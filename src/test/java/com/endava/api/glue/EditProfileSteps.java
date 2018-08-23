package com.endava.api.glue;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class EditProfileSteps {
    @Dado("^que Sergio quiere editar su \"([^\"]*)\"$")
    public void queSergioQuiereEditarSu(String attribute) {
    }

    @Cuando("^realiza una peticion para editar$")
    public void realizaUnaPeticionParaEditar() {
    }

    @Entonces("^el sistema retorna \"([^\"]*)\" actualizado$")
    public void elSistemaRetornaActualizado(String attribute) {
    }

    @Dado("^que Sergio quiere editar su perfil con \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" y contraseña actual valida$")
    public void queSergioQuiereEditarSuPerfilConYContraseñaActualValida(String email, String password, String confirmPassword) {
    }

    @Dado("^que Sergio quiere editar su perfil con \"([^\"]*)\", \"([^\"]*)\" y contraseña actual invalida$")
    public void queSergioQuiereEditarSuPerfilConYContraseñaActualInvalida(String password, String confirmPassword) {
    }

    @Dado("^que Sergio quiere editar su perfil con datos existentes$")
    public void queSergioQuiereEditarSuPerfilConDatosExistentes() {
    }
}
