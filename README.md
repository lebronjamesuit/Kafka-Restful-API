# Kafka-Restful-API


1 Start the ZooKeeper service

    $ bin/zookeeper-server-start.sh config/zookeeper.properties


2 Start the Kafka broker service

    $ bin/kafka-server-start.sh config/server.properties


3 Producer
Spring Boot Kafka: topic, kafka template config

4 Consumer

     bin/kafka-console-consumer.sh --topic food --from-beginning --bootstrap-server localhost:9092
