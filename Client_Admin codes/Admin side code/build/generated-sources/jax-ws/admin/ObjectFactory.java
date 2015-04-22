
package admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the admin package. 
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

    private final static QName _DeletionResponse_QNAME = new QName("http://Admin/", "deletionResponse");
    private final static QName _Deletion_QNAME = new QName("http://Admin/", "deletion");
    private final static QName _Insertion_QNAME = new QName("http://Admin/", "insertion");
    private final static QName _InsertionResponse_QNAME = new QName("http://Admin/", "insertionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Insertion }
     * 
     */
    public Insertion createInsertion() {
        return new Insertion();
    }

    /**
     * Create an instance of {@link Deletion }
     * 
     */
    public Deletion createDeletion() {
        return new Deletion();
    }

    /**
     * Create an instance of {@link DeletionResponse }
     * 
     */
    public DeletionResponse createDeletionResponse() {
        return new DeletionResponse();
    }

    /**
     * Create an instance of {@link InsertionResponse }
     * 
     */
    public InsertionResponse createInsertionResponse() {
        return new InsertionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin/", name = "deletionResponse")
    public JAXBElement<DeletionResponse> createDeletionResponse(DeletionResponse value) {
        return new JAXBElement<DeletionResponse>(_DeletionResponse_QNAME, DeletionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin/", name = "deletion")
    public JAXBElement<Deletion> createDeletion(Deletion value) {
        return new JAXBElement<Deletion>(_Deletion_QNAME, Deletion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin/", name = "insertion")
    public JAXBElement<Insertion> createInsertion(Insertion value) {
        return new JAXBElement<Insertion>(_Insertion_QNAME, Insertion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin/", name = "insertionResponse")
    public JAXBElement<InsertionResponse> createInsertionResponse(InsertionResponse value) {
        return new JAXBElement<InsertionResponse>(_InsertionResponse_QNAME, InsertionResponse.class, null, value);
    }

}
