package com.example.demo.framework.imageslider.service;

import com.example.demo.framework.imageslider.model.ImageSlider;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImageSliderServiceImpl implements ImageSliderService {

    private List<ImageSlider> images = new ArrayList<>();

    @Override
    public List<ImageSlider> getAllImages() {
        return images;
    }

    @Override
    public ImageSlider saveImage(ImageSlider image) {
        images.add(image);
        return image;
    }
}
