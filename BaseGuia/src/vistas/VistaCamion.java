/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author tatip
 */
public class VistaCamion extends javax.swing.JFrame {

    /**
     * Creates new form VistaCamion
     */
    public VistaCamion() {
        initComponents();
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnGuardar1() {
        return btnGuardar1;
    }

    public void setBtnGuardar1(JButton btnGuardar1) {
        this.btnGuardar1 = btnGuardar1;
    }

    public JButton getBtnLimpiar1() {
        return btnLimpiar1;
    }

    public void setBtnLimpiar1(JButton btnLimpiar1) {
        this.btnLimpiar1 = btnLimpiar1;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JDialog getDlg() {
        return dlg;
    }

    public void setDlg(JDialog dlg) {
        this.dlg = dlg;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JButton getBtnSalirdlg() {
        return btnSalirdlg;
    }

    public void setBtnSalirdlg(JButton btnSalirdlg) {
        this.btnSalirdlg = btnSalirdlg;
    }

   

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblBuscar() {
        return lblBuscar;
    }

    public void setLblBuscar(JLabel lblBuscar) {
        this.lblBuscar = lblBuscar;
    }

    public JLabel getLblCanton() {
        return lblCanton;
    }

    public void setLblCanton(JLabel lblCanton) {
        this.lblCanton = lblCanton;
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

    public JTable getTblCamion() {
        return tblCamion;
    }

    public void setTblCamion(JTable tblCamion) {
        this.tblCamion = tblCamion;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCodProvincia2() {
        return txtCodProvincia2;
    }

    public void setTxtCodProvincia2(JTextField txtCodProvincia2) {
        this.txtCodProvincia2 = txtCodProvincia2;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtMatricula() {
        return txtMatricula;
    }

    public void setTxtMatricula(JTextField txtMatricula) {
        this.txtMatricula = txtMatricula;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtPotencia() {
        return txtPotencia;
    }

    public void setTxtPotencia(JTextField txtPotencia) {
        this.txtPotencia = txtPotencia;
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
        txtMarca = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        btnGuardar1 = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnSalirdlg = new javax.swing.JButton();
        txtCodProvincia2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCamion = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 204));
        jLabel2.setText("Camiones");

        txtMarca.setText("Marca");
        txtMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMarcaMouseClicked(evt);
            }
        });
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtPotencia.setText("Potencia");
        txtPotencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPotenciaMouseClicked(evt);
            }
        });
        txtPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaActionPerformed(evt);
            }
        });

        btnGuardar1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/guardar32.jpg"))); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnLimpiar1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/limpiar32.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtMatricula.setText("Matricula");
        txtMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatriculaMouseClicked(evt);
            }
        });
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        txtModelo.setText("Modelo");
        txtModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModeloMouseClicked(evt);
            }
        });
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        btnSalirdlg.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnSalirdlg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/salir32.jpg"))); // NOI18N
        btnSalirdlg.setToolTipText("");
        btnSalirdlg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalirdlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirdlgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula)
                    .addComponent(txtMarca)
                    .addComponent(txtPotencia)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirdlg))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnGuardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnLimpiar1))
                    .addComponent(txtModelo))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirdlg))
                .addGap(18, 18, 18)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1)
                    .addComponent(btnLimpiar1))
                .addContainerGap())
        );

        javax.swing.GroupLayout dlgLayout = new javax.swing.GroupLayout(dlg.getContentPane());
        dlg.getContentPane().setLayout(dlgLayout);
        dlgLayout.setHorizontalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgLayout.setVerticalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtCodProvincia2.setText("Código Provincia");
        txtCodProvincia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodProvincia2MouseClicked(evt);
            }
        });
        txtCodProvincia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProvincia2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));

        tblCamion.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        tblCamion.setForeground(new java.awt.Color(0, 153, 255));
        tblCamion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Marca", "Modelo", "Potencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCamion);

        jPanel2.setBackground(new java.awt.Color(153, 0, 204));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/buscar32.png"))); // NOI18N
        lblBuscar.setToolTipText("Buscar");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        txtBuscar.setText("Buscar");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/agregar32.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSalir.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/salir32.jpg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblBuscar)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCrear)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Camiones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
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

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaMouseClicked
        txtMarca.setText("");
    }//GEN-LAST:event_txtMarcaMouseClicked

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtPotenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPotenciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaMouseClicked

    private void txtPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaActionPerformed

    private void txtMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatriculaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaMouseClicked

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtCodProvincia2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodProvincia2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProvincia2MouseClicked

    private void txtCodProvincia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProvincia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProvincia2ActionPerformed

    private void txtModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModeloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloMouseClicked

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void btnSalirdlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirdlgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirdlgActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCamion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCamion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCamion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCamion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCamion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirdlg;
    private javax.swing.JDialog dlg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JTable tblCamion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodProvincia2;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPotencia;
    // End of variables declaration//GEN-END:variables
}
