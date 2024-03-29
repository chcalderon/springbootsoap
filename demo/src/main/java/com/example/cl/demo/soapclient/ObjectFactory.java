//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.06.30 a las 11:25:39 PM CLT 
//


package com.example.cl.demo.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.cl.demo.soapclient package. 
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

    private final static QName _GetBank_QNAME = new QName("http://thomas-bayer.com/blz/", "getBank");
    private final static QName _GetBankResponse_QNAME = new QName("http://thomas-bayer.com/blz/", "getBankResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.cl.demo.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankType }
     * 
     */
    public GetBankType createGetBankType() {
        return new GetBankType();
    }

    /**
     * Create an instance of {@link GetBankResponseType }
     * 
     */
    public GetBankResponseType createGetBankResponseType() {
        return new GetBankResponseType();
    }

    /**
     * Create an instance of {@link DetailsType }
     * 
     */
    public DetailsType createDetailsType() {
        return new DetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankType }{@code >}
     */
    @XmlElementDecl(namespace = "http://thomas-bayer.com/blz/", name = "getBank")
    public JAXBElement<GetBankType> createGetBank(GetBankType value) {
        return new JAXBElement<GetBankType>(_GetBank_QNAME, GetBankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://thomas-bayer.com/blz/", name = "getBankResponse")
    public JAXBElement<GetBankResponseType> createGetBankResponse(GetBankResponseType value) {
        return new JAXBElement<GetBankResponseType>(_GetBankResponse_QNAME, GetBankResponseType.class, null, value);
    }

}
