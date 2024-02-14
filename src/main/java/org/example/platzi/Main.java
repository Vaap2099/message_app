package org.example.platzi;
import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        do {
            System.out.println("-----------------");
            System.out.println("Aplicacion de Mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensajes");
            System.out.println("3. Editar Mensaje");
            System.out.println("4. Eliminar Mensajes");
            System.out.println("5. Salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                case 5:
                    System.out.println("Gracias por elegir nuestra aplicacion");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }


        } while (opcion != 5);


    }
}