package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Salaketa extends Kexa{
	private String mota;
	 //egoera:0: Salaketa tratatu gabe, 1: Salaketa ukatuta, 2: Salaketa onartuta
	@XmlIDREF
	@ManyToOne(fetch = FetchType.EAGER)
	private Registered salatzailea;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Sale produktoa;
	
	public Salaketa(String mota, Sale produktoa, Date pubDate, Registered salatzailea) {
		super(produktoa.getTitle(), pubDate);
		this.mota = mota;
		this.produktoa = produktoa;
		
		this.salatzailea = salatzailea;
	}
	public Salaketa() {super();}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}
	public Sale getProduktoa() {
		return produktoa;
	}
	public Registered getSalatzailea() {
		return salatzailea;
	}

	public void setProduktoa(Sale produktoa) {
		this.produktoa = produktoa;
	}
	
	
	public void setSalatzailea(Registered salatzailea) {
		this.salatzailea = salatzailea;
	}
	
}
