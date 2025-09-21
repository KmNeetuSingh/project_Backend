package com.example.demo.framework.imageslider.repo;

import com.example.demo.framework.imageslider.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
