package co.arbhutale.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import co.arbhutale.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String describtion;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {

	}
	
	public Course(String id, String name, String describtion, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.describtion = describtion;
		this.topic = new Topic(topicId, "","");
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
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
