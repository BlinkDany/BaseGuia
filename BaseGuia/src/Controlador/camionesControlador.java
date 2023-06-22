
package Controlador;

import Modelo.Camiones;
import Modelo.camionModelo;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import vistas.VistaCamion;

/**
 *
 * @author tatip
 */
public class camionesControlador {
    
   
    camionModelo camionModelo;
    VistaCamion VistaCamion;
   
   public camionesControlador(){
       
   }
   
    public camionesControlador(camionModelo modeloCamion, VistaCamion  vista) {

        this.camionModelo = modeloCamion;

        this.VistaCamion = vista;

        vista.setVisible(true);

    }
    
    public void iniciaControl() {
        // Configuración inicial de la vista
        VistaCamion.setTitle("Camiones");
        VistaCamion.getTblCamion().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                llenarCamposDeTextoCamion();
            }

        });
        // Asociación de   los botones

        VistaCamion.getBtnLimpiar1().addActionListener(l -> limpiarDlg());
        VistaCamion.getLblBuscar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                buscarCamion();
            }

        });
        
         VistaCamion.getTxtBuscar().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               VistaCamion.getTxtBuscar().setText("");
            }
            
        });
         
         VistaCamion.getTxtCodProvincia2().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               VistaCamion.getTxtCodProvincia2().setText("");
            }
            
        });
         
          VistaCamion.getTxtMarca().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               VistaCamion.getTxtMarca().setText("");
            }
            
        });
          
          VistaCamion.getTxtMatricula().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               VistaCamion.getTxtMatricula().setText("");
            }
            
        });
          
          
          VistaCamion.getTxtModelo().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               VistaCamion.getTxtModelo().setText("");
            }
            
        });
          
          
          VistaCamion.getTxtPotencia().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               VistaCamion.getTxtPotencia().setText("");
            }
            
        });
          
        
        VistaCamion.getBtnSalirdlg().addActionListener(l -> cerrarDialogo());
        VistaCamion.getBtnSalir().addActionListener(l -> VistaCamion.dispose());
        VistaCamion.getBtnCrear().addActionListener(l -> abrirDialogo("Crear"));
        VistaCamion.getBtnCrear().addActionListener(l -> llenarCamposDeTextoCamion());
        VistaCamion.getBtnGuardar1().addActionListener(l -> crearCamion());

        VistaCamion.getBtnLimpiar1().addActionListener(l -> actualizaLimpia());

        
        

        VistaCamion.getTblCamion().getSelectionModel().addListSelectionListener(e -> {
            // Verifica si hay alguna fila seleccionada
            if (VistaCamion.getTblCamion().getSelectedRow() != -1) {
                // Llama al método para llenar los campos de texto
                llenarCamposDeTextoCamion();
            }
        });

        mostrarDatosTablaCamion();

    }

    private void cerrarDialogo() {

        VistaCamion.getDlg().dispose();

    }

    //limpiar actualizar talba
    private void actualizaLimpia() {
        VistaCamion.getTxtBuscar().setText("");

        mostrarDatosTablaCamion();
        
    }

    private void abrirDialogo(String ce) {

        VistaCamion.getDlg().setLocationRelativeTo(VistaCamion);
        VistaCamion.getDlg().setSize(400, 400);
        VistaCamion.getDlg().setTitle(ce);

        if (VistaCamion.getDlg().getTitle().equals("Crear")) {
            
            

            if (VistaCamion.getTblCamion().getSelectedRow() == -1 || VistaCamion.getTblCamion().getSelectedRow() == -1) {

                JOptionPane.showMessageDialog(VistaCamion, "Seleccione un camion", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                VistaCamion.getBtnGuardar1().setText("Registrar");
                limpiarDlg();
                llenarCamposDeTextoCamion();
                VistaCamion.getDlg().setVisible(true);
                // crearFactura();
                
                mostrarDatosTablaCamion();
            }
        }
    }

   

    private void crearCamion() {
        String title = VistaCamion.getDlg().getTitle();

        if (title.equals("Crear")) {

            if (camposVacios()) {

                JOptionPane.showMessageDialog(null, "Aún existen campos vacíos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                camionModelo.setMatricula((VistaCamion.getTxtMatricula().getText()));
               

                if (camionModelo.Validar()) {

                 
                    camionModelo.setMarca(VistaCamion.getTxtMarca().getText());
                    camionModelo.setModelo((VistaCamion.getTxtModelo().getText()));
                    camionModelo.setPotencia((VistaCamion.getTxtPotencia().getText()));
             
            
                   
           

                    if (camionModelo.insertarCamion()) {
                        // vista.getDlgFacturaYdetalle().dispose();
                        mostrarDatosTablaCamion();
                        

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar la información",
                                "Advertencia", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(VistaCamion, "La matricula ingresada ya existe",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        }

    }

// Verifica si hay campos vacíos en el formulario
    public boolean camposVacios() {
        return VistaCamion.getTxtMarca().getText().isEmpty()
                || VistaCamion.getTxtMatricula().getText().isEmpty()
                || VistaCamion.getTxtPotencia().getText().isEmpty()
                || VistaCamion.getTxtModelo().getText().isEmpty();
              
    }

 

    public void mostrarDatosTablaCamion() {
    DefaultTableModel tabla = (DefaultTableModel) VistaCamion.getTblCamion().getModel();
    tabla.setRowCount(0);

    // Obtener la lista de productos
    List<Camiones> listca = camionModelo.listarCamion();

    // Crear un objeto de renderizado de celda personalizado
    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    cellRenderer.setPreferredSize(new Dimension(150, 100)); // Establecer tamaño personalizado para las celdas

    // Establecer el objeto de renderizado de celda personalizado para todas las columnas de la tabla
    for (int i = 0; i < VistaCamion.getTblCamion().getColumnCount(); i++) {
        VistaCamion.getTblCamion().getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
    }

    // Recorrer la lista de productos
    listca.forEach(p -> {
        // Crear un objeto datos con los valores de los campos correspondientes del producto
        Object[] datos = {p.getMatricula(), p.getMarca(), p.getModelo(), p.getPotencia()};

        // Agregar el objeto como una nueva fila a la tabla
        tabla.addRow(datos);
    });
}

    public void llenarCamposDeTextoCamion() {
        // Borrar los datos existentes en los campos de texto
        limpiarDlg();

        // Obtener la lista de personas
        List<Camiones> lictca = camionModelo.listarCamion();

        // Recorrer la lista de personas
        lictca.stream().forEach(p -> {
            // Verificar si el código de la persona coincide con el código seleccionado en la tabla
            if (VistaCamion.getTblCamion().getValueAt(VistaCamion.getTblCamion().getSelectedRow(), 0).equals(p.getMatricula())) {
                // Llenar el campo de la vista con el dato de la idFacFk
                VistaCamion.getTxtMatricula().setText(p.getMatricula());
            }
        });
    }

    

   
    public void limpiarDlg() {

        VistaCamion.getTxtBuscar().setText("");
        VistaCamion.getTxtCodProvincia2().setText("");
        VistaCamion.getTxtMarca().setText("");

        VistaCamion.getTxtMatricula().setText("");
        VistaCamion.getTxtModelo().setText("");
        VistaCamion.getTxtPotencia().setText("");
        

    }

   
    public void buscarCamion() {
        // Obtener la cédula ingresada en el campo de búsqueda
        String placa = VistaCamion.getTxtBuscar().getText();

        if (placa.isEmpty()) {
            // Mostrar mensaje de error si no se ingresa la cédula
            JOptionPane.showMessageDialog(null, "Ingrese la matricula del camion",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Obtener el modelo de la tabla
            DefaultTableModel tabla = (DefaultTableModel) VistaCamion.getTblCamion().getModel();
            // Limpiar el modelo de datos de la tabla
            tabla.setNumRows(0);

            // Obtener la lista de personas
            List<Camiones> listf = camionModelo.listarCamion();

            // Utilizar un stream para procesar la lista de personas
            listf.stream()
                    // Filtrar las personas por la cédula 
                    .filter(p -> placa .equals(p.getMatricula()))
                    // Mapear cada persona filtrada a un objeto "datos" que contiene los valores deseados
                    .map(p -> {
                        // Calcular la edad a partir de la fecha de nacimiento

                        // Crear un objeto "datos" 
                        Object[] datos = {p.getMatricula(), p.getMarca(), p.getModelo(), p.getPotencia()};
                        return datos;
                    })
                    // Agregar cada objeto "datos" como una nueva fila al modelo de la tabla
                    .forEach(tabla::addRow);
        }
    }

    
}



  
 
