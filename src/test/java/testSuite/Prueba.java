package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.BuscarInformacion;

public class Prueba {

    ChromeDriver webDriver;
    String url="https://www.google.com/webhp?hl=es&sa=X&ved=0ahUKEwiNp9CZq8v3AhXuKrkGHQDgB_QQPAgI";


    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","driverNavegador/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @AfterTest
    public void closedriver(){
       webDriver.close();
    }

    @Test
    public void buscarinformacion(){
        BuscarInformacion buscarinformacion= new BuscarInformacion();
        buscarinformacion.buscarperro(webDriver);
    }

}
