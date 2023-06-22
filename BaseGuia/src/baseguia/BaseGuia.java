/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baseguia;

import Controlador.ControladorPaquetes;
import Modelo.ModeloPaquetes;
import vistas.VistaPaquetes;

/**
 *
 * @author blink
 */
public class BaseGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Modelo.ModeloPaquetes v = new ModeloPaquetes();
        VistaPaquetes vi = new VistaPaquetes();
        ControladorPaquetes c = new ControladorPaquetes(v, vi);
        
        c.Iniciar();
        
        System.out.println("Menos ganas de vivir");
    }
    
}
