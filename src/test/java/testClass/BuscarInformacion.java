package testClass;

import org.openqa.selenium.WebDriver;
import page.Google;

public class BuscarInformacion {

    private Google google;

    public void buscarperro(WebDriver webdriver){
        google = new Google(webdriver);
        google.ingresarbusqueda("perro");
        google.clickbtnbuscar();

    }

}
