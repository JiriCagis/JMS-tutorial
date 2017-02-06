<h1>JMS tutorial</h1>
<div>
Project is first familiarization with the JMS API(Java messaging system) in programming language Java.
I choosed the library ActiveMQ for implementation the JMS API. Application is consist of three small sub-programs
simulation separate programs. One of them is mark as a producer and other are marks as consumers messages from  the producer.

The producer read lines assigmented by user. If user type word "APPLE", all registered consumers are informs about it.
The consumer pause on 30s after receive  a message. It is for verification delivery the messages if consumer happen busy.
</div>
<br>
<br>

<p align='center'><img src='jms_example.png' width='55%' title='Picture show how work the JMS API.'> </p>

<h2>How do you run it? </h2>
<ol>
    <li>First time you must download ActiveMQ from <b> URL: http://activemq.apache.org/download.html. </b></li>
    <li>Uzip it in your favorite folder. (Example linux command: <b> tar -zxvf activemq*.gz.tar </b>) </li>
    <li>Execute file <b> bin/activemq </b> , this file run the ActiveMQ server. </li>
    <li>Open a browser and you type url: <b> http://localhost:8161/admin/ </b> (Username and password are "admin") </li>
    <li>Create topic in admin interface with name <b>"FruitTopic"</b> </li>
    <li>Run Java application <b>BrokerLauncher.java</b></li>
    <li>Run Java application <b>ProducerClient.java</b> </li>
    <li>Finall step, you run both instance of class ConsumerClients and you enjoy it :) </li>
</ol>

<h2>Technologies</h2>
<ul>
    <li>Java</li>
    <li>JMS API</li>
    <li>ActiveMQ</li>
</ul>
