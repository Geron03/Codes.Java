/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_herencia_productos;

/**
 *
 * @author usuario
 */
public class Encapsular {
    
    private Perecederos perecederos;
    private NoPerecederos noperecederos;

    public Encapsular(Perecederos perecederos, NoPerecederos noperecederos) {
        this.perecederos = perecederos;
        this.noperecederos = noperecederos;
    }

    public Perecederos getPerecederos() {
        return perecederos;
    }

    public void setPerecederos(Perecederos perecederos) {
        this.perecederos = perecederos;
    }

    public NoPerecederos getNoperecederos() {
        return noperecederos;
    }

    public void setNoperecederos(NoPerecederos noperecederos) {
        this.noperecederos = noperecederos;
    }
    
    
    
}
