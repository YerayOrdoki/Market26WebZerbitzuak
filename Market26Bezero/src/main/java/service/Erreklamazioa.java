
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para erreklamazioa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="erreklamazioa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://businessLogic/}kexa"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eroslea" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="saltzailea" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="produktoa" type="{http://businessLogic/}boughtSale" minOccurs="0"/&gt;
 *         &lt;element name="mezuak" type="{http://businessLogic/}disputaMezua" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erreklamazioa", propOrder = {
    "eroslea",
    "saltzailea",
    "produktoa",
    "mezuak"
})
public class Erreklamazioa
    extends Kexa
{

    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object eroslea;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object saltzailea;
    protected BoughtSale produktoa;
    @XmlElement(nillable = true)
    protected List<DisputaMezua> mezuak;

    /**
     * Obtiene el valor de la propiedad eroslea.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEroslea() {
        return eroslea;
    }

    /**
     * Define el valor de la propiedad eroslea.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEroslea(Object value) {
        this.eroslea = value;
    }

    /**
     * Obtiene el valor de la propiedad saltzailea.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaltzailea() {
        return saltzailea;
    }

    /**
     * Define el valor de la propiedad saltzailea.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaltzailea(Object value) {
        this.saltzailea = value;
    }

    /**
     * Obtiene el valor de la propiedad produktoa.
     * 
     * @return
     *     possible object is
     *     {@link BoughtSale }
     *     
     */
    public BoughtSale getProduktoa() {
        return produktoa;
    }

    /**
     * Define el valor de la propiedad produktoa.
     * 
     * @param value
     *     allowed object is
     *     {@link BoughtSale }
     *     
     */
    public void setProduktoa(BoughtSale value) {
        this.produktoa = value;
    }

    /**
     * Gets the value of the mezuak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mezuak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMezuak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputaMezua }
     * 
     * 
     */
    public List<DisputaMezua> getMezuak() {
        if (mezuak == null) {
            mezuak = new ArrayList<DisputaMezua>();
        }
        return this.mezuak;
    }

}
