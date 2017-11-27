<%-- 
    Document   : mostrarTicket
    Created on : Nov 27, 2017, 3:49:32 PM
    Author     : zerep08
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Tickets creados</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />

        <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-6">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Tickets</h3>
                            <div class="pull-right">
                                <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">
                                    <i class="glyphicon glyphicon-filter"></i>
                                </span>
                            </div>
                        </div>
                        <div class="panel-body">
                            <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter ticket" />
                        </div>
                        <table class="table table-hover" id="dev-table">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Nombre</th>
                                    <th>Email</th>
                                    <th>Comentario</th>
                                    <th>Estatus</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>Kilgore</td>
                                    <td>Trout</td>
                                    <td>kilgore</td>
                                    <td>open</td>

                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>Bob</td>
                                    <td>Loblaw</td>
                                    <td>boblahblah</td>
                                    <td>open</td>

                                </tr>
                                <tr>
                                    <td>3</td>
                                    <td>Holden</td>
                                    <td>Caulfield</td>
                                    <td>penceyreject</td>
                                    <td>open</td>

                                </tr>
                                <tr>
                                    <td>4</td>
                                    <td>Hoasdflden</td>
                                    <td>Caulfiefwld</td>
                                    <td>penceyrefaeject</td>
                                    <td>open</td>

                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
