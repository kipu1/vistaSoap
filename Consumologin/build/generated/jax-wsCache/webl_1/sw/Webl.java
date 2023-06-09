
package sw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "webl", targetNamespace = "http://sw/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Webl {


    /**
     * 
     * @param usuario
     * @param saldo
     * @param contraseña
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Reg\u00edstrese")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Reg\u00edstrese", targetNamespace = "http://sw/", className = "sw.Reg\u00edstrese")
    @ResponseWrapper(localName = "Reg\u00edstreseResponse", targetNamespace = "http://sw/", className = "sw.Reg\u00edstreseResponse")
    @Action(input = "http://sw/webl/Reg\u00edstreseRequest", output = "http://sw/webl/Reg\u00edstreseResponse")
    public boolean regístrese(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña,
        @WebParam(name = "saldo", targetNamespace = "")
        int saldo);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns sw.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://sw/", className = "sw.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://sw/", className = "sw.LoginResponse")
    @Action(input = "http://sw/webl/loginRequest", output = "http://sw/webl/loginResponse")
    public Cliente login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param ope
     * @param usuario
     * @param value
     * @return
     *     returns sw.Cliente
     */
    @WebMethod(operationName = "Actualizar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Actualizar", targetNamespace = "http://sw/", className = "sw.Actualizar")
    @ResponseWrapper(localName = "ActualizarResponse", targetNamespace = "http://sw/", className = "sw.ActualizarResponse")
    @Action(input = "http://sw/webl/ActualizarRequest", output = "http://sw/webl/ActualizarResponse")
    public Cliente actualizar(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "value", targetNamespace = "")
        int value,
        @WebParam(name = "ope", targetNamespace = "")
        boolean ope);

}
