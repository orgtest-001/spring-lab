package com.rojojun.springadvanced;

import com.rojojun.springadvanced.trace.logtrace.LogTrace;
import com.rojojun.springadvanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
