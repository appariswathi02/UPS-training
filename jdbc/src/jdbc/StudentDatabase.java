package jdbc;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class StudentDatabase {
	private static Scanner sc=new Scanner(System.in);
	private static Connection connection=null;
	public static void main(String args[]) {
		StudentDatabase studentDatabase=new  StudentDatabase();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/prac";
			String user="root";
			String password="#raghav2005";
			connection=DriverManager.getConnection(dburl , user , password);
			System.out.println("Connetion successful");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				insert();
				break;
			case 2:
				selectRecord();
				break;
			case 3:
				selectAllRecords();
				break;
			case 4:
				updateRecord();
				break;
			case 5:
				deletrecord();
				break;
			case 6:
				transaction();
				break;
			case 7:
				batchProcessing();
				break;
			default:
				break;
			}
		}
		catch(Exception e) {
			//throw new RuntimeException("Connection not syccessful",e);
			System.out.println("Connection failed"+e.getMessage());
		}
		
		}
	private static void insert() throws SQLException {
		System.out.println("insert");
		System.out.println("Enter name:");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter per:");
		double per=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter add:");
		String address=sc.nextLine();
		sc.nextLine();
		//String sql="insert into students(name,per,address) values('Swathi',90,'Chennai')";
		String sql="insert into students(name,per,address) values(?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2,per);
		preparedStatement.setString(3, address);
		int rows=preparedStatement.executeUpdate();
		if(rows>0) {
			System.out.println("recort inserted successfully");
		}
	}
	public static void selectRecord() throws SQLException {
		System.out.println("Select Record");
		//String sql="select * from students where rollno=1";
		int number=sc.nextInt();
		
		//String sql="select * from students";
		String sql="select * from students where rollno="+number;
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(sql);
		if(result.next()) {
			int rollno=result.getInt("rollno");
			String name=result.getString("name");
			int per=result.getInt("per");
			String address=result.getString("address");
			System.out.println("Roll number is:"+rollno);
			System.out.println("Name is:"+name);
			System.out.println("Percentage is:"+per);
			System.out.println("address is"+address);
		}
		else {
			System.out.println("No records found");
		}
//		while(result.next()) {
//			int rollno=result.getInt("rollno");
//			String name=result.getString("name");
//			int per=result.getInt("per");
//			String address=result.getString("address");
//			System.out.println("Roll number is:"+rollno);
//			System.out.println("Name is:"+name);
//			System.out.println("Percentage is:"+per);
//			System.out.println("address is"+address);
//		}
	}
	public static void selectAllRecords() throws SQLException{
		CallableStatement callableStatement=connection.prepareCall("{call GET_ALL}");
		ResultSet result=callableStatement.executeQuery();
		while(result.next()) {
			int rollno=result.getInt("rollno");
			String name=result.getString("name");
			int per=result.getInt("per");
			String address=result.getString("address");
			System.out.println("Roll number is:"+rollno);
			System.out.println("Name is:"+name);
			System.out.println("Percentage is:"+per);
			System.out.println("address is"+address);
		}
	}
	public static void updateRecord() throws SQLException {
		System.out.println("updating");
		System.out.println("enter roll no to update:");
		int number=sc.nextInt();
		//String sql="select * from students where rollno=1";
		String sql="select * from students where rollno="+number;
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(sql);
		if(result.next()) {
			int rollno=result.getInt("rollno");
			String name=result.getString("name");
			int per=result.getInt("per");
			String address=result.getString("address");
			System.out.println("Roll number is:"+rollno);
			System.out.println("Name is:"+name);
			System.out.println("Percentage is:"+per);
			System.out.println("address is"+address);
			
			System.out.println("What you what to update:");
			System.out.println("1.name");
			System.out.println("2.Percentage");
			System.out.println("3.Address");
			
			int choice=sc.nextInt();
			String sqlquery="update students set ";
			switch(choice) {
			case 1:
				System.out.println("Name to be update");
				System.out.println("Enter name to change:");
				String newname=sc.next();
				 sqlquery=sqlquery+"name=? where rollno ="+number;
			
				PreparedStatement preparedStatement=connection.prepareStatement(sqlquery);
				preparedStatement.setString(1,newname);
				int rows=preparedStatement.executeUpdate();
				System.out.println("update successful");
			case 2:
				System.out.println("persentage to be updated");
				System.out.println("enter new percentage");
				double newper=sc.nextDouble();
				sqlquery=sqlquery+"per=? where rollno ="+number;
				PreparedStatement preparedstatement=connection.prepareStatement(sqlquery);
				preparedstatement.setDouble(1,newper);
				int rows1=preparedstatement.executeUpdate();
//				if(rows1>0) {
//					System.out.println("Rocord updated successfully");
//				}
//				break;
			case 3:
				System.out.println("address to be updated");
				System.out.println("Enter new address");
				String newadd=sc.next();
				sqlquery=sqlquery+"address=? where rollno="+number;
				PreparedStatement pre=connection.prepareStatement(sqlquery);
				pre.setString(1, newadd);
				int row2=pre.executeUpdate();
				if(row2>0) {
					System.out.println("Record updated successfully");
				}
				break;
				
			default:
				break;
			}
		}
		
	}
	public static void deletrecord() throws SQLException {
		System.out.println("Deleting");
		System.out.println("Enter the number to delete:");
		int number=sc.nextInt();
		String sql="delete from students where rollno=+"+number;
		Statement st=connection.createStatement();
		int rows=st.executeUpdate(sql);
		if(rows>0) {
			System.out.println("DEleted");
		}
		else {
			System.out.println("no record found");
		}
	}
	public static void transaction() throws SQLException{
		connection.setAutoCommit(false);
		String sql1="insert into students (name,per,address) values('geet',70,'chennai')";
		String sql2="insert into students (name,per,address) values('harini',70,'chennai')";
		PreparedStatement preparedStatement=connection.prepareStatement(sql1);
		int row1=preparedStatement.executeUpdate();
		preparedStatement=connection.prepareStatement(sql2);
		int row2=preparedStatement.executeUpdate();
		if(row1>0 && row2>0) {
			//System.out.println("Successful");
			connection.commit();
		}
		else {
			connection.rollback();
		}
		System.out.println("successful connection");
	}
	
	public static void batchProcessing() throws SQLException{
		connection.setAutoCommit(false);
		String sql1="insert into students (name,per,address) values('raj',44,'jammu')";
		String sql2="insert into students (name,per,address) values('pinky',54,'srinagar')";
		String sql3="insert into students (name,per,address) values('romal',56,'pondy')";
		String sql4="insert into students (name,per,address) values('rose',44,'jammu')";
		String sql5="insert into students (name,per,address) values('jack',44,'jammu')";
		String sql6="update students set address='hyd' where rollno=11";
		Statement statement=connection.createStatement();
		statement.addBatch(sql1);
		statement.addBatch(sql2);
		statement.addBatch(sql3);
		statement.addBatch(sql4);
		statement.addBatch(sql5);
		statement.addBatch(sql6);
		int[] rows=statement.executeBatch();
		for(int i:rows)
			if(i>0)
				continue;
			else
				connection.rollback();
		      connection.commit();
		
	}
}
