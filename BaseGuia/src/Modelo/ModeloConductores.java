
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
public class ModeloConductores extends Conductores{
    
    ConexionBD cpg = new ConexionBD();
    ResultSet rs = null;
    String sql;
    
    public boolean crearConductor() {
        sql = "INSERT INTO Conductor(IdConductor,cedulaPer,salario)"
                + " VALUES (" + getIdConductor()
                + "," + getCedulaPer()
                + "," + getSalario()
                + ")";
        return cpg.CRUD(sql);
    }
    
    public boolean ModificarConductor(){
        
        sql = "UPDATE Conductor "
                + "SET cedulaPer = '" + getCedulaPer()+ "', salario = '" + getSalario()+ "'"+ "WHERE IdConductor = " + getIdConductor() + ";";
        return cpg.CRUD(sql);
    }
    
    public boolean EliminarConductor(){
        
        sql = "DELETE Conductor "
                + "WHERE IdConductor = " + getIdConductor() + ";";
        return cpg.CRUD(sql);
    }
    
    public List<Conductores> listarConductores (int cedu){
       List<Conductores> conduc = new ArrayList<>();
       try {
            if (cedu==0) {
                sql = "SELECT IdConductor,cedulaPer,salario FROM Conductor";
            } else {
                sql = "SELECT IdConductor,cedulaPer,salario FROM Conductor WHERE cedulaPer="+cedu; 
            }
            rs = cpg.Consultas(sql);
            if (rs != null) {
                while (rs.next()) {
                    Conductores conductor = new Conductores(rs.getInt(1), rs.getString(2), rs.getInt(3));
                    conduc.add(conductor);
                }
            }
            return conduc;
        } catch (SQLException ex) {
            return null;
        }
    }
    public boolean ValidarID() {

        try {
            int count = 0;
            boolean val = false;
            sql = "select count(IdConductor) "
                    + "from Conductor where IdConductor = " + getIdConductor() + "";
            ResultSet res = cpg.Consultas(sql);

            while (res.next()) {

                count = res.getInt("count(IdConductor)");
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
