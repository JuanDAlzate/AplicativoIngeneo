$(function(){
    $("#btn-ok").on("click",function()){
   if($("#listaOpciones").attr("value")=="1"){
       alert("Creacion");
   }else if($("#listaOpciones").attr("value")=="2"){
       alert("Eliminacion");
   } 
    });
});
