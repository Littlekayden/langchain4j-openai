package com.chinasofti.langchain4jspringdemo.config;

import com.chinasofti.langchain4jspringdemo.aiservices.TempService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类,我感觉就像工厂模式的工厂类,在这里真正定义Bean
@Configuration
public class CommonConfig {

    @Autowired
    private OpenAiChatModel model;//注入的配置文件里的模型


//    @Bean
//    public TempService tempService(){
//        //导入的AIServices依赖，在这里使用;感觉像是 反射+构建者
//        TempService tempService = AiServices.builder(TempService.class)//这里必须是接口【规范】
//                .chatLanguageModel(model)
//                .build();
//        return tempService;
//    }

}
