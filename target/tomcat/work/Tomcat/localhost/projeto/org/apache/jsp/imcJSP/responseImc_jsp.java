/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-03 13:40:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.imcJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class responseImc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset= utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Exemplo JSP</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        h1{\n");
      out.write("            font-weight: bolder;\n");
      out.write("            box-shadow: 0px 0px 5px rgba(0,0,0,.2);\n");
      out.write("            padding: 5px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            color: rgba(0,0,0,.5);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("        <div class=\"modal-dialog\" style=\"margin-bottom:0\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <center>\n");
      out.write("                        <h1 >Calculadora de IMC</h1>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                ");
   
                    double imc = 0;
                    String situacao = "";
                    try{
                        String pesoStr = request.getParameter("peso");
                        String alturaStr = request.getParameter("altura");
                        String sexo = request.getParameter("sexo");

                        double peso = Double.parseDouble(pesoStr);
                        double altura = Double.parseDouble(alturaStr);
                        imc = peso / (altura * altura);

                        
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
                    }catch(Exception e){
                        situacao = "IMC desconhecido. Os dados fornecidos são inválidos."+
                        "'<br/>'Por favor informar peso e altura!!!";
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <center>\n");
      out.write("                        <h3 class=\"panel-title\">IMC: ");
      out.print( imc );
      out.write("</h3>\n");
      out.write("                    </center> \n");
      out.write("                </div>\n");
      out.write("                ");

                if(imc>=20.7 && imc<26.4){
                
      out.write("\n");
      out.write("                <div class=\"alert alert-success\" role=\"alert\" style=\"margin-top:45px; text-align: center;\">");
      out.print(situacao);
      out.write("</div>\n");
      out.write("                ");
}
                else{
      out.write("\n");
      out.write("                <div class=\"alert alert-warning\" role=\"alert\" style=\"margin-top:45px; text-align: center;\">");
      out.print(situacao);
      out.write("</div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("                 <center style=\"padding-bottom: 10px;\">\n");
      out.write("                    <button class=\"btn btn-sm btn-success\"><a href=\"index.jsp\">Novo Caulculo</a></button>\n");
      out.write("                     \n");
      out.write("                 </center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}