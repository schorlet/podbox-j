package com.podbox.challenge.domain;

public class Track {

    public final Integer rank;

    public final String title;

    public final String artist;

    public final String spotifyUri;

    public Track(Integer rank, String title, String artist) {
        this(rank, title, artist, null);
    }

    public Track(Integer rank, String title, String artist, String spotifyUri) {
        this.rank = rank;
        this.title = title;
        this.artist = artist;
        this.spotifyUri = spotifyUri;
    }
}
