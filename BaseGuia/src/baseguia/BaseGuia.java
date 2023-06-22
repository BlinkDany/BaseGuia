/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baseguia;

import Controlador.*;
import Modelo.ModeloPaquetes;
import Modelo.ModeloViajes;
import vistas.*;

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
        
        Modelo.ModeloViajes v = new ModeloViajes();
        VistaViajes vi = new VistaViajes();
        ControladorViajes c = new ControladorViajes(v, vi);
        
        c.Iniciar();
        
        System.out.println("Menos ganas de vivir");
    }
    
}
