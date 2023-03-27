package formas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class RastreadorDeMouse extends JFrame
        implements MouseListener, MouseMotionListener {
    private JLabel barraEstado;

    public RastreadorDeMouse() {
        super("Demostrador de los eventos de raton");
        barraEstado = new JLabel();
        getContentPane().add(barraEstado, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
        setSize(500, 400);
        setLocation(600, 200);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        barraEstado.setText("Se hizo click en (" + e.getX() + "," + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        barraEstado.setText("Se oprimio en (" + e.getX() + "," + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        barraEstado.setText("Se solto en (" + e.getX() + "," + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        barraEstado.setText("Se entro en (" + e.getX() + "," + e.getY() + ")");
        getContentPane().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        barraEstado.setText("Raton Fuera de la Ventana");
        getContentPane().setBackground(Color.BLUE);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        barraEstado.setText("Se arrastro en (" + e.getX() + "," + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        barraEstado.setText("Se hizo movio en (" + e.getX() + "," + e.getY() + ")");

    }
    //implements MouseListener, MouseMotionListener


}