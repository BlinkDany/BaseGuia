package Modelo;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derek
 */
public class ModeloDestinatario extends destinatario{
    ConexionBD cpg = new ConexionBD();
    ResultSet rs = null;
    String sql;
    
    public boolean RegistrarDestinatario() {

        String sql = "INSERT INTO Destinatario (IdConductor,cedulaPer,salario)\n"
                + "VALUES (" + getIdRDestinatario() + ", '" + getCedulaPer() + "', '" + getFechaEntrega() + "');";
        return cpg.CRUD(sql);
    }
    
    public boolean ModificarDestinatario(){
        
        sql = "UPDATE Destinatario "
                + "SET cedulaPer = '" + getCedulaPer()+ "', FechaEntrega = '" + getFechaEntrega()+ "'"+ "WHERE IdRDestinatario = " + getIdRDestinatario() + ";";
        return cpg.CRUD(sql);
    }
    
    public boolean EliminarDestinatario(){
        
        sql = "DELETE Destinatario "
                + "WHERE IdRDestinatario = " + getIdRDestinatario() + ";";
        return cpg.CRUD(sql);
    }
    
    public boolean crearDestinatario() {
        sql = "INSERT INTO Destinatario( IdConductor,cedulaPer,salario)"
                + " VALUES (" + getIdRDestinatario()
                + "," + getCedulaPer()
                + "," + getFechaEntrega()
                + ")";
        return cpg.CRUD(sql);
    }
    public List<destinatario> listarDestinatario (int cedu){
       List<destinatario> destinat = new ArrayList<>();
       try {
            if (cedu==0) {
                sql = "SELECT IdRDestinatario, cedulaPer,FechaEntrega FROM Destinatario";
            } else {
                sql = "SELECT IdRDestinatario,cedulaPer, FechaEntrega FROM Destinatario WHERE cedulaPer="+cedu; 
            }
            rs = cpg.Consultas(sql);
            if (rs != null) {
                while (rs.next()) {
                    destinatario destina = new destinatario(rs.getInt(1), rs.getString(2), rs.getDate(3));
                    destinat.add(destina);
                }
            }
            return destinat;
        } catch (SQLException ex) {
            return null;
        }
    }
    public boolean ValidarId() {

        try {
            int count = 0;
            boolean val = false;
            sql = "select count(IdRDestinatario) "
                    + "from Destinatario where IdRDestinatario = " + getIdRDestinatario() + "";
            ResultSet res = cpg.Consultas(sql);

            while (res.next()) {

                count = res.getInt("count(IdRDestinatario)");
            }

            if (count == 0) {

                val = true;
            }

            return val;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
