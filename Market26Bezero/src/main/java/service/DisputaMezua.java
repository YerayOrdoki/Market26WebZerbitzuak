
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para disputaMezua complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="disputaMezua"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="textua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="igorlea" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disputaMezua", propOrder = {
    "saleId",
    "textua",
    "data",
    "igorlea"
})
public class DisputaMezua {

    protected Integer saleId;
    protected String textua;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object igorlea;

    /**
     * Obtiene el valor de la propiedad saleId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaleId() {
        return saleId;
    }

    /**
     * Define el valor de la propiedad saleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaleId(Integer value) {
        this.saleId = value;
    }

    /**
     * Obtiene el valor de la propiedad textua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextua() {
        return textua;
    }

    /**
     * Define el valor de la propiedad textua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextua(String value) {
        this.textua = value;
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
     * Obtiene el valor de la propiedad igorlea.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIgorlea() {
        return igorlea;
    }

    /**
     * Define el valor de la propiedad igorlea.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIgorlea(Object value) {
        this.igorlea = value;
    }

}
