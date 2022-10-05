
function cache(){

const peticion=fetch('http://localhost:4567/listMsj')

peticion
.then(resp=>resp.json())
.then(mensaje=> {
   for(let i=0; i<9;i++){
    let result = mensaje[i]
    
    let mensajeTemp= result.mensaje
    let fechaTemp = result.fecha
    document.getElementById("info").innerHTML += 
    `<tr>
        <td>${mensajeTemp}</td>
        <td>${fechaTemp}</td>
    </tr>`

   }
})
}

function insertMsj (){
    let url = 'http://localhost:4567/insertMsj'
    let input = document.getElementById("input").value;
    axios.post(url,input).then(result=>{
        console.log("ENTRAAAA")
    })
    //location.reload();
    

}
