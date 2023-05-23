/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import sw.Webl;
import sw.Webl_Service;

/**
 *
 * @author ASUS ROG
 */
public class controladorlogin {
  private Vista login = new Vista();
    Webl_Service service = new Webl_Service();
    Webl cliente = service.getWeblPort();
    
    public controladorlogin() {
        login.loginButton.addActionListener(l -> login());
        login.registerButton.addActionListener(l -> Registro());
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private void login() {
        if (validar()==true) {
        sw.Cliente user = cliente.login(login.usuariol.getText(), login.contraseñal.getText().trim());
        if (user == null) {
            login.lblmensaje.setText("Datos mal ingresados o no existen");
        } else {
            login.lblmensaje.setText("Ingreso correcto");
            controladoresultado sign = new controladoresultado(user);
            login.dispose();
        }
    }
        }
public boolean validar(){
        boolean validar=true;
       if (login.getUsuariol().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un usuario", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            validar = false;
        }

        if (login.getContraseñal().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            validar = false;
             }
   
        return validar;
            } 

    private void Registro() {
        controladoregistro registro = new controladoregistro();
         login.getjDialog1().dispose();
        
    }}