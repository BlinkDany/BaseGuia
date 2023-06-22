/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author blink
 */
public class Paquetes {
    
    private int codPaquete;
    private String descripcion;
    private String direccion;
    private double peso;
    private double precio;
    private int idRemitente;
    private int idDestinatario;
    private int codCanton;

    public Paquetes() {
    }

    public Paquetes(int codPaquete, String descripcion, String direccion, double peso, double precio, int idRemitente, int idDestinatario, int codCanton) {
        this.codPaquete = codPaquete;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.peso = peso;
        this.precio = precio;
        this.idRemitente = idRemitente;
        this.idDestinatario = idDestinatario;
        this.codCanton = codCanton;
    }

    public int getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(int codPaquete) {
        this.codPaquete = codPaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public int getCodCanton() {
        return codCanton;
    }

    public void setCodCanton(int codCanton) {
        this.codCanton = codCanton;
    }
}
