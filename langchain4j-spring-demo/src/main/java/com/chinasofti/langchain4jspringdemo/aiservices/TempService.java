package com.chinasofti.langchain4jspringdemo.aiservices;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

//接口,定义会被使用到的方法
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT, //显示手动装配
        chatModel = "openAiChatModel" //注入的配置文件的model
)
public interface TempService {
    public String chat(String message);
}
