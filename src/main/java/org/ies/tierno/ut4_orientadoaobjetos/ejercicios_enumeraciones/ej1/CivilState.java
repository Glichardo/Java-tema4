package org.ies.tierno.ut4_orientadoaobjetos.ejercicios_enumeraciones.ej1;

public enum CivilState {
    Single("Soltero"), Divorced("Divorciado"), Widower("Viudo"), Married("Casado");
    private String description;
    private CivilState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
