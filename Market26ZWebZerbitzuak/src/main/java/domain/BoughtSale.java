	package domain;
	import java.util.Date;
	import java.util.Date;
	import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
	/**
	 * Sale ren klase antzekoa, honek erositako data gordetzen du eta erositakoak listan gordetzen da seller bakoitzean
	 */
	@Entity
	@XmlAccessorType(XmlAccessType.FIELD)
	public class BoughtSale  {
		@Id
	    @GeneratedValue
	    private int id;

	    private Date erosketaData;
	   
	    @Embedded  
	    private Sale s;
	    public BoughtSale() {super();}

	    public BoughtSale(Sale sale) {
	        this.erosketaData = new Date();
	       
	        this.s=new Sale(sale);
	    }

	    public Date getErosketaData() {
	    	return erosketaData;
		}
	    
	    public Sale getSale() {
	    	return s;
	    }
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Sale getS() {
			return s;
		}

		public void setS(Sale s) {
			this.s = s;
		}

		public void setErosketaData(Date erosketaData) {
			this.erosketaData = erosketaData;
		}
	    
	}