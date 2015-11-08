package com.podbox.challenge.service;

import com.podbox.challenge.domain.billboard.*;
import com.podbox.challenge.domain.spotify.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import org.springframework.cache.annotation.Cacheable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class TrackService {
    static final Logger log = LoggerFactory.getLogger(TrackService.class);

    @Autowired
    RestTemplate restTemplate;

    @Cacheable("billboard")
    public Billboard billboard() {
        String url = "http://www.billboard.com/rss/charts/hot-100";
        log.debug("billboard: {}", url);

        return restTemplate.getForObject(url, Billboard.class);
    }

    @Cacheable("spotify")
    public String spotify(String track, String artist) {
        String url = "https://api.spotify.com/v1/search";
        String query = String.format("track:\"%s\" artist:\"%s\"", track, artist);

        String targetUrl = UriComponentsBuilder.fromHttpUrl(url)
            .queryParam("q", query)
            .queryParam("type", "track")
            .queryParam("limit", "1")
            .build()
            .toUriString();
        log.debug("spotify: {}", targetUrl);

        Result res = restTemplate.getForObject(targetUrl, Result.class);
        if (res.Tracks.Items.size() > 0) {
            return res.Tracks.Items.get(0).PreviewURL;
        }

        return null;
    }
}
