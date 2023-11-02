/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_herencia_productos;

/**
 *
 * @author usuario
 */
public class NoPerecederos extends Productos {
   
    private int Tipo;
    
    public NoPerecederos(){
        super();
    }

    public NoPerecederos(long codigo, String nombre, float precio) {
        super(codigo, nombre, precio);
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public double Calcular(int cantProductos) {
        
        float precioI = cantProductos * this.getPrecio();
        float reducir;
         float PrecioFinal = 0;
        
        if(Tipo == 1 ){
            PrecioFinal =  (float) (precioI - (precioI * 0.05));   
        }
        if(Tipo == 2){
            PrecioFinal =  (float) (precioI - (precioI * 0.05));
           
        }
        else{
            PrecioFinal =  (float) (precioI - (precioI * 0.05));
        }

       return PrecioFinal;
        
    }
    
    
    
}
