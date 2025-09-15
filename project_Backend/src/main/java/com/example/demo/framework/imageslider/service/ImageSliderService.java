package com.example.demo.framework.imageslider.service;

import com.example.demo.framework.imageslider.model.ImageSlider;
import java.util.List;

public interface ImageSliderService {
    List<ImageSlider> getAllImages();
    ImageSlider saveImage(ImageSlider image);
}
