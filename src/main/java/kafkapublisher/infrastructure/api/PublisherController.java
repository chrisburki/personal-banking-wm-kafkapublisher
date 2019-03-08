package kafkapublisher.infrastructure.api;

import kafkapublisher.domain.message.Message;
import kafkapublisher.application.PublisherService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    private final PublisherService publisherService;

    PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }


    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public Message sendMessage(@RequestBody Message message) {
        System.out.println("Message received");
        System.out.println("Message Content: " + message.getContent());

        publisherService.sendMessage(message.getContent());
        return message;
    }

}
