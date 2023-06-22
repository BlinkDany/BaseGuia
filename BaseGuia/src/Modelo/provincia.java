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
public class provincia {

    private int codProvincia;
    private String nombreProvincia;

    public provincia() {
    }

    public provincia(int codProvincia, String nombreProvincia) {
        this.codProvincia = codProvincia;
        this.nombreProvincia = nombreProvincia;
    }

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

}
