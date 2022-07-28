package example.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class KafkaExecutor {


    public static void main(String... args){
        String servidoresBootstrap = "127.0.0.1:9092";
        String topic = "users";

        Properties props = new Properties();
        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, servidoresBootstrap);
        props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "group_id");

        KafkaConsumer<String, String> consumidor = new KafkaConsumer<>(props);
        try {
            consumidor.subscribe(Collections.singleton(topic));

            ConsumerRecords<String, String> mensajes = consumidor.poll(Duration.ZERO);

            for (ConsumerRecord<String, String> mensaje: mensajes) {
                System.out.println(mensaje.value());
            }
        } finally {
            consumidor.close();
        }
    }
}
