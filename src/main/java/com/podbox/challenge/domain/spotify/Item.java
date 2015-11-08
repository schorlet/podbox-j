package com.podbox.challenge.domain.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    @JsonProperty(value="preview_url")
    public String PreviewURL;
}
