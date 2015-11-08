package com.podbox.challenge.domain.billboard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Item {
    @JacksonXmlProperty(localName="chart_item_title")
    public String Title;

    @JacksonXmlProperty(localName="artist")
    public String  Artist;

    @JacksonXmlProperty(localName="rank_this_week")
    public Integer Rank;
}
