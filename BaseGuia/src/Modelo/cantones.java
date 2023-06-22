/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author tatip
 */
public class cantones {
    
    private int codCantonPk;
    private int codProvinciaFk;
    private String nombreCanton;

    public cantones() {
    }

    public cantones(int codCantonPk, int codProvinciaFk, String nombreCanton) {
        this.codCantonPk = codCantonPk;
        this.codProvinciaFk = codProvinciaFk;
        this.nombreCanton = nombreCanton;
    }

    public int getCodCantonPk() {
        return codCantonPk;
    }

    public void setCodCantonPk(int codCantonPk) {
        this.codCantonPk = codCantonPk;
    }

    public int getCodProvinciaFk() {
        return codProvinciaFk;
    }

    public void setCodProvinciaFk(int codProvinciaFk) {
        this.codProvinciaFk = codProvinciaFk;
    }

    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }
    
    
    
}
