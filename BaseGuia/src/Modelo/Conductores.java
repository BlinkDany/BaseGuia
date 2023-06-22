
package Modelo;

/**
 *
 * @author Derek
 */
public class Conductores  extends Persona{
    private int IdConductor ;
    private String cedulaPer ;
    private double salario;

    public Conductores() {
    }

    public Conductores(int IdConductor, String cedulaPer, double salario, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String telf) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, direccion, telf);
        this.IdConductor = IdConductor;
        this.cedulaPer = cedulaPer;
        this.salario = salario;
    }

    public Conductores(int IdConductor, String cedulaPer, double salario) {
        this.IdConductor = IdConductor;
        this.cedulaPer = cedulaPer;
        this.salario = salario;
    }


    public int getIdConductor() {
        return IdConductor;
    }

    public void setIdConductor(int IdConductor) {
        this.IdConductor = IdConductor;
    }

    public String getCedulaPer() {
        return cedulaPer;
    }

    public void setCedulaPer(String cedulaPer) {
        this.cedulaPer = cedulaPer;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
