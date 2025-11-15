package com.chinasofti.langchain4jspringdemo.controller;

import com.chinasofti.langchain4jspringdemo.aiservices.FluxService;
import com.chinasofti.langchain4jspringdemo.aiservices.TempService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {

    @Resource
    private OpenAiChatModel model;//注入的配置文件的model

    @Resource
    private TempService tempService;//注入的自定义的 XXService Bean

    @Resource
    private FluxService fluxService;//注入容器中的 FluxService


    @RequestMapping("/chat")
    public String chat(String message){
        String result = model.chat(message);
        return result;
    }

    @RequestMapping("/chatWithService")
    public String chatWithService(String message){
        String result = tempService.chat(message);
        return result;
    }

    @RequestMapping(value = "/chatWithFlux",produces = "text/html;charset=utf-8")//解决乱码
    public Flux<String> chatWithFlux(String message){
        Flux<String> result = fluxService.chat(message);
        return result;
    }


}
