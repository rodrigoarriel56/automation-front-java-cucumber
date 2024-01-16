/**
 * A Classe Produto é responsável por cenários de teste
 * as ações de dicionar produtos no carrinho.
 *
 * @author Rodrigo Arriel <rodrigoarriel56@gmail.com>
 * @version 1.0
 */

package stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.ProdutoPage;
import pages.LoginPage;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ProdutoStep {

    private LoginPage loginPage = new LoginPage(Hooks.driver);
    private ProdutoPage addProduto = new ProdutoPage(Hooks.driver);
 
    @Dado("^preencho os campos para logar$")
    public void preencho_os_campos_para_logar(DataTable userCredentials) throws Throwable {
        List<List<String>> data = userCredentials.raw();
        loginPage.setFieldPassword(data.get(0).get(1));
    }

    @Quando("^clico no produto desejado$")
    public void clico_no_produto_desejado() throws Throwable {
    	addProduto.submitBtnCart();
    	addProduto.submitBtnBackpack();
    }

    @Então("^produto devera ser adicionado no carrinho com sucesso \"([^\"]*)\"$")
    public void produto_devera_ser_adicionado_no_carrinho_com_sucesso(String mensagem) throws Throwable {
        assertEquals(mensagem, addProduto.getTextoDescricao());
    }
}
