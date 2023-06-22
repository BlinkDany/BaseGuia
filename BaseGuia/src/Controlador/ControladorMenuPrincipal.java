/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Camiones;
//import Modelo.Conductores;
//import Modelo.ModeloConductores//
//import Modelo.ModeloDestinatario;
import Modelo.ModeloPaquetes;
//import Modelo.ModeloRemitente;
//import Modelo.ModeloViajes;
import Modelo.Paquetes;
//import Modelo.Persona;
//import Modelo.Viajes;
import Modelo.camionModelo;
import Modelo.cantonModelo;
import Modelo.cantones;
//import Modelo.destinatario;
import Modelo.provincia;
import Modelo.provinciaModelo;
import vistas.MenuPrincipal;
import vistas.VistaCamion;
import vistas.VistaCantones;
//import vistas.VistaConductor;
import vistas.VistaProvincias;
//import vistas.VistaViajes;



/**
 *
 * @author tatip
 */
public class ControladorMenuPrincipal {
    
    MenuPrincipal vistaPrincipal;
    
    public ControladorMenuPrincipal (MenuPrincipal vistaPrincipal ){
        
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
    }
    
   public void iniciaControl (){
        vistaPrincipal.getBtnCamiones().addActionListener(l ->menuCamiones() );
        vistaPrincipal.getBtnCantones().addActionListener(l -> menuCantones());
        vistaPrincipal.getBtnProvincias().addActionListener(l -> menuProvincias());
    }
    
    private void menuCamiones () { 
        
        Modelo.camionModelo model = new camionModelo();
        vistas.VistaCamion vista = new VistaCamion();
        Camiones mica = new Camiones();
        vistaPrincipal.getDesctopPrincipal().add(vista);
        Controlador.camionesControlador controlPer = new camionesControlador(model, vista);
        controlPer.iniciaControl();
        

}
    
    
     private void menuCantones () { 
        
        Modelo.cantonModelo mod = new cantonModelo();
        Modelo.provinciaModelo mp = new provinciaModelo();
        vistas.VistaCantones vis = new VistaCantones();
        
        cantones mica = new cantones();
        vistaPrincipal.getDesctopPrincipal().add(vis);
        Controlador.cantonesControlador controlPro = new cantonesControlador (mod, mp, vis);
        controlPro.iniciaControl();
        

}
    
     private void menuProvincias () { 
        
        Modelo.provinciaModelo mod = new provinciaModelo();
             
        vistas.VistaProvincias vis = new VistaProvincias();

        vistaPrincipal.getDesctopPrincipal().add(vis);
        
        Controlador.provinciaControlador pc = new provinciaControlador(mod, vis);
        pc.iniciaControl();
        
}
     
     
}


