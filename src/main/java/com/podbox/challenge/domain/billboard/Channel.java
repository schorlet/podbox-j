package com.podbox.challenge.domain.billboard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Channel {
    @JacksonXmlElementWrapper(useWrapping=false)
    @JacksonXmlProperty(localName="item")
    public List<Item> Items;
}
