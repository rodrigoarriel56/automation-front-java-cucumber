/**
 * A Classe Carrinho Checkout tem como finalidade as execuções dos testes das duas funcionalidades.
 *
 * @author Rodrigo Arriel <rodrigoarriel56@gmail.com>
 * @version 1.0
 */

package stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import pages.ProdutoPage;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CarrinhoCheckoutStep {

    //private Properties properties = new PropertiesHelper().getProperties();
    private LoginPage loginPage = new LoginPage(Hooks.driver);
    private ProdutoPage addProduto = new ProdutoPage(Hooks.driver);

    public CarrinhoCheckoutStep() {
    	loginPage = new LoginPage(Hooks.driver);
    }

    @Dado("^preencho os campos para logar$")
    public void preencho_os_campos_para_logar(DataTable userCredentials) throws Throwable {
        List<List<String>> data = userCredentials.raw();
        loginPage.setFieldPassword(data.get(0).get(1));
    }

    @Quando("^clico no produto desejdo \"([^\"]*)\"$")
    public void clico_no_produto_desejdo() throws Throwable {
        addProduto.submitBtnBackpack();
        addProduto.submitBtnCart();
    }
    
    @E("^clico no botão carrinho \"([^\"]*)\"$")
    public void clico_no_botao_carrinho() throws Throwable {
    	addProduto.submitBtnCarrinho();
    }
    
    @E("^clico no botão remover produto \"([^\"]*)\"$")
    public void clico_no_botao_remover_produto() throws Throwable {
    	addProduto.submitBtnRemove();
    }
    
    @Quando("^clico no botão continue comprando \"([^\"]*)\"$")
    public void clico_no_botao_continue_comprando() throws Throwable {
    	addProduto.submitBtnContinueComprando();
    }
    
    @E("^clico no produto \"([^\"]*)\"$")
    public void clico_no_produto() throws Throwable {
        addProduto.submitBtnBackpack();
        addProduto.submitBtnCart();
        addProduto.submitBtnCarrinho();
    }    
    
    @Então("^tela de detalhes do produto devera ser apresentado \"([^\"]*)\"$")
    public void tela_de_detalhes_do_produto_devera_ser_apresentado(String mensagem) throws Throwable {
        assertEquals(mensagem, addProduto.getTextoDescricao());
    }
    
    @E("^clico no botão checkout \"([^\"]*)\"$")
    public void clico_no_botao_checkout() throws Throwable {
    	addProduto.btnCheckout();
    }
    
    @Quando("^preencho campo primeiro nome \"([^\"]*)\"$")
    public void preencho_campo_primeiro_nome() throws Throwable {
    	addProduto.submitBtnNomePrimeiro();
    	
    }
    
    @E("^preencho campo segundo nome \"([^\"]*)\"$")
    public void preencho_campo_segundo_nome() throws Throwable {
    	addProduto.submitBtnNomeSegundo();
    }
    
    @E("^preencho campo cep \"([^\"]*)\"$")
    public void preencho_campo_cep() throws Throwable {
    	addProduto.submitBtnCep();
    	addProduto.btnContinueCheckout();
    }
    
    @Então("^tela de detalhes da compra devera ser exibida \"([^\"]*)\"$")
    public void tela_de_detalhes_da_compra_devera_ser_exibida(String mensagem) throws Throwable {
        assertEquals(mensagem, addProduto.getOverview());
    }
    
    
    

}
