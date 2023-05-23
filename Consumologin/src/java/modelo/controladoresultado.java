/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.oracle.util.Checksums.update;
import javax.swing.JOptionPane;
import sw.Cliente;
import sw.Webl;
import sw.Webl_Service;

/**
 *
 * @author ASUS ROG
 */
public class controladoresultado {

    public controladoresultado() {
    }
    
   resultado resultado = new resultado();
    Webl_Service service = new Webl_Service();
    Webl cliente = service.getWeblPort();
    Cliente cli;

    controladoresultado(Cliente cli) {
      this.cli = cli;
        resultado.lnombre.setText("" + cli.getUsuario());
        resultado.jsaldo.setText(String.valueOf(cli.getSaldo()));
        resultado.registrar3.addActionListener(l -> Resultado());
        resultado.bRegresar.addActionListener(l -> atras());
        resultado.setLocationRelativeTo(null);
        resultado.setVisible(true);
    }

    private void Resultado() {
         if (validar()) {
             String buttonGroup1;
        if(resultado.getDeposito().isSelected()){
                buttonGroup1="Deposito";
         if (resultado.buttonGroup1.getSelection().toString().equals("Retiro")) {
        }
           Cliente actu = cliente.actualizar(cli.getUsuario(),
                    Integer.parseInt(resultado.jvalor.getText()), true);
            if (actu != null) {
                resultado.jsaldo.setText(String.valueOf(actu.getSaldo()));
            } 
        } else {
            Cliente actu = cliente.actualizar(cli.getUsuario(),
                    Integer.parseInt(resultado.jvalor.getText()), false);
            if (actu != null) {
                resultado.lblmensaje1.setText("Operación realizado");
                resultado.jsaldo.setText(String.valueOf(actu.getSaldo()));
            } else {
                resultado.lblmensaje1.setText("Saldo insuficiente");
            }
        }
    }
   
    }
    public void atras(){
        controladorlogin c = new controladorlogin();
        resultado.dispose();
    }
  public boolean validar(){
        boolean validar=true;
       if(resultado.getDeposito().isSelected()==false && resultado.getRetiro().isSelected()==false ){
          JOptionPane.showMessageDialog(null, "Elija una opcion","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;  
        }
        if(!resultado.getJvalor().getText().matches("[0-9]+")){
          JOptionPane.showMessageDialog(null, "Ingrese numeros","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;
      }
    if (resultado.getJvalor().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese su saldo ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            validar = false;
             }
        return validar;
            } 
}
