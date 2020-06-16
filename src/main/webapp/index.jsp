<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scegli un'operazione</title>
</head>
<body>

<form action="numeri" method="post">

<input type="radio" id="addizione" value="addizione">
  <label for="addizione">Addizione</label><br>
  
<input type="radio" id="sottrazione" value="sottrazione">
  <label for="sottrazione">Sottrazione</label><br>
  
<input type="radio" id="moltpilicazione" value="moltiplicazione">
  <label for="moltiplicazione">Moltiplicazione</label><br>

<input type="radio" id="divisione" value="divisione">
  <label for="divisione">Divisione</label>
	
	<input type="submit" name="azione" value="Invio">
	
</form>

</body>
</html>