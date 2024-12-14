package com.AppBack.appBack.Funcion;
import java.io.IOException;
import java.net.InetAddress;
public class pingFuncion {
    public static void pingContinuously(String ipAddress, int timeout) {
        try {
            InetAddress inet = InetAddress.getByName(ipAddress);

            while (true) { // Bucle infinito
                boolean isReachable = inet.isReachable(timeout);

                if (isReachable) {
                    System.out.println("La dirección IP " + ipAddress + " responde al ping.");
                } else {
                    System.out.println("No se pudo alcanzar la dirección IP " + ipAddress + ".");
                }

                // Pausa de 1 segundo entre pings
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al intentar hacer ping: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String ip = "8.8.8.8"; // Dirección IP de ejemplo (Google DNS)
        int timeout = 5000;    // Tiempo de espera en milisegundos

        System.out.println("Iniciando pings continuos a la dirección IP: " + ip);
        pingContinuously(ip, timeout);
    }
}
