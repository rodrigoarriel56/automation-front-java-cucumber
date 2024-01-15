# language: pt
# encoding UTF-8
Funcionalidade: Logar na apliação Swag Labs

  Contexto: Evidenciar Teste;
    Dado que utilizo o word para evidências com as informações de execução
      | Homologação | Logar na Aplicação Swag Labs | Logar Swag Labs | Aplicação e-Commerce | e-Commercer Swag Labs | Rodrigo Arriel | 01 | 01 |

  @execute @chrome-same-session @generate-word @login
  Esquema do Cenario: CT - LOGIN - Logar na Aplicação Swag Labs com sucesso.
    Dado que estou na página de login através da url "urlLogin"
    Quando preencho o campo user <USER>
    E preencho o campo senha <SENHA>
    E clico no botão Login
    Então a aplicação exibe a mensagem <MENSAGEM>
    

    Exemplos:
      | 	  USER        |     SENHA      |  MENSAGEM   |
      | "standard_user" | "secret_sauce" | "Swag Labs" |
