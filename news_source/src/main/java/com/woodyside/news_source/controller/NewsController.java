package com.woodyside.news_source.controller;

import com.woodyside.news_source.dto.NewsDto;
import com.woodyside.news_source.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NewsDto> publishNews(@RequestBody NewsDto toBePublished) {
        return ResponseEntity.ok(newsService.publishNews(toBePublished));
    }
}
