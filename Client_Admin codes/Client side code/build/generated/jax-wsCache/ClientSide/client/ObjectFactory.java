
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _Count_QNAME = new QName("http://Client/", "count");
    private final static QName _NoOfPeopleResponse_QNAME = new QName("http://Client/", "NoOfPeopleResponse");
    private final static QName _CountResponse_QNAME = new QName("http://Client/", "countResponse");
    private final static QName _NoOfPeople_QNAME = new QName("http://Client/", "NoOfPeople");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link NoOfPeopleResponse }
     * 
     */
    public NoOfPeopleResponse createNoOfPeopleResponse() {
        return new NoOfPeopleResponse();
    }

    /**
     * Create an instance of {@link NoOfPeople }
     * 
     */
    public NoOfPeople createNoOfPeople() {
        return new NoOfPeople();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Client/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoOfPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Client/", name = "NoOfPeopleResponse")
    public JAXBElement<NoOfPeopleResponse> createNoOfPeopleResponse(NoOfPeopleResponse value) {
        return new JAXBElement<NoOfPeopleResponse>(_NoOfPeopleResponse_QNAME, NoOfPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Client/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoOfPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Client/", name = "NoOfPeople")
    public JAXBElement<NoOfPeople> createNoOfPeople(NoOfPeople value) {
        return new JAXBElement<NoOfPeople>(_NoOfPeople_QNAME, NoOfPeople.class, null, value);
    }

}
