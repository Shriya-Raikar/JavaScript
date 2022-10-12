//Ability to Check Employee is present or Absent
const check_id = 1;
let check = Math.floor(Math.random()*10) % 2;
if(check_id == check){
    console.log("Employee is Present")
}else{
    console.log("Employee is Absent")
}