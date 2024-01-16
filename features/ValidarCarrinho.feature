# language: pt
# encoding UTF-8
Funcionalidade: Validar Checkout

  Contexto: Evidenciar Teste;
    Dado que estou na página de login através da url "urlLogin"
    E preencho os campos para logar
      | standard_user | secret_sauce |
    E clico no botão Login
    E que utilizo o word para evidências com as informações de execução
      | Homologação | Validar checkout | Produto no carrinho | Aplicação e-Commerce | e-Commercer Swag Labs | Rodrigo Arriel | 01 | 01 |
    
  @execute @chrome-same-session @generate-word @validacarrinho
  Esquema do Cenario: CT - REMOVER PRODUTO DO CARRINHO - Remover produto do carrinho com Sucesso.
    Quando clico no produto desejado
    Então produto devera ser adicionado no carrinho com sucesso
    Quando clico no carrinho
    E clico no botão remover produto
    Então produto devera ser removido do carrinho
    
	@execute @chrome-same-session @generate-word @validarcheckout
  Esquema do Cenario: CT - ADICIONAR PRODUTO - Adicionar produto no carrinho com Sucesso.
    Quando clico no produto desejado
    E clico no botão carrinho
    Então tela de detalhes do produto devera ser apresentado