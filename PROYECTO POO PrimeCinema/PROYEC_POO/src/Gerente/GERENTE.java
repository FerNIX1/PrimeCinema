package Gerente;

import javax.swing.*;
import java.awt.*;

public class GERENTE extends JFrame {
    private JButton btnIr;
    private JButton irButton1;
    private JButton irButton2;
    private JButton btnFunciones;
    private JButton btnSalir;
    private JComboBox Sucursales;
    private JTextField Gerentes;
    private JTable table1;
    private JPanel PnlGerente;

    public GERENTE(String titulo) {
        super(titulo);
        // Configuración de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(PnlGerente);
        this.setMinimumSize(new Dimension(550, 500));
        this.setLocationRelativeTo(getParent());
    }
}
