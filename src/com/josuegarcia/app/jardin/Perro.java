package com.josuegarcia.app.jardin;

import com.josuegarcia.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
