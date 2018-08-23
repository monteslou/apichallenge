package com.endava.api.glue;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;

public class LogInSteps {
    @Dado("^que Sergio quiere iniciar sesion con datos existentes")
    public void queSergioQuiereIniciarSesionConDatosValidos() {
    }

    @Cuando("^realiza una peticion para iniciar sesion$")
    public void realizaUnaPeticionParaIniciarSesion() {
    }

    @Dado("^que Sergio quiere iniciar sesion con un correo inexistente$")
    public void queSergioQuiereIniciarSesionConUnCorreoInexistente() {
    }

    @Y("^contraseña incorrecta$")
    public void contraseñaIncorrecta() {
    }
}
