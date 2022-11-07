package com.woodyside.news_source.model;

import com.woodyside.news_source.model.audit.AuditModel;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity(name = "News")
@Table(name = "news")
public class News extends AuditModel {

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
