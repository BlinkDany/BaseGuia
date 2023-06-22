package Controlador;
import Modelo.Conductores;
import Modelo.ModeloConductores;
import java.util.List;
import vistas.VistaConductor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Derek
 */
public class ControladorConductor {
    ModeloConductores mcod;
    VistaConductor  vcod;
    public ControladorConductor() {
    }
     public ControladorConductor(Modelo.Conductores mcod, vistas.VistaConductor vcod) {
        this.mcod = (ModeloConductores) mcod;
        this.vcod = vcod;
        vcod.setVisible(true);
    }

    public void Iniciar() {

        MostrarDatos();
        vcod.setTitle("Conductor");
        vcod.setLocationRelativeTo(null);
        //vcod.getBtnregistrar().addActionListener(l-> RegistrarConductor());
        vcod.getBtnagregarconduc().addActionListener(l -> IniciarDialog());
    }

    public void IniciarDialog() {

        vcod.getJINTFConductores().setVisible(true);
        vcod.getJINTFConductores().setSize(519, 389);
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
    
    public void MostrarDatos(){
        
        DefaultTableModel tabla = (DefaultTableModel) vcod.jtblconductor.getModel();
        tabla.setNumRows(0);
        List<Conductores> pa = mcod.listarConductores(0);
        
        pa.stream().forEach(p -> {
            
            Object datos [] = {p.getIdConductor(), p.getCedulaPer(), p.getSalario()};
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
