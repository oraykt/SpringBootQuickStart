/*
 * TopicController.java
 * Created by Oray Kurt at 5/14/20, 2:36 AM
 * github.com/oraykt
 *
 */

package kt.spring.JavaSpringQuickStart.controller;

import kt.spring.JavaSpringQuickStart.model.Course;
import kt.spring.JavaSpringQuickStart.model.Topic;
import kt.spring.JavaSpringQuickStart.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value="/topics/{topicId}/courses",method = RequestMethod.GET)
    public List<Course> getAllCourses(@PathVariable String topicId){
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping(value="/courses/{topicId}/courses/{courseId}",method = RequestMethod.GET)
    public Optional<Course> getCourse(@PathVariable String courseId){
        return courseService.getCourse(courseId);
    }

    @RequestMapping(value="/topics/{topicId}/courses",method = RequestMethod.POST)
    public void addCourse(@PathVariable String topicId, @RequestBody Course course){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(topicId, course);
    }

    @RequestMapping(value="/topics/{topicId}/courses/{courseId}",method = RequestMethod.PUT)
    public void updateCourse(@PathVariable String topicId, @PathVariable String courseId, @RequestBody Course course){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }
    @RequestMapping(value="/topics/{topicId}/courses/{courseId}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String courseId){
        courseService.deleteCourse(courseId);
    }
}
