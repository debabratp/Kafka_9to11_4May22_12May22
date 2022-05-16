package org.skp.conf;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.Map;
import java.util.TreeMap;

@Configuration
public class ProducerConfiguration {

    @Bean
    public ProducerFactory<String, String> producerFactory(){
        Map<String, String> propMap = new TreeMap<>();
        propMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        propMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        propMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        return new DefaultKafkaProducerFactory(propMap);
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate(){

        return new KafkaTemplate<>(producerFactory());
    }


}
