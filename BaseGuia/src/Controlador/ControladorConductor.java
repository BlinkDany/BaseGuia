package Controlador;

import Modelo.Conductores;
import Modelo.ModeloConductores;
import Modelo.ModeloDestinatario;
import Modelo.ModeloRemitente;
import Modelo.Remitente;
import Modelo.destinatario;
import java.awt.Dimension;
import java.util.List;
import vistas.VistaConductor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Derek
 */
public class ControladorConductor {

    ModeloConductores mcod;
    VistaConductor vcod;
    ModeloRemitente mrem;
    ModeloDestinatario mdest;

    public ControladorConductor() {
    }

    public ControladorConductor(Modelo.Conductores mcod, vistas.VistaConductor vcod,ModeloRemitente mrem,ModeloDestinatario mdest) {
        this.mcod = (ModeloConductores) mcod;
        this.vcod = vcod;
        this.mrem = mrem;
        this.mdest = mdest;
        vcod.setVisible(true);
    }

    public void Iniciar() {

        MostrarDatos();
        vcod.setTitle("Conductor");
        vcod.setLocationRelativeTo(null);
        vcod.getBtnregistrar().addActionListener(l-> RegistrarConductor());
        vcod.getBtnlimpiar().addActionListener(l-> limpiar());
        vcod.getBtnagregarremi().addActionListener(l-> llenarCamposDeTextoRemitente());
        vcod.getBtnagregarconduc().addActionListener(l-> llenarCamposDeTextoConductores());
        vcod.getBtnagregardestinatario().addActionListener(l-> llenarCamposDeTextoDestinatario());
        vcod.getBtnagregarconduc().addActionListener(l -> IniciarDialog());
    }

    public void IniciarDialog() {

        vcod.getJINTFConductores().setVisible(true);
        vcod.getJINTFConductores().setSize(500, 600);
        //vcod.getJINTFConductores().setl;
        vcod.getJINTFConductores().setTitle("Registro de Conductores");
    }

    public void RegistrarConductor() {

        /*if (vcod.txt|| vcod.txt.getText().isEmpty() || vcod.txt.getText().isEmpty() || vcod.) {
            
            MessageError("Faltan campos por llenar");
        } else {
            
            mcod.setIdConductor(Integer.parseInt(vcod.txtid.getText()));
            
            if (mcod.ValidarID()) {
                
                mcod.setIdDestinatario(Integer.valueOf(vpa.txtDestinatario.getText()));
                mcod.setIdRemitente(Integer.valueOf(vpa.txtRemitente.getText()));
                
                if (mcod.crearConductor()) {
                    
                    MessageOk("Se ha registrado con exito");
                    MostrarDatos();
                } else {
                    
                    MessageError("No se ha podido guardar en la base de datos");
                }
            } else {
                
                MessageError("El codigo del conductor ya existe");
            }
        }*/
    }

    public void MostrarDatos() {

        DefaultTableModel tabla = (DefaultTableModel) vcod.jtblconductor.getModel();
        tabla.setNumRows(0);
        List<Conductores> pa = mcod.listarConductores(0);

        pa.stream().forEach(p -> {

            Object datos[] = {p.getIdConductor(), p.getCedulaPer(), p.getSalario()};
            tabla.addRow(datos);
        });
    }
     public void llenarCamposDeTextoConductores() {
        limpiar();

        List<Conductores> lictca = mcod.listarConductores(0);
        lictca.stream().forEach(p -> {
            if (vcod.getJtblconductor().getValueAt(vcod.getJtblconductor().getSelectedRow(), 0).hashCode()== p.getIdConductor()) {
                vcod.getTxtidconductor().setText(String.valueOf(p.getIdConductor()));
            }
        });
    }
     
     public void llenarCamposDeTextoRemitente() {
        limpiar();

        List<Remitente> lictca = mrem.listarRemitente(0);
        lictca.stream().forEach(p -> {
            if (vcod.getJtblremitente().getValueAt(vcod.getJtblremitente().getSelectedRow(), 0).hashCode()== p.getIdRemitente()) {
                vcod.getTxtidremitente().setText(String.valueOf(p.getIdRemitente()));
            }
        });
    }
     public void llenarCamposDeTextoDestinatario() {
        limpiar();

        List<destinatario> lictca = mdest.listarDestinatario(0);
        lictca.stream().forEach(p -> {
            if (vcod.getJtblDestinatario().getValueAt(vcod.getJtblDestinatario().getSelectedRow(), 0).hashCode()== p.getIdRDestinatario()) {
                vcod.getTxtiddestinatario().setText(String.valueOf(p.getIdRDestinatario()));
            }
        });
    }

     public void limpiar() {

        vcod.getTxtcedconductor().setText("");
        vcod.getTxtceduladestina().setText("");
        vcod.getTxtcedularemiten().setText("");
        vcod.getTxtidconductor().setText("");
        vcod.getTxtiddestinatario().setText("");
        vcod.getTxtidremitente().setText("");
        vcod.getSpnsalarioconduc().setValue(250);
        vcod.getJdcfechaentregadestina().setEnabled(true);
        vcod.getJdcfechaenvioremiten().setEnabled(true);
        

    }
    public void mostrarDatosTablaRemitente() {
        DefaultTableModel tabla = (DefaultTableModel) vcod.getJtblremitente().getModel();
        tabla.setRowCount(0);

        List<Remitente> listca = mrem.listarRemitente(0);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setPreferredSize(new Dimension(150, 100)); 
        for (int i = 0; i < vcod.getJtblremitente().getColumnCount(); i++) {
            vcod.getJtblremitente().getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        listca.forEach(p -> {
            Object[] datos = {p.getIdRemitente(), p.getCedulaPer(), p.getFechaEnvio()};
            tabla.addRow(datos);
        });
    }
    public void mostrarDatosTablaDestinatario() {
        DefaultTableModel tabla = (DefaultTableModel) vcod.getJtblDestinatario().getModel();
        tabla.setRowCount(0);

       // List<destinatario> listca = mcod.listarConductores(0);
       List<destinatario> listade = mdest.listarDestinatario(0);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setPreferredSize(new Dimension(150, 100)); 
        for (int i = 0; i < vcod.getJtblDestinatario().getColumnCount(); i++) {
            vcod.getJtblDestinatario().getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        listade.forEach(p -> {
            Object[] datos = {p.getIdRDestinatario(), p.getCedulaPer(), p.getFechaEntrega()};
            tabla.addRow(datos);
        });
    }

    public void MessageOk(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }

    public void MessageError(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
