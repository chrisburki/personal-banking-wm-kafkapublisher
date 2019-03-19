package kafkapublisher.domain.publisher;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Value(value = "${kafka.bootstrapServerAddress}")
    private String bootstrapServerAddress;

    @Value(value = "${message.topic.name}")
    private String topicName;

//    @Value("${KAFKA_SERVICE_HOST}")
//    private String kafkaHost;

//    @Value("${KAFKA_SERVICE_PORT}")
//    private String kafkaPort;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
//        bootstrapServerAddress = kafkaHost + ":" + kafkaPort;
        System.out.println("bootstrapServerAddress: " + bootstrapServerAddress);
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServerAddress);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topic() {
        return new NewTopic(topicName, 1, (short) 1);
    }

}
