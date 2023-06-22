/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baseguia;

import Controlador.*;
import Modelo.*;
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
        
        MenuPrincipal vi = new MenuPrincipal();
        ControladorMenuPrincipal c = new ControladorMenuPrincipal(vi);
        
        c.iniciaControl();
        
        System.out.println("Menos ganas de vivir");
    }
    
}
