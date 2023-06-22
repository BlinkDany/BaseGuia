/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tatip
 */
public class camionModelo extends Camiones{
    
   Conexion. ConexionBD con  = new ConexionBD();
    
    public camionModelo () {
        
    }
    
    public List<Camiones> listarCamion() {

        try {

            String sql = "SELECT * FROM public.camiones";

            ResultSet rs = con.Consultas(sql);

            List<Camiones> camList = new ArrayList<>();

            while (rs.next()) {

                Camiones miKmi = new Camiones();

                miKmi.setMatricula(rs.getString("matricula"));
                miKmi.setMarca(rs.getString("marca"));
                miKmi.setModelo(rs.getString("modelo"));
                miKmi.setPotencia(rs.getString("potencia"));
               
                camList.add(miKmi);

            }
            rs.close();
            return camList;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }

    public boolean insertarCamion() {
//construir consulta para insertar el miKmi 
        String sql = "INSERT INTO public.camiones(\n"
                + "	matricula, marca, modelo, potencia)\n"
                + "	VALUES ('" + getMatricula()+ "','" + getMarca()+ "','" + getModelo()+ "', '" + getPotencia() + "');";

        return con.CRUD(sql);

    }
    
     public boolean Validar() {

        try {
            boolean validar = false;
            int count = 0;

            String sql = "select count(matricula) from camiones where matricula = '" + getMatricula()+ "'";
            ResultSet res = con.Consultas(sql);
            while (res.next()) {

                count = res.getInt("count");
            }
            if (count == 0) {

                validar = true;
            }
            res.close();
            return validar;

        } catch (SQLException ex) {
            Logger.getLogger(Camiones.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
