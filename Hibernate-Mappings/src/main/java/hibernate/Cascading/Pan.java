package hibernate.Cascading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Pan_Tab")
public class Pan {//Pan-Target Entity(With whom source entity is having relationship)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pannum;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPannum() {
		return pannum;
	}
	public void setPannum(String pannum) {
		this.pannum = pannum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
