const add=(a,b)=>{
    console.log(a+b);
}
add(10,20);

function greet(name,callback){
    console.log(name);
    callback();
}
function you(){
    console.log("Deepak");
 }
 greet("Hello",you);