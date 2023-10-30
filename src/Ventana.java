import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextArea txtAlmacenTemporal;
    private JButton btnActualizarPilas;
    private JTextArea txtAlmacen1;
    private JTextArea txtAlmacen2;
    private JTextField txtAgregarAlmacenTemporal;
    private JButton agregarContenidoAAlButton;
    private JButton btnMoverFueraAlmacen1;
    private JButton btnMoverFueraAlmacen2;
    Almacen almacenGeneral = new Almacen();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {

        btnActualizarPilas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAlmacenTemporal.setText(almacenGeneral.toString(almacenGeneral.almacenTemporal));
                txtAlmacen1.setText(almacenGeneral.toString(almacenGeneral.almacen1));
                txtAlmacen2.setText(almacenGeneral.toString(almacenGeneral.almacen2));
            }
        });

        agregarContenidoAAlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                almacenGeneral.agregarAlmacen(txtAgregarAlmacenTemporal.getText(),almacenGeneral.almacenTemporal);
                JOptionPane.showMessageDialog(null,"OBJETO GUARDADO CORRECTAMENTE");
            }
        });
        btnMoverFueraAlmacen1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    almacenGeneral.sacarDeAlmacenTemporal(almacenGeneral.almacen1);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });

        btnMoverFueraAlmacen2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    almacenGeneral.sacarDeAlmacenTemporal(almacenGeneral.almacen2);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }
}
