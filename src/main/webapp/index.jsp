<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Prueba de Herencia, Polimorfismo y Constructores</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Prueba de Herencia, Polimorfismo y Constructores</h1>
        
        <form action="HerenciaServlet" method="POST">
            <button type="submit" class="btn btn-primary mt-3">Herencia</button>
            <input type="hidden" name="action" value="herencia">
        </form>
        
        <form action="HerenciaServlet" method="POST">
            <button type="submit" class="btn btn-primary mt-3">Polimorfismo</button>
            <input type="hidden" name="action" value="polimorfismo">
        </form>
        
        <form action="HerenciaServlet" method="POST">
            <button type="submit" class="btn btn-primary mt-3">Constructores</button>
            <input type="hidden" name="action" value="constructores">
        </form>
        
        <%-- Mostrar el resultado del servlet --%>
        <div class="mt-5">
            <h3>Resultado:</h3>
            <div class="alert alert-info">
                ${output}
            </div>
        </div>
    </div>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
