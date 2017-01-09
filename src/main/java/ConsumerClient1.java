import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.net.URISyntaxException;

/**
 * Consumer is responsible for receive message on topic "FruitTopic".
 * When consumer receive message, consumer display info and sleep on 30s.
 * Consumer exit work after receive word "STOP" .
 * Created by osboxes on 08/01/17.
 */
public class ConsumerClient1 {

    public static void main(String[] args) throws URISyntaxException, Exception {
        TopicConnection connection = null;
        TopicConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                "tcp://localhost:46820");
        connection = connectionFactory.createTopicConnection();
        TopicSession session = connection.createTopicSession(false,
                Session.AUTO_ACKNOWLEDGE);
        try {
            Topic topic = session.createTopic("FruitTopic");

            // Consumer
            TopicSubscriber subscriber = session.createSubscriber(topic);
            connection.start();

            while (true){
                TextMessage message = (TextMessage) subscriber.receive();
                System.out.println("I received message from producer and sleep of 30s: " + message.getText());
                Thread.sleep(30000);
                if(message.getText().equals("STOP")){
                    break;
                }
            }
            connection.close();
        } finally {
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
