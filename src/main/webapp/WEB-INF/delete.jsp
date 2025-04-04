<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8" />
        <title>Novo Gênero</title>
    </head>

    <body>
        <h1>Remover Gênero</h1>

        <p>Deseja mesmo EXCLUIR o gênero: ${genero.nome} ?</p>
        <form action="/genero/delete" method="post">
            <input type="hidden" name="id" value="${genero.id}">
            <button type="submit">Excluir</button>
        </form>
    </body>
</html>