package LOGIN;

import Datos.LoginDatos;
import Datos.OlvideContraseña;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CINE extends JFrame{
    private JTextField txtUsuario;
    private JTextField txtContraseña;
    private JButton btnEntrar;
    private JButton btnOvideContraseña;
    private JButton btnRegistrarse;
    private JPanel PnlLogin;

    public CINE(String titulo) {
    super(titulo);
    // Configuración de la ventana
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(PnlLogin);
    this.setMinimumSize(new Dimension(550, 500));
    this.setLocationRelativeTo(getParent());
    btnEntrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            BtnEntrar();
        }
    });
        btnRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BtnRegistrarse();
            }
        });
        btnOvideContraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BtnOlvideContraseña();
            }
        });
    }
    public void BtnEntrar () {
        String usuario = txtUsuario.getText();
        String password = txtContraseña.getText();
        LoginDatos login = new LoginDatos();
        boolean balidacion = login.base(usuario, password);
        // Si la validación es exitosa, se cierra la ventana actual
        if (balidacion) {
            dispose(); // Cierra la ventana actual
        }
}
    public void BtnRegistrarse(){

    }
    public void BtnOlvideContraseña(){
        OLCONTRASEÑA olvidar = new OLCONTRASEÑA("olvide Contraseña");
        olvidar.setVisible(true);
        boolean cerrarventana = true;
        if(cerrarventana==true){
            dispose(); // Cierra la ventana actual
        }
    }
}
