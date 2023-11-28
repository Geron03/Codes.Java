package unicentro;

import java.util.Scanner;

public class Unicentro {

    private boolean koajEntered = false;
    private boolean metroEntered = false;
    private boolean cityParkEntered = false;

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("MENU");
            System.out.println("1. LOCAL 1");
            System.out.println("2. LOCAL 2");
            System.out.println("3. LOCAL 3");
            System.out.println("4. SALIR");
            op = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (op) {
                case 1:
                    if (!koajEntered) {
                        enterLocalData("LOCAL 1", scanner);
                        koajEntered = true;
                    } else {
                        System.out.println("Datos deL LOCAL 1 ya ingresados. Seleccione otra opción.");
                    }
                    break;
                case 2:
                    if (!metroEntered) {
                        enterLocalData("LOCAL 2", scanner);
                        metroEntered = true;
                    } else {
                        System.out.println("Datos DEL LOCAL 2 ya ingresados. Seleccione otra opción.");
                    }
                    break;
                case 3:
                    if (!cityParkEntered) {
                        enterLocalData("LOCAL 3", scanner);
                        cityParkEntered = true;
                    } else {
                        System.out.println("Datos del LOCAL 3 ya ingresados. Seleccione otra opción.");
                    }
                    break;
            }

        } while (op != 4);

        scanner.close();
    }

    public void enterLocalData(String localName, Scanner scanner) {
        System.out.println("Digite la ubicacion del local");
        String ubi = scanner.nextLine();
        System.out.println("Digite el horario de trabajo");
        String horario = scanner.nextLine();
        System.out.println("Digite el nombre del local");
        String local = scanner.nextLine();
        System.out.println("Digite el nit de " + localName);
        long nit = scanner.nextLong();
        System.out.println("Ingreso mensual: ");
        float ingresoMen = scanner.nextFloat();
        System.out.println("Ingrese numero de clientes");
        int numClientes = scanner.nextInt();

        if (localName.equalsIgnoreCase("LOCAL 1")) {
            Local1 local1 = new Local1(ingresoMen, nit, ubi, horario, local, numClientes);
        } else if (localName.equalsIgnoreCase("LOCAL 2")) {
            Local2 local2 = new Local2(ingresoMen, nit, ubi, horario, local, numClientes);
        } else {
            if (localName.equalsIgnoreCase("LOCAL 3")) {
                Local3 local3= new Local3(ingresoMen, nit, ubi, horario, local, numClientes);

            }
        }

        // Create the corresponding local object here using the entered data
        // For example, you can create an instance of KOAJ, METRO, or CITY PARK
        // based on the localName parameter.
    }

    public static void main(String[] args) {
       
        
        javax.swing.SwingUtilities.invokeLater(() -> new Vista());
        
         Unicentro screen = new Unicentro();
        screen.menu();
    }
}
