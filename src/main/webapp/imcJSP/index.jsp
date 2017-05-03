<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Exemplo JSP</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <style>
        h1{
            font-weight: bolder;
            box-shadow: 0px 0px 5px rgba(0,0,0,.2);
            padding: 5px;
            border-radius: 4px;
            color: rgba(0,0,0,.5);
        }
    </style>
  </head>
  <body>
    <div class="col-md-12">
        <div class="modal-dialog" style="margin-bottom:0">
            <div class="modal-content">
                <div class="panel-heading">
                    <center>
                        <h1 >Calculadora de IMC</h1>
                    </center>
                    
                </div>
                <div class="panel-body">
                    <form name="formulario" action="responseImc.jsp" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="Informe aqui seu peso" name="peso" type="text" autofocus="">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Informe aqui sua altura" name="altura" type="text" autofocus="">
                            </div>
                            <div class="form-group">
                                <select class="form-control" name="sexo">
                                    <option value="masculino">Masculino</option>
                                    <option value="feminino">Feminino</option>
                                </select>
                            </div>
                            <button class="btn btn-lg btn-success">Calcular IMC</button>
                        </fieldset>
                    </form>
                </div>

            </div>
  </body>
</html>