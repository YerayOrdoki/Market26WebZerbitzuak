package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public abstract class Kexa implements Serializable {
	
	
	@Id 
	@GeneratedValue
	private Integer kexaNumber;
	private Date pubDate;
	private String title;
	private  int egoera;

	public int getEgoera() {
		return egoera;
	}

	public void setEgoera(int egoera) {
		this.egoera = egoera;
	}

	public Kexa(String title, Date pubDate) {
		super();
		this.title = title;
		this.pubDate = pubDate;	
		this.egoera=0;
	}
	
	public Kexa(Kexa kexa) {
		super();
		this.title = kexa.getTitle();
		this.pubDate=kexa.getPubDate();
		egoera=0;
	}
	public Kexa() {super();}

	public Integer getKexaNumber() {
		return kexaNumber;
	}

	public void setKexaNumber(Integer kexaNumber) {
		this.kexaNumber = kexaNumber;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
