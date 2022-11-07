package com.woodyside.new_york_times.util;

import com.woodyside.new_york_times.dto.NewsYorkTimesNewsDto;
import com.woodyside.new_york_times.model.NewYorkTimesNews;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class NewYorkTimesNewsDtoConverter {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static NewsYorkTimesNewsDto modelToDto(NewYorkTimesNews news) {
        NewsYorkTimesNewsDto newsYorkTimesNewsDto = NewsYorkTimesNewsDto.builder().build();
        modelMapper.map(news,newsYorkTimesNewsDto);
        return newsYorkTimesNewsDto;
    }

    public static NewYorkTimesNews dtoToModel(NewsYorkTimesNewsDto newsDto) {
        NewYorkTimesNews newYorkTimesNews = NewYorkTimesNews.builder().build();
        modelMapper.map(newsDto,newYorkTimesNews);
        return newYorkTimesNews;
    }
}
