/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.datasource.impl.OracleDataSource;

/**
 *
 * @author blink
 */
public class ConexionBD {
    
    private static Connection conn = null;
    private static String login = "Daniel";
    private static String clave = "dan23";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    private Connection con = null;
    private Statement st;
    
    public ConexionBD(){
        
        try {
            OracleDataSource ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:XE");
            ods.setUser(login);
            ods.setPassword(clave);
            conn = ods.getConnection();
            System.out.println("conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Error de conexión!", null, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean CRUD(String sql) {
        st = null;
        try {
            st = con.createStatement();
            st.execute(sql);
            st.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public PreparedStatement Creae(String sql) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }

    public ResultSet Consultas(String SQL) {

        st = null;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
