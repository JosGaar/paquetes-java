package com.josuegarcia.app.jardin;

import com.josuegarcia.app.hogar.*;
import static com.josuegarcia.app.hogar.Persona.saludar;
import static com.josuegarcia.app.hogar.Persona.GENERO_MASCULINO;
import static com.josuegarcia.app.hogar.Persona.GENERO_FEMENINO;
import static com.josuegarcia.app.hogar.ColorPelo.CAFE;

public class EjemploPaquetes {
    public static void main(String[] args) {

        // Estableciendo valores a los atributos de persona.
        Persona persona = new Persona();
        persona.setNombre("Josue");
        persona.setApellido("Garcia");
        persona.setColorPelo(CAFE); // Utilizando el import estatico.
        persona.setColorPelo(ColorPelo.NEGRO); // Utilizando la clase.
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Pitbull";

        // Utilizando el metodo jugar que es a nivel paquete.
        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        // Import estatico
        String saludo = saludar();
        String generoHombre = GENERO_MASCULINO;
        String generoMujer = GENERO_FEMENINO;
    }
}
