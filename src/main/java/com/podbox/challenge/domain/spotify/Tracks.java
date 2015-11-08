package com.podbox.challenge.domain.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Tracks {
    @JsonProperty(value="items")
    public List<Item> Items;
}
