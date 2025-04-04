<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8" />
        <title>Editar Gênero</title>
    </head>

    <body>
        <h1>Edição de Gênero</h1>

        <form action="/genero/update" method="post">
            <input type="hidden" name="id" value="${genero.id}">
            <label>Descrição do Gênero</label>
            <input type="text" name="nome" value="${genero.nome}">
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>