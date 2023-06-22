/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.cantonModelo;
import Modelo.cantones;
import Modelo.provincia;
import Modelo.provinciaModelo;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import vistas.VistaCantones;

/**
 *
 * @author tatip
 */
public class cantonesControlador {
    
    provinciaModelo modeloProvincia;

    cantonModelo modeloCanton;

    VistaCantones vista;

    public cantonesControlador() {
    }

    public cantonesControlador(provinciaModelo modeloProvincia, cantonModelo modeloCanton, VistaCantones vista) {

        this.modeloProvincia = modeloProvincia;

        this.modeloCanton = modeloCanton;

        this.vista = vista;

        vista.setVisible(true);

    }

    public void iniciaControl() {
        // Configuración inicial de la vista
        vista.setTitle("Cantones");
        vista.getTblCantones().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                llenarCamposDeTextoCantones();
            }

        });
        // Asociación de   los botones
        

        vista.getLblBuscaCanton().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                buscarCanton();
                actualizaLimpia();
                
            }

        });
        
        
        vista.getLblBuscaProvincia().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {               
                buscarProvincia();
                actualizaLimpia();
            }

        });

        vista.getBtnLimpiar().addActionListener(l -> limpiarDlg());
        

        vista.getBtnSalir().addActionListener(l -> vista.dispose());
        vista.getBtnAgregar().addActionListener(l -> abrirDialogo("Crear"));
        
        
       

        vista.getBtnSalirDlg().addActionListener(l -> cerrarDialogo());
        

        vista.getBtnGuardar().addActionListener(l -> crearCanton());
        vista.getBtnGuardar().addActionListener(l -> mostrarDatosTablaCanton());
        
        
        vista.getTblProvincia().getSelectionModel().addListSelectionListener(e -> {
            // Verifica si hay alguna fila seleccionada
            if (vista.getTblProvincia().getSelectedRow() != -1) {
                // Llama al método para llenar los campos de texto
                llenarCamposDeTextoProvincia();
            }
        });

        // Validaciones de entrada para los campos de texto
        

        mostrarDatosTablaProvincia();
        mostrarDatosTablaCanton();
      
    }

    private void cerrarDialogo() {

        vista.getDlg().dispose();

    }

    //limpiar actualizar talba
    private void actualizaLimpia() {
        vista.getTxtBuscarCanton().setText("");
        vista.getTxtBuscarProvincia().setText("");
                
        mostrarDatosTablaProvincia();
        mostrarDatosTablaCanton();
        
    }

    private void abrirDialogo(String ce) {

        vista.getDlg().setLocationRelativeTo(vista);
        vista.getDlg().setSize(400, 300);
        vista.getDlg().setTitle(ce);

        if (vista.getDlg().getTitle().equals("Crear")) {
            
            

            if (vista.getTblProvincia().getSelectedRow() == -1 ) {

                JOptionPane.showMessageDialog(vista, "Seleccione una provincia ", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                
                vista.getBtnGuardar().setText("Registrar");
                limpiarDlg();
                vista.getTxtCodProFK().setEditable(false);
                vista.getTxtCodCantonPk().setEditable(false);
                
                llenarCamposDeTextoProvincia();
                
                codAutoIncrementalCanton();
                vista.getDlg().setVisible(true);
                mostrarDatosTablaCanton();
            }
        }
    }

    private void crearCanton() {
        String title = vista.getDlg().getTitle();

        if (title.equals("Crear")) {

            if (camposVacios()) {

                JOptionPane.showMessageDialog(null, "Aún existen campos vacíos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                modeloCanton.setCodCantonPk(Integer.valueOf(vista.getTxtCodCantonPk().getText()));

                if (modeloCanton.Validar()) {

                    // Asignar valores a la factura
                    modeloCanton.setCodProvinciaFk(Integer.valueOf(vista.getTxtCodProFK().getText()));

                    modeloCanton.setNombreCanton(vista.getTxtNombreCanton().getText());

                    if (modeloCanton.insertarCanton()) {
                        JOptionPane.showMessageDialog(null, "Datos guardados exitosamente",
                                "Advertencia", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar la información",
                                "Advertencia", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(vista, "El código del canton  ingresado ya existe en la base de datos",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

 

// Verifica si hay campos vacíos en el formulario
    public boolean camposVacios() {
        return vista.getTxtCodCantonPk().getText().isEmpty()
                || vista.getTxtCodProFK().getText().isEmpty()
                || vista.getTxtNombreCanton().getText().isEmpty();
                
    }


    public void llenarCamposDeTextoCantones() {

        // Obtener la lista de productos
        List<cantones> listCan = modeloCanton.listarCanton();

        // Recorrer la lista de productos
        listCan.stream().forEach(p -> {
            // Verificar si el código del producto coincide con el código seleccionado en la tabla
            try {
                if (vista.getTblCantones().getValueAt(vista.getTblCantones().getSelectedRow(), 0).equals(p.getCodCantonPk())) {

                    vista.getTxtCodCantonPk().setText(String.valueOf(p.getCodCantonPk()));
                    vista.getTxtCodProFK().setText(String.valueOf(p.getCodProvinciaFk()));
                    vista.getTxtNombreCanton().setText((p.getNombreCanton()));                 

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });
    }
    
    public void llenarCamposDeTextoProvincia() {

        // Obtener la lista de productos
        List<provincia> listpro = modeloProvincia.listarProvincia();

        // Recorrer la lista de productos
        listpro.stream().forEach(p -> {
            // Verificar si el código del producto coincide con el código seleccionado en la tabla
            try {
                if (vista.getTblProvincia().getValueAt(vista.getTblProvincia().getSelectedRow(), 0).equals(p.getCodProvincia())) {

                    vista.getTxtCodProFK().setText(String.valueOf(p.getCodProvincia()));
                    

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });
    }

   

    public void mostrarDatosTablaCanton() {

        DefaultTableModel tabla = (DefaultTableModel) vista.getTblCantones().getModel();
        tabla.setRowCount(0);

        // Obtener la lista de productos
        List<cantones> listcan = modeloCanton.listarCanton();

        // Recorrer la lista de productos
        listcan.stream().forEach(p -> {

                Object[] datos = {p.getCodCantonPk(), p.getCodProvinciaFk(), p.getNombreCanton()};

                // Agregar el objeto como una nueva fila a la tabla
                tabla.addRow(datos);       

        });

    }

   
    public void mostrarDatosTablaProvincia() {

        DefaultTableModel tabla = (DefaultTableModel) vista.getTblProvincia().getModel();
        tabla.setRowCount(0);

        // Obtener la lista de productos
        List<provincia> listdeta = modeloProvincia.listarProvincia();

        // Recorrer la lista de productos
        listdeta.stream().forEach(p -> {

                // Crear un objeto datos con los valores de los campos correspondientes del producto
                Object[] datos = {p.getCodProvincia(), p.getNombreProvincia()};

                // Agregar el objeto como una nueva fila a la tabla
                tabla.addRow(datos);
          
        });
    }

    ////////////FIN DETALLE/////////////////////////////
    public void limpiarDlg() {

        vista.getTxtCodCantonPk().setText("");
        vista.getTxtCodProFK().setText("");
        vista.getTxtNombreCanton().setText("");

    }

   

    ////////////////////////////
    public void buscarCanton() {
        // Obtener la cédula ingresada en el campo de búsqueda
        String cod = vista.getTxtBuscarCanton().getText();

        if (cod.isEmpty()) {
            // Mostrar mensaje de error si no se ingresa la cédula
            JOptionPane.showMessageDialog(null, "Ingrese el código del canton",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Obtener el modelo de la tabla
            DefaultTableModel tabla = (DefaultTableModel) vista.getTblCantones().getModel();
            // Limpiar el modelo de datos de la tabla
            tabla.setNumRows(0);

            // Obtener la lista de personas
            List<cantones> listcan = modeloCanton.listarCanton();

            // Utilizar un stream para procesar la lista de personas
            listcan.stream()
                    // Filtrar las personas por la cédula 
                    .filter(p -> cod.equals(p.getCodCantonPk()))
                    // Mapear cada persona filtrada a un objeto "datos" que contiene los valores deseados
                    .map(p -> {
                        // Calcular la edad a partir de la fecha de nacimiento

                        // Crear un objeto "datos" 
                        Object[] datos = {p.getCodCantonPk(), p.getCodProvinciaFk(), p.getNombreCanton()};
                        return datos;
                    })
                    // Agregar cada objeto "datos" como una nueva fila al modelo de la tabla
                    .forEach(tabla::addRow);
        }
    }

    public void buscarProvincia() {
        // Obtener la cédula ingresada en el campo de búsqueda
        String pro = vista.getTxtBuscarProvincia().getText();

        if (pro.isEmpty()) {
            // Mostrar mensaje de error si no se ingresa la cédula
            JOptionPane.showMessageDialog(null, "Ingrese el código de la provincia",
                    "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
            
            // Obtener el modelo de la tabla
            DefaultTableModel tabla = (DefaultTableModel) vista.getTblProvincia().getModel();
            // Limpiar el modelo de datos de la tabla
            tabla.setNumRows(0);

            // Obtener la lista de personas
            List<provincia> listpro = modeloProvincia.listarProvincia();

            // Utilizar un stream para procesar la lista de personas
            listpro.stream().forEach(p -> {

                if (Integer.valueOf(pro) == p.getCodProvincia()) {
                    Object[] datos = {p.getCodProvincia(), p.getNombreProvincia()};
                    tabla.addRow(datos);
                }
            });
        }
    }

    ///////////////////////////
    

    public void codAutoIncrementalCanton() {
        String codigo = String.valueOf(modeloCanton.CargarCodigoCanton());
        vista.getTxtCodCantonPk().setText(codigo);
    }

   
    
}
