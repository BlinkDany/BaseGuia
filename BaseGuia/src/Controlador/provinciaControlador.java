/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.provincia;
import Modelo.provinciaModelo;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import vistas.VistaProvincias;

/**
 *
 * @author tatip
 */
public class provinciaControlador {

    provinciaModelo modelo;

    VistaProvincias vista;

    public provinciaControlador() {
    }

    public provinciaControlador(provinciaModelo modelo, VistaProvincias vista) {

        this.modelo = modelo;

        this.vista = vista;

        vista.setVisible(true);

    }

    public void iniciaControl() {
        // Configuración inicial de la vista
        vista.setTitle("Provincias");

        // Asociación de acciones a los botones
        vista.getBtnLimpiar().addActionListener(l -> limpiar());
        vista.getLblBuscar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                buscarProvincia();
                limpiaBusca();
            }

        });
        
        vista.getTxtCodProvincia().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               vista.getTxtCodProvincia().setText("");
            }
            
        });
        
        vista.getTxtNombrePro().addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
               vista.getTxtNombrePro().setText("");
            }
            
        });
        
        vista.getBtnSalir().addActionListener(l -> vista.dispose());
        
        vista.getBtnAgregar().addActionListener(l -> abrirDialogo("Crear"));

        vista.getBtnSalirDlg().addActionListener(l -> cerrarDialogo());

       
        mostrarDatosTabla();
    }

    private void cerrarDialogo() {

        vista.getDlg().dispose();

    }

    private void limpiaBusca() {
        vista.getTxtBuscar().setText("");
        mostrarDatosTabla();
    }

    private void abrirDialogo(String ce) {

        vista.getDlg().setLocationRelativeTo(vista);
        vista.getDlg().setSize(400, 300);
        vista.getDlg().setTitle(ce);

        if (vista.getDlg().getTitle().equals("Crear")) {

            vista.getBtnGuardar().setText("Registrar");
            limpiar();
            vista.getTxtCodProvincia().setEnabled(true);
        }
        vista.getDlg().setVisible(true);
    }
//modelo.setCodigoProducto(Integer.valueOf(vista.getTxtCodigoDlg().getText()));

    private void crearEditarProductos() {
        String title = vista.getDlg().getTitle();

        if (title.equals("Crear")) {
            if (camposVacios()) {
                JOptionPane.showMessageDialog(null, "Aún existen campos vacíos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                modelo.setCodProvincia(Integer.valueOf(vista.getTxtCodProvincia().getText()));

                if (modelo.Validar()) {

                    // Asignar valores al modelo
                    modelo.setNombreProvincia(vista.getTxtNombrePro().getText());
                    ;

                    if (modelo.insertarProvincia()) {
                        JOptionPane.showMessageDialog(null, "Datos guardados exitosamente",
                                "Advertencia", JOptionPane.INFORMATION_MESSAGE);

                        vista.getDlg().dispose();
                        mostrarDatosTabla();

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar la información",
                                "Advertencia", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(vista, "El código ingresado ya existe en la base de datos",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

// Verifica si hay campos vacíos en el formulario
    private boolean camposVacios() {
        return vista.getTxtCodProvincia().getText().isEmpty()
                || vista.getTxtNombrePro().getText().isEmpty();
    }

    public void llenarCamposDeTexto() {
        // Obtener la lista de productos
        List<provincia> listPro = modelo.listarProvincia();

        // Recorrer la lista de productos
        listPro.stream().forEach(p -> {
            // Verificar si el codigo del producto coincide con el codigo seleccionado en la tabla
            if (vista.getTblProvincias().getValueAt(vista.getTblProvincias().getSelectedRow(), 0).equals(p.getCodProvincia())) {

                // Llenar los campos de la vista con los datos de producto seleccionado
                vista.getTxtCodProvincia().setText(String.valueOf(p.getCodProvincia()));
                vista.getTxtNombrePro().setText(p.getNombreProvincia());

            }
        });
    }

    public void mostrarDatosTabla() {

        DefaultTableModel tabla = (DefaultTableModel) vista.getTblProvincias().getModel();
        tabla.setRowCount(0);

        // Obtener la lista de productos
        List<provincia> listPro = modelo.listarProvincia();

        // Recorrer la lista de productos
        listPro.forEach(p -> {

            // Crear un objeto datos con los valores de los campos correspondientes del producto
            Object[] datos = {p.getCodProvincia(), p.getNombreProvincia()};

            // Agregar el objeto como una nueva fila a la tabla
            tabla.addRow(datos);
        });

        // Agregar ordenamiento y filtrado a la tabla
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tabla);
        vista.getTblProvincias().setRowSorter(sorter);
    }

    public void buscarProvincia() {
        // Obtener el código ingresado en el campo de búsqueda
        int codigo = Integer.parseInt(vista.getTxtBuscar().getText());

        if (codigo == 0) {
            // Mostrar mensaje de error si no se ingresa el código
            JOptionPane.showMessageDialog(null, "Ingrese el código de la provincia que desea buscar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Obtener el modelo de la tabla
            DefaultTableModel tabla = (DefaultTableModel) vista.getTblProvincias().getModel();
            // Limpiar el modelo de datos de la tabla
            tabla.setNumRows(0);

            // Obtener la lista de productos
            List<provincia> listpro = modelo.listarProvincia();

            // Utilizar un stream para procesar la lista de productos
            listpro.stream()
                    // Filtrar los productos por el código
                    .filter(p -> codigo == p.getCodProvincia())
                    // Mapear cada producto filtrado a un objeto "datos" que contiene los valores deseados
                    .map(p -> {
                        // Crear un objeto "datos"
                        Object[] datos = {p.getCodProvincia(), p.getNombreProvincia()};
                        return datos;
                    })
                    // Agregar cada objeto "datos" como una nueva fila al modelo de la tabla
                    .forEach(tabla::addRow);
        }
    }

    public void limpiar() {

        vista.getTxtBuscar().setText("");
        vista.getTxtCodProvincia().setText("");
        vista.getTxtNombrePro().setText("");

    }

}
