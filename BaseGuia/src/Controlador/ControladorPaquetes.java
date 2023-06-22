package Controlador;

import Conexion.ConexionBD;
import Modelo.ModeloPaquetes;
import Modelo.Paquetes;
import java.sql.Connection;
import vistas.VistaPaquetes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorPaquetes {
    
    ModeloPaquetes mpa;
    VistaPaquetes vpa;

    public ControladorPaquetes() {
    }

    public ControladorPaquetes(ModeloPaquetes mpa, VistaPaquetes vpa) {
        this.mpa = mpa;
        this.vpa = vpa;
        vpa.setVisible(true);
    }

    public void Iniciar() {

        MostrarDatos();
        vpa.setTitle("Paquetes");
        vpa.setLocationRelativeTo(null);
        vpa.btnRegistrar.addActionListener(l -> RegistrarPaquete());
        vpa.btnRfresh.addActionListener(l -> MostrarDatos());
    }

    public void RegistrarPaquete() {
        
        if (vpa.txtCod.getText().isEmpty() || vpa.txtCanton.getText().isEmpty() || vpa.txtDescripcion.getText().isEmpty() || vpa.txtDestinatario.getText().isEmpty()
                || vpa.txtDireccion.getText().isEmpty() || vpa.txtPeso.getText().isEmpty() || vpa.txtPrecio.getText().isEmpty() || vpa.txtRemitente.getText().isEmpty()) {
            
            MessageError("Faltan campos por llenar");
        } else {
            
            mpa.setCodPaquete(Integer.parseInt(vpa.txtCod.getText()));
            
            if (mpa.ValidarCodigo()) {
                
                mpa.setCodPaquete(Integer.parseInt(vpa.txtCod.getText()));
                mpa.setCodCanton(Integer.valueOf(vpa.txtCanton.getText()));
                mpa.setDescripcion(vpa.txtDescripcion.getText());
                mpa.setDireccion(vpa.txtDireccion.getText());
                mpa.setIdDestinatario(Integer.valueOf(vpa.txtDestinatario.getText()));
                mpa.setIdRemitente(Integer.valueOf(vpa.txtRemitente.getText()));
                mpa.setPeso(Double.valueOf(vpa.txtPeso.getText()));
                mpa.setPrecio(Double.valueOf(vpa.txtPrecio.getText()));
                
                if (mpa.Regi()) {
                    
                    MessageOk("Se ha registrado con exito");
                    MostrarDatos();
                } else {
                    
                    MessageError("No se ha podido guardar en la base de datos");
                }
            } else {
                
                MessageError("El codigo del paquete ya existe");
            }
        }
    }
    
    public void MostrarDatos(){
        
        DefaultTableModel tabla = (DefaultTableModel) vpa.tblProducto.getModel();
        tabla.setNumRows(0);
        List<Paquetes> pa = mpa.ListaPaquetes();
        
        pa.stream().forEach(p -> {
            
            Object datos [] = {p.getCodPaquete(), p.getDescripcion(), p.getDireccion(), p.getPeso(), p.getPrecio(), p.getIdRemitente(), p.getIdDestinatario(), p.getCodCanton()};
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
