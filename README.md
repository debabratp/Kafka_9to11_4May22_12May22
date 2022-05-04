Kafka
----------------------------------------------------------------

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
    
    Message Driven System

        Point-to-Point

            producer ----------->> MSG --------->> consumer
                            (half-duplex)

        Broadcasting


            producer1
            producer2   -------->> MSG -- MSG-POOL ------->> consumer1, consumer2, consumer3...
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

    
    