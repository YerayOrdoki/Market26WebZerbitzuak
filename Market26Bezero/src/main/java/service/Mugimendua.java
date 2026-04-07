
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para mugimendua complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mugimendua"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="produktua" type="{http://businessLogic/}boughtSale" minOccurs="0"/&gt;
 *         &lt;element name="diruKantitatea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mugimenduMota" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mugimendua", propOrder = {
    "data",
    "produktua",
    "diruKantitatea",
    "mugimenduMota"
})
public class Mugimendua {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected BoughtSale produktua;
    protected Double diruKantitatea;
    protected int mugimenduMota;

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
     * Obtiene el valor de la propiedad produktua.
     * 
     * @return
     *     possible object is
     *     {@link BoughtSale }
     *     
     */
    public BoughtSale getProduktua() {
        return produktua;
    }

    /**
     * Define el valor de la propiedad produktua.
     * 
     * @param value
     *     allowed object is
     *     {@link BoughtSale }
     *     
     */
    public void setProduktua(BoughtSale value) {
        this.produktua = value;
    }

    /**
     * Obtiene el valor de la propiedad diruKantitatea.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiruKantitatea() {
        return diruKantitatea;
    }

    /**
     * Define el valor de la propiedad diruKantitatea.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiruKantitatea(Double value) {
        this.diruKantitatea = value;
    }

    /**
     * Obtiene el valor de la propiedad mugimenduMota.
     * 
     */
    public int getMugimenduMota() {
        return mugimenduMota;
    }

    /**
     * Define el valor de la propiedad mugimenduMota.
     * 
     */
    public void setMugimenduMota(int value) {
        this.mugimenduMota = value;
    }

}
