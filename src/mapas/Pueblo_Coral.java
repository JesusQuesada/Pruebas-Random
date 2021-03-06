/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import Eventos.EventoAgresion;
import Eventos.EventosInteractuar;

/**
 *
 * @author Diego
 */
public class Pueblo_Coral extends Mapas {

    public Pueblo_Coral() {
        direccion = null;
        nSector = 0;
    }

    public void casa_Coral1() {
        System.out.println("Acabas de entrar por el NORTE al Pueblo Coral. Te rodean pequeñas granjas con cerdos, vacas y gallinas. Cuanto más al SUR hay casas de madera, al ESTE ?? y hacia el OESTE ves un cartel.\n ¿Qué quieres hacer?");
        direccion = sc.next();
        if (direccion.equals("NORTE") || direccion.equals("norte")) {
            nSector = 1;
            comprobarDireccion();
        } else if (direccion.equals("SUR") || direccion.equals("sur")) {
            nSector = 3;
            comprobarDireccion();
        } else if (direccion.equals("ESTE") || direccion.equals("este")) {
            nSector = 4;
            comprobarDireccion();
        } else if (direccion.equals("OESTE") || direccion.equals("oeste")) {
            nSector = 2;
            comprobarDireccion();
        } else if (direccion.equals("ATACAR ANIMAL") || direccion.equals("atacar animal")) {
            nEventoAgresion = 1;
            comprobarEvento();
        } else if (direccion.equals("LEER") || direccion.equals("leer")) {
            // Si leemos tenemos que volver a preguntar que queremos hacer !!!!!!!
            comprobarDireccion();
        }

    }

    public void casa_Coral2() {
        System.out.println("Acabas de entrar por el NORTE al Pueblo Coral. Te rodean pequeñas granjas con cerdos, vacas y gallinas. Cuanto más al SUR hay casas de madera, al ESTE ?? y hacia el OESTE ves un cartel.\n ¿Qué quieres hacer?");
        direccion = sc.next();
        if (direccion.equals("NORTE") || direccion.equals("norte")) {
            nSector = 1;
            comprobarDireccion();
        } else if (direccion.equals("SUR") || direccion.equals("sur")) {
            nSector = 3;
            comprobarDireccion();
        } else if (direccion.equals("ESTE") || direccion.equals("este")) {
            nSector = 4;
            comprobarDireccion();
        } else if (direccion.equals("OESTE") || direccion.equals("oeste")) {
            nSector = 2;
            comprobarDireccion();
        } else if (direccion.equals("ATACAR ANIMAL") || direccion.equals("atacar animal")) {
            nEventoAgresion = 1;
            comprobarEvento();
        } else if (direccion.equals("LEER") || direccion.equals("leer")) {
            // Si leemos tenemos que volver a preguntar que queremos hacer !!!!!!!
            comprobarDireccion();
        }

    }

    public void plaza_Coral() {

        System.out.println("Situado desde el centro de la plaza ves gente animada y niños jugando. Sientes que es un pueblo tranquilo, sin sobresaltos.\n ¿Qué quieres hacer?");
        direccion = sc.next();

    }

    public void FueraTienda_Coral() {

        System.out.println("Llegas a un edificio de madera con un gran cartel que pone 'EL PERCEBE'. Hacia el sur puedes ver el puerto a lo lejos. \n ¿Qué quieres hacer, ENTRAR, ir al SUR o VOLVER?");
        direccion = sc.next();

        if (direccion.equals("ENTRAR") || direccion.equals("entrar")) {
            nSector = 21;
            comprobarDireccion();
        } else if (direccion.equals("SUR") || direccion.equals("sur")) {
            nSector = 5;
            comprobarDireccion();
        } else if (direccion.equals("VOLVER") || direccion.equals("volver")) {
            nSector = 3;
            comprobarDireccion();
        }

    }

    //FALTA EL IF DE VOLVER AL BOSQUE
    public void afueras_Coral1() {
        System.out.println("Estas en las afueras del Pueblo Coral. \n ¿Qué quieres hacer, ENTRAR o VOLVER al bosque?");
        direccion = sc.next();

        if (direccion.equals("ENTRAR") || direccion.equals("entrar")) {
            nSector = 7;
            comprobarDireccion();
        }
    }

    public void tienda_Coral() {
        System.out.println("Dentro de la tienda observas a un anciano limpiando la trastienda. \n ¿Qué quieres hacer, HABLAR o VOLVER?");
        direccion = sc.next();

        if (direccion.equals("HABLAR") || direccion.equals("hablar")) {
            nEventos = 1;
            comprobarEvento();
        } else if (direccion.equals("VOLVER") || direccion.equals("VOLVER")) {
            nSector = 2;
            comprobarEvento();
        }

    }

    public void comprobarDireccion() {
        switch (nSector) {

            case 1:
                afueras_Coral1();
                break;
            case 2:
                afueras_Coral1();
                break;
            case 3:
                casa_Coral1();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                plaza_Coral();
                break;
            case 7:
                break;
            case 8:
                casa_Coral2();
                break;
            case 21:

                break;

        }
    }

    //EVENTOS DE AGRESION
    public void comprobarEventoAgresion() {
        switch (nEventoAgresion) {

            case 1:
                EventoAgresion evento1 = new EventoAgresion();
                evento1.AgresionAnimal();
                break;
        }
    }

    //EVENTOS NORMALES
    public void comprobarEvento() {
        EventosInteractuar evento1 = new EventosInteractuar();
        switch (nEventos) {

            case 1:
                evento1.hablarMercader();
                break;
        }

    }

}
