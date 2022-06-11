package retoUtest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import retoUtest.userinterface.Direccion;
import retoUtest.userinterface.Dispositivos;

public class RegistroDispositivos implements Task {

    public RegistroDispositivos(String strComputadora, String strVersion, String strIdioma, String strMovil, String strModelo, String strOperativo) {
        this.strComputadora = strComputadora;
        this.strVersion = strVersion;
        this.strIdioma = strIdioma;
        this.strMovil = strMovil;
        this.strModelo = strModelo;
        this.strOperativo = strOperativo;
    }

    private String strComputadora;
    private String strVersion;
    private String strIdioma;
    private String strMovil;
    private String strModelo;
    private String strOperativo;

    public static RegistroDispositivos utestDispositivos(String strComputadora, String strVersion, String strIdioma, String strMovil, String strModelo, String strOperativo) {
    return Tasks.instrumented(RegistroDispositivos.class, strComputadora, strVersion, strIdioma, strMovil, strModelo, strOperativo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Dispositivos.COMPUTADORA),
                Enter.theValue(strComputadora).into(Dispositivos.CAMPO_COMPUTADORA).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Dispositivos.VERSION),
                Enter.theValue(strVersion).into(Dispositivos.CAMPO_VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Dispositivos.IDIOMA),
                Enter.theValue(strIdioma).into(Dispositivos.CAMPO_IDIOMA).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Dispositivos.MOVIL),
                Enter.theValue(strMovil).into(Dispositivos.CAMPO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Dispositivos.MODELO),
                Enter.theValue(strModelo).into(Dispositivos.CAMPO_MODELO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Dispositivos.BOTON_CONTRASENA)
                );


    }
}
