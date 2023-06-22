/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author tatip
 */
public class VistaCantones extends javax.swing.JFrame {

    /**
     * Creates new form VistaCamion
     */
    public VistaCantones() {
        initComponents();
    }

    public JLabel getLblBuscaCanton() {
        return lblBuscaCanton;
    }

    public void setLblBuscaCanton(JLabel lblBuscaCanton) {
        this.lblBuscaCanton = lblBuscaCanton;
    }

    public JLabel getLblBuscaProvincia() {
        return lblBuscaProvincia;
    }

    public void setLblBuscaProvincia(JLabel lblBuscaProvincia) {
        this.lblBuscaProvincia = lblBuscaProvincia;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnSalirDlg() {
        return btnSalirDlg;
    }

    public void setBtnSalirDlg(JButton btnSalirDlg) {
        this.btnSalirDlg = btnSalirDlg;
    }

    public JDialog getDlg() {
        return dlg;
    }

    public void setDlg(JDialog dlg) {
        this.dlg = dlg;
    }

    public JLabel getLblBuscar() {
        return lblBuscaCanton;
    }

    public void setLblBuscar(JLabel lblBuscar) {
        this.lblBuscaCanton = lblBuscar;
    }

    public JLabel getLblBuscar1() {
        return lblBuscaProvincia;
    }

    public void setLblBuscar1(JLabel lblBuscar1) {
        this.lblBuscaProvincia = lblBuscar1;
    }

    public JLabel getLblCamion() {
        return lblCamion;
    }

    public void setLblCamion(JLabel lblCamion) {
        this.lblCamion = lblCamion;
    }

    public JLabel getLblConductor() {
        return lblConductor;
    }

    public void setLblConductor(JLabel lblConductor) {
        this.lblConductor = lblConductor;
    }

    public JLabel getLblDestinario() {
        return lblDestinario;
    }

    public void setLblDestinario(JLabel lblDestinario) {
        this.lblDestinario = lblDestinario;
    }

    public JLabel getLblEnvios() {
        return lblEnvios;
    }

    public void setLblEnvios(JLabel lblEnvios) {
        this.lblEnvios = lblEnvios;
    }

    public JLabel getLblPaquete() {
        return lblPaquete;
    }

    public void setLblPaquete(JLabel lblPaquete) {
        this.lblPaquete = lblPaquete;
    }

    public JLabel getLblProvincia() {
        return lblProvincia;
    }

    public void setLblProvincia(JLabel lblProvincia) {
        this.lblProvincia = lblProvincia;
    }

    public JLabel getLblRemitente() {
        return lblRemitente;
    }

    public void setLblRemitente(JLabel lblRemitente) {
        this.lblRemitente = lblRemitente;
    }

    public JLabel getLblViajes() {
        return lblViajes;
    }

    public void setLblViajes(JLabel lblViajes) {
        this.lblViajes = lblViajes;
    }

    public JTable getTblCantones() {
        return tblCantones;
    }

    public void setTblCantones(JTable tblCantones) {
        this.tblCantones = tblCantones;
    }

    public JTable getTblProvincia() {
        return tblProvincia;
    }

    public void setTblProvincia(JTable tblProvincia) {
        this.tblProvincia = tblProvincia;
    }

    public JTextField getTxtBuscarCanton() {
        return txtBuscarCanton;
    }

    public void setTxtBuscarCanton(JTextField txtBuscarCanton) {
        this.txtBuscarCanton = txtBuscarCanton;
    }

    public JTextField getTxtBuscarProvincia() {
        return txtBuscarProvincia;
    }

    public void setTxtBuscarProvincia(JTextField txtBuscarProvincia) {
        this.txtBuscarProvincia = txtBuscarProvincia;
    }

    public JTextField getTxtCodCantonPk() {
        return txtCodCantonPk;
    }

    public void setTxtCodCantonPk(JTextField txtCodCantonPk) {
        this.txtCodCantonPk = txtCodCantonPk;
    }

    public JTextField getTxtCodProFK() {
        return txtCodProFK;
    }

    public void setTxtCodProFK(JTextField txtCodProFK) {
        this.txtCodProFK = txtCodProFK;
    }

    public JTextField getTxtNombreCanton() {
        return txtNombreCanton;
    }

    public void setTxtNombreCanton(JTextField txtNombreCanton) {
        this.txtNombreCanton = txtNombreCanton;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlg = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtCodCantonPk = new javax.swing.JTextField();
        txtNombreCanton = new javax.swing.JTextField();
        txtCodProFK = new javax.swing.JTextField();
        btnSalirDlg = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblPaquete = new javax.swing.JLabel();
        lblRemitente = new javax.swing.JLabel();
        lblDestinario = new javax.swing.JLabel();
        lblEnvios = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblViajes = new javax.swing.JLabel();
        lblCamion = new javax.swing.JLabel();
        lblConductor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCantones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtBuscarProvincia = new javax.swing.JTextField();
        lblBuscaProvincia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProvincia = new javax.swing.JTable();
        txtBuscarCanton = new javax.swing.JTextField();
        lblBuscaCanton = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 204));
        jLabel2.setText("Cantones");

        btnLimpiar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/limpiar32.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnGuardar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/guardar32.jpg"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtCodCantonPk.setText("Código Canton");
        txtCodCantonPk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodCantonPkMouseClicked(evt);
            }
        });

        txtNombreCanton.setText("Nombre Canton");
        txtNombreCanton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreCantonMouseClicked(evt);
            }
        });

        txtCodProFK.setText("Código Provincia");
        txtCodProFK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodProFKMouseClicked(evt);
            }
        });
        txtCodProFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProFKActionPerformed(evt);
            }
        });

        btnSalirDlg.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnSalirDlg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/salir32.jpg"))); // NOI18N
        btnSalirDlg.setToolTipText("Salir");
        btnSalirDlg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addComponent(txtNombreCanton)
                            .addComponent(txtCodCantonPk)
                            .addComponent(txtCodProFK))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirDlg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirDlg))
                .addGap(18, 18, 18)
                .addComponent(txtCodProFK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCodCantonPk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombreCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout dlgLayout = new javax.swing.GroupLayout(dlg.getContentPane());
        dlg.getContentPane().setLayout(dlgLayout);
        dlgLayout.setHorizontalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlgLayout.setVerticalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/paquete64.png"))); // NOI18N
        lblPaquete.setToolTipText("Paquete");

        lblRemitente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/remitente64.png"))); // NOI18N
        lblRemitente.setToolTipText("Remitente");

        lblDestinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/destinatario64.png"))); // NOI18N
        lblDestinario.setToolTipText("Destinatario");

        lblEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/envios64.png"))); // NOI18N
        lblEnvios.setToolTipText("Envios");
        lblEnvios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEnviosMouseEntered(evt);
            }
        });

        lblProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/provincia64.png"))); // NOI18N
        lblProvincia.setToolTipText("Provincias");
        lblProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProvinciaMouseEntered(evt);
            }
        });

        lblViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/viaje64.png"))); // NOI18N
        lblViajes.setToolTipText("Viajes");

        lblCamion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/camion64.png"))); // NOI18N
        lblCamion.setToolTipText("Envios");
        lblCamion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCamionMouseEntered(evt);
            }
        });

        lblConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/conductor64.png"))); // NOI18N
        lblConductor.setToolTipText("Conductor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRemitente)
                            .addComponent(lblPaquete)
                            .addComponent(lblDestinario)
                            .addComponent(lblEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblViajes))
                            .addComponent(lblConductor))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblRemitente)
                .addGap(18, 18, 18)
                .addComponent(lblDestinario)
                .addGap(19, 19, 19)
                .addComponent(lblPaquete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEnvios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCamion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConductor)
                .addGap(18, 18, 18)
                .addComponent(lblProvincia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblViajes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblCantones.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        tblCantones.setForeground(new java.awt.Color(0, 153, 255));
        tblCantones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Provincia", "Código Canton", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCantones);
        if (tblCantones.getColumnModel().getColumnCount() > 0) {
            tblCantones.getColumnModel().getColumn(2).setHeaderValue("Nombre");
        }

        jPanel2.setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Cantones");

        btnSalir.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/salir32.jpg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/agregar32.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427)
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregar))
                .addContainerGap())
        );

        txtBuscarProvincia.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        txtBuscarProvincia.setText("Buscar Provincia");
        txtBuscarProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarProvinciaMouseClicked(evt);
            }
        });

        lblBuscaProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/buscar32.png"))); // NOI18N
        lblBuscaProvincia.setToolTipText("Buscar");

        tblProvincia.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        tblProvincia.setForeground(new java.awt.Color(0, 153, 255));
        tblProvincia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Provincia", "Nombre Provincia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProvincia);

        txtBuscarCanton.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        txtBuscarCanton.setText("Buscar Canton");
        txtBuscarCanton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarCantonMouseClicked(evt);
            }
        });
        txtBuscarCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCantonActionPerformed(evt);
            }
        });

        lblBuscaCanton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/buscar32.png"))); // NOI18N
        lblBuscaCanton.setToolTipText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblBuscaProvincia)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblBuscaCanton)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarCanton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(349, 349, 349)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblBuscaProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarProvincia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblBuscaCanton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarCanton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblProvinciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProvinciaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProvinciaMouseEntered

    private void lblEnviosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnviosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEnviosMouseEntered

    private void txtBuscarCantonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCantonMouseClicked
        
    }//GEN-LAST:event_txtBuscarCantonMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void lblCamionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCamionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCamionMouseEntered

    private void txtBuscarProvinciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarProvinciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProvinciaMouseClicked

    private void txtBuscarCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCantonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCantonActionPerformed

    private void txtCodProFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProFKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProFKActionPerformed

    private void txtCodProFKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodProFKMouseClicked
  
    }//GEN-LAST:event_txtCodProFKMouseClicked

    private void txtCodCantonPkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodCantonPkMouseClicked
       
    }//GEN-LAST:event_txtCodCantonPkMouseClicked

    private void txtNombreCantonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCantonMouseClicked
   
    }//GEN-LAST:event_txtNombreCantonMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
      
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCantones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCantones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCantones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCantones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCantones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirDlg;
    private javax.swing.JDialog dlg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBuscaCanton;
    private javax.swing.JLabel lblBuscaProvincia;
    private javax.swing.JLabel lblCamion;
    private javax.swing.JLabel lblConductor;
    private javax.swing.JLabel lblDestinario;
    private javax.swing.JLabel lblEnvios;
    private javax.swing.JLabel lblPaquete;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblRemitente;
    private javax.swing.JLabel lblViajes;
    private javax.swing.JTable tblCantones;
    private javax.swing.JTable tblProvincia;
    private javax.swing.JTextField txtBuscarCanton;
    private javax.swing.JTextField txtBuscarProvincia;
    private javax.swing.JTextField txtCodCantonPk;
    private javax.swing.JTextField txtCodProFK;
    private javax.swing.JTextField txtNombreCanton;
    // End of variables declaration//GEN-END:variables
}
