$(document).ready(function(){
                //Manejo del formulario para la gestion de los empleados
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
                         $("#inputIdenJE").removeAttr("disabled");
                     }else{
                         $("#inputIdenE").css("background","");
                         $("#inputIdenJE").prop("disabled","true");
                     }
                });
                //----------------------------------------------------//                
                //Manejo del formulario de departamentos                
                         /*$("#divCodD").css("display","none");*/
                        $("#inputCodE").removeAttr("required");
                        $('#listaOpciones2').change(function(){
                   
                    
                    var selectedOption2=$('#listaOpciones2 option:selected');
                    
                    //Manejo del formulario al crear un departamento
                     if(selectedOption2.val()==1){
                         $("#divCodD").hide("slow");
                         $("#inputCodE").removeAttr("required");
                         $('#divAcciones2').css('margin-top','-15px');                         
                     }else{
                          $("#divCodD").show("slow");
                          $("#inputCodE").prop("required", true);
                          $('#divAcciones2').css('margin-top','0px');
                     }
                     
                             //Manejo del formulario al eliminar o consultar un departamento
                    if(selectedOption2.val()==2 || selectedOption2.val()==4){
                             $("#divNomD,#divSelectJefeD").hide("slow");
                             $("#inputNomD,#inputIdenEn").removeAttr("required");
                             $('#divAcciones2').css('margin-top','10px');
                             $('#inputCodE').removeAttr('disabled');
                         }else{
                             $("#divNomD,#divSelectJefeD").show("slow");
                             $("#inputNomD,#inputIdenEn").prop("required", true);
                         }               
                     
                     //Manejo del formulario al actualizar un departamento
                     if(selectedOption2.val()==3){    
                       $('#inputCodE').css('background','#9FF781');
                       $("#divAcciones2").css("margin-top","20px"); 
                       $('#inputCodE').removeAttr('disabled');
                         }else{
                              $('#inputCodE').css('background','');
                               $("#divAcciones2").css("margin-top","0px");
                         }
                });
                
                 //----------------------------------------------------//                
                //Manejo del formulario de categorias de empleado
                $("#inputCodCate").removeAttr("required");
                        $('#listaOpciones3').change(function(){
                   
                    
                    var selectedOption3=$('#listaOpciones3 option:selected');
                    
                    //Manejo del formulario al crear un departamento
                     if(selectedOption3.val()==1){
                         $("#divCodigoCate").hide("slow");
                         $("#inputCodCate").removeAttr("required");
                         $('#divAcciones3').css('margin-top','-20px');                         
                     }else{
                          $("#divCodigoCate").show("slow");
                          $("#inputCodCate").prop("required", true);
                          $('#divAcciones3').css('margin-top','0px');
                     }
                     
                     //Manejo de la eliminacion
                     if(selectedOption3.val()==2){
                         $("#divNombreCate").hide("slow");
                         $("#inputNomcate").removeAttr("required");
                         $("#inputCodCate").removeAttr("disabled");
                     }else{
                         $("#divNombreCate").show("slow");
                         $("#inputCodCate").prop("disabled");
                     }
                     
                     //Manejo de la actualizacion de la actualizacion
                     if(selectedOption3.val()==3){
                         $("#inputCodCate").removeAttr("disabled");
                         $('#inputCodCate').css('background','#9FF781');
                         
                     }else{
                         $("#inputCodCate").prop("disabled");
                         $('#inputCodCate').css('background','');
                     }
                     
                     
                    });
                    
                    //--------------------------------------------------//
                    //Manejo del formulario para la gestion de las nominas
                    $("#listaOpciones4").change(function() {
                        var selectedOption4=$("#listaOpciones4 option:selected");
                        
                        //Manejo de los campos al realizar una creacion de la nomina
                        if(selectedOption4.val()==1){
                            $("#divCodnomina").hide("slow");
                        }else{
                            $("#divCodnomina").show("slow");
                            $("#inputCodNomina").prop("required","true");
                        }
                        
                        //Manejo de los campos al realizar una eliminacion
                        if(selectedOption4.val()==2 || selectedOption4.val()==4){                            
                            
                            $("#inputCodNomina").removeAttr("disabled");
                            $("#divCodnomina").css("margin-top","-50px");
                            
                            
                            $("#divFechaNomina").hide("slow");
                            $("#inputFechaNomina").removeAttr("required");
                            
                            $("#divSalarioNomina").hide("slow");
                            $("#inputSalarioNomina").removeAttr("required");
                            
                            $("#divCodEmpleadoNomina").hide("slow");
                            $("#inputCodEmpleadoNomina").removeAttr("required");
                        }else{
                            $("#inputCodNomina").prop("disabled","true");
                            $("#divCodnomina").css("margin-top","");
                            
                            $("#divFechaNomina").show("slow");
                            $("#inputFechaNomina").prop("required","true");
                            
                            $("#divSalarioNomina").show("slow");
                            $("#inputSalarioNomina").prop("required","true");
                            
                            $("#divCodEmpleadoNomina").show("slow");
                            $("#inputCodEmpleadoNomina").prop("required","true");
                            
                        }
                        
                        //Manejo de los campos al realizar una actualizacion
                        if(selectedOption4.val()==3){
                            $("#inputCodNomina").removeAttr("disabled");
                            $("#inputCodNomina").css("background","#9FF781");
                            
                        }else{
                            $("#inputCodNomina").css("background","");
                        }
                        
                    });
                    
                     //--------------------------------------------------//
                    //Manejo del formulario para la gestion de los contratos
                     $("#listaOpciones5").change(function (){
                        var optionSelected=$("#listaOpciones5 option:selected");
                        
                        //Manejo del formulario cuando se maneja la opcion crear
                         if(optionSelected.val()==1){
                             $("#divCodigoContrato").css("margin-top","10px");
                             $("#inputCodigoContrato").removeAttr("required");
                        }else{
                             $("#divCodigoContrato").show("slow");
                             $("#inputCodigoContrato").prop("required","true");
                             $("#divAcciones5").css("margin-top","");
                        }
                        
                        //Manejo del formulario cuando se maneja la opcion eliminar
                        if(optionSelected.val()==2 || optionSelected.val()==4){
                            $("#inputCodigoContrato").removeAttr("disabled");                            
                            $("#inputCodigoContrato").prop("required","true");
                            $("#divCodigoContrato").css("margin-top","-80px");
                            
                            $("#divFechaInicioContrato").hide("slow");
                            $("#inputFechaInicioContrato").removeAttr("required");
                            $("#divFechaFinalContrato").hide("slow");
                            $("#inputFechaFinalContrato").removeAttr("required");
                            $("#divEmpleadoContrato").hide("slow");
                            $("#inputEmpleadoContrato").removeAttr("required");
                            $("#divCategoriaContrato").hide("slow");
                            $("#inputCategoriaContrato").removeAttr("required");
                        }else{
                            $("#inputCodigoContrato").prop("required","true");
                            
                            $("#inputCodigoContrato").removeAttr("required");
                            $("#divFechaInicioContrato").show("slow");
                            $("#inputFechaInicioContrato").prop("required","true");
                            $("#divFechaFinalContrato").show("slow");
                            $("#inputFechaFinalContrato").prop("required","true");
                            $("#divEmpleadoContrato").show("slow");
                            $("#inputEmpleadoContrato").prop("required","true");
                            $("#divCategoriaContrato").show("slow");
                            $("#inputCategoriaContrato").prop("required","true");
                            
                        }
                        
                        //Manejo del formulario cuando se maneja la opcion actualizar
                         if(optionSelected.val()==3){
                             $("#divCodigoContrato").show("slow");
                             $("#divCodigoContrato").css("margin-top","10px");
                             $("#inputCodigoContrato").prop("required","true");
                             $("#inputCodigoContrato").css("background","#9FF781");
                             $("#inputCodigoContrato").removeAttr("disabled");
                         }else{
                             $("#inputCodigoContrato").css("background","");
                             //$("#divCodigoContrato").css("margin-top","0px");
                         }
                         
                         
                     });
                    
                
                
                
            });

