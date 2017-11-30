<!-- 
 *      Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>SOSORE</title>
    </head>
    <body id="top">
        <div class="wrapper row1">
            <header id="header" class="hoc clear"> 
                <nav id="mainav" class="fl_right">
                    <ul class="clear">
                        <li><a href="indexLocal.html">Inicio</a></li>
                        <li class="active"><a class="drop" href="#">Local Comercial</a>
                            <ul>
                                <li><a href="inventarioLocal.jsp">INVENTARIO</a></li>
                                <li><a href="personalLocal.jsp">PERSONAL</a></li>
                                <li><a href="ventaLocal.jsp">VENTAS</a></li>
                            </ul>
                        </li>
                        <li><a href="index.html">Home</a></li>
                    </ul>
                </nav>
            </header>
        </div>
        <div class="wrapper row2">
            <div id="breadcrumb" class="hoc clear"> 
                <ul>
                    <li><a href="indexLocal.html">Inicio</a></li>
                    <li><a href="#">Local</a></li>
                    <li><a href="#">Ventas</a></li>
                </ul>
            </div>
        </div>
        <div class="wrapper row3">
            <main class="hoc container clear"> 
                <div class="content"> 
                    <div id="gallery">
                        <figure>
                            <header class="heading">Gallery Title Goes Here</header>
                    </div><div class="wrapper row4">
                        <footer id="footer" class="hoc clear"> 
                            <div class="one_quarter first">
                                <h6 class="title"> </h6>
                                <p> </p>
                                <p> </p>
                            </div>
                            <div class="one_quarter">
                                <h6 class="title">INFORMACION</h6>
                                <ul class="nospace linklist contact">
                                    <li><i class="fa fa-fax"></i>Universidad Sergio Arboleda</li>
                                    <li><i class="fa fa-map-marker"></i>
                                        <address>
                                            Calle 74 # 14-14 &amp; Bogotá - Colombia
                                        </address>
                                    </li>
                                    <li><i class="fa fa-phone"></i>Telefono<br>
                                        (+571) 325 8181</li>
                                    <li><i class="fa fa-envelope-o"></i>brian.sterling@correo.usa.edu.co</li>
                                </ul>
                            </div>
                            <div class="one_quarter">
                                <h6 class="title">REGISTRO</h6>
                                <p>SNIES 1728 - Resolución 16377 del 29 octubre de 1984 y 6423 del 05 de agosto de 2011 - Ministerio de Educación Nacional - Acreditación Institucional - Resolución 590 del 09 de enero de 2015 Vigencia 4 años por el Ministerio de Educación.</p>
                            </div>
                            <div class="one_quarter">
                                <h6 class="title"> </h6>
                                <p> </p>
                                <p> </p>
                            </div>
                        </footer>
                    </div>
                    <div class="wrapper row5">
                        <div id="copyright" class="hoc clear"> 
                            <p class="fl_left">Copyright &copy; 2017 - All Rights Reserved - <a href="#">Grupo Empresarial Montesalvo S.A.</a></p>
                        </div>
                    </div>
                    <a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
        <script src="layout/scripts/jquery.min.js"></script>
        <script src="layout/scripts/jquery.backtotop.js"></script>
        <script src="layout/scripts/jquery.mobilemenu.js"></script>
    </body>
</html>