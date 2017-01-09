import org.apache.activemq.ActiveMQConnectionFactory;


import javax.jms.*;
import java.util.Scanner;

/**
 * Producer has main function read lines from terminal.
 * When user types word "APPLE" producer send message all registered consumers.
 * User can exit program types word "STOP".
 * Created by osboxes on 08/01/17.
 */
public class ProducerClient {

    public static void main(String[] args) throws Exception{
        TopicConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:46820");
        TopicConnection connection = null;

        try{
            connection = connectionFactory.createTopicConnection();
            TopicSession session = connection.createTopicSession(false,Session.AUTO_ACKNOWLEDGE);
            Topic topic = session.createTopic("FruitTopic");
            TopicPublisher publisher = session.createPublisher(topic);

            String line = "";
            while (!line.equals("STOP")){
                Scanner scanner = new Scanner(System.in);
                line = scanner.next();

                if(line.equals("APPLE")){
                    Message message = session.createTextMessage(line);
                    publisher.send(message);
                    System.out.println("Was send information message for all registered consumers.");
                }

                if(line.equals("STOP")){
                    Message message = session.createTextMessage(line);
                    publisher.send(message);
                }
            }
            session.close();
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            if(connection !=null){
                connection.close();
            }
        }

    }
}
