import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by osboxes on 08/01/17.
 */
public class BrokerLauncher {

    public static void main(String[] args) throws URISyntaxException,Exception{
        URI uri = new URI("broker:(tcp://localhost:46820)");
        BrokerService brokerService = BrokerFactory.createBroker(uri);
        brokerService.start();
    }
}
