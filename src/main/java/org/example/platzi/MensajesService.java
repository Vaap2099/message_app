package org.example.platzi;

import java.util.Scanner;

public class MensajesService {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Escribe el autor del mensaje");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.CrearMensajeDB(registro);
    }

    public static void listarMensaje() {

    }

    public static void borrarMensaje() {

    }

    public static void editarMensaje() {

    }
}
