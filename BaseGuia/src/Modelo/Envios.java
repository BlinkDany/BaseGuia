package Modelo;

import java.sql.Date;

public class Envios {
    
    private int codEnvios;
    private Date fehca;
    private int codViaje;
    private int codPaquete;
    private int codCanton;

    public Envios() {
    }

    public Envios(int codEnvios, Date fehca, int codViaje, int codPaquete, int codCanton) {
        this.codEnvios = codEnvios;
        this.fehca = fehca;
        this.codViaje = codViaje;
        this.codPaquete = codPaquete;
        this.codCanton = codCanton;
    }

    public int getCodEnvios() {
        return codEnvios;
    }

    public void setCodEnvios(int codEnvios) {
        this.codEnvios = codEnvios;
    }

    public Date getFehca() {
        return fehca;
    }

    public void setFehca(Date fehca) {
        this.fehca = fehca;
    }

    public int getCodViaje() {
        return codViaje;
    }

    public void setCodViaje(int codViaje) {
        this.codViaje = codViaje;
    }

    public int getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(int codPaquete) {
        this.codPaquete = codPaquete;
    }

    public int getCodCanton() {
        return codCanton;
    }

    public void setCodCanton(int codCanton) {
        this.codCanton = codCanton;
    }
}
