
package Validaciones;

import java.util.ArrayList;
import parcial_herencia_productos.Productos;


public class ValidarAtributos {
    
    public boolean codigo(ArrayList<Productos>Registro, long codigo){
        boolean repeat = false;
        
        for (int i = 0; i <Registro.size(); i++) {
            if(Registro.get(i).getCodigo() ==codigo ){
                repeat = true;
                break;   
            }
            
        }
        if(repeat == true){
            return true;
        }
        else{
            return false;
        }
       
        
    }
    
}
