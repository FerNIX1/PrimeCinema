package LOGIN;

import Datos.OlvideContraseña;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OLCONTRASEÑA extends JFrame {
    private JTextField txtDui;
    private JTextField TxtnuevaContraseña;
    private JButton btnGuardar;
    private JButton btnRegresar;
    private JPanel PnlOlvideContraseña;

    public OLCONTRASEÑA(String titulo) {
        super(titulo);
        // Configuración de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(PnlOlvideContraseña);
        this.setMinimumSize(new Dimension(550, 500));
        this.setLocationRelativeTo(getParent());
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BtnolvideContra();
            }
        });
    }

    public void BtnolvideContra() {
        String numerodui=txtDui.getText();
        OlvideContraseña contra = new OlvideContraseña();
        contra.base(numerodui);
    }
}
