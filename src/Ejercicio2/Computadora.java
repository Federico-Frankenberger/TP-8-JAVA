package Ejercicio2;

import java.util.HashSet;
import java.util.Scanner;

public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> componentes;

    Scanner sc = new Scanner(System.in);
    public Computadora(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;
        componentes = new HashSet<>();
    }
    public void agregarComponente(ComponenteCPU componente) {
        this.componentes.add(componente);
    }
    public void cargarComponentes(){
        while (true){
            System.out.println("Ingrese el nombre del componente: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la marca del componenete:");
            String marca = sc.nextLine();
            System.out.println("Ingrese la cantidad:");
            int cantidad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el precio del componente:");
            double precio = sc.nextDouble();
            sc.nextLine();
            agregarComponente(new ComponenteCPU(nombre,marca,cantidad,precio));
            System.out.println("Desea cargar otro componente?");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("no")){
                break;
            }
        }
    }
    public void  mostarComputadora(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Componentes: ");
        System.out.println("Componente\t\tMarca\t\tCantidad\t\tPrecio X Unidad\t\tSubtotal");
        double suma=0;
        for (ComponenteCPU componente : componentes){
            double subtotal = componente.getPrecio()*componente.getCantidad();
            suma+=subtotal;
            System.out.println(componente.getComponente() +"\t"+"\t"+componente.getMarca()+"\t"+"\t"+componente.getCantidad()+"\t"+"\t"+subtotal);
        }
        System.out.println("Costo Total: "+suma);
        if (suma>50000){
            double recargo = suma*0.3;
            System.out.println("El precio sugerido de venta es "+ suma + " + "+recargo + " = " +(suma+recargo));
        }else{
            double recargo = suma*0.4;
            System.out.println("El precio sugerido de venta es "+ suma + " + "+recargo + " = " +(suma+recargo));
        }
    }

}
