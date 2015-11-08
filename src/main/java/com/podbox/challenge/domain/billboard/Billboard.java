package com.podbox.challenge.domain.billboard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JacksonXmlRootElement(localName = "rss")
public class Billboard {
    @JacksonXmlElementWrapper(localName="channel")
    public Channel Channel;

    public List<Item> Items() {
        return this.Channel.Items;
    }
}

