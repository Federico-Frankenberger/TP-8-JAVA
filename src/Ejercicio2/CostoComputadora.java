package Ejercicio2;
import java.util.Scanner;

public class CostoComputadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computadora pc ;
        System.out.println("Ingrese la marca:");
        String marca = sc.nextLine();
        System.out.println("Ingrese el modelo:");
        String modelo = sc.nextLine();
        pc = new Computadora(marca, modelo);
        pc.cargarComponentes();
        pc.mostarComputadora();
    }
}
