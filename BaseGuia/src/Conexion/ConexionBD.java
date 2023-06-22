/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
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
}
