package retoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



public class IniciarRegistro extends PageObject {

    public static final Target BOTON_REGISTRO =
            Target.the("Permitira al usuario ver el formulario").locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");

    public static final Target CAMPO_NOMBRE=
            Target.the("Ingresar Nombre Usuario").located(By.id("firstName"));
    public static final Target CAMPO_APELLIDO=
            Target.the("Ingresar  Apellido").located(By.id("lastName"));
    public static final Target CAMPO_CORREO=
            Target.the("Ingresar Correo").located(By.id("email"));
    public static final Target OPCION_MES=
            Target.the("Ingresar Mes Nacimiento").located(By.id("birthMonth"));
    public static final Target OPCION_DIA=
            Target.the("Ingresar Dia Nacimiento").located(By.id("birthDay"));
    public static final Target OPCION_ANO=
            Target.the("Ingresar Año Nacimiento").located(By.id("birthYear"));
    public static final Target SIGUIENTE_SOBRE=
            Target.the("Boton Siguiente Formulario").located(By.xpath("//a[@class='btn btn-blue']"));


}
