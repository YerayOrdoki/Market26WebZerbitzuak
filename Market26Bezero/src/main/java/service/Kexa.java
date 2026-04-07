
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para kexa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="kexa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kexaNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pubDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="egoera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kexa", propOrder = {
    "kexaNumber",
    "pubDate",
    "title",
    "egoera"
})
@XmlSeeAlso({
    Erreklamazioa.class,
    Salaketa.class
})
public abstract class Kexa {

    protected Integer kexaNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pubDate;
    protected String title;
    protected int egoera;

    /**
     * Obtiene el valor de la propiedad kexaNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKexaNumber() {
        return kexaNumber;
    }

    /**
     * Define el valor de la propiedad kexaNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKexaNumber(Integer value) {
        this.kexaNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pubDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPubDate() {
        return pubDate;
    }

    /**
     * Define el valor de la propiedad pubDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPubDate(XMLGregorianCalendar value) {
        this.pubDate = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad egoera.
     * 
     */
    public int getEgoera() {
        return egoera;
    }

    /**
     * Define el valor de la propiedad egoera.
     * 
     */
    public void setEgoera(int value) {
        this.egoera = value;
    }

}
