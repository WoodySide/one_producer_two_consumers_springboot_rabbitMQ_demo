package com.woodyside.new_york_times.repository;

import com.woodyside.new_york_times.model.NewYorkTimesNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsYorkTimesRepository extends JpaRepository<NewYorkTimesNews, Integer> {
}
