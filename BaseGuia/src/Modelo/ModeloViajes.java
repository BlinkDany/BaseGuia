package Modelo;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloViajes extends Viajes {
    
    ConexionBD con = new ConexionBD();

    public boolean RegistrarViajes() {

        String sql = "INSERT INTO DANIEL.viajes (codviajes, fecha, idconduc, matricula) "
                + "VALUES ("+ getCodviajes() +", '"+ getFecha() +"',"+ getIdConductor() +", '"+ getMatriculaCamion() +"');";
        return con.CRUD(sql);
    }
    
    public boolean ValidarCodigo(){
        
        try {
            boolean val = false;
            int count = 0;
            String sql = "select count(codviajes) from viajes "
                    + "where codviajes = " + getCodviajes() + "";
            ResultSet res = con.Consultas(sql);
            
            while(res.next()){
                
                count = res.getInt("count(codviajes)");
            }
            
            if (count == 0) {
                
                val = true;
            }
            
            return val;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloViajes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean Modificar(){
        
        String sql = "UPDATE viajes "
                + "SET fecha = '" + getFecha() + "', idconduc = " + getIdConductor() + ", matricula = '" + getMatriculaCamion() + "' "
                + "WHERE codviajes = " + getCodviajes()+ ";";
        return con.CRUD(sql);
    }
    
    public boolean Eliminar(){
        
        String sql = "DELETE viajes "
                + "WHERE codviajes = " + getCodviajes()+ ";";
        return con.CRUD(sql);
    }
    
    public List<Viajes> ListaViajes(){
        
        try {
            String sql = "Select * from viajes order by codviajes";
            ResultSet res = con.Consultas(sql);
            List<Viajes> viaje = new ArrayList<>();            
            
            while (res.next()) {
                Viajes miviaje = new Viajes();
                miviaje.setCodviajes(res.getInt("codviajes"));
                miviaje.setFecha(res.getDate("fecha"));
                miviaje.setIdConductor(res.getInt("idconduc"));
                miviaje.setMatriculaCamion(res.getString("matricula"));
                
                viaje.add(miviaje);
            }
            
            res.close();
            return viaje;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloViajes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
}
