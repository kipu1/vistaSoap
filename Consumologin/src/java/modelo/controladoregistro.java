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
public class controladoregistro {
    
    registro registro = new registro();
     Webl_Service service = new Webl_Service();
    Webl cliente = service.getWeblPort();

    public controladoregistro() {
        registro.rregistro.addActionListener(l -> registro());
        registro.bcancelar.addActionListener(l -> regresar());
        registro.setLocationRelativeTo(null);
        registro.setVisible(true);
    }
    
    
    
    public void registro(){
         if (validar()==true) {
        boolean ingreso = cliente.regístrese(registro.rusuario.getText(), registro.rcontraseña.getText(), 
                Integer.parseInt(registro.rsaldo.getText()));
         if (ingreso == false) {
            registro.lblmensaje2.setText("Ese usuario ya existe");
          
        } else {
          
            controladorlogin reg = new controladorlogin();
              registro.lblmensaje2.setText("Datos ingresados correctamente");
           registro.dispose();
           
        }
      }     
    }
     public void regresar(){
        controladorlogin acc = new controladorlogin();
        registro.dispose();
    }
    public boolean validar(){
        boolean validar=true;
       if (registro.getRusuario().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un usuario", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            validar = false;
            
        }
       if (registro.getRcontraseña().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            validar = false;
             }
        
        if (registro.getRepetircontraseña().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Confirme su contraseña ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            validar = false;
             }
    if (registro.getRsaldo().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese su saldo ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            validar = false;
             }
    if(!registro.getRsaldo().getText().matches("[0-9]+")){
          JOptionPane.showMessageDialog(null, "Ingrese numeros","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;
      }
        return validar;
            } 
}