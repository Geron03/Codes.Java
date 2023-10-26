/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_registro_datos;

import Validaciones.Validar_Entradas;
import java.util.Scanner;

public class ClassRegistros {

    int opSearch;
    int acum_edad = 0;
    int pamplona = 0;
    int cucuta = 0;
    int outlook = 0;
    int gmail = 0;

    //Validar_Entradas package2 = new Validar_Entradas();
    Scanner scanner = new Scanner(System.in);

    public void RegistrarDatos(String nombre[], long cedula[], String email[], int edad[], long telefono[], String C_residencia[], int i) {
        Validar_Entradas package2 = new Validar_Entradas();
        boolean Edad_Val;
        int Cedula_Val;

        System.out.print("\nNombre Completo: ");
        String nombreI = scanner.nextLine();
        nombre[i] = nombreI;

        System.out.print("Cedula: ");
        long cedulaI = scanner.nextLong();
        Cedula_Val = package2.validarCedula(cedula, cedulaI, i);
        while (Cedula_Val == 2 || Cedula_Val == 3) {

            if (Cedula_Val == 2) {
                System.out.println("La cedula no es valida, no cumple su longuitud");

            } else if (Cedula_Val == 3) {
                System.out.println("La cedula ya se encuentra registrada. Ingrese de nuevo: ");
            }
            cedulaI = scanner.nextLong();
            Cedula_Val = package2.validarCedula(cedula, cedulaI, i);
        }
        cedula[i] = cedulaI; // añadir la cedula al vector luego de la validación

        scanner.nextLine();
        System.out.print("Email: ");
        String emailI = scanner.nextLine();
        boolean dominio = package2.validarEmail(emailI);
        boolean equalsEmail = package2.busca_email(email, emailI);

        while (dominio == false || equalsEmail == false) {

            if (dominio == false) {
                System.out.println("Email no valido. Ingrese de nuevo el email");

            } else if (equalsEmail == false && dominio == true) {
                System.out.println("El email ya se encuentra registrado. Ingrese de nuevo");
            }
            emailI = scanner.nextLine();
            dominio = package2.validarEmail(emailI);
            equalsEmail = package2.busca_email(email, emailI);
        }

        email[i] = emailI; //Añadir el correo solo si es admitido

        System.out.print("Edad: ");
        int edadI = scanner.nextInt();
        Edad_Val = package2.Validar_Edad(edadI);
        while (Edad_Val == false) {
            System.out.println("Edad no permitida. Solo mayores a 18 años");
            edadI = scanner.nextInt();
            Edad_Val = package2.Validar_Edad(edadI);

        }
        edad[i] = edadI; // guardar dato luego de validarlo
        acum_edad += edadI;

        System.out.print("Telefono: ");
        long telefonoI = scanner.nextLong();
        telefono[i] = telefonoI;

        scanner.nextLine();
        System.out.print("Ciudad de residencia: ");
        String ciudadI = scanner.nextLine();
        C_residencia[i] = ciudadI;

        if (ciudadI.equalsIgnoreCase("pamplona")) {
            pamplona++;
        }

        if (ciudadI.equalsIgnoreCase("cucuta")) {
            cucuta++;
        }

        int arrobaIndex = emailI.lastIndexOf('@');

        if (arrobaIndex != -1) {
            String correo;
            correo = emailI.substring(arrobaIndex + 1);

            if (correo.equalsIgnoreCase("outlook.com")) {
                outlook++;
            }

            if (correo.equalsIgnoreCase("gmail.com")) {
                gmail++;
            }
        }

    }

    //Listar personas por medio de la ciudad o edades
    public void ListarPersonas(String C_residencia[], String nombre[], int edad[], int i, int opcion) {
        Validar_Entradas package2 = new Validar_Entradas();
        int k = 0;
        //si la ocpion elegida es 1.Listar por ciudad
        if (opcion == 1) {
            System.out.print("\nCiudad: ");
            String Ciudad_List = scanner.nextLine();

            System.out.println("Personas Registradas en" + Ciudad_List);
            for (int j = 0; j < i; j++) {
                if (Ciudad_List.equalsIgnoreCase(C_residencia[j])) {
                    System.out.println(nombre[j]);
                    k = 1;
                }
            }
            if (k == 0) {
                System.out.println("No hay personas registradas en " + Ciudad_List);
            }

        } //si la opcion elegida es 2. Listar por rango de edades
        else if (opcion == 2) {

            System.out.println("\nRango de edad");
            System.out.print("Desde: ");
            int EdadBack = scanner.nextInt();
            boolean Edad_Val = package2.Validar_Edad(EdadBack);

            while (Edad_Val == false) {
                System.out.println("\nEdad no permitida. Solo mayores o iguales  a 18 años");
                System.out.print("Desde: ");
                EdadBack = scanner.nextInt();
                Edad_Val = package2.Validar_Edad(EdadBack);
            }

            System.out.println("Hasta");
            int EdadFront = scanner.nextInt();
            while (EdadFront < 18) {
                System.out.println("La edad limite no puede ser menor a la edad inicial del rango");
                System.out.println("Ingrese una edad valida");
                EdadFront = scanner.nextInt();
            }
            System.out.println("Personas entre " + EdadBack + " y " + EdadFront + " de edad");

            for (int j = 0; j < i; j++) {
                if (edad[j] >= EdadBack && edad[j] <= EdadFront) {
                    System.out.println((j + 1) + nombre[j] + ": " + edad[j] + " años");
                    k = 1;
                }
            }
            if (k == 0) {
                System.out.println("\nNo hay personas de entre " + EdadBack + " a " + EdadFront + " de edad");
            }

        }

    }
    //Listar personas por medio de un rango de edades

    public void Modif_Cedula(String nombre[], long cedula[], String email[], int edad[], long telefono[], String C_residencia[], int N_Registros, int op) {
        Validar_Entradas package2 = new Validar_Entradas();
        ClassRegistros modif_Persona = new ClassRegistros();
        int posicion = 0;
        long cedula_modif;
        boolean Comprobar_LongCC;
        boolean cedula_found_valid;
        while (true) {
            System.out.println("Cedula de la persona a buscar");
            cedula_modif = scanner.nextLong();
            Comprobar_LongCC = package2.longuitud_CC(cedula_modif);
            cedula_found_valid = package2.validar_Cedula(cedula_modif, cedula, N_Registros);

            if (Comprobar_LongCC == false) {
                System.out.println("La cedula no cumple el rango de caracteres (6 a 10)");
            } else if (cedula_found_valid == false) {
                System.out.println("Cedula no encontrada");
            } else {
                // Si la cédula es válida y encontrada, sal del bucle
                break;
            }

            System.out.println("\n1.Seguir con la busqueda \n2.Volver al menu principal");
            System.out.print("\nOpcion: ");
            opSearch = scanner.nextInt();

            boolean valid = package2.valid_opSearch(opSearch);
            while (valid == false) {
                System.out.println("Opcion no valida. Ingrese de nuevo");
                System.out.println("\n1.Seguir con la busqueda \n2.Volver al menu principal");
                System.out.print("\nOpcion: ");
                opSearch = scanner.nextInt();
                valid = package2.valid_opSearch(opSearch);
            }

            if (opSearch == 2) {
                break;
            }
        }

        if (opSearch == 1) {
            for (int j = 0; j < N_Registros; j++) {
                if (cedula_modif == cedula[j]) {
                    posicion = j;
                    break;
                }
            }

            System.out.println("Cedula Perteneciente a " + nombre[posicion]);
            System.out.println("\nModificacion de datos: ");

            modif_Persona.RegistrarDatos(nombre, cedula, email, edad, telefono, C_residencia, posicion);
        }

    }

    public void modificar_pEmail(String nombre[], long cedula[], String email[], int edad[], long telefono[], String C_residencia[], int N_Registros) {
        Validar_Entradas package2 = new Validar_Entradas();
        int posicion = 0;
        boolean encontrado = false;
        ClassRegistros validar = new ClassRegistros();

        System.out.println("Email de la persona a modificar");
        String Email_Modif = scanner.nextLine();
        boolean dominio = package2.validarEmail(Email_Modif);
        int pos_Email = validar.Validar_Email(email, Email_Modif, N_Registros);

        while (dominio == false || pos_Email == -1) {
            if (dominio == false) {
                System.out.println("Email no valido. Ingrese de nuevo el email");
                Email_Modif = scanner.nextLine();
                dominio = package2.validarEmail(Email_Modif);
            }

            if (pos_Email == -1 && dominio == true) {
                System.out.println("Email no encontrado. Ingrese de nuevo");
                Email_Modif = scanner.nextLine();
                pos_Email = validar.Validar_Email(email, Email_Modif, N_Registros);

            }
        }

        System.out.println("Email encontrado");

        System.out.println("Email perteneciente a " + nombre[pos_Email]);
        ClassRegistros modif_Persona = new ClassRegistros();
        modif_Persona.RegistrarDatos(nombre, cedula, email, edad, telefono, C_residencia, pos_Email);

    }

    public int Validar_Email(String email[], String Email_Buscar, int N_Registros) {
        int posicion = 0;
        int found = 0;
        for (int i = 0; i < N_Registros; i++) {
            if (Email_Buscar.equals(email[i])) {
                posicion = i;
                found = 1;
                break;
            }
        }
        if (found == 1) {
            return posicion;
        } else {
            return -1;
        }

    }

    public int ValidarTelefono(long telefono[], long telefono_busc, int N_Registros) {
        int posicion = 0;
        int found = 0;
        for (int i = 0; i < N_Registros; i++) {
            if (telefono_busc == telefono[i]) {
                posicion = i;
                found = 1;
                break;

            }
        }
        if (found == 1) {
            return posicion;
        } else {
            return -1;
        }

    }

    public int ValidarCedula(long cedula[], long cedula_busc, int N_Registros) {
        int posicion = 0;
        int found = 0;
        for (int i = 0; i < N_Registros; i++) {
            if (cedula_busc == cedula[i]) {
                posicion = i;
                found = 1;
                break;
            }
        }
        if (found == 1) {
            return posicion;
        } else {
            return -1;
        }
    }

    public void imprimirDatos_Email_CC_Tel(String nombre[], long cedula[], String email[], int edad[], long telefono[], String C_residencia[], int posicion) {

        Imprimir_Datos class3 = new Imprimir_Datos();

        class3.imprimir_Registro(nombre, cedula, email, edad, telefono, C_residencia, posicion);

    }

    public int Delete_Info_Persona(String nombre[], long cedula[], String email[], int edad[], long telefono[], String C_residencia[], int posicion, int N_Registros) {

        for (int i = posicion; i < (N_Registros - 1); i++) {

            nombre[i] = nombre[i + 1];
            cedula[i] = cedula[i + 1];
            email[i] = email[i + 1];
            edad[i] = edad[i + 1];
            telefono[i] = telefono[i + 1];
            C_residencia[i] = C_residencia[i + 1];

        }
        // Disminuir el tamaño real de los vectores
        N_Registros--;
        return N_Registros;
    }

}
