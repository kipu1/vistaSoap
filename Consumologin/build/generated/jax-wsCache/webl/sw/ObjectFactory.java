
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SingUp_QNAME = new QName("http://sw/", "SingUp");
    private final static QName _SingUpResponse_QNAME = new QName("http://sw/", "SingUpResponse");
    private final static QName _Actualizar_QNAME = new QName("http://sw/", "actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://sw/", "actualizarResponse");
    private final static QName _Login_QNAME = new QName("http://sw/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://sw/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SingUp }
     * 
     */
    public SingUp createSingUp() {
        return new SingUp();
    }

    /**
     * Create an instance of {@link SingUpResponse }
     * 
     */
    public SingUpResponse createSingUpResponse() {
        return new SingUpResponse();
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingUp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SingUp }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "SingUp")
    public JAXBElement<SingUp> createSingUp(SingUp value) {
        return new JAXBElement<SingUp>(_SingUp_QNAME, SingUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingUpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SingUpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "SingUpResponse")
    public JAXBElement<SingUpResponse> createSingUpResponse(SingUpResponse value) {
        return new JAXBElement<SingUpResponse>(_SingUpResponse_QNAME, SingUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "actualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
