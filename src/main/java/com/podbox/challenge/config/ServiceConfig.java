package com.podbox.challenge.config;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
class ServiceConfig {

    @Bean
    CloseableHttpClient httpClient() {
        return HttpClientBuilder.create()
                .build();
    }

    @Bean
    RestTemplate restTemplate(final CloseableHttpClient httpClient) {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient));
        return restTemplate;
    }
}
