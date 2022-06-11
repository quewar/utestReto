package retoUtest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import retoUtest.userinterface.IniciarRegistro;

public class RegistroAcerca implements Task {

    private String strNombre;
    private String  strApellido;
    private String strCorreo;
    private String  strMes;
    private String strDia;
    private String  strAno;

    public RegistroAcerca(String strNombre, String  strApellido, String strCorreo , String strMes, String strDia, String strAno) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strCorreo = strCorreo;
        this.strMes = strMes;
        this.strDia = strDia;
        this.strAno = strAno;
    }


    public static RegistroAcerca enPaginaUtest(String strNombre, String strApellido, String strCorreo, String strMes, String strDia, String strAno) {
        return Tasks.instrumented(RegistroAcerca.class, strNombre , strApellido, strCorreo, strMes, strDia, strAno);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IniciarRegistro.BOTON_REGISTRO),
                Enter.theValue(strNombre).into(IniciarRegistro.CAMPO_NOMBRE),
                Enter.theValue(strApellido).into(IniciarRegistro.CAMPO_APELLIDO),
                Enter.theValue(strCorreo).into(IniciarRegistro.CAMPO_CORREO),
                SelectFromOptions.byVisibleText(strMes).from(IniciarRegistro.OPCION_MES),
                SelectFromOptions.byVisibleText(strDia).from(IniciarRegistro.OPCION_DIA),
                SelectFromOptions.byVisibleText(strAno).from(IniciarRegistro.OPCION_ANO),
                Click.on(IniciarRegistro.SIGUIENTE_SOBRE)

                );

    }
}
