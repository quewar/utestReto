package retoUtest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retoUtest.userinterface.Contrasena;

public class RegistroFinal implements Task {

    public RegistroFinal(String strContrasena) {
        this.strContrasena = strContrasena;

    }

    private String  strContrasena;


    public static RegistroFinal utestContrasena(String strContrasena) {
        return Tasks.instrumented(RegistroFinal.class, strContrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strContrasena).into(Contrasena.CONTRA),
                Enter.theValue(strContrasena).into(Contrasena.CONFIRM),
                Click.on(Contrasena.CHECK01),
                Click.on(Contrasena.CHECK02),
                Click.on(Contrasena.CHECK03),
                Click.on(Contrasena.REGISTRAR_USUARIO)
                );

    }
}
