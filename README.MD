<h1>JMS tutorial</h1>
<div>
Project is first familiarization with the JMS API(Java messaging system) in programming language Java.
I choosed the library ActiveMQ for implementation the JMS API. Application is consist of a three small sub-programs
simulation separate programs. One of them is mark as a producer and other are marks as consumers messages from  the producer.

The producer read lines assigmented by user. If user type word "APPLE", all registered consumers are informs about it.
The consumer pause on 30s after receive  a message. It is for verification delivery the messages if consumer happen busy.
</div>

<h2>How do you run it? </h2>
<ol>
    <li>First time you must download ActiveMQ from url: http://activemq.apache.org/download.html. </li>
    <li>You unzip it in your favorite folder. (Example linux command: tar -zxvf activemq*.gz.tar) </li>
    <li>You execute file bin/activemq, this file run the ActiveMQ server. </li>
    <li>You ppen browser and you type url into adress line: http://localhost:8161/admin/ (Username and password are "admin") </li>
    <li>You create topic in admin interface with name "FruitTopic" </li>
    <li>You run Java application BrokerLauncher.java </li>
    <li>You run Java application ProducerClient.java </li>
    <li>Finall step, you run both ConsumerClients and you enjoy it :) </li>
</ol>

<h2>Technologies</h2>
<ul>
    <li>Java</li>
    <li>JMS API</li>
    <li>ActiveMQ</li>
</ul>
