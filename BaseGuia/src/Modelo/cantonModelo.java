/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ConexionBD.ConexionSQL;
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
public class cantonModelo extends  cantones{
    

    ConexionBD.ConexionSQL con = new ConexionSQL();
    
    public cantonModelo (){
        
    }
    
     public List<cantones> listarCanton() {

        try {

            String sql = "SELECT * FROM cantones";

            ResultSet rs = con.Consultas(sql);

            List<cantones> listaCanton = new ArrayList<>();

            while (rs.next()) {

                cantones miCan = new cantones();

                miCan.setCodCantonPk(rs.getInt("codCanton"));
                miCan.setCodProvinciaFk(rs.getInt("codProvincia"));
                miCan.setNombreCanton(rs.getString("nombreCanton"));
                          
                listaCanton.add(miCan);

            }
            rs.close();
            return listaCanton;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }

    public boolean insertarCanton() {

        String sql = "INSERT INTO cantones(\n"
                + "	codCanton, codProvincia, nombreCanton)\n"
                + "	VALUES ('" + getCodCantonPk()+ "','" + getCodProvinciaFk()+ "','" + getNombreCanton() + "');";

        return con.CRUD(sql);

    }
    
     public boolean Validar() {

        try {
            boolean validar = false;
            int count = 0;

            String sql = "select count(codCanton) from cantones where codCanton = '" + getCodCantonPk()+ "'";
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
            Logger.getLogger(cantonModelo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
      public int CargarCodigoCanton() {
        int codigo = 0;
        String sql = "select max(codCanton) from cantones;";
        ResultSet res = null;
        try {
            res = con.Consultas(sql);
            while (res.next()) {
                codigo = res.getInt("max") + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(cantonModelo.class.getName()).log(Level.SEVERE, null, ex);

        } finally {

            if (res != null) {
                try {
                    res.close();
                } catch (SQLException ex) {
                    Logger.getLogger(cantonModelo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return codigo;
    }
    
}
