package parcial_herencia_productos;

import Validaciones.ValidarAtributos;
import java.util.ArrayList;
import java.util.Scanner;

public class Parcial_herencia_productos {

    public void menu() {
        ArrayList<Productos> Registro = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ValidarAtributos validar = new ValidarAtributos();

        long codigo;
        String nombre;
        float precio;
        int op;
        int tipoProducto, TipoNoPe;
        int cantidad;
        int diasCaducar;
        float PrecioFinal;

        do {
            System.out.println("MENU");
            System.out.println("1. Insertar producto");
            System.out.println("2.Modificar producto por codigo");
            System.out.println("3.Listar Productos");
            System.out.println("4.Salir");
            op = scanner.nextInt();

            while (op < 1 || op > 4) {
                System.out.println("Opcion no permitda");
                System.out.println("Ingrese de nuevo la opcion");
                System.out.println("MENU");
                System.out.println("1. Insertar producto");
                System.out.println("2.Modificar producto por codigo");
                System.out.println("3.Listar Productos");
                System.out.println("4.Salir");
                op = scanner.nextInt();
            }

            switch (op) {

                case 1 -> {
                    System.out.print("Codigo: ");
                    codigo = scanner.nextLong();
                    boolean repeat = validar.codigo(Registro, codigo);
                    while (repeat == true) {
                        System.out.println("Codigo repetido");
                        System.out.print("Codigo: ");
                        codigo = scanner.nextLong();
                        repeat = validar.codigo(Registro, codigo);
                    }
                    scanner.nextLine();
                    System.out.println("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Precio: ");
                    precio = scanner.nextFloat();
                    System.out.println("Tipo:  1.Perecedero     |    2.No Perecedero");
                    tipoProducto = scanner.nextInt();
                    if (tipoProducto == 1) {
                        System.out.println("Dias Caducar: ");
                        diasCaducar = scanner.nextInt();
                        Perecederos perecedero = new Perecederos(codigo, nombre, precio);
                        Registro.add(perecedero);
                        perecedero.setDiasCaducar(diasCaducar);
                        System.out.println("Cantidad: ");
                        cantidad = scanner.nextInt();

                        PrecioFinal = (float) perecedero.Calcular(cantidad);
                        System.out.println("Precio Final del producto: " + PrecioFinal);

                    } else {
                        System.out.println("Seleccione el tipo");
                        System.out.println("1.Tipo 1");
                        System.out.println("2.Tipo 2");
                        System.out.println("3.Tipo 3");
                        // colcar validacion
                        TipoNoPe = scanner.nextInt();
                        NoPerecederos noPerecedero = new NoPerecederos(codigo, nombre, precio);
                        Registro.add(noPerecedero);
                        noPerecedero.setTipo(op);
                        System.out.println("Cantidad: ");
                        cantidad = scanner.nextInt();
                        PrecioFinal = (float) noPerecedero.Calcular(cantidad);
                        System.out.println("Precio final del producto: " + PrecioFinal);

                    }

                }
                case 2 -> {

                }
                case 3 -> {

                }

            }

        } while (op != 4);

    }

    public static void main(String[] args) {

        Parcial_herencia_productos screen = new Parcial_herencia_productos();
        screen.menu();

    }

}
