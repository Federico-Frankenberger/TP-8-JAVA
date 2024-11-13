package Ejercicio1;

import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Long> agenda;

    public Agenda() {
        agenda = new HashMap<>();
    }
    public HashMap<String, Long> getAgenda() {
        return agenda;
    }

    public void setAgenda(HashMap<String, Long> agenda) {
        this.agenda = agenda;
    }

    public void menu(){
        do {
            System.out.println("1- Carga Datos en la Agenda \n2- Buscar teléfono por nombre\n3- Listar Agenda");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    cargarDatos();
                    break;
                case 2:
                    buscarPersona();
                    break;
                case 3:
                    mostrarPersonas();
                    break;
                default:
                    System.out.println("Opcion no valida vuelva a intentarlo!");
            }
        }while (true);
    }
    public void cargarDatos() {
        while (true) {
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el telefono: ");
            long telefono = sc.nextLong();
            sc.nextLine();
            if (agenda.containsKey(nombre)) {

                System.out.println("La persona ya fue cargada!");
            }else {
                agenda.put(nombre, telefono);
            }
            System.out.println("Desea cargar otra persona?");
            String opcion = sc.next();
            sc.nextLine();
            if(opcion.equalsIgnoreCase("no")){
                break;
            }
        }

    }
    public void buscarPersona() {
        System.out.println("Ingrese el nombre se la persona para buscar su telefono:");
        String nombre = sc.nextLine();
        if (agenda.containsKey(nombre)) {
            long telefono = agenda.get(nombre);
            System.out.println("El número de teléfono es: " + telefono);
        }else{
            System.out.println("La persona no se encuentra en la agenda!");
        }
    }
    public void mostrarPersonas() {
        for (String nombre : agenda.keySet()) {
            System.out.println("Nombre: " + nombre + "\nTelefono: " + agenda.get(nombre));
        }
    }
}
