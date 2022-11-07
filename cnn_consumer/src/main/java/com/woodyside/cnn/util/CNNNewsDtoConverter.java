package com.woodyside.cnn.util;

import com.woodyside.cnn.dto.CNNNewsDto;
import com.woodyside.cnn.model.CNNNews;
import com.woodyside.news_source.dto.NewsDto;
import com.woodyside.news_source.model.News;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class CNNNewsDtoConverter {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static CNNNewsDto modelToDto(CNNNews news) {
        CNNNewsDto cnnNewsDto = CNNNewsDto.builder().build();
        modelMapper.map(news,cnnNewsDto);
        return cnnNewsDto;
    }

    public static CNNNews dtoToModel(CNNNewsDto cnnNewsDto) {
        CNNNews cnnNews = CNNNews.builder().build();
        modelMapper.map(cnnNewsDto,cnnNews);
        return cnnNews;
    }
}
