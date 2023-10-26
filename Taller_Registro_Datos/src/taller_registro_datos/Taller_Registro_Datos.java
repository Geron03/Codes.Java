package taller_registro_datos;

import java.util.Scanner;
import Validaciones.Validar_Entradas;

//AÑADIR VALIDACIÓN PARA NO PERMITIR EMAILS REPETIDOS Y CALCULAR LAS ESTADISTICAS PARCIALES Y FINALES
//validar maxima capcidad del veector 
// analizar posible cambios en los metodos para las opciones de bsucar Email, telefono, y cedula
//las opciones de modificar persona volverlas un solo metodo como el de listar personas
// validación de emails
//validación de opciones del menú y demas opciones del codigo
//organizar el codigo y colocar comentarios
//colocar validación de edad, si es menor de 18 no dejar registrar los datos y pedir la edad correcta 
public class Taller_Registro_Datos {

    ClassRegistros class2 = new ClassRegistros();
    Validar_Entradas package1 = new Validar_Entradas();
    Imprimir_Datos class3 = new Imprimir_Datos();

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        String[] nombre = new String[200];
        long[] cedula = new long[200];
        String[] email = new String[200];
        int[] edad = new int[200];
        long[] telefono = new long[200];
        String[] C_residencia = new String[200];

        long cedula_modif;
        String Email_Modif;

        int op, i = 0, opci_2, promedio;
        int tamano_max = 200;
        int modif_perso;
        long telefono_busc, cedula_busc, CC_Delete;
        String Email_Buscar;
        int pos_Email, pos_telefono, pos_cedula;
        boolean longui_cedula;
        int Posi_Email, Posi_Telef, Posi_CC, buscar, Eliminar_Info;
        boolean val_cc, val_OP_3, val_OP_2, control;
        int opci_CC, pamplonaCount, cucutaCount, outlookCount, gmailCount;

        do {
            System.out.println("Casilla: " + i);
            System.out.println("\n1.Registrar Datos");
            System.out.println("2.Listar Personas");
            System.out.println("3.Modificar persona por cedula o por email");
            System.out.println("4.Buscar persona por email");
            System.out.println("5.Buscar persona por numero de telefono");
            System.out.println("6.Buscar persona por cedula");
            System.out.println("7.Eliminar información completa de una persona");
            System.out.println("8.Reporte estadistico parcial");
            System.out.println("9.Salir ");
            System.out.print("\nOpciion: ");
            op = scanner.nextInt();

            switch (op) {

                case 1 -> {
                    class2.RegistrarDatos(nombre, cedula, email, edad, telefono, C_residencia, i);

                }
                case 2 -> {
                    System.out.println("\nListar personas por: ");
                    System.out.println("1.ciudad:");
                    System.out.println("2.Rango de edad (mayores de 18 años)");
                    System.out.print("\nOpcion: ");
                    opci_2 = scanner.nextInt();
                    val_OP_2 = package1.valid_opSearch(opci_2);
                    while (val_OP_2 == false) {
                        System.out.println("Opcion no valida");
                        System.out.println("\nModificar persona por: ");
                        System.out.println("1.Cedula");
                        System.out.println("2.Email ");
                        System.out.print("Opcion: ");
                        opci_2 = scanner.nextInt();
                        val_OP_2 = package1.valid_opSearch(opci_2);
                    }

                    switch (opci_2) {

                        case 1 -> {
                            class2.ListarPersonas(C_residencia, nombre, edad, i, opci_2);
                            continue;
                        }
                        case 2 -> {

                            class2.ListarPersonas(C_residencia, nombre, edad, i, opci_2);
                            continue;
                        }
                    }
                    continue;
                }
                case 3 -> {
                    System.out.println("\nModificar persona por: ");
                    System.out.println("1.Cedula");
                    System.out.println("2.Email ");
                    System.out.print("Opcion: ");
                    modif_perso = scanner.nextInt();
                    val_OP_3 = package1.valid_opSearch(modif_perso);
                    while (val_OP_3 == false) {
                        System.out.println("Opcion no valida");
                        System.out.println("\nModificar persona por: ");
                        System.out.println("1.Cedula");
                        System.out.println("2.Email ");
                        System.out.print("Opcion: ");
                        modif_perso = scanner.nextInt();
                        val_OP_3 = package1.valid_opSearch(modif_perso);
                    }

                    switch (modif_perso) {
                        case 1 -> {
                            class2.Modif_Cedula(nombre, cedula, email, edad, telefono, C_residencia, i, op);
                            if (class2.opSearch == 2) {
                                continue;
                            }
                        }
                        case 2 -> {
                            class2.modificar_pEmail(nombre, cedula, email, edad, telefono, C_residencia, i);
                            continue;
                        }
                    }
                    continue;
                }
                case 4 -> {
                    scanner.nextLine();
                    System.out.println("Email de la persona a buscar: ");
                    Email_Buscar = scanner.nextLine();
                    boolean dominio = package1.validarEmail(Email_Buscar);
                    pos_Email = class2.Validar_Email(email, Email_Buscar, i);

                    while (dominio == false || pos_Email == -1) {
                        if (dominio == false) {
                            System.out.println("Email no valido. Ingrese de nuevo el email");
                            Email_Buscar = scanner.nextLine();
                            dominio = package1.validarEmail(Email_Buscar);
                        }

                        if (pos_Email == -1 && dominio == true) {
                            System.out.println("Email no encontrado. Ingrese de nuevo");
                            Email_Buscar = scanner.nextLine();
                            pos_Email = class2.Validar_Email(email, Email_Buscar, i);
                        }
                    }
                    System.out.println("Email encontado");
                    class2.imprimirDatos_Email_CC_Tel(nombre, cedula, email, edad, telefono, C_residencia, pos_Email);
                    continue;
                }
                case 5 -> {
                    System.out.println("Numero de telefono a buscar");
                    telefono_busc = scanner.nextLong();
                    pos_telefono = class2.ValidarTelefono(telefono, telefono_busc, i);

                    while (pos_telefono == -1) {
                        System.out.println("Telefono no encontrado, vuelva a digitarlo");
                        telefono_busc = scanner.nextLong();

                        pos_telefono = class2.ValidarTelefono(telefono, telefono_busc, i);
                    }

                    System.out.println("Telefono Encontrado");
                    class2.imprimirDatos_Email_CC_Tel(nombre, cedula, email, edad, telefono, C_residencia, pos_telefono);

                    continue;
                }
                case 6 -> {
                    System.out.println("Cedula de la persona a buscar");
                    cedula_busc = scanner.nextLong();
                    longui_cedula = package1.longuitud_CC(cedula_busc);
                    pos_cedula = class2.ValidarCedula(cedula, cedula_busc, i);

                    while (!longui_cedula || pos_cedula == -1) {
                        if (!longui_cedula) {
                            System.out.println("La cédula no cumple las características (6 - 10 caracteres)");
                        }
                        if (pos_cedula == -1 && longui_cedula) {
                            System.out.println("Cédula no encontrada");
                        }
                        System.out.println("Vuelva a digitarla o ingrese un numero negativo para salir");
                        opci_CC = scanner.nextInt();
                    }

                    class2.imprimirDatos_Email_CC_Tel(nombre, cedula, email, edad, telefono, C_residencia, pos_cedula);

                    continue;

                }
                case 7 -> {
                    System.out.println("Para eliminar información debe ingresar la cedula a buscar");
                    System.out.print("Cedula: ");
                    CC_Delete = scanner.nextLong();
                    longui_cedula = package1.longuitud_CC(CC_Delete);
                    pos_cedula = class2.ValidarCedula(cedula, CC_Delete, i);

                    while (!longui_cedula || pos_cedula == -1) {
                        if (!longui_cedula) {
                            System.out.println("La cedula no cumple las características (6 - 10 caracteres)");
                        }
                        if (pos_cedula == -1 && longui_cedula) {
                            System.out.println("Cedula no encontrada");
                        }
                        System.out.println("Vuelva a digitarla");
                        CC_Delete = scanner.nextLong();
                        longui_cedula = package1.longuitud_CC(CC_Delete);
                        pos_cedula = class2.ValidarCedula(cedula, CC_Delete, i);
                    }

                    System.out.println("Informacion de la persona\n");
                    class2.imprimirDatos_Email_CC_Tel(nombre, cedula, email, edad, telefono, C_residencia, pos_cedula);

                    Eliminar_Info = class2.Delete_Info_Persona(nombre, cedula, email, edad, telefono, C_residencia, pos_cedula, i);
                    System.out.println("Información Eliminada Exitosamente ");
                    i = Eliminar_Info; // actualizar el tamaño del vector 
                    continue;
                }
                case 8 -> {
                    if (i == 0) {
                        System.out.println("No se han registado personas, por lo tanto no hay reportes estadisticos");
                        continue;
                    }
                    System.out.println("Estadistias parciales\n ");

                    System.out.println("\nSe han registado " + i + " personas");
                    promedio = class2.acum_edad / i;
                    System.out.println("\nPromedio de edades registrados " + promedio);

                    System.out.println("\nNumero de Personas registradas en Pamplona " + class2.pamplona);

                    System.out.println("\nNumero dePersonas registradas en Cucuta: " + class2.cucuta);

                    System.out.println("\nNumero de Personas regisradas con Outlook.com: " + class2.outlook);

                    System.out.println("\nNumero de Personas registradas con gmail.com: " + class2.gmail);

                    continue;

                }
                default -> {
                    System.out.println("Opcion no valida");
                    continue;
                }
            }
            control = class3.maximo_personas(i, tamano_max);
            if (control == false) {
                System.out.println("Se ha alcanzado el maximo numero de registros");
                break;
            }
            i++;

        } while (op != 9);

    }

    public static void main(String[] args) {

        Taller_Registro_Datos screen = new Taller_Registro_Datos();
        screen.menu();
    }
}
