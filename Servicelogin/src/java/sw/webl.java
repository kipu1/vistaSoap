/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS ROG
 */
@WebService(serviceName = "webl")
public class webl {

    private static ArrayList<Cliente> cli= new ArrayList<>();
          /**
     * Web service operation
     */
   @WebMethod(operationName = "login")
    public Cliente login(@WebParam(name = "username") String usuario, @WebParam(name = "password") String contraseña) {

        for (Cliente us : cli) {
            if (usuario.equals(us.getUsuario()) && contraseña.equals(us.getContraseña())) {
                return us;
            }
        }
        return null;
    }
 @WebMethod(operationName = "Regístrese")
    public boolean Regístrese(@WebParam(name = "usuario") String usuario, @WebParam(name = "contraseña") String contraseña, @WebParam(name = "saldo") int saldo) {
        for (Cliente us : cli) {
            if (usuario.equals(us.getUsuario())) {
                return false;
            }
            
        }
        cli.add(new Cliente(usuario, contraseña, saldo));
        return true;
    }

    @WebMethod(operationName = "Actualizar")
    public Cliente Actualizar(@WebParam(name = "usuario") String usuario, @WebParam(name = "value") int value, @WebParam(name = "ope") boolean ope) {
        for (Cliente us : cli) {
            if (usuario.equals(us.getUsuario()) && ope == true) {
                int add = us.getSaldo()+ value;
                us.setSaldo(add);
                return us;
            } else if (usuario.equals(us.getUsuario()) && ope == false) {
                int ret = us.getSaldo()- value;
                if (ret < 0) {
                    return null;
                } else {
                    us.setSaldo(ret);
                    return us;
                }
            }
        }
        return null;
    }
}
