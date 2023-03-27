package menus;
import formas.*;
import javax.swing.*;
import java.awt.event.*;

public class Principal extends JFrame {
    private JPanel panelVistas;
    private JMenuBar barraMenu;
    private JMenu menuGUIs;
    private JMenuItem itemGUI;
    private JMenuItem itemEventoMouse;
    private JMenuItem itemEventoTeclado;
    private JMenu menuProcesos;
    private JMenuItem itemBackUp;

    public Principal() {
        super("Muestra de GUIS y Eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocation(400, 250);
        //  setResizable(false);
        //  setContentPane(panelVistas);

        barraMenu = new JMenuBar();
        menuGUIs = new JMenu("Interfaces");
        itemGUI = new JMenuItem("GUI");
        itemGUI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI gui=new GUI();
            }
        });

        itemEventoMouse = new JMenuItem("Evento Mouse");
        itemEventoMouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RastreadorDeMouse ap=new RastreadorDeMouse();
            }
        });
        itemEventoTeclado = new JMenuItem(("Evento Teclado"));
        //   itemEventMouse.setActionCommand(" ");
        itemEventoTeclado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventoTeclado eventoTeclado=new EventoTeclado();
            }
        });

        menuProcesos = new JMenu("Procesos");
        itemBackUp = new JMenuItem("BackUp");

        menuGUIs.add(itemGUI);
        menuGUIs.add(itemEventoMouse);
        menuGUIs.add(itemEventoTeclado);

        barraMenu.add(menuGUIs);
        menuProcesos.add(itemBackUp);
        barraMenu.add(menuProcesos);
        this.setJMenuBar(barraMenu);

        setVisible(true);

        // Evento de llamado a la forma GUI
        itemGUI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}