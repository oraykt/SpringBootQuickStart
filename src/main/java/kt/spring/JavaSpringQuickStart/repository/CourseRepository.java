/*
 * Topic.java
 * Created by Oray Kurt at 5/14/20, 3:39 AM
 * github.com/oraykt
 *
 */

package kt.spring.JavaSpringQuickStart.repository;

import kt.spring.JavaSpringQuickStart.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);

}
