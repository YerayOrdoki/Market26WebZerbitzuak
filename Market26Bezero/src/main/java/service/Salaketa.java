
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para salaketa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="salaketa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://businessLogic/}kexa"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salatzailea" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="produktoa" type="{http://businessLogic/}sale" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salaketa", propOrder = {
    "mota",
    "salatzailea",
    "produktoa"
})
public class Salaketa
    extends Kexa
{

    protected String mota;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object salatzailea;
    protected Sale produktoa;

    /**
     * Obtiene el valor de la propiedad mota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMota() {
        return mota;
    }

    /**
     * Define el valor de la propiedad mota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMota(String value) {
        this.mota = value;
    }

    /**
     * Obtiene el valor de la propiedad salatzailea.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSalatzailea() {
        return salatzailea;
    }

    /**
     * Define el valor de la propiedad salatzailea.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSalatzailea(Object value) {
        this.salatzailea = value;
    }

    /**
     * Obtiene el valor de la propiedad produktoa.
     * 
     * @return
     *     possible object is
     *     {@link Sale }
     *     
     */
    public Sale getProduktoa() {
        return produktoa;
    }

    /**
     * Define el valor de la propiedad produktoa.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale }
     *     
     */
    public void setProduktoa(Sale value) {
        this.produktoa = value;
    }

}
