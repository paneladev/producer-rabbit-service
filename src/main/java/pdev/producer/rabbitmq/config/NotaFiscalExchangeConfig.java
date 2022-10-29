package pdev.producer.rabbitmq.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotaFiscalExchangeConfig {

    public static final String EXCHANGE_NAME = "pdev-exchange";

    @Bean
    DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }
}
