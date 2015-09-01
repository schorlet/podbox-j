package com.podbox.challenge.service;

import com.podbox.challenge.domain.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ChartsService {

    @Autowired
    RestTemplate restTemplate;

    public List<Track> getHot10() {
        throw new UnsupportedOperationException("not implemented");
    }
}
