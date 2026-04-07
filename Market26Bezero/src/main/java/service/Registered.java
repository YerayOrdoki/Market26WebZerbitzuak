
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registered complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registered"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://businessLogic/}user"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saldoa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="isBanned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sales" type="{http://businessLogic/}sale" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registered", propOrder = {
    "saldoa",
    "isBanned",
    "sales"
})
public class Registered
    extends User
{

    protected double saldoa;
    protected boolean isBanned;
    @XmlElement(nillable = true)
    protected List<Sale> sales;

    /**
     * Obtiene el valor de la propiedad saldoa.
     * 
     */
    public double getSaldoa() {
        return saldoa;
    }

    /**
     * Define el valor de la propiedad saldoa.
     * 
     */
    public void setSaldoa(double value) {
        this.saldoa = value;
    }

    /**
     * Obtiene el valor de la propiedad isBanned.
     * 
     */
    public boolean isIsBanned() {
        return isBanned;
    }

    /**
     * Define el valor de la propiedad isBanned.
     * 
     */
    public void setIsBanned(boolean value) {
        this.isBanned = value;
    }

    /**
     * Gets the value of the sales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sale }
     * 
     * 
     */
    public List<Sale> getSales() {
        if (sales == null) {
            sales = new ArrayList<Sale>();
        }
        return this.sales;
    }

}
