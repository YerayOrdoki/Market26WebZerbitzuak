
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saleSellerBoughtContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saleSellerBoughtContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sale" type="{http://businessLogic/}sale" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://businessLogic/}registered" minOccurs="0"/&gt;
 *         &lt;element name="bought" type="{http://businessLogic/}boughtSale" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saleSellerBoughtContainer", propOrder = {
    "sale",
    "user",
    "bought"
})
public class SaleSellerBoughtContainer {

    protected Sale sale;
    protected Registered user;
    protected BoughtSale bought;

    /**
     * Obtiene el valor de la propiedad sale.
     * 
     * @return
     *     possible object is
     *     {@link Sale }
     *     
     */
    public Sale getSale() {
        return sale;
    }

    /**
     * Define el valor de la propiedad sale.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale }
     *     
     */
    public void setSale(Sale value) {
        this.sale = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link Registered }
     *     
     */
    public Registered getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link Registered }
     *     
     */
    public void setUser(Registered value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad bought.
     * 
     * @return
     *     possible object is
     *     {@link BoughtSale }
     *     
     */
    public BoughtSale getBought() {
        return bought;
    }

    /**
     * Define el valor de la propiedad bought.
     * 
     * @param value
     *     allowed object is
     *     {@link BoughtSale }
     *     
     */
    public void setBought(BoughtSale value) {
        this.bought = value;
    }

}
