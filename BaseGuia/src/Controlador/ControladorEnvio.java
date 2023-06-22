package asd;

import Modelo.Envios;
import Modelo.ModeloEnvios;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.VistaEnvios;

public class ControladorEnvio {

    ModeloEnvios men;
    VistaEnvios ven;

    public ControladorEnvio() {
    }

    public ControladorEnvio(ModeloEnvios men, VistaEnvios ven) {
        this.men = men;
        this.ven = ven;
        ven.setVisible(true);
    }

    public void Iniciar() {

        ven.setTitle("Envios");
        MostrarDatos();

    }

    public void Registrar() {

        if (ven.txtCanton.getText().isEmpty() || ven.txtCod.getText().isEmpty() || ven.txtDate.getDate() == null || ven.txtIdPaquete.getText().isEmpty()
                || ven.txtViaje.getText().isEmpty()) {

            MessageError("Faltan campos por llenar");
        } else {

            try {
                men.setCodCanton(Integer.valueOf(ven.txtCanton.getText()));

                if (men.ValidarCod()) {
                    
                    men.setCodCanton(Integer.valueOf(ven.txtCanton.getText()));
                    men.setCodEnvios(Integer.valueOf(ven.txtCod.getText()));
                    men.setCodPaquete(Integer.valueOf(ven.txtIdPaquete.getText()));
                    men.setCodViaje(Integer.valueOf(ven.txtViaje.getText()));
                    men.setFehca(new java.sql.Date(ven.txtDate.getDate().getTime()));
                    
                    if (men.Registrar()) {
                        MessageOk("Se ha registrado con exito");
                        MostrarDatos();
                    } else {
                        MessageError("Error al guardar en la base de datos");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEnvio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void MostrarDatos(){
        
        DefaultTableModel modelo = (DefaultTableModel) ven.tblEnvios.getModel();
        modelo.setNumRows(0);
        List<Envios> listv = men.ListaEnvios();

        listv.stream().forEach(p -> {

            Object datos[] = {p.getCodEnvios(), p.getFehca(), p.getCodPaquete(), p.getCodCanton()};
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
