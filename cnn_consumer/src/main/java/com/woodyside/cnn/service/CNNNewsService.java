package com.woodyside.cnn.service;

import com.woodyside.cnn.dto.CNNNewsDto;
import com.woodyside.cnn.model.CNNNews;
import com.woodyside.cnn.repository.CNNNewsRepository;
import com.woodyside.cnn.util.CNNNewsDtoConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CNNNewsService {

    private final CNNNewsRepository cnnNewsRepository;

    public void saveNews(CNNNewsDto toBeSaved) {
        CNNNews cnnNews = CNNNewsDtoConverter.dtoToModel(toBeSaved);
        cnnNewsRepository.save(cnnNews);
    }
}
