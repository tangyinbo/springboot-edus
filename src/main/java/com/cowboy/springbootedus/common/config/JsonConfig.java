package com.cowboy.springbootedus.common.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用fastjson
 * Created by cowboy on 2017-11-5.
 */
@Configuration
public class JsonConfig {
    /**
     * fastjson 作为json转换对象
     * @return
     */
    @Bean
    public HttpMessageConverters fastjsonHttpMessageConverters(){
        //fastjson 消息转换对象
        FastJsonHttpMessageConverter messageConverter = new FastJsonHttpMessageConverter();
        //配置对象
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        messageConverter.setFastJsonConfig(config);
        return new HttpMessageConverters(messageConverter);
    }
}
