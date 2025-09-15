package com.example.demo.framework.imageslider.repo;

import com.example.demo.framework.imageslider.model.ImageSlider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageSliderRepository extends JpaRepository<ImageSlider, Long> {
    // No need to reference ImageSliderService here
}
