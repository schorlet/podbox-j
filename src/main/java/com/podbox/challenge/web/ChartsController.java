package com.podbox.challenge.web;

import com.podbox.challenge.domain.Track;
import com.podbox.challenge.service.ChartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/charts")
class ChartsController {

    @Autowired
    ChartsService chartsService;

    @RequestMapping(method = GET)
    List<Track> hot10() {
        return chartsService.getHot10();
    }
}
