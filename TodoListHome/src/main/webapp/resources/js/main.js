const addForm = document.querySelector("#addForm");
const title = document.querySelector("[name=title]");

addForm.addEventListener("submit", e =>{

  const input = title.value.trim();

  if(input.length === 0){
    e.preventDefault();
    alert("제목을 입력해주세여");
    title.focus();
  }

})