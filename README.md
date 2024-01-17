
# Framework de Automação de testes para FRONT-END WEB #

## Pré-requisitos ##

* Possuir java instalado **> Version 8 ou superior **
* https://www.java.com/en/download/

* Possuir Plugin Cucumber para Java
* Possuir Plugin Maven instalado e configurado  

## Instalações e configurações do ambiente ##

 ## Primeiro passo. ##
  
    - Acessar o endereço do repositorio do projeto
 
    - https://github.com/rodrigoarriel56/automation-front-java-cucumber
 	
 ## Segundo passo ##
		
		- Para o desenvolvimento do projeto, foi utilizado a IDE Eclipse, mas fica a critério do QA/DEV na escolha da IDE desejada
 
    	- Realizar a importação do projeto clonado para o seu Workspace - (Neste momento será baixado e atualizado as dependências do projeto).
    
 ## Pronto projeto instalado e configurado na maquina

## Executando o projeto ##
	
		- Para a execução dos testes, temos duas possibilidade: 
			
			1º - Caso o executor não tenha nenhuma IDE de desenvolvmento em sua maquina, o mesmo pode acessar o diretorio do projeto e executar o seguinte comando:
				 - mvn install 
				  - mvn run 
			
			2º - Para a execução utilizando uma IDE, o executor deverá olhar a classe "runner" nela contem as TAG que deverão ser executadas nos testes
				 - Como se trata de um projeto de automação de testes em BDD(cucumber), temos como premissa as configurações de execuções das funcionalidade.

 ## ATENÇÃO ##

* Para executar o projeto, devemos tomar os seguintes cuidados de segurança:

	  - MAC: Verificar se o driver do google driver tem permissão para ser executado e verificar qual a versão do mesmo.
	  
	  - Windows: Verificar a versão do google chrome e a versão do chromeDriver
	             Também no Windows. Verificar o protect mode encontra-se habilitado.
 
 * Para ajudar com configurações e solicitações mencionadas acima, segue URL dos ChromeDriver
 
 	 - https://chromedriver.chromium.org/downloads
    


## Gerador de Evidência ##

	 As evidências serão geradas na pasta output localizada na raiz do projeto.
	/output

## BUG encontrado ##

	 As execuções dos testes, foram deparados com alguns BUG's. Os detalhes dos mesmos encontra-se no seguinte diretorio:
	/BUGs
