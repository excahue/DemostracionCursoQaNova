package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    WebElement inputBuscar;

    @FindBy(xpath ="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")
    WebElement btnBuscar;

    //@FindBy(xpath ="//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
    //WebElement btnBuscar;

    public Google (WebDriver webdriver){
        PageFactory.initElements(webdriver,this);
    }


    public void ingresarbusqueda(String prueba){
      inputBuscar.sendKeys(prueba);
    }

    public void clickbtnbuscar(){
        btnBuscar.click();
    }

}

