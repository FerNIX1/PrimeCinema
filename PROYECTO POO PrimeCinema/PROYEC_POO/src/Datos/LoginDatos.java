package Datos;

import Conexion.Conexion;
import Gerente.GERENTE;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDatos {
    //se valido correctamente
    private final String Sql_Select="SELECT * FROM usuarios WHERE log_in = ? AND contrasenia = ?";
    private boolean validarPantalla;
    public boolean base(String user,String pass){
        String id_usuario = "";
        String nombre_completo = "";
        String log_in= "";
        String contrasenia= "";
        String numero_dui = "";
        String dirreccion="";
        String telefono="";
        String rol="";
        //SE DEDFINE LAS VARIABLES PARA LA CONEXION
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try{
            con= Conexion.getConnection();
            statement=con.prepareStatement(Sql_Select);
            statement.setString(1,user);
            statement.setString(2,pass);
            ResultSet resultSet = statement.executeQuery();
            // Si se encontró al usuario, se obtienen sus datos de la base de datos
            if (resultSet.next()) {
                id_usuario = resultSet.getString(1);
                nombre_completo = resultSet.getString(2);
                log_in = resultSet.getString(3);
                contrasenia = resultSet.getString(4);
                numero_dui = resultSet.getString(5);
                dirreccion= resultSet.getString(6);
                telefono = resultSet.getString(7);
                rol=resultSet.getString(8);
            }
            // Se validan los datos ingresados por el usuario
            if (!log_in.equals(user)) {
                JOptionPane.showMessageDialog(null, "!No existe!");
            } else if (!contrasenia.equals(pass)) {
                JOptionPane.showMessageDialog(null, "¡Su contraseña no es igual!");
            } else if (contrasenia.equals(pass)) {
                JOptionPane.showMessageDialog(null, "¡A Ingresado Correctamente!");
                validarPantalla = true;
            }

// Se redirige al usuario a la ventana correspondiente según su tipo de empleado
            if (rol.equals("normal") && validarPantalla) {
                 JOptionPane.showMessageDialog(null,"esta es la vista del usuario");
                //lo llevara a la ventana de usuario
            } else if (rol.equals("gerente") && validarPantalla) {
                GERENTE gerente= new GERENTE("Gerente");
                gerente.setVisible(true);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            Conexion.close(rs);
            Conexion.close(statement);
            Conexion.close(con);
        }
        return validarPantalla;
    }
}
