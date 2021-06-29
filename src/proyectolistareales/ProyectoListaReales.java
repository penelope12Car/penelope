package proyectolistareales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProyectoListaReales {
    ArrayList<Double> listaReales;
    public static void main(String[] args) {
        ProyectoListaReales proyectoReales = new ProyectoListaReales();
        proyectoReales.listaReales = new ArrayList();
        proyectoReales.leerOpcion();
    }
    public void leerOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("«Lista de Reales»");
            System.out.println("«[1] Agregar»");
            System.out.println("«[2] Buscar»");
            System.out.println("«[3] Modificar elemento»");
            System.out.println("«[4] Eliminar elemento»");
            System.out.println("«[5] Insertar elemento»");
            System.out.println("«[6] Mostrar elementos»");
            System.out.println("«[7] Orden ascendente»");
            System.out.println("«[8] Orden descendente»");
            System.out.println("«[9] Salir»");
            System.out.print("«Ingrese opcion (1-9): «");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                    break;
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarLista();
                    break;
                case 7:
                    ordenarAscendente();
                    break;
                case 8:
                    ordenarDescendente();
                    break;
            }
        } while (opcion != 9);
    }
    public void ingresarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        System.out.print("«Ingrese valor: «");
        valor = entrada.nextDouble();
        listaReales.add(valor);
    }
    public void buscarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("«Valor a buscar: «");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if (indice != -1) {
            System.out.println("«Dato se encuentra en posicion: »" + indice);
        } else {
            System.out.println(" «Dato no se encuentra»");
        }
    }
    public void modificarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.print("«Valor a modificar: «");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if (indice != -1) {
            System.out.print("«Nuevo valor: «");
            nuevoValor = entrada.nextDouble();
            listaReales.set(indice, nuevoValor);
        } else {
            System.out.println("«Dato no se encuentra»");
        }
    }
    public void eliminarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("«Valor a eliminar: «");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if (indice != -1) {
            listaReales.remove(indice);
            System.out.println("«Dato eliminado»");
        } else {
            System.out.println("«Dato no se encuentra»");
        }
    }
    public void insertarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("«Valor a insertar: «");
        valor = entrada.nextDouble();
        System.out.print("«Posicion donde desea insertar: «");
        indice = entrada.nextInt();
        listaReales.add(indice, valor);
    }
    public void mostrarLista() {
        if (!listaReales.isEmpty()) {
            System.out.println("«Elementos de la lista:»");
            for (int i = 0; i < listaReales.size(); i++) {
                System.out.println(listaReales.get(i));
            }
        } else {
            System.out.println("«No existen valores en la lista»");
        }
    }

    public void ordenarAscendente() {
        Collections.sort(listaReales);
        mostrarLista();
    }

    public void ordenarDescendente() {
        Comparator<Double> comparador = Collections.reverseOrder();
        Collections.sort(listaReales, comparador);
        mostrarLista();
    }

}
