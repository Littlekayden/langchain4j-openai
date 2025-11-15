package com.chinasofti;

import dev.langchain4j.model.openai.OpenAiChatModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //2.创建模型(非官方标准格式)
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("https://dashscope.aliyuncs.com/compatible-mode/v1")
                .apiKey("your API KEY")
                .modelName("qwen-plus")
                .logRequests(true)//打印请求日志信息
                .logResponses(true)//打印响应日志信息
                .build();
        //3.调用chat()方法
        String answer = model.chat("你是谁？");
        System.out.println(answer);

    }
}
