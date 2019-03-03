package co.arbhutale.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicReposiory;
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring framework api desc"),
			new Topic("Spring1", "Spring Framework1", "Spring framework api desc1"),
			new Topic("Sprin2", "Spring Framework2", "Spring framework api desc2")
			));
	public List<Topic> getallTopics() {
		//return topics;
		List<Topic> topics1 = new ArrayList<>();
		topicReposiory.findAll().forEach(topics1::add);
		return topics1;
	}
	
	public Topic getTopic(String id) {
		//return  t.getId().equals(id)).findFirst().get();
		return topicReposiory.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		topicReposiory.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		/*for(int i = 0; i < topics.size(); i++) {
			Topic t= topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		} */
		topicReposiory.save(topic);
	}

	public void deletTopic(String id) {
		// TODO Auto-generated method stub
		//return topics.removeIf(t -> t.getId().equals(id));
		 topicReposiory.deleteById(id);
	}
}
