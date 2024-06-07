<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="form1" method="post" action="/ExemploMvc/cadastroDvd">
<table>

	<tr>
		<td>Nome do dvd:</td>
		<td><input type="text" name="nome"></td>
	</tr>
	<tr>
		<td>Autor:</td>
		<td><input type="text" name="autor"></td>
	</tr>
	<tr>
		<td>Gênero:</td>
		<td>
			<select name="genero">
				<option value="">-- Selecione --</option>
				<option value="rock">Rock</option>
				<option value="mpb">Mpb</option>
				<option value="pagode">Pagode</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Ano de lançamento:</td>
		<td><input type="text" name="anoLancamento"></td>
	</tr>
	<tr>
		<td><input type="submit" value="Cadastrar"></td>
		<td><input type="reset" value="Limpar"></td>
	</tr>	
	


</table>
</form>

</body>
</html>