<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Caso eu tenha recebido o valor do nome do DVD, esse é:
<br/>

<% 
	HttpSession sessao = request.getSession();

  if((sessao.getAttribute("nomeDvd")!= null) && (!sessao.getAttribute("nomeDvd").equals(""))){
	out.println(sessao.getAttribute("nomeDvd"));
  }
  
  
%>

<hr/>

Conteúdo do atributo criado dentro da RN: <br/>
<%= request.getAttribute("novoAtributoCriadoRn") %>   



</body>
</html>