/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloViajes;
import Modelo.Viajes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        vvia.setLocationRelativeTo(null);
        vvia.setTitle("Viajes");
        vvia.btnRegistrar.addActionListener(l -> Registrar());
        vvia.btnGuardar.addActionListener(l -> AbrirDialog());
    }

    public void AbrirDialog() {

        vvia.dialogRegistrar.setVisible(true);
        vvia.dialogRegistrar.setLocationRelativeTo(null);
        vvia.dialogRegistrar.setTitle("Registrar");
        vvia.dialogRegistrar.setSize(400, 408);

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
                    vvia.dialogRegistrar.dispose();
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

    public void MessageOk(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }

    public void MessageError(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
