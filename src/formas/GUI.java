package formas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class GUI extends JFrame  {
    public GUI(){
        JFrame ventana = new JFrame();
        ventana.setTitle("Clientes");
        ventana.setLocation(100, 100);
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //Crear paneles
        JPanel panelGeneral = new JPanel();
        JPanel panelEncabezado = new JPanel();
        JPanel panelBody = new JPanel();
        JPanel panelBotones = new JPanel();

        //Crear los labels (etiquetas)
        JLabel lblEncabezado = new JLabel();
        JLabel lblClave = new JLabel();
        JLabel lblNombre = new JLabel();
        JLabel lblDireccion = new JLabel();
        JLabel lblCiudad = new JLabel();
        JLabel lblEstado = new JLabel();

        //Asignar Valores a los labels
        lblEncabezado.setText("ENCABEZADO");
        lblClave.setText("Clave:");
        lblNombre.setText("Nombre:");
        lblDireccion.setText("Direccion:");
        lblCiudad.setText("Ciudad:");
        lblEstado.setText("Estado");

        //Crear los JTextFields
        JTextField jtfClave = new JTextField(5);
        JTextField jtfNombre = new JTextField(30);
        JTextField jtfDireccion = new JTextField(30);

        //Crear ComboBox

        String[] Lista = {"Veracruz", "Chiapas", "Quintana Roo", "Oaxaca"};
        JComboBox cmbEstado = new JComboBox(Lista);

        JComboBox cmbCiudad = new JComboBox();

        //Asignar items al ComboBox
        cmbCiudad.addItem("Veracruz");
        cmbCiudad.addItem("Tapachula");
        cmbCiudad.addItem("Cancun");
        cmbCiudad.addItem("Juquilita");


        //Crear los Botones
        JButton jbtAceptar = new JButton("Aceptar");
        JButton jbtCancelar = new JButton("Cancelar");
        JButton jbtSalir = new JButton("Salir");

        //Mas componentes
        JCheckBox chkbEstudiante = new JCheckBox();
        chkbEstudiante.setText("Estudiante");
        JCheckBox chkbBecado = new JCheckBox();
        chkbBecado.setText("Becado");


        //Panel Encabezado
        panelEncabezado.add(lblEncabezado);

        //Panel Body
        panelBody.setLayout(new GridLayout(5, 2));
        panelBody.add(lblClave);
        panelBody.add(jtfClave);
        panelBody.add(lblNombre);
        panelBody.add(jtfNombre);
        panelBody.add(lblDireccion);
        panelBody.add(jtfDireccion);
        panelBody.add(lblCiudad);
        panelBody.add(cmbCiudad);
        panelBody.add(lblEstado);
        panelBody.add(cmbEstado);

        //Panel de Botones
        panelBotones.setLayout(new GridLayout(1, 3));
        panelBotones.add(jbtAceptar);
        panelBotones.add(jbtCancelar);
        panelBotones.add(jbtSalir);

        //Integrar Paneles
        panelGeneral.setLayout(new BorderLayout());
        panelGeneral.add(panelEncabezado, BorderLayout.NORTH);
        panelGeneral.add(panelBody, BorderLayout.CENTER);
        panelGeneral.add(panelBotones, BorderLayout.SOUTH);

        //Ingresar el panel general en el JFrame
        ventana.add(panelGeneral);


        ventana.setVisible(true);
    }
}