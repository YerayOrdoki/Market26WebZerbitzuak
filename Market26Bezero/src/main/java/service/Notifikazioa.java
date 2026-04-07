
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para notifikazioa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="notifikazioa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mezua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="irakurrita" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hartzailea" type="{http://businessLogic/}registered" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifikazioa", propOrder = {
    "id",
    "mezua",
    "data",
    "irakurrita",
    "hartzailea"
})
public class Notifikazioa {

    protected Integer id;
    protected String mezua;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected boolean irakurrita;
    protected Registered hartzailea;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad mezua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezua() {
        return mezua;
    }

    /**
     * Define el valor de la propiedad mezua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezua(String value) {
        this.mezua = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad irakurrita.
     * 
     */
    public boolean isIrakurrita() {
        return irakurrita;
    }

    /**
     * Define el valor de la propiedad irakurrita.
     * 
     */
    public void setIrakurrita(boolean value) {
        this.irakurrita = value;
    }

    /**
     * Obtiene el valor de la propiedad hartzailea.
     * 
     * @return
     *     possible object is
     *     {@link Registered }
     *     
     */
    public Registered getHartzailea() {
        return hartzailea;
    }

    /**
     * Define el valor de la propiedad hartzailea.
     * 
     * @param value
     *     allowed object is
     *     {@link Registered }
     *     
     */
    public void setHartzailea(Registered value) {
        this.hartzailea = value;
    }

}
