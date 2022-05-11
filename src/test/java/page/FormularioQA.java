package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormularioQA {

    @FindBy(xpath="")
    WebElement txtnombre;

    @FindBy(xpath="")
    WebElement txtapellido;

    @FindBy(xpath="")
    WebElement txtedad;

    @FindBy(xpath="")
    WebElement listvalor;

    @FindBy(xpath="")
    WebElement chkvalor;

    @FindBy(xpath="")
    WebElement btnenviar;

    public FormularioQA(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }//constructor

    public void nombre(String nombre){
        txtnombre.sendKeys(nombre);
    }
    public void apellido(String apellido){
        txtapellido.sendKeys(apellido);
    }

    public void edad(String edad){
        txtedad.sendKeys(edad);
    }
    public void Listavalor(String lista){
        listvalor.sendKeys(lista);
    }
    public void checkvalor(String check){
        listvalor.sendKeys(check);
    }
    public void enviar(){
        btnenviar.click();
    }



}//fin class
