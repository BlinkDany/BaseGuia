
package Modelo;

import java.sql.Date;

/**
 *
 * @author Derek
 */
public class Remitente extends Persona{
    private int IdRemitente ;
    private String cedulaPer ;
    private Date FechaEnvio;

    public Remitente() {
    }

    public Remitente(int IdRemitente, String cedulaPer, Date FechaEnvio, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String telf) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, direccion, telf);
        this.IdRemitente = IdRemitente;
        this.cedulaPer = cedulaPer;
        this.FechaEnvio = FechaEnvio;
    }

    public Remitente(int IdRemitente, String cedulaPer, Date FechaEnvio) {
        this.IdRemitente = IdRemitente;
        this.cedulaPer = cedulaPer;
        this.FechaEnvio = FechaEnvio;
    }


    public int getIdRemitente() {
        return IdRemitente;
    }

    public void setIdRemitente(int IdRemitente) {
        this.IdRemitente = IdRemitente;
    }

    public String getCedulaPer() {
        return cedulaPer;
    }

    public void setCedulaPer(String cedulaPer) {
        this.cedulaPer = cedulaPer;
    }

    public Date getFechaEnvio() {
        return FechaEnvio;
    }

    public void setFechaEnvio(Date FechaEnvio) {
        this.FechaEnvio = FechaEnvio;
    }
}
