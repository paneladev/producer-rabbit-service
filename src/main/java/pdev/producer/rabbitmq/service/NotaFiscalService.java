package pdev.producer.rabbitmq.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pdev.producer.rabbitmq.domain.NotaFiscalRequest;
import pdev.producer.rabbitmq.producer.NotaFiscalProducer;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {

    private final NotaFiscalProducer producer;

    public void sendMessage(NotaFiscalRequest request) {
        // faz o processamento necessario com a nota fiscal

        // envia mensagem para o rabbit
        producer.sendMessage(request);
    }
}
