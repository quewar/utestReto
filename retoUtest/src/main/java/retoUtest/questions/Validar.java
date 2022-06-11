package retoUtest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import retoUtest.userinterface.Contrasena;

public class Validar implements Question<Boolean> {


    private String strTitulo;

    public Validar(String strTitulo) {
        this.strTitulo = strTitulo;
    }

    public static Question<Boolean> texto(String strTitulo) {
        return new Validar(strTitulo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String bienvenidos = BrowseTheWeb.as(actor).find(Contrasena.BIENVENIDO).getText();
        if (strTitulo.equals(bienvenidos)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}

