package pdev.producer.rabbitmq.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pdev.producer.rabbitmq.domain.NotaFiscalRequest;
import pdev.producer.rabbitmq.service.NotaFiscalService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    private final NotaFiscalService service;

    @PostMapping
    public void sendMessage(@RequestBody NotaFiscalRequest request) {
        log.info("Nota fiscal:  {}", request);
        service.sendMessage(request);
    }
}
