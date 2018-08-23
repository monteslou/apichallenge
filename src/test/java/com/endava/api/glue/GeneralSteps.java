package com.endava.api.glue;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class GeneralSteps {
    @Y("^status code \"([^\"]*)\"$")
    public void statusCode(String statusCode) {
    }

    @Entonces("^el sistema retorna \"([^\"]*)\"$")
    public void elSistemaRetorna(String errorMessage) {
    }

    @Entonces("^el sistema retorna un token$")
    public void elSistemaUnRetornaToken() {
    }

    @Y("^el id del perfil$")
    public void elIdDelPerfil() {
    }

    @Entonces("^el sistema retorna status code \"([^\"]*)\"$")
    public void retornaStatusCode(String statusCode) {
    }
}
