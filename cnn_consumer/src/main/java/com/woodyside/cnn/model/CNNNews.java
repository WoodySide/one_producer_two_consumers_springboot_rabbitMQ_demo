package com.woodyside.cnn.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity(name = "CNNNews")
@Table(name = "cnn_news")
public class CNNNews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private Integer id;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "author_last_name")
    private String authorLastName;

    @Column(name = "news_text")
    private String text;
}
