Kafka
----------------------------------------------------------------

    Agenda
    -----------------

        Main 1: Apache Kafka Baics
                    What is Kafka? 
                    Kafka Features
                    Kafka Concepts
                    Kafka Architecture
                    Kafka Components 
                    Kafka Installation
                    Kafka Cluster 
                    Types of Kafka Clusters
                    Configuring Single Node Single Broker Cluster  
        Main 2: Kafka Producer 
                    Constructing a Kafka Producer 
                    Sending a Message to Kafka 
                    Producing Keyed and Non-Keyed Messages  
                    Sending a Message Synchronously & Asynchronously 
                    Configuring Producers 
                    Serializers 
                    Partitions 
        Main 3: Kafka Consumer 
                    Consumers and Consumer Groups 
                    Standalone Consumer 
                    Consumer Groups and Partition Rebalance 
                    Creating a Kafka Consumer 
                    Subscribing to Topics 
                    The Poll Loop 
                    Configuring Consumers 
                    Commits and Offsets 
                    Rebalance Listeners 
                    Consuming Records with Specific Offsets 
                    Deserializers 
        Main 4: Kafka Internals
                    Cluster Membership 
                    The Controller 
                    Replication   
                    Request Processing 
                    Physical Storage 
                    Reliability  
                    Broker Configuration 
                    Using Producers in a Reliable System 
                    Using Consumers in a Reliable System 
        
        Main 5: Kafka Stream Processing 
                    Stream Processing  
                    Stream-Processing Concepts  
                    Stream-Processing Design Patterns
                    Kafka Streams by Example 
        

    Lab SetUp
    -----------------------
        STS/Eclipse IDE
        Java 8
        Kafka
        Zookeeper

    What and Why ?

        + Distrubuted Event Progression or Message Broadcasting System.
        + It means that Kafka can facilitate two completely isolated non-similar
            application to communicate withe one another.

        Apps need to talk to one another
            In context of microservices
            In context of a IOT device talking to a Web App/Mobile App
            In context to bigdata
            and so on.....

        + Kafka can be configured on a single clustur or a multiple - clustur
        + Kafka can be used in any scale of utility
        + Kafaka can be used as a event store
    
    Message Driven System

        Point-to-Point

            producer ----------->> MSG --------->> consumer
                            (half-duplex)

        Broadcasting

            producer1
            producer2   -------->> MSG -- MSG-POOL[TOPICS] ------->> consumer1, consumer2, consumer3...
            producer3

        Kafka supports both types of Messaging systems.


        Producer        is one which supplies a message

        Consumer        is one which receives a message

        Message         can be 
                                a request
                                an event
                                an instruction
                                or a record or any arbitary piece of information.

                in a chatting application, a message is 'some text'
                in CQRS , a message is 'an event' or 'a command'

        Topic           is a logical identifier for a group of messages.

        Publish     the process of sending message by a producer is called publishing.
                    a producer PUBLISHES messages to a TOPIC

        Subscribe   the process of receiving messages by a consumer is called subscribing.
                    a consumer SUBSCRIBES a topic and receives the messages.

    
    