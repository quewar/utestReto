package retoUtest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoUtest.model.RegistroDatos;
import retoUtest.questions.Validar;
import retoUtest.tasks.*;

import java.util.List;

public class Registro {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Kevin quiere registrarse en Utest$")
    public void kevinQuiereRegistrarseEnUtest() throws Exception {
    OnStage.theActorCalled("Kevin").wasAbleTo(
            Visitar.paginaUtest()
            );
    }


    @When("^debera validar que el usuario no exista  y los datos que ingresa$")
    public void deberaValidarQueElUsuarioNoExistaYLosDatosQueIngresa(List <RegistroDatos> registroDatos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
        RegistroAcerca.enPaginaUtest(
                registroDatos.get(0).getStrNombre(), registroDatos.get(0).getStrApellido(),
                registroDatos.get(0).getStrCorreo(), registroDatos.get(0).getStrMes(),
                registroDatos.get(0).getStrDia(), registroDatos.get(0).getStrAno()),
                RegistroUbicacion.utestDireccion(
                        registroDatos.get(0).getStrCiudad(), registroDatos.get(0).getStrCodigo(),
                        registroDatos.get(0).getStrPais()
                ),
                RegistroDispositivos.utestDispositivos(
                        registroDatos.get(0).getStrComputadora(), registroDatos.get(0).getStrVersion(), registroDatos.get(0).getStrIdioma(),
                        registroDatos.get(0).getStrMovil(), registroDatos.get(0).getStrModelo(), registroDatos.get(0).getStrOperativo()
                ),
                RegistroFinal.utestContrasena(
                        registroDatos.get(0).getStrContrasena()

                )
        );
    }

    @Then("^el registro se realizo de manera exitosa o el usuario existe o  los datos no son correctos$")
    public void elRegistroSeRealizoDeManeraExitosaOElUsuarioExisteOLosDatosNoSonCorrectos(List <RegistroDatos> registroDatos) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                Validar.texto(
                        registroDatos.get(0).getStrTitulo()
                )));
        System.out.println(""+Validar.texto(registroDatos.get(0).getStrTitulo()).answeredBy(OnStage.theActorInTheSpotlight()));

    }
}
