/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author blink
 */
public class Viajes {
    private int codviajes;
    private Date fecha;
    private int idConductor;
    private String MatriculaCamion;

    public Viajes() {
    }

    public Viajes(int codviajes, Date fecha, int idConductor, String MatriculaCamion) {
        this.codviajes = codviajes;
        this.fecha = fecha;
        this.idConductor = idConductor;
        this.MatriculaCamion = MatriculaCamion;
    }

    public int getCodviajes() {
        return codviajes;
    }

    public void setCodviajes(int codviajes) {
        this.codviajes = codviajes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getMatriculaCamion() {
        return MatriculaCamion;
    }

    public void setMatriculaCamion(String MatriculaCamion) {
        this.MatriculaCamion = MatriculaCamion;
    }
}
