/**
 * A Classe ProdutoPage é responsável por gerenciar os obejetos da pagina de produto
 *
 * @author Rodrigo Arriel <rodrigoarriel56@gmail.com>
 * @version 1.0
 */

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.BaseWebPageFactory;

public class ProdutoPage extends BaseWebPageFactory {

    //Locators
	
	//Botão de add produto Sauce Labs Bike Light
    @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bike-light")
    private WebElement submitBtnCart;
    
    //Botão de add produto Sauce Labs Backpack
    @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
    private WebElement submitBtnBackpack;
    
    //Botão carrinho
    @FindBy(how = How.ID, using = "shopping_cart_container")
    private WebElement submitBtnCarrinho;

    //Botão Remover
    @FindBy(how = How.ID, using = "remove-sauce-labs-bike-light")
    private WebElement submitBtnRemove;
    
  //Validação do texto da pagina de Checkout com suas informações
    @FindBy(how = How.XPATH, using = "//div[@id='header_container']/div[2]/span")
    private WebElement validateTextoDescricao;

    //Botão Continue Comprando
    @FindBy(how = How.ID, using = "continue-shopping")
    private WebElement submitBtnContinueComprando;

    //Botão checkout 
    @FindBy(how = How.ID, using = "checkout")
    private WebElement submitBtncheckout;

    //Botão Primeiro nome
    @FindBy(how = How.ID, using = "first-name")
    private WebElement submitBtnNomePrimeiro;
    
    //Botão Segundo nome
    @FindBy(how = How.ID, using = "last-name")
    private WebElement submitBtnNomeSegundo;
    
    //Campo CEP
    @FindBy(how = How.ID, using = "postal-code")
    private WebElement submitBtnCep;
    
    //Botão Checkout na tela de confirmação do pedido  
    @FindBy(how = How.ID, using = "continue")
    private WebElement btnContinueCheckout;
    
    //Validação do texto da pagina de Checkout - Overview 
    @FindBy(how = How.XPATH, using = "//div[@id='header_container']/div[2]/span")
    private WebElement validateOverviewSucess;

    public ProdutoPage(WebDriver driver) {
        super(driver);
    }

    public void setUrl(String pUrl) {
        driver.navigate().to(pUrl);
    }

    public void submitBtnCart() throws InterruptedException {
    	submitBtnCart.click();
    	Thread.sleep(2000);
    }

    public void submitBtnBackpack() throws InterruptedException {
    	submitBtnBackpack.click();
    	Thread.sleep(2000);
    }

    public void submitBtnCarrinho() throws InterruptedException {
    	submitBtnCarrinho.click();
    	Thread.sleep(2000);
    }

  
    public void submitBtnRemove() throws InterruptedException {
    	submitBtnRemove.click();
    	Thread.sleep(2000);
    }
    
    public void submitBtnContinueComprando() throws InterruptedException {
    	submitBtnContinueComprando.click();
    	Thread.sleep(2000);
    }
    
    public void btnCheckout() throws InterruptedException {
    	submitBtncheckout.click();
    	Thread.sleep(2000);
    }
    
    public void submitBtnNomePrimeiro() throws InterruptedException {
    	submitBtnNomePrimeiro.click();
    	Thread.sleep(2000);
    }
    
    public void submitBtnNomeSegundo() throws InterruptedException {
    	submitBtnNomeSegundo.click();
    	Thread.sleep(2000);
    }
    
    public void submitBtnCep() throws InterruptedException {
    	submitBtnCep.click();
    	Thread.sleep(2000);
    }
    
    public void btnContinueCheckout() throws InterruptedException {
    	btnContinueCheckout.click();
    	Thread.sleep(2000);
    }

    public String getOverview() throws InterruptedException {
        waitUntilElementIsVisible(validateOverviewSucess);
        return validateOverviewSucess.getText();
    }
    
    public String getTextoDescricao() throws InterruptedException {
        waitUntilElementIsVisible(validateTextoDescricao);
        return validateTextoDescricao.getText();
    }
    

}
