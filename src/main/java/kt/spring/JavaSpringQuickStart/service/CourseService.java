/*
 * TopicService.java
 * Created by Oray Kurt at 5/14/20, 3:09 AM
 * github.com/oraykt
 *
 */

package kt.spring.JavaSpringQuickStart.service;

import kt.spring.JavaSpringQuickStart.model.Course;
import kt.spring.JavaSpringQuickStart.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String id){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id).forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id){
        return courseRepository.findById(id);
    }

    public void addCourse(String topicId, Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
