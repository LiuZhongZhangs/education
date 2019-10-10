package com.example.springboot.configure;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 配置消息转换器器
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/8 17:06
 */
@Configuration
public class FastJsonConfiguration implements WebMvcConfigurer {

    /**
     * FastJsonHttpMessageConverter 中有实现 HttpMessageConverter接口
     * @param converters
     */

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        /**
         * 先移除MappingJackson2HttpMessageConverter转换器，再加入fastjson转换器
         */
        Iterator<HttpMessageConverter<?>> iterator = converters.iterator();
        while(iterator.hasNext()){
            HttpMessageConverter<?> converter = iterator.next();
            if(converter instanceof MappingJackson2HttpMessageConverter){
                iterator.remove();
            }
        }
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //自定义配置...
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteMapNullValue
                ,SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullBooleanAsFalse,
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteNullNumberAsZero);
        fastJsonHttpMessageConverter.setFastJsonConfig(config);

        //解决返回的json数据中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<MediaType> ();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);

        //将转换器添加到转换列表
        converters.add(fastJsonHttpMessageConverter);
    }


//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        // 父类的配置
//        super.configureMessageConverters(converters);
//        // fastJson消息转换器
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//
//        // 处理中文乱码问题
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        fastConverter.setSupportedMediaTypes(fastMediaTypes);
//
//        // 配置类
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//
//        // 时间格式化 不然返回时间戳
//        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        // 过滤返回结果  参看下面注释
//        fastJsonConfig.setSerializerFeatures(
//                SerializerFeature.DisableCircularReferenceDetect,
//                SerializerFeature.WriteMapNullValue,  // 输出值为 null 的字段
//                SerializerFeature.WriteNullStringAsEmpty, // null 输出为"",而非null
//                SerializerFeature.WriteNullListAsEmpty    // List 为 []
//        );
//        /**
//         * fastJson配置类fastJsonConfig 调用setSerializerFeatures方法配置过滤选择
//         * DisableCircularReferenceDetect ：消除对同一对象循环引用的问题，默认为false（如果不配置有可能会进入死循环）
//         * WriteNullBooleanAsFalse：Boolean字段为null,输出为false,而非null
//         * WriteNullStringAsEmpty ：字符类型为null,输出为"",而非null
//         * WriteNullListAsEmpty  ：List字段为null,输出为[],而非null
//         * WriteMapNullValue      ：是否输出值为null的字段,默认为false。
//         */
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        converters.add(fastConverter);
//    }




}
