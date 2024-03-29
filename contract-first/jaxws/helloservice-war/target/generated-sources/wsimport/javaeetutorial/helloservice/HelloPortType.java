
package javaeetutorial.helloservice;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloPortType", targetNamespace = "http://helloservice.javaeetutorial/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloPortType {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.SubResponse")
    @Action(input = "http://helloservice.javaeetutorial/Hello/subRequest", output = "http://helloservice.javaeetutorial/Hello/subResponse")
    public String sub(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mul", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.Mul")
    @ResponseWrapper(localName = "mulResponse", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.MulResponse")
    @Action(input = "http://helloservice.javaeetutorial/Hello/mulRequest", output = "http://helloservice.javaeetutorial/Hello/mulResponse")
    public String mul(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.SayHelloResponse")
    @Action(input = "http://helloservice.javaeetutorial/Hello/sayHelloRequest", output = "http://helloservice.javaeetutorial/Hello/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "div", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.Div")
    @ResponseWrapper(localName = "divResponse", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.DivResponse")
    @Action(input = "http://helloservice.javaeetutorial/Hello/divRequest", output = "http://helloservice.javaeetutorial/Hello/divResponse")
    public String div(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://helloservice.javaeetutorial/", className = "javaeetutorial.helloservice.AddResponse")
    @Action(input = "http://helloservice.javaeetutorial/Hello/addRequest", output = "http://helloservice.javaeetutorial/Hello/addResponse")
    public String add(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
