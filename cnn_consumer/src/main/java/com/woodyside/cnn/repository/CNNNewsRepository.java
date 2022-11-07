package com.woodyside.cnn.repository;

import com.woodyside.cnn.model.CNNNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CNNNewsRepository extends JpaRepository<CNNNews, Integer> {
}
