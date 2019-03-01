package kafkapublisher;

//import kafkapublisher.application.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);

/*
		ConfigurableApplicationContext context = SpringApplication.run(KafkaPublisherApplication.class, args);

		Publisher producer = context.getBean(Publisher.class);
		*/
/*
		 * Sending a Hello BUC message to topic 'buc'.
		 * Must be recieved by both listeners with group foo
		 * and bar with containerFactory fooKafkaListenerContainerFactory
		 * and barKafkaListenerContainerFactory respectively.
		 * It will also be recieved by the listener with
		 * headersKafkaListenerContainerFactory as container factory
		 *//*

		producer.sendMessage("Hello, BUC!");
		context.close();
*/
	}

}

