package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Erreklamazioa extends Kexa {

	@XmlIDREF
	private Registered eroslea;
	@XmlIDREF
	private Registered saltzailea;
	
	private BoughtSale produktoa;
	 //egeora: 0:negoziatzen, 1:Admin, 2:itzulera onartua, 3:itzulera deuseztatua
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DisputaMezua> mezuak = new ArrayList<DisputaMezua>();
	
	
	public Erreklamazioa(String title, Date pubDate, Registered eroslea, Registered saltzailea, BoughtSale produktoa) {
		super(title, pubDate);
		this.eroslea = eroslea;
		this.saltzailea = saltzailea;
		this.produktoa = produktoa;
	}
	public Erreklamazioa () {super();}


	public Registered getEroslea() {
		return eroslea;
	}


	public void setEroslea(Registered eroslea) {
		this.eroslea = eroslea;
	}


	public Registered getSaltzailea() {
		return saltzailea;
	}


	public void setSaltzailea(Registered saltzailea) {
		this.saltzailea = saltzailea;
	}


	

	public List<DisputaMezua> getMezuak() {
		return mezuak;
	}


	public void setMezuak(List<DisputaMezua> mezuak) {
		this.mezuak = mezuak;
	}


	public BoughtSale getProduktoa() {
		return produktoa;
	}


	public void setProduktoa(BoughtSale produktoa) {
		this.produktoa = produktoa;
	}
	
	
}
