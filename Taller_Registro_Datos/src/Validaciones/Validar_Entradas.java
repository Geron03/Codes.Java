/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validaciones;

/**
 *
 * @author USER
 */
public class Validar_Entradas {

    public boolean Validar_Edad(int edad) {

        return (edad >= 18);
    }

    public int validarCedula(long cedula[], long cedulaI, int registros) {
        int L = 0;
        int k = 0;

        String cedulaStr = Long.toString(cedulaI);
        int longitud = cedulaStr.length();

        if (longitud >= 6 && longitud <= 10) {
            L = 1; // longuitud valida
        } else {
            L = 2; // longuitud no valida 
        }

        for (int i = 0; i < registros; i++) {
            if (cedulaI == cedula[i]) {
                k = 1; // ya hay registradas
                break; // Salir del bucle tan pronto como se encuentre una cédula repetida
            }
        }

        if (L == 1 && k == 0) { // si la cédula tiene entre 6 a 10 dígitos y no se encuentra repetida entonces:  retorna 1
            return 1;
        } else if (L == 2) { // si tiene menos de 6 dígitos: retorna 2
            return 2;
        } else if (k == 1) { // si se encuentra repetida entonces: retorna 3
            return 3;
        }

        return 0; // En caso de que ninguna condición se cumpla
    }

    public boolean validarEmail(String emailI) {
        String correo = null;
        int arrobaIndex = emailI.lastIndexOf('@');

        if (arrobaIndex != -1) {
            correo = emailI.substring(arrobaIndex + 1);
        } else {
            // El correo no contiene "@"; en este caso, puedes considerarlo no válido
            return false;
        }

        return correo.equalsIgnoreCase("gmail.com") || correo.equalsIgnoreCase("hotmail.com") || correo.equalsIgnoreCase("outlook.com");
    }

    public boolean longuitud_CC(long cedula_modif) {
        String cedulaStr = Long.toString(cedula_modif);
        int longitud = cedulaStr.length();
        // longuitud valida
        return longitud >= 6 && longitud <= 10;

    }

    public boolean validar_Cedula(long cedula_modif, long cedula[], int N_Registros) {
        int k = -12;
        boolean isFull = false;

        for (int j = 0; j < N_Registros; j++) {
            if (cedula_modif == cedula[j]) {
                isFull = true;
                break;

            }
        }

        return isFull != false;
    }

    public boolean valid_opSearch(int opSearch) {

        return opSearch >= 1 && opSearch <= 2;
    }

    public boolean busca_email(String email[], String emailI) {
        
        
        int k = 0;
        for (String emails : email) {
            if (emailI.equals(emails)) {
                k = 1;
                break;
            }

        }
        return k != 1; // si lo encuentra entonces retornar true
        // si no lo encuentra entonces retornar false

    }
    
    

}
