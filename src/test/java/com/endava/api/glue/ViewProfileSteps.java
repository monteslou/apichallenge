package com.endava.api.glue;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class ViewProfileSteps {
    @Dado("^que Sergio quiere ver los datos de su perfil$")
    public void queSergioQuiereVerLosDatosDeSuPerfil() {
    }

    @Cuando("^realiza una peticion para ver el perfil$")
    public void realizaUnaPeticionParaVerElPerfil() {
    }

    @Y("^\"([^\"]*)\" del perfil$")
    public void delPerfil(String attribute) {
    }

    @Dado("^que Sergio quiere ver los datos de su perfil con un id invalido$")
    public void queSergioQuiereVerLosDatosDeSuPerfilConUnIdInvalido() {
    }

    @Dado("^que Sergio quiere ver los datos de todos los logros$")
    public void queSergioQuiereVerLosDatosDeTodosLosLogros() {
    }

    @Cuando("^realiza una peticion para ver logros")
    public void realizaUnaPeticionParaVerLogros() {
    }

    @Entonces("^el sistema retorna los logros$")
    public void elSistemaRetornaLosLogros() {
    }

    @Dado("^que Sergio quiere ver los datos de un logro con un id invalido$")
    public void queSergioQuiereVerLosDatosDeUnLogroConUnIdInvalido() {
    }
}
