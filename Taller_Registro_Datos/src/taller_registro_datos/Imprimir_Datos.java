/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_registro_datos;

/**
 *
 * @author USER
 */
public class Imprimir_Datos {
    
    
    public void imprimir_Registro(String nombre[], long cedula[], String email[], int edad[], long telefono[], String C_residencia[], int posicion) {

        System.out.println("\nNombre: " + nombre[posicion]);
        System.out.println("Cedula: " + cedula[posicion]);
        System.out.println("Edad: " + edad[posicion]);
        System.out.println("Telefono: " + telefono[posicion]);
        System.out.println("Email: " + email[posicion]);
        System.out.println("Ciudad de residencia: " + C_residencia[posicion]);

    }
    
    
    public boolean maximo_personas(int i, int tamano_max){
        
        if(i <= 200){
            return true;
        }else{
            return false;
        }
        
    }


}
