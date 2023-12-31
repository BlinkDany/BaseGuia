/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloViajes;
import Modelo.Viajes;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.VistaViajes;

/**
 *
 * @author blink
 */
public class ControladorViajes {

    ModeloViajes mvi;
    VistaViajes vvia;

    public ControladorViajes() {
    }

    public ControladorViajes(ModeloViajes mvi, VistaViajes vvia) {
        this.mvi = mvi;
        this.vvia = vvia;
        vvia.setVisible(true);
    }

    public void Iniciar() {

        MostrarDatos();
        vvia.setTitle("Viajes");
        vvia.btnRegistrar.addActionListener(l -> Registrar());
        vvia.btnRefresh.addActionListener(l -> MostrarDatos());
        vvia.lblBuscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (vvia.txtBuscar.getText().isEmpty()) {
                    MessageError("Ingrese un valor");
                } else {
                    
                    Buscar();
                }
            }
        });
        vvia.tblViajes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                LlenarDatos();
            }
        });
    }

    public void Registrar() {

        if (vvia.txtCod.getText().isEmpty() || vvia.txtDate.getDate() == null || vvia.txtIdConductor.getText().isEmpty() || vvia.txtMatricula.getText().isEmpty()) {

            MessageError("Faltan campos por llenar");
        } else {

            mvi.setCodviajes(Integer.valueOf(vvia.txtCod.getText()));
            if (mvi.ValidarCodigo()) {

                mvi.setFecha(new java.sql.Date(vvia.txtDate.getDate().getTime()));
                mvi.setIdConductor(Integer.valueOf(vvia.txtIdConductor.getText()));
                mvi.setMatriculaCamion(vvia.txtMatricula.getText());

                if (mvi.RegistrarViajes()) {
                    MessageOk("Se ha registrado con exito");
                    MostrarDatos();
                } else {

                    MessageError("No se ah podido registrar en la base de datos");
                }

            } else {

                MessageError("El codigo del viaje ya existe");
            }
        }
    }

    public void MostrarDatos() {

        DefaultTableModel modelo = (DefaultTableModel) vvia.tblViajes.getModel();
        modelo.setNumRows(0);
        List<Viajes> listv = mvi.ListaViajes();

        listv.stream().forEach(p -> {

            Object datos[] = {p.getCodviajes(), p.getFecha(), p.getIdConductor(), p.getMatriculaCamion()};
            modelo.addRow(datos);
        });

    }
    
    public void LlenarDatos(){
        
        List<Viajes> listv = mvi.ListaViajes();

        listv.stream().forEach(p -> {

            if (p.getCodviajes() == Integer.valueOf(vvia.tblViajes.getValueAt(vvia.tblViajes.getSelectedRow(), 0).hashCode())) {

                vvia.txtCod.setText(String.valueOf(p.getCodviajes()));
                vvia.txtDate.setDate(p.getFecha());
                vvia.txtIdConductor.setText(String.valueOf(p.getIdConductor()));
                vvia.txtMatricula.setText(String.valueOf(p.getMatriculaCamion()));
            }
        });
        
    }

    public void Buscar() {

        DefaultTableModel modelo = (DefaultTableModel) vvia.tblViajes.getModel();
        modelo.setNumRows(0);
        List<Viajes> listv = mvi.ListaViajes();

        listv.stream().forEach(p -> {

            if (p.getCodviajes() == Integer.valueOf(vvia.txtBuscar.getText())) {

                Object datos[] = {p.getCodviajes(), p.getFecha(), p.getIdConductor(), p.getMatriculaCamion()};
                modelo.addRow(datos);
            }
        });

    }

    public void MessageOk(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }

    public void MessageError(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
