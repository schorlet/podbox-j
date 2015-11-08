package com.podbox.challenge.config;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.annotation.EnableCaching;

import org.springframework.web.client.RestTemplate;

@EnableCaching
@Configuration
class ServiceConfig {

    @Bean
    CloseableHttpClient httpClient() {
        return HttpClientBuilder.create().build();
    }

    @Bean
    RestTemplate restTemplate(final CloseableHttpClient httpClient) {
        final HttpComponentsClientHttpRequestFactory requestFactory =
            new HttpComponentsClientHttpRequestFactory(httpClient);
        requestFactory.setConnectTimeout(1000);
        requestFactory.setReadTimeout(1000);

        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(requestFactory);

        return restTemplate;
    }

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager();
    }
}
