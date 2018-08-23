package com.endava.api.glue;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

public class CreateAccountSteps {
    @Dado("^que Sergio quiere crear una cuenta con datos validos$")
    public void queSergioQuiereCrearUnaCuentaConDatosValidos() {
    }

    @Cuando("^realiza una peticion para crear la cuenta$")
    public void realizaUnaPeticionParaCrearLaCuenta() {
    }

    @Dado("^que Sergio quiere crear una cuenta con \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" y \"([^\"]*)\"$")
    public void queSergioQuiereCrearUnaCuentaConY(String email, String password, String confirmPassword, String name) {
    }

    @Dado("^que Sergio quiere crear una cuenta con datos existentes$")
    public void queSergioQuiereCrearUnaCuentaConDatosExistentes() {
    }
}
