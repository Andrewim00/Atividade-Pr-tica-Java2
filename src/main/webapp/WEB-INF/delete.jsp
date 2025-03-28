<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8" />
        <title>Novo Gênero</title>
    </head>

    <body>
        <h1>Novo Gênero</h1>

        <form action="/genero/insert" method="post">
            <label>Descrição do Gênero</label>
            <input type="text" name="descricao">
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>