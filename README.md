Para rodar essa aplicação em sua máquina, siga os seguintes passos:

1° - Navegue até a pasta: aprendizado\src\main\resources\application.properties

2° - Nessa parte: spring.datasource.password="", você vai colocar a senha do seu Banco PostgreSQL, mas sem as aspas

3° - Acesse o pgAdmin e crie um banco com esse nome: exemplo-aprendizado

      ---  ATÊNÇÃO: ---
      não é necessário criar a tabela e nem os atributos, pois isso vai ser criado automaticamente
      quando você rodar a aplicação
      
4° - Rode o projeto

5° - Use uma ferramenta como o Postman ou Insomnia para testar as requisições Http

6° - Use esses endpoints para cada uma das requisições:

Enpoint apenas para teste
  -- GET  http://localhost:8083/usuario/teste

Endpoint que vai trazer todos os usuários cadastrados
  -- GET  http://localhost:8083/usuario/allUsers

Endpoint que busca um usuário pelo ID (basta colocar o id do usuário após o userById/)
  -- GET  http://localhost:8083/usuario/userById/

Endpoint que vai salvar um usuário no banco (Envie os dados no formato json)
  -- POST  http://localhost:8083/usuario/saveUser

Endpoint que vai editar um usuário (Adicione o id após o updateUsuario/, e os dados no formato json)
  -- UPDATE  http://localhost:8083/usuario/updateUsuario/


Endpoint que vai excluir um usuário (Adicione o id após o deleteUsuario/)
  -- DELETE  http://localhost:8083/usuario/deleteUsuario/
