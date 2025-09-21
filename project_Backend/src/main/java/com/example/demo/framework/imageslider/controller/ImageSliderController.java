package com.example.demo.framework.imageslider.controller;

import com.example.demo.framework.imageslider.dto.ImageSliderDto;
import com.example.demo.framework.imageslider.model.Image;
import com.example.demo.framework.imageslider.service.ImageSliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image-slider")
public class ImageSliderController {

    @Autowired
    private ImageSliderService imageSliderService;

 @GetMapping("/getAll")
    public ResponseEntity<List<Image>> getAll() {
        List<Image> images = imageSliderService.getAllImages();
        return ResponseEntity.ok(images);
    }


    // Endpoint to create a new image
    @PostMapping("/create")
    public ResponseEntity<Image> create(@RequestBody ImageSliderDto dto) {
        Image savedImage = imageSliderService.createImage(dto);
        return ResponseEntity.ok(savedImage);
    }
}
