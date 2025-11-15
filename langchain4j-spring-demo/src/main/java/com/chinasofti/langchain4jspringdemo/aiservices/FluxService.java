package com.chinasofti.langchain4jspringdemo.aiservices;

import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

@AiService
public interface FluxService {

    public Flux<String> chat(String message);
}
