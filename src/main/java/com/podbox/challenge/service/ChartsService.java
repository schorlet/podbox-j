package com.podbox.challenge.service;

import com.podbox.challenge.domain.Track;
import com.podbox.challenge.domain.billboard.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class ChartsService {
    @Autowired
    TrackService trackService;

    public List<Track> getHot10() {
        Billboard b = trackService.billboard();

        List<Track> tracks = b.Items().stream()
            .limit(10)
            .parallel()
            .map(item -> {
                String url = trackService.spotify(item.Title, item.Artist);
                return new Track(item.Rank, item.Title, item.Artist, url);
            })
            .collect(Collectors.toList());

        return tracks;
    }
}
