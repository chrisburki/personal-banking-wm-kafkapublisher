package kafkapublisher.api;

import kafkapublisher.domain.Message;
import kafkapublisher.application.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private Publisher publisher;


    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public Message sendMessage(@RequestBody Message message) {
        System.out.println("Message received");
        System.out.println("Message Content: " + message.getContent());

        publisher.sendMessage(message.getContent());
        return message;
    }

}
