package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(xpath = "")
    WebElement txtuser;

    @FindBy(xpath = "")
    WebElement txtpass;

    @FindBy(xpath = "")
    WebElement btnlogin;

    public Login(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }//constructor

    public void inputUser(String user){
        txtuser.sendKeys(user);
    }
    public void inputPass(String pass){
        txtpass.sendKeys(pass);
    }
    public void Log_in(){
        btnlogin.click();
    }

}//fin class
