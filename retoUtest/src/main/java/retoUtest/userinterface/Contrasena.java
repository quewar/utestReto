package retoUtest.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class Contrasena extends PageObject {
    public static Target CONTRA= Target.the("Ingresar Contraseña").located(By.id("password"));
    public static Target CONFIRM= Target.the("Confirmar Contraseña").located(By.id("confirmPassword"));
    public static Target CHECK01= Target.the("Seleccionar Mantener informado").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static Target CHECK02= Target.the("Seleccionar terminos").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static Target CHECK03= Target.the("Seleccionar politica").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static Target REGISTRAR_USUARIO= Target.the("Confirmar registro Usuario").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
    public static By BIENVENIDO = By.xpath("//div[@class='image-box-header']");
}
