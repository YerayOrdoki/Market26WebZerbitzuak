
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para admin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="admin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://businessLogic/}user"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kexak" type="{http://businessLogic/}kexa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admin", propOrder = {
    "kexak"
})
public class Admin
    extends User
{

    @XmlElement(nillable = true)
    protected List<Kexa> kexak;

    /**
     * Gets the value of the kexak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kexak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKexak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kexa }
     * 
     * 
     */
    public List<Kexa> getKexak() {
        if (kexak == null) {
            kexak = new ArrayList<Kexa>();
        }
        return this.kexak;
    }

}
