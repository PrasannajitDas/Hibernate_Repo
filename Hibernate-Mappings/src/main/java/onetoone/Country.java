package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="countries") // changing the table name explicitly
public class Country {
	
	@Id
	private int id;
	
	@Column(unique = true)// this column will only accept unique values, by-default it will be false so explicitly giving true using @Column Annotation
	private String name;
	
	private String population;

	@OneToOne // Using @OneToOne Annotation to establish one-to-one relationship between 2 entities(tables)
	private Primeminister primeminister;// Establishing Has-A Relationship
	
	
	
	public Primeminister getPrimeminister() {
		return primeminister;
	}

	public void setPrimeminister(Primeminister primeminister) {
		this.primeminister = primeminister;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
	
	

}
