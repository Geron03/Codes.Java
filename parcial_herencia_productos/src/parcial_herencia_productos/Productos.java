/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_herencia_productos;

/**
 *
 * @author usuario
 */
public abstract class Productos {
    
    private long codigo;
    private String nombre;
    private float precio;

    public Productos(){
        super();
    }
    
    public Productos(long codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public abstract double Calcular (int cantProductos);

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
}
