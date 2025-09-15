package com.example.demo.framework.imageslider.controller;

import com.example.demo.framework.imageslider.model.ImageSlider;
import com.example.demo.framework.imageslider.service.ImageSliderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/images")
public class ImageSliderController {

    private final ImageSliderService imageSliderService;

    public ImageSliderController(ImageSliderService imageSliderService) {
        this.imageSliderService = imageSliderService;
    }

    @GetMapping
    public List<ImageSlider> getAllImages() {
        return imageSliderService.getAllImages();
    }

    @PostMapping
    public ImageSlider saveImage(@RequestBody ImageSlider image) {
        return imageSliderService.saveImage(image);
    }
}
