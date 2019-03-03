package co.arbhutale.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String describtion;
	
	public Topic() {

	}
	
	public Topic(String id, String name, String describtion) {
		super();
		this.id = id;
		this.name = name;
		this.describtion = describtion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

}
