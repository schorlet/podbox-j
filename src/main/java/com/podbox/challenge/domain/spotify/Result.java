package com.podbox.challenge.domain.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="")
public class Result {
    @JsonProperty(value="tracks")
    public Tracks Tracks;
}
