package unicentro;

public class Local3 extends Comercial {

    public float Ingreso_Mensual;
    public long NIT;
    private int Num_Clientes;

    public Local3(float Ingreso_Mensual, long NIT, String Ubicación, String Horario, String Nombre, int Num_Clientes) {
        super(Ubicación, Horario, Nombre);
        this.Ingreso_Mensual = Ingreso_Mensual;
        this.NIT = NIT;
        this.Num_Clientes = Num_Clientes;
    }

    public float getIngreso_Mensual() {
        return Ingreso_Mensual;
    }

    public void setIngreso_Mensual(float Ingreso_Mensual) {
        this.Ingreso_Mensual = Ingreso_Mensual;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }

    
    public int Contar_Client(int Num_Client) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public float Arriendo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    

}
