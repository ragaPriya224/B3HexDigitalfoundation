console.log("hello team, i'm JS");
var greeting ="bye";
var habit = "bye";
console.log(greeting == habit);//true

 greeting ="4";
 habit = 4;
 console.log(greeting == habit);//true checking value.. not check type
 console.log(greeting === habit);// false recommended..bcoz type alo checked
// POP UP BOXES
//  alert("welcome to coding");
//  confirm("confirm you're a human");
//  prompt("enter name");

let person = prompt("Please enter your name", "Harry Potter");
let text;
if (person == null || person == "") {
  text = "User cancelled the prompt.";
} else {
  text = "Hello " + person + "! How are you today?";
}
console.log(text);

// FUNCTION 

function square(number){
    console.log("square function is executed");
    return number*number;
}
const output = square(10);
console.log(output);

c=confirm("Do You Want to Continue")
if(c){
alert ("Welcome")
}else{
alert ("Thank You")
}