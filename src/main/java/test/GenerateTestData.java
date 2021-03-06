package test;

import Common.Constant;
import conf.KafkaConf;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/**
 * @author siyongshuai
 * @time 2020-03-12 13:42
 */

public class GenerateTestData {
    public static void main(String[] args) {

        Properties props = KafkaConf.createTestKafkaProps("test");
        Producer producer = new KafkaProducer(props);
        for (int i = 10000; i < 20000; i++) {
            ProducerRecord record = new ProducerRecord(Constant.TEST_TOPIC, i + "");
            producer.send(record);

        }
        producer.close();
        System.out.println("发送完成");
    }
}
