
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para boughtSale complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="boughtSale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="erosketaData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="s" type="{http://businessLogic/}sale" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boughtSale", propOrder = {
    "id",
    "erosketaData",
    "s"
})
public class BoughtSale {

    protected int id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erosketaData;
    protected Sale s;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad erosketaData.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErosketaData() {
        return erosketaData;
    }

    /**
     * Define el valor de la propiedad erosketaData.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErosketaData(XMLGregorianCalendar value) {
        this.erosketaData = value;
    }

    /**
     * Obtiene el valor de la propiedad s.
     * 
     * @return
     *     possible object is
     *     {@link Sale }
     *     
     */
    public Sale getS() {
        return s;
    }

    /**
     * Define el valor de la propiedad s.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale }
     *     
     */
    public void setS(Sale value) {
        this.s = value;
    }

}
