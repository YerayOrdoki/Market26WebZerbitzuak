package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class DisputaMezua {

	    
	    @Id
	    @GeneratedValue  

	    private Integer saleId;  // o similar

	
	String textua;
	Date data;
    @XmlIDREF
	User igorlea;
	public DisputaMezua(String textua, User igorlea) {
		super();
		this.textua = textua;
		this.data = new Date();
		this.igorlea = igorlea;
	}
	public DisputaMezua() {super();}
	public String getTextua() {
		return textua;
	}
	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}
	public void setTextua(String textua) {
		this.textua = textua;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public User getIgorlea() {
		return igorlea;
	}
	public void setIgorlea(User igorlea) {
		this.igorlea = igorlea;
	}
	
	
}
