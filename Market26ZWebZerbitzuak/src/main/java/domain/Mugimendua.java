package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import configuration.UtilDate;
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Mugimendua {
	
	Date data;
	BoughtSale produktua;
	Double diruKantitatea;
	int mugimenduMota; //1:dirua irabazi, 0:dirua galdu
	
	//produktua duten mugimenduak gordetzeko
	public Mugimendua (BoughtSale produktua, int mota) {
		this.produktua=produktua;
		this.data=UtilDate.trim(new Date());
		this.mugimenduMota=mota;
		this.diruKantitatea=(double) produktua.getSale().getPrice();
	}
	
	//diru sarrera/irteereak gordetzeko
	public Mugimendua (double diruKantitatea, int mota) {
		this.diruKantitatea=diruKantitatea;
		this.mugimenduMota=mota;
		this.produktua=null;
		this.data=UtilDate.trim(new Date());
		
	}
	
	public Mugimendua() {
        super();
    }

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BoughtSale getProduktua() {
		return produktua;
	}

	public void setProduktua(BoughtSale produktua) {
		this.produktua = produktua;
	}

	public Double getDiruKantitatea() {
		return diruKantitatea;
	}

	public void setDiruKantitatea(Double diruKantitatea) {
		this.diruKantitatea = diruKantitatea;
	}

	public int getMugimenduMota() {
		return mugimenduMota;
	}

	public void setMugimenduMota(int mugimenduMota) {
		this.mugimenduMota = mugimenduMota;
	}
	
	
	

}

