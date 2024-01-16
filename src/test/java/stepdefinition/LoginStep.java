/**
 * A Classe Login é responsável por executar o login do usuário em tela
 *
 * @author Rodrigo Arriel <rodrigoarriel56@gmail.com>
 * @version 1.0
 */

package stepdefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import frontutils.PropertiesHelper;
import pages.LoginPage;

import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("unused")
public class LoginStep {

    @SuppressWarnings("static-access")
	private Properties properties = new PropertiesHelper().getProperties();
    private LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage(Hooks.driver);
    }

    @Dado("^que estou na página de login através da url \"([^\"]*)\"$")
    public void que_estou_na_página_de_login_através_da_url(String url) throws Throwable {
        loginPage.setUrl(properties.getProperty(url));
    }

    @Quando("^preencho o campo user \"([^\"]*)\"$")
    public void preencho_o_campo_user(String user) throws Throwable {
        loginPage.setFieldUser(user);
    }

    @Quando("^preencho o campo senha \"([^\"]*)\"$")
    public void preencho_o_campo_senha(String password) throws Throwable {
        loginPage.setFieldPassword(password);
    }

    @Quando("^clico no botão Login$")
    public void clico_no_botão_Login() throws Throwable {
        loginPage.submitFieldLogin();
    }

    @Então("^a aplicação exibe a mensagem \"([^\"]*)\" ")
    public void a_aplicação_exibe_a_mensagem_de_bem_vindo(String mensagem) throws Throwable {
        assertEquals(mensagem, loginPage.getMessageLoginSuccess());
    }


}
