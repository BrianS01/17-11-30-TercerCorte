<%@page import="controlador.Cliente"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registro cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="background-color:lightgray;">

    <center>
        <p>&nbsp;</p>    
        <h1>Nuevo cliente</h1>
         
    </center>



    <center>
      
       
            <form action="Cliente" method="post"> 
                <p>&nbsp;</p> 
                <strong>documento<strong>
                <input class="contact" type="text" name="documento" value="" />
                 <p>&nbsp;</p> 
                <strong>tipoDocumento<strong>
                <input class="contact" type="text" name="tipoDocumento" value="" />
                 <p>&nbsp;</p> 
                <strong>nombre<strong>
                <input class="contact" type="text" name="nombre" value="" />
                 <p>&nbsp;</p> 
                 <strong>apellido<strong>
                <input class="contact" type="text" name="apellido" value="" />
                 <p>&nbsp;</p> 
                <strong>direccion<strong>
                <input class="contact" type="text" name="direccion" value="" />
                 <p>&nbsp;</p> 
                <strong>telefono<strong>
                <input class="contact" type="text" name="telefono" value="" />
                 <p>&nbsp;</p> 
                <strong>fechanacimiento<strong>
                <input class="contact" type="text" name="fechanacimiento" value="" />
                <p>&nbsp;</p> 
                <strong>edadA<strong>
                <input class="contact" type="text" name="edadA" value="" />
                <p>&nbsp;</p> 
                <input style="background-color: #2a93da" class="submit" type="submit" name="registrar_cliente"  value="Registrar Cliente" > 
                           
                
            </form>


        
            <%
                if(request.getAttribute("total")==null){
                    
                }else{
                     out.println(request.getAttribute("total"));
                }
           
                                    
            %>


   



    </center>