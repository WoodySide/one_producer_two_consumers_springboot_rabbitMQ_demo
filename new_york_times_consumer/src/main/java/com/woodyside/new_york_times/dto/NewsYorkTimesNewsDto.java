package com.woodyside.new_york_times.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsYorkTimesNewsDto {

    private Integer id;

    @JsonProperty(value = "author_name")
    private String authorName;

    @JsonProperty(value = "author_last_name")
    private String authorLastName;

    private String text;
}
