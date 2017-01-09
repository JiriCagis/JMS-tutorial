<h1>JMS tutorial</h1>
<div>
Project is first familiarization with API JMS(Java messaging system) in programming language Java.
For implementation JMS API was choose library ActiveMQ. Application is consist of three small sub-programs
simulation separate programs. One of them is mark as producer and other as consumers messages from producer.

Producer read lines assigment by user. If user type word "APPLE", all registered consumers are inform about it.
Consumer pause on 30s after receive message. It is for verification delivery messages if consumer is busy.
</div>

<h2>How run it? </h2>
<ol>
    <li>Download ActiveMQ from url: http://activemq.apache.org/download.html. </li>
    <li>Unzip it in your favorite folder (Example: tar -zxvf activemq*.gz.tar) </li>
    <li>Run server from file: bin/activemq</li>
    <li>Open browser and type url: http://localhost:8161/admin/ (Username and password are "admin") </li>
    <li>Create topic in admin interface with name "FruitTopic" </li>
    <li>Run Java application BrokerLauncher.java </li>
    <li>Run Java application ProducerClient.java </li>
    <li>Run both ConsumerClients and you enjoy it :) </li>
<ol>

<h2>Technologies</h2>
<ul>
    <li>Java</li>
    <li>JMS API</li>
    <li>ActiveMQ</li>
</ul>