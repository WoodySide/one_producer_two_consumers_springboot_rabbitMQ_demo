package com.woodyside.news_source.util;

import com.woodyside.news_source.dto.NewsDto;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;
import com.woodyside.news_source.model.News;

@UtilityClass
public class NewsModelMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static NewsDto modelToDto(News news) {
        NewsDto newsDto = NewsDto.builder().build();
        modelMapper.map(news,newsDto);
        return newsDto;
    }

    public static News dtoToModel(NewsDto newsDto) {
        News news = News.builder().build();
        modelMapper.map(newsDto,news);
        return news;
    }
}
