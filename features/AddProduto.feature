# language: pt
# encoding UTF-8
Funcionalidade: Adicionar Produto

  Contexto: Evidenciar Teste;
    Dado que estou na página de login através da url "urlLogin"
    E preencho os campos para logar
      | standard_user | secret_sauce |
    E clico no botão Login
    E que utilizo o word para evidências com as informações de execução
      | Homologação | Adicionar produto no carrinho com Sucesso | Produto no carrinho | Aplicação e-Commerce | e-Commercer Swag Labs | Rodrigo Arriel | 01 | 01 |

  @execute @chrome-same-session @generate-word @produto
  Esquema do Cenario: CT - ADICIONAR PRODUTO - Adicionar produto no carrinho com Sucesso.
    Quando clico no produto desejado
    Então produto devera ser adicionado no carrinho com sucesso
