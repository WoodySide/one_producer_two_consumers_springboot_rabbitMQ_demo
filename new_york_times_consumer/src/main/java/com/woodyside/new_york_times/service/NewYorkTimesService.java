package com.woodyside.new_york_times.service;

import com.woodyside.new_york_times.dto.NewsYorkTimesNewsDto;
import com.woodyside.new_york_times.model.NewYorkTimesNews;
import com.woodyside.new_york_times.repository.NewsYorkTimesRepository;
import com.woodyside.new_york_times.util.NewYorkTimesNewsDtoConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewYorkTimesService {

    private final NewsYorkTimesRepository newsYorkTimesRepository;

    public void saveNews(NewsYorkTimesNewsDto toBeSaved) {
        NewYorkTimesNews cnnNews = NewYorkTimesNewsDtoConverter.dtoToModel(toBeSaved);
        newsYorkTimesRepository.save(cnnNews);
    }
}
