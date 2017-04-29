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
                    <form name="formulario">
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



                <%
                String pesoStr = request.getParameter("peso");
                String alturaStr = request.getParameter("altura");
                String sexo = request.getParameter("sexo");

                pesoStr = pesoStr == null ? "0" : pesoStr;
                alturaStr = alturaStr == null ? "0" : alturaStr;

                double peso = Double.parseDouble(pesoStr);
                double altura = Double.parseDouble(alturaStr);
                double imc = peso / (altura * altura);

                String situacao = "";
                if(sexo.equals("masculino") && imc <= 20.7){
                    situacao = "Abaixo do Peso Ideal!!";
                }
                else if(sexo.equals("masculino") && imc <= 26.4){
                    situacao = "No Peso Normal!!";
                }
                else if(sexo.equals("masculino") && imc <= 27.8){
                    situacao = "Marginalmente Acima do Peso!!";
                }
                else if(sexo.equals("masculino") && imc <= 31.1){
                    situacao = "Acima do Peso Ideal!!";
                }
                else if(sexo.equals("masculino") && imc > 31.1){
                    situacao = "Obeso!!";
                }
                else if(sexo.equals("feminino") && imc <= 19.1){
                    situacao = "Abaixo do Peso!!";
                }
                else if(sexo.equals("feminino") && imc <= 25.8){
                    situacao = "No Peso Normal!!";
                }
                else if(sexo.equals("feminino") && imc <= 27.3){
                    situacao = "Marginalmente Acima do Peso!!";
                }
                else if(sexo.equals("feminino") && imc <= 32.3){
                    situacao = "Acima do Peso Ideal!!";
                }
                else if(sexo.equals("feminino") && imc > 32.3){
                    situacao = "Obesa!!";
                }



                %>

                <div class="panel-heading">
                    <center>
                        <h3 class="panel-title">IMC: <%=imc%></h3>
                    </center> 
                </div>
                <%
                if(imc>=20.7 && imc<26.4){
                %>
                <div class="alert alert-success" role="alert" style="margin-top:45px"><%=situacao%></div>
                <%}
                else{%>
                <div class="alert alert-warning" role="alert" style="margin-top:45px"><%=situacao%></div>
                <%}%>



            </div>
  </body>
</html>