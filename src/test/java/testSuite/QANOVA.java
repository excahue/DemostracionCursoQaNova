package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.SendForm;

public class QANOVA {
    ChromeDriver webDriver;
    String url="";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","driverNavegador/chromedriver.exe");
        webDriver= new ChromeDriver();
        webDriver.get(url);
    }


    @AfterTest
    public void close(){
        webDriver.close();
    }

    @Test
    public void CPM0001.enviarformularioqa(){
    SendForm test= new SendForm();
    test.enviarform(webDriver);
    }

}
