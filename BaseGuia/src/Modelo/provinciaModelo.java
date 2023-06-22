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
public class provinciaModelo extends provincia{
    
      ConexionBD.ConexionSQL con = new ConexionSQL();
    
    public provinciaModelo (){
        
    }
    
     public List<provincia> listarProvincia() {

        try {

            String sql = "SELECT * FROM public.Provincia";

            ResultSet rs = con.Consultas(sql);

            List<provincia> listPro = new ArrayList<>();

            while (rs.next()) {

                provincia miPro = new provincia();

                miPro.setCodProvincia(rs.getInt("codProvincia"));
                miPro.setNombreProvincia(rs.getString("nombre"));
               
                          
                listPro.add(miPro);

            }
            rs.close();
            return listPro;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }

    public boolean insertarProvincia() {

        String sql = "INSERT INTO public.Provincia(\n"
                + "	codProvincia, nombre)\n"
                + "	VALUES ('" + getCodProvincia()+ "','" + getNombreProvincia() + "');";

        return con.CRUD(sql);

    }
    
     public boolean Validar() {

        try {
            boolean validar = false;
            int count = 0;

            String sql = "select count(codProvincia) from Provincia where codProvincia = '" + getCodProvincia()+ "'";
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
            Logger.getLogger(cantones.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
