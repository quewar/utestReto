package retoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Direccion extends PageObject {

    public static final Target CAMPO_CIUDAD =
            Target.the("Ingresar Ciudad").located(By.id("city"));
    public static final Target CAMPO_CODIGO=
            Target.the("Ingresar Código").located(By.id("zip"));
    public static final Target OPCION_PAIS=
            Target.the("Seleccionar Pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target PAIS=
            Target.the("Ingresar Pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_DISPOSITIVOS=
            Target.the("Siguiente  Sección").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}


