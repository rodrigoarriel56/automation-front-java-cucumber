/**
 * A Classe LoginPage é responsável por gerenciar os obejetos da pagina de login
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

public class LoginPage extends BaseWebPageFactory {

    //Locators

    @FindBy(how = How.ID, using = "user-name")
    private WebElement setFieldUsername;

    @FindBy(how = How.ID, using = "password")
    private WebElement setFieldPassword;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement submitFieldLogin;
    
    @FindBy(how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Close Menu'])[1]/following::div[2]")
    private WebElement validateMessagemLogin;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUrl(String pUrl) {
        driver.navigate().to(pUrl);
    }

    public void setFieldUser(String user) {
        setFieldUsername.sendKeys(user);
    }

    public void setFieldPassword(CharSequence password) {
        setFieldPassword.sendKeys(password);
    }

    public void submitFieldLogin() {
        submitFieldLogin.click();
    }

    public String getMessageLoginSuccess() throws InterruptedException {
        waitUntilElementIsVisible(validateMessagemLogin);
        return validateMessagemLogin.getText();
    }

   
  }
