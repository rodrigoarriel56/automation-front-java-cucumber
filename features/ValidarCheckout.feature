# language: pt
# encoding UTF-8
Funcionalidade: Validar carrinho

  Contexto: Evidenciar Teste;
    Dado que estou na página de login através da url "urlLogin"
    E preencho os campos para logar
      | standard_user | secret_sauce |
    E clico no botão Login
    E que utilizo o word para evidências com as informações de execução
      | Homologação | Adicionar produto no carrinho com Sucesso | Produto no carrinho | Aplicação e-Commerce | e-Commercer Swag Labs | Rodrigo Arriel | 01 | 01 |

	@execute @chrome-same-session @generate-word @validarcheckout
  Esquema do Cenario: CT - VALIDAR CHECKOUT - Validar checkout com Sucesso.
  	E clico no botão checkou
    Quando preencho campo primeiro nome <PRIMEIRO>
    E preencho campo segundo nome <SEGUNDO>
    E preencho campo cep <CEP>
    Quando clico no botão continue
    Então tela de detalhes da compra devera ser exibida <MENSAGEM>
    
  Exemplos:
      | PRIMEIRO  | SEGUNDO  |    CEP     | MENSAGEM   |
      | "Rodrigo" | "Arriel" | "01153020" | "Overview" |      