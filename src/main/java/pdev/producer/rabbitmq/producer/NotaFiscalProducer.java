package pdev.producer.rabbitmq.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import pdev.producer.rabbitmq.domain.NotaFiscalRequest;

import static pdev.producer.rabbitmq.config.NotaFiscalExchangeConfig.EXCHANGE_NAME;
import static pdev.producer.rabbitmq.config.NotaFiscalRabbitConfig.ROUTING_KEY_NAME;

@Component
@RequiredArgsConstructor
public class NotaFiscalProducer {

    private final RabbitTemplate template;

    public void sendMessage(NotaFiscalRequest request) {
        template.convertAndSend(EXCHANGE_NAME, ROUTING_KEY_NAME, request);
    }
}
