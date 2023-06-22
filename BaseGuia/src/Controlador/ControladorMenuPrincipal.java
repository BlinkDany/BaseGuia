/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Camiones;
import Modelo.Conductores;
import Modelo.Envios;
import Modelo.ModeloConductores;
import Modelo.ModeloDestinatario;
import Modelo.ModeloEnvios;

import Modelo.ModeloPaquetes;
import Modelo.ModeloRemitente;
import Modelo.ModeloViajes;

import Modelo.Paquetes;

import Modelo.camionModelo;
import Modelo.cantonModelo;
import Modelo.cantones;

import Modelo.provincia;
import Modelo.provinciaModelo;
import asd.ControladorEnvio;
import vistas.MenuPrincipal;
import vistas.VistaCamion;
import vistas.VistaCantones;
import vistas.VistaConductor;
import vistas.VistaEnvios;

import vistas.VistaProvincias;
import vistas.VistaViajes;

/**
 *
 * @author tatip
 */
public class ControladorMenuPrincipal {

    MenuPrincipal vistaPrincipal;

    public ControladorMenuPrincipal(MenuPrincipal vistaPrincipal) {

        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
    }

    public void iniciaControl() {
        vistaPrincipal.getBtnCamiones().addActionListener(l -> menuCamiones());
        vistaPrincipal.getBtnCantones().addActionListener(l -> menuCantones());
        vistaPrincipal.getBtnProvincias().addActionListener(l -> menuProvincias());
        vistaPrincipal.getBtnPaquete().addActionListener(l -> menuPaquetes());
        vistaPrincipal.getBtnEnvios().addActionListener(l ->menuEnvios());
        vistaPrincipal.getBtnViajes().addActionListener(l -> menuViajes());
        vistaPrincipal.getBtnConductores().addActionListener(l -> menuConductor());
    }

    private void menuCamiones() {

        Modelo.camionModelo model = new camionModelo();
        vistas.VistaCamion vista = new VistaCamion();
        Camiones mica = new Camiones();
        vistaPrincipal.getDesctopPrincipal().add(vista);
        Controlador.camionesControlador controlPer = new camionesControlador(model, vista);
        controlPer.iniciaControl();

    }

    private void menuEnvios() {

        ModeloEnvios en = new ModeloEnvios();
        vistas.VistaEnvios v = new VistaEnvios();
        
        vistaPrincipal.getDesctopPrincipal().add(v);
        ControladorEnvio c = new ControladorEnvio(en, v);
        c.Iniciar();

    }

    private void menuCantones() {

        Modelo.cantonModelo mod = new cantonModelo();
        Modelo.provinciaModelo mp = new provinciaModelo();
        vistas.VistaCantones vis = new VistaCantones();

        cantones mica = new cantones();
        vistaPrincipal.getDesctopPrincipal().add(vis);
        Controlador.cantonesControlador controlPro = new cantonesControlador(mp, mod, vis);
        controlPro.iniciaControl();

    }

    private void menuProvincias() {

        Modelo.provinciaModelo mod = new provinciaModelo();

        vistas.VistaProvincias vis = new VistaProvincias();

        vistaPrincipal.getDesctopPrincipal().add(vis);

        Controlador.provinciaControlador pc = new provinciaControlador(mod, vis);
        pc.iniciaControl();

    }

    private void menuPaquetes() {

        Modelo.ModeloPaquetes mod = new ModeloPaquetes();

        vistas.VistaPaquetes vpa = new vistas.VistaPaquetes();

        vistaPrincipal.getDesctopPrincipal().add(vpa);

        Controlador.ControladorPaquetes cp = new ControladorPaquetes(mod, vpa);
        cp.Iniciar();

    }

    private void menuViajes() {

        Modelo.ModeloViajes mod = new ModeloViajes();

        vistas.VistaViajes vpa = new VistaViajes();

        vistaPrincipal.getDesctopPrincipal().add(vpa);

        Controlador.ControladorViajes cp = new ControladorViajes(mod, vpa);
        cp.Iniciar();

    }

    private void menuConductor() {

        Modelo.ModeloConductores mod = new ModeloConductores();
        Conductores con = new Conductores();
        ModeloRemitente mrem = new ModeloRemitente();
        ModeloDestinatario mdest = new ModeloDestinatario();

        vistas.VistaConductor vpa = new VistaConductor();

        vistaPrincipal.getDesctopPrincipal().add(vpa);

        Controlador.ControladorConductor cp = new ControladorConductor(mod, vpa, mrem, mdest);
        cp.Iniciar();

    }

}
