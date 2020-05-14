/*
 * TopicController.java
 * Created by Oray Kurt at 5/14/20, 2:36 AM
 * github.com/oraykt
 *
 */

package kt.spring.JavaSpringQuickStart.controller;

import kt.spring.JavaSpringQuickStart.model.Topic;
import kt.spring.JavaSpringQuickStart.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value="/topics",method = RequestMethod.GET)
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping(value="/topics/{id}",method = RequestMethod.GET)
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value="/topics",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(value="/topics/{id}",method = RequestMethod.PUT)
    public void getTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }
    @RequestMapping(value="/topics/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
