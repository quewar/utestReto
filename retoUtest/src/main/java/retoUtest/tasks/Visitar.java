package retoUtest.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import retoUtest.userinterface.UtestPage;

public class Visitar implements Task {
    private UtestPage utestpage;
    public static Visitar paginaUtest() {
        return Tasks.instrumented(Visitar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(utestpage));
    }
}
