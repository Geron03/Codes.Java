
package unicentro;


public abstract class Comercial {
    
    private String Ubicación;
    private String Horario;
    private String Nombre;

    public Comercial(String Ubicación, String Horario, String Nombre) {
        this.Ubicación = Ubicación;
        this.Horario = Horario;
        this.Nombre = Nombre;
    }

    public String getUbicación() {
        return Ubicación;
    }

    public void setUbicación(String Ubicación) {
        this.Ubicación = Ubicación;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
   
    public abstract int  Contar_Client(int Num_Client);
    public abstract float Arriendo();
    
    
    
}
