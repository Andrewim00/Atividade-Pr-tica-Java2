<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8" />
        <title>Home</title>
    </head>

    <body>
        <h1>Gêneros</h1>
        <a href="/genero/insert">Novo Gênero</a>

        <c:forEach var="item" items="${generos}">
            <li>
                ${item.nome} |
                <a href="/genero/update?id=${item.id}">Editar</a> |
                <a href="/genero/delete?id=${item.id}">Excluir</a>
            </li>
        </c:forEach>
    </body>
</html>