package com.woodyside.news_source.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsDto {

    private Integer id;

    @JsonProperty(value = "author_name")
    private String authorName;

    @JsonProperty(value = "author_last_name")
    private String authorLastName;

    private String text;
}
