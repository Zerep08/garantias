<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta charset="utf-8" />
        <title>Contactanos</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />

        <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">

            <div class="page-header">
                <h1>FORMULARIO DE REGISTRO PARA SEGUIMIENTO DE FALLAS</h1>
            </div>

            <!-- Contact Form - START -->
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="well well-sm">
                            <form class="form-horizontal" method="post">
                                <fieldset>
                                    <legend class="text-center header">Crea un ticket</legend>

                                    <div class="form-group">
                                        <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                                        <div class="col-md-8">
                                            <input id="fname" name="name" type="text" placeholder="Ingresa tu nombre" class="form-control" required>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                                        <div class="col-md-8">
                                            <input id="email" name="email" type="text" placeholder="Email" class="form-control" >
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                                        <div class="col-md-8">
                                            <input id="phone" name="falla" type="text" placeholder="Falla" class="form-control" required>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                                        <div class="col-md-8">
                                            <textarea class="form-control" id="message" name="message" placeholder="Ingresa una descripcion de la falla" rows="7"></textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-12 text-center">
                                            <button type="submit" class="btn btn-primary btn-lg">Crear ticket</button>                                         
                                        </div>
                                    </div>

                                </fieldset>
                            </form>
                            
                            <form class="form-horizontal" action="ver.htm" method="get">
                                
                                    <div class="form-group">
                                        <div class="col-md-12 text-center">
                                            <div class="container">
                                                <div class="row">

                                                    <!-- Signin & Signup -->
                                                    <a class="btn btn-primary" href="#" data-toggle="modal" data-target=".login-register-form">
                                                        Login
                                                    </a>

                                                    <!-- Login / Register Modal-->
                                                    <div class="modal fade login-register-form" role="dialog">
                                                        <div class="modal-dialog modal-sm">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <button type="button" class="close" data-dismiss="modal">
                                                                        <span class="glyphicon glyphicon-remove"></span>
                                                                    </button>
                                                                    <ul class="nav nav-tabs">
                                                                        <li class="active"><a data-toggle="tab" href="#login-form"> Login <span class="glyphicon glyphicon-user"></span></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <div class="tab-content">
                                                                        <div id="login-form" class="tab-pane fade in active">
                                                                            <form action="/">
                                                                                <div class="form-group">
                                                                                    <label for="email">Email:</label>
                                                                                    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                                                                                </div>
                                                                                <div class="form-group">
                                                                                    <label for="pwd">Password:</label>
                                                                                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
                                                                                </div>
                                                                                <div class="checkbox">
                                                                                    <label><input type="checkbox" name="remember"> Remember me</label>
                                                                                </div>
                                                                                <button type="submit" class="btn btn-default">Login</button>
                                                                            </form>
                                                                        </div>


                                                                    </div>
                                                                </div>
                                                                <!--                                    <div class="modal-footer">-->
                                                                <!--                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>-->
                                                                <!--                                    </div>-->
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                            </form>
                            
                            
                        </div>
                    </div>
                </div>
            </div>

            <style>
                .header {
                    color: #36A0FF;
                    font-size: 27px;
                    padding: 10px;
                }

                .bigicon {
                    font-size: 35px;
                    color: #36A0FF;
                }
            </style>

            <!-- Contact Form - END -->

        </div>





    </body>
</html>