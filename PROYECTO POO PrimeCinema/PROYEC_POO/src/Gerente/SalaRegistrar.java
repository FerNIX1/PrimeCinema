package Gerente;

import javax.swing.*;
import java.awt.*;

public class SalaRegistrar extends JFrame {
    private JTextField txtSalaID;
    private JComboBox cmbSucursal;
    private JTable table1;
    private JComboBox cmbHorario;
    private JTextField txtPeliculaID;
    private JButton btnAgregar;
    private JButton btnRegistrar;
    private JButton btnRegresar;
    private JPanel pnlSala;

    public SalaRegistrar(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlSala);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(getParent());
    }

    public static void main(String[] args) {
        JFrame frame = new SalaRegistrar("Registrar Sala");
        frame.setVisible(true);
    }
}
