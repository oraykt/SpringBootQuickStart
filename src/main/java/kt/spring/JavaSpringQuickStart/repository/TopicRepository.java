/*
 * Topic.java
 * Created by Oray Kurt at 5/14/20, 3:39 AM
 * github.com/oraykt
 *
 */

package kt.spring.JavaSpringQuickStart.repository;

import kt.spring.JavaSpringQuickStart.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
