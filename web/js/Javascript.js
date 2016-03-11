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
                
                //Manejo del formulario de departamentos
                
               $('#listaOpciones2').change(function(){
                    var selectedOption=$('#listaOpciones2 option:selected');
                     if(selectedOption.val()==1){
                         $("#divCodD").hide("slow");
                         $("#inputCodE").removeAttr("required");
                         $('#divAcciones2').css('margin-top','-30px'); 
                         
                         
                     }else{
                          $("#divCodD").show("slow");
                          $("#inputCodE").prop("required", true);
                          $('#divAcciones2').css('margin-top','');
                     }
                     
                  
                         
                     if(selectedOption.val()==2 || selectedOption.val()==4){
                             $("#divNomD,#divSelectJefeD").hide("slow");
                             $("#inputNomD,#inputIdenEn").removeAttr("required");
                             $('#divCodD').css('margin-top','-30px');
                             $('#divAcciones2').css('margin-top','-10px'); 
                         }else{
                             $("#divNomD,#divSelectJefeD").show("slow");
                             $("#inputNomD,#inputIdenEn").prop("required", true);
                             $('#divAcciones2').css('margin-top','');
                             
                         }                       
                     
                });
               
                
                
            });

