package Datos;

import Conexion.Conexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OlvideContraseña {
    private final String Sql_Validar="SELECT * FROM usuarios WHERE numero_dui = ?";

    private final String Sql_actualizar="UPDATE * FROM usuarios WHERE ";
    private boolean ValidarVentana=false;

    public Boolean base(String numero_dui) {
        String dui="";
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            con= Conexion.getConnection();
            statement=con.prepareStatement(Sql_Validar);
            statement.setString(1,numero_dui);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                dui = resultSet.getString(5);
                JOptionPane.showMessageDialog(null,dui);
            }if (dui.equals(numero_dui)) {
                JOptionPane.showMessageDialog(null, "Se A encontrado el dui registrado");
                //validarPantalla = true;
            }
        } catch (Exception e) {

        }
        return false;
    }
}
