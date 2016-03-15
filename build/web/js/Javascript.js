$(document).ready(function(){
                $('#listaOpciones').change(function(){
                    var selectedOption=$('#listaOpciones option:selected');
                     if(selectedOption.val()==2 || selectedOption.val()==4){
                         $("#divNomE,#divApeE,#divDirE,#divTelE,#divJefE").hide("slow");
                         $("#inputNomE,#inputApeE,#inputDirE,#inputTelE,#inputIdenJE").removeAttr("required");
                         $('#divAcciones').css('margin-top','-100px'); 
                         
                         
                     }else{
                         $("#divNomE,#divApeE,#divDirE,#divTelE,#divJefE").show("slow");
                          $("#inputNomE,#inputApeE,#inputDirE,#inputTelE,#inputIdenJE").prop("required", true);
                          $('#divAcciones').css('margin-top','');
                     }
                     
                     if(selectedOption.val()==3){
                         
                         $("#inputIdenE").css("background","#9FF781");
                     }else{
                         $("#inputIdenE").css("background","");
                     }
                });
                //----------------------------------------------------//                
                //Manejo del formulario de departamentos                
               $('#listaOpciones2').change(function(){
                    var selectedOption2=$('#listaOpciones2 option:selected');
                    
                    //Opcion crear
                     if(selectedOption2.val()==1){
                         $("#divCodD").hide("slow");
                         $("#inputCodE").removeAttr("required");
                         $('#divAcciones2').css('margin-top','-15px');                         
                     }else{
                          $("#divCodD").show("slow");
                          $("#inputCodE").prop("required", true);
                          $('#divAcciones2').css('margin-top','0px');
                     }
                     
                             //Opciones Borrar y consultar
                    if(selectedOption2.val()==2 || selectedOption2.val()==4){
                             $("#divNomD,#divSelectJefeD").hide("slow");
                             $("#inputNomD,#inputIdenEn").removeAttr("required");
                             $('#divAcciones2').css('margin-top','10px');
                             
                             
                         }else{
                             $("#divNomD,#divSelectJefeD").show("slow");
                             $("#inputNomD,#inputIdenEn").prop("required", true);
                         }               
                     
                     //Decision para la actualizar el departamento
                     if(selectedOption2.val()==3){    
                       $('#inputCodE').css('background','#9FF781');
                       $("#divAcciones2").css("margin-top","20px");                             
                         }else{
                              $('#inputCodE').css('background','');
                               $("#divAcciones2").css("margin-top","0px");
                         }
                });
            });

