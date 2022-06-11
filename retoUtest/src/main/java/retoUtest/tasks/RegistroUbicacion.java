package retoUtest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import retoUtest.userinterface.Direccion;
import retoUtest.userinterface.IniciarRegistro;

public class RegistroUbicacion implements Task {

    public RegistroUbicacion(String strCiudad, String strCodigo, String  strPais) {
        this.strCiudad = strCiudad;
        this.strCodigo = strCodigo;
        this.strPais = strPais;
    }

    private String strCiudad;
    private String strCodigo;
    private String strPais;

    public static RegistroUbicacion utestDireccion(String strCiudad, String strCodigo, String strPais) {
        return Tasks.instrumented(RegistroUbicacion.class, strCiudad, strCodigo, strPais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCiudad).into(Direccion.CAMPO_CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(Direccion.CAMPO_CIUDAD),
                Hit.the(Keys.ENTER).into(Direccion.CAMPO_CIUDAD),
                Enter.theValue(strCodigo).into(Direccion.CAMPO_CODIGO),
                Click.on(Direccion.OPCION_PAIS),
                Enter.theValue(strPais).into(Direccion.PAIS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Direccion.BOTON_DISPOSITIVOS)
                );
    }
}
