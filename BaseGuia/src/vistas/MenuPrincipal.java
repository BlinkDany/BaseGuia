/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 *
 * @author tatip
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    public JButton getBtnCantones() {
        return btnCantones;
    }

    public void setBtnCantones(JButton btnCantones) {
        this.btnCantones = btnCantones;
    }

    public JButton getBtnCamiones() {
        return btnCamiones;
    }

    public void setBtnCamiones(JButton btnCamiones) {
        this.btnCamiones = btnCamiones;
    }

    public JButton getBtnConductores() {
        return btnConductores;
    }

    public void setBtnConductores(JButton btnConductores) {
        this.btnConductores = btnConductores;
    }

    public JButton getBtnDestinarios() {
        return btnDestinarios;
    }

    public void setBtnDestinarios(JButton btnDestinarios) {
        this.btnDestinarios = btnDestinarios;
    }

    public JButton getBtnEnvios() {
        return btnEnvios;
    }

    public void setBtnEnvios(JButton btnEnvios) {
        this.btnEnvios = btnEnvios;
    }


    public JButton getBtnPaquete() {
        return btnPaquete;
    }

    public void setBtnPaquete(JButton btnPaquete) {
        this.btnPaquete = btnPaquete;
    }

    public JButton getBtnProvincias() {
        return btnProvincias;
    }

    public void setBtnProvincias(JButton btnProvincias) {
        this.btnProvincias = btnProvincias;
    }

    public JButton getBtnRemitentes() {
        return btnRemitentes;
    }

    public void setBtnRemitentes(JButton btnRemitentes) {
        this.btnRemitentes = btnRemitentes;
    }


    public JButton getBtnViajes() {
        return btnViajes;
    }

    public void setBtnViajes(JButton btnViajes) {
        this.btnViajes = btnViajes;
    }

    public JDesktopPane getDesctopPrincipal() {
        return desctopPrincipal;
    }

    public void setDesctopPrincipal(JDesktopPane desctopPrincipal) {
        this.desctopPrincipal = desctopPrincipal;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        desctopPrincipal = new javax.swing.JDesktopPane();
        toolBar = new javax.swing.JToolBar();
        btnPaquete = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnViajes = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnRemitentes = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnProvincias = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnEnvios = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnDestinarios = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnConductores = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btnCamiones = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnCantones = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel1.setText("Guía Practica, Base de Datos");

        desctopPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        toolBar.setRollover(true);

        btnPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/paquete64.png"))); // NOI18N
        btnPaquete.setToolTipText("Paquetes");
        btnPaquete.setFocusable(false);
        btnPaquete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaquete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnPaquete);
        toolBar.add(jSeparator4);

        btnViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/viaje64.png"))); // NOI18N
        btnViajes.setToolTipText("Viajes");
        btnViajes.setFocusable(false);
        btnViajes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViajes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnViajes);
        toolBar.add(jSeparator5);

        btnRemitentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/remitente64.png"))); // NOI18N
        btnRemitentes.setToolTipText("Remitentes");
        btnRemitentes.setFocusable(false);
        btnRemitentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemitentes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnRemitentes);
        toolBar.add(jSeparator6);

        btnProvincias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/provincia64.png"))); // NOI18N
        btnProvincias.setToolTipText("Provincias");
        btnProvincias.setFocusable(false);
        btnProvincias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProvincias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnProvincias);
        toolBar.add(jSeparator7);

        btnEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/envios64.png"))); // NOI18N
        btnEnvios.setToolTipText("Envios");
        btnEnvios.setFocusable(false);
        btnEnvios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnvios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnEnvios);
        toolBar.add(jSeparator9);

        btnDestinarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/destinatario64.png"))); // NOI18N
        btnDestinarios.setToolTipText("Destinatarios");
        btnDestinarios.setFocusable(false);
        btnDestinarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDestinarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnDestinarios);
        toolBar.add(jSeparator10);

        btnConductores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/conductor64.png"))); // NOI18N
        btnConductores.setToolTipText("Conductores");
        btnConductores.setFocusable(false);
        btnConductores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConductores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnConductores);
        toolBar.add(jSeparator11);

        btnCamiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/camion64.png"))); // NOI18N
        btnCamiones.setToolTipText("Camiones");
        btnCamiones.setFocusable(false);
        btnCamiones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCamiones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnCamiones);
        toolBar.add(jSeparator8);

        btnCantones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/canton64.png"))); // NOI18N
        btnCantones.setToolTipText("Cantones");
        btnCantones.setFocusable(false);
        btnCantones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCantones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnCantones);

        desctopPrincipal.setLayer(toolBar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desctopPrincipalLayout = new javax.swing.GroupLayout(desctopPrincipal);
        desctopPrincipal.setLayout(desctopPrincipalLayout);
        desctopPrincipalLayout.setHorizontalGroup(
            desctopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desctopPrincipalLayout.setVerticalGroup(
            desctopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desctopPrincipalLayout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 690, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(931, Short.MAX_VALUE))
            .addComponent(desctopPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(desctopPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCamiones;
    private javax.swing.JButton btnCantones;
    private javax.swing.JButton btnConductores;
    private javax.swing.JButton btnDestinarios;
    private javax.swing.JButton btnEnvios;
    private javax.swing.JButton btnPaquete;
    private javax.swing.JButton btnProvincias;
    private javax.swing.JButton btnRemitentes;
    private javax.swing.JButton btnViajes;
    private javax.swing.JDesktopPane desctopPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
