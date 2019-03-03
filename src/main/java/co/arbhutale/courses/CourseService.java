package co.arbhutale.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseReposiory;
	
	/*List<Course> topics = new ArrayList<>(Arrays.asList(
			new Course("Spring", "Spring Framework", "Spring framework api desc"),
			new Course("Spring1", "Spring Framework1", "Spring framework api desc1"),
			new Course("Sprin2", "Spring Framework2", "Spring framework api desc2")
			)); */
	public List<Course> getallCourses(String topicId) {
		//return topics;
		List<Course> course1 = new ArrayList<>();
		courseReposiory.findByTopicId(topicId).forEach(course1::add);
		return course1;
	}
	
	public Course getCourse(String id) {
		//return  t.getId().equals(id)).findFirst().get();
		return courseReposiory.findById(id).get();
	}
	
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		courseReposiory.save(course);
	}
	
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		/*for(int i = 0; i < course.size(); i++) {
			Topic t= topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		} */
		courseReposiory.save(course);
	}

	public void deletCourse(String id) {
		// TODO Auto-generated method stub
		//return topics.removeIf(t -> t.getId().equals(id));
		courseReposiory.deleteById(id);
	}
}
