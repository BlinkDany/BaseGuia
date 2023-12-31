package Modelo;

import Conexion.ConexionBD;
import Modelo.Envios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloEnvios extends Envios {

    ConexionBD con = new ConexionBD();

    public boolean Registrar() {

        String sql = "INSERT INTO envios (codenvios, fecha, codviaje, codpaquete, codcanton) "
                + "VALUES (" + getCodEnvios() + ", '" + getFehca() + "', " + getCodViaje() + ", " + getCodPaquete() + ", " + getCodCanton() + ");";
        return con.CRUD(sql);
    }
    
    public boolean Regi(Connection con2) {

        PreparedStatement prt = null;
        String sql = "INSERT INTO envios (codenvios, fecha, codviaje, codpaquete, codcanton) "
                + "VALUES (?, ?, ?, ?, ?);";
        try {
            prt = con2.prepareStatement(sql);
            prt.setInt(1, getCodPaquete());
            prt.setDate(2, getFehca());
            prt.setInt(3, getCodViaje());
            prt.setInt(4, getCodPaquete());
            prt.setInt(5, getCodCanton());
            prt.execute();
            prt.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean ValidarCod() throws SQLException{
        
            String sql = "SELECT COUNT(codenvios) FROM DANIEL.ENVIOS"
                    + "WHERE = " + getCodEnvios() + "";
            ResultSet res = con.Consultas(sql);
            int count = 0;
            boolean val = false;            
            
            while (res.next()) {
                
                count = res.getInt("COUNT(codenvios)");
            }
            
            if (count == 0) {
                
                val = true;
            }
            
            return val;
    }
    
    public List<Envios> ListaEnvios(){
        
        try {
            String sql = "SELECT * FROM DANIEL.ENVIOS ORDER BY codenvios";
            ResultSet res = con.Consultas(sql);
            List<Envios> envio = new ArrayList<>();            
            
            while (res.next()) {
                
                Envios en = new Envios();
                en.setCodCanton(res.getInt("codcanton"));
                en.setCodEnvios(res.getInt("codenvios"));
                en.setCodPaquete(res.getInt("codpaquete"));
                en.setCodViaje(res.getInt("codviaje"));
                en.setFehca(res.getDate("fecha"));
                
                envio.add(en);
            }
            
            res.close();
            return envio;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEnvios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
}
