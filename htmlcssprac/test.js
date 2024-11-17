var mul=function(a,b){
    return a*b;
}
var mularrow=(a,b) => a*b;

var obj1={
    valueOfThis: function(a,b){
        return a+b;
    },
    valuesub:(a,b)=>{
        return a-b;
    }
}
// var obj2={
//     valueOfThis:()=>{
//         return this;
//     }
// }
console.log(obj1.valueOfThis(5,4));  
console.log(obj1.valuesub(6,7));
console.log(mul(2,3));
console.log(mularrow(3,3));

//Promises
function sumofele(...elements){
    return new Promise((resolve,reject)=>{
        if(elements.length > 3){
            reject("Only three elemts");
        }
        else{
            let sum=0;
            let i=0;
            while(i<elements.length){
            sum+=elements[i];
            i++;
            }
            resolve("Sum is:"+sum);
        }
    })
}

sumofele(4,5,6)
.then(result=> console.log(result))
.catch(error=> console.log(error));
console.log(sumofele(6,7,8));
console.log(sumofele(1,2,3,4,5));