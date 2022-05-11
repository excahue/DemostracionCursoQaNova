package testClass;

import org.openqa.selenium.WebDriver;
import page.FormularioQA;


public class SendForm {

    private FormularioQA form;

    public void enviarform(WebDriver webDriver){
        FormularioQA form= new FormularioQA(webDriver);
        form.nombre("Pedro");
        form.apellido("Gonzalez");
        form.edad("22");
        form.Listavalor("2");
        form.checkvalor("2,3");
        form.enviar();
    }

}
