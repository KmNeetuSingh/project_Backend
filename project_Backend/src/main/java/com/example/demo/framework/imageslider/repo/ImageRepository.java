package com.example.demo.framework.imageslider.repo;

import com.example.demo.framework.imageslider.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
