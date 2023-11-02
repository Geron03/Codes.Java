/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_herencia_productos;
import Validaciones.ValidarAtributos;

/**
 *
 * @author usuario
 */
public class Perecederos extends Productos {
    
    private int diasCaducar;
    public Perecederos(){
        super();
    }

    public Perecederos(long codigo, String nombre, float precio) {
        super(codigo, nombre, precio);
    }
   

    @Override
    public double Calcular(int cantProductos) {
        float PrecioI = cantProductos * this.getPrecio();
        float PrecioFinal = 0;
        
        switch (diasCaducar) {
            case 1:
                PrecioFinal = (PrecioI / 4) ;
                break;
            case 2:
                PrecioFinal = (PrecioI / 3);
                break;
            default:
                if(diasCaducar == 3){
                    PrecioFinal = (PrecioI / 2);
                }   break;
        }
        
        
        return PrecioFinal;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }
    
    
    
}


//http://programacion1unas.blogspot.com/2017/11/herencia.html