package com.example.demo.framework.imageslider.service;

import com.example.demo.framework.imageslider.dto.ImageSliderDto;
import com.example.demo.framework.imageslider.model.Image;

import java.util.List;

public interface ImageSliderService {

    List<Image> getAllImages();

    Image createImage(ImageSliderDto dto);
}
