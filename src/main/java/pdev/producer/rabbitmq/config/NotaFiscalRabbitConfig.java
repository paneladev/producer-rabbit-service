package pdev.producer.rabbitmq.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class NotaFiscalRabbitConfig {

    private final DirectExchange directExchange;
    public static final String ROUTING_KEY_NAME = "pdev.nf.message";
    public static final String QUEUE_NAME = "pdev.nf.queue";

    @Bean
    Queue queue() {
        return QueueBuilder.durable(QUEUE_NAME).build();
    }

    @Bean
    Binding binding() {
        return BindingBuilder.bind(queue()).to(directExchange).with(ROUTING_KEY_NAME);
    }
}
