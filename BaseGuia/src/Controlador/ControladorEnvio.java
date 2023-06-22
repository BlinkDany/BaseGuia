package asd;

import Conexion.ConexionBD;
import Modelo.Envios;
import Modelo.ModeloEnvios;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
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
        ven.btnRefresh.addActionListener(l -> MostrarDatos());
        ven.btnGuardar.addActionListener(l -> Registrar());
        ven.lblBuscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            
                if (ven.txtBuscar.getText().isEmpty()) {
                    MessageError("Ingrese un codigo");
                } else {
                    
                    Buscar();
                }
            }
        });
        ven.tblEnvios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            
                LlenarDatos();
            }
        });
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

                    Connection con = ConexionBD.getConnection();
                    if (men.Regi(con)) {
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

    public void MostrarDatos() {

        DefaultTableModel modelo = (DefaultTableModel) ven.tblEnvios.getModel();
        modelo.setNumRows(0);
        List<Envios> listv = men.ListaEnvios();

        listv.stream().forEach(p -> {

            Object datos[] = {p.getCodEnvios(), p.getFehca(), p.getCodPaquete(), p.getCodCanton()};
            modelo.addRow(datos);
        });

    }

    public void LlenarDatos(){
        
        List<Envios> listv = men.ListaEnvios();

        listv.stream().forEach(p -> {

            if (p.getCodEnvios() == ven.tblEnvios.getValueAt(ven.tblEnvios.getSelectedRow(), 0).hashCode()) {

                ven.txtCanton.setText(String.valueOf(p.getCodCanton()));
                ven.txtCod.setText(String.valueOf(p.getCodEnvios()));
                ven.txtIdPaquete.setText(String.valueOf(p.getCodPaquete()));
                ven.txtViaje.setText(String.valueOf(p.getCodViaje()));
                ven.txtDate.setDate(p.getFehca());
            }
        });
        
    }
    
    public void Buscar() {

        DefaultTableModel modelo = (DefaultTableModel) ven.tblEnvios.getModel();
        modelo.setNumRows(0);
        List<Envios> listv = men.ListaEnvios();

        listv.stream().forEach(p -> {

            if (p.getCodEnvios() == Integer.valueOf(ven.txtBuscar.getText())) {

                Object datos[] = {p.getCodEnvios(), p.getFehca(), p.getCodPaquete(), p.getCodCanton()};
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
