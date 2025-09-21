package com.example.demo.framework.imageslider.service;

import com.example.demo.framework.imageslider.dto.ImageSliderDto;
import com.example.demo.framework.imageslider.model.Image;
import com.example.demo.framework.imageslider.model.ImageData;
import com.example.demo.framework.imageslider.model.Tag;
import com.example.demo.framework.imageslider.repo.ImageRepository;
import com.example.demo.framework.imageslider.repo.ImageDataRepository;
import com.example.demo.framework.imageslider.repo.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.framework.imageslider.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageSliderServiceImpl implements ImageSliderService {

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private ImageDataRepository imageDataRepository;

    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    @Override
    public Image createImage(ImageSliderDto dto) {

        // Find related ImageData
        Optional<ImageData> imageData = imageDataRepository.findById(dto.getRecordId());
        if (!imageData.isPresent()) {
            throw new ResourceNotFoundException("ImageData not found with ID: " + dto.getRecordId());
        }

        // Find related Tag (optional)
        Tag tag = null;
        if (dto.getTagId() != null) {
            tag = tagRepository.findById(dto.getTagId())
                    .orElseThrow(() -> new ResourceNotFoundException("Tag not found with ID: " + dto.getTagId()));
        }

        // Create new Image entity
        Image image = new Image();
        image.setImageData(imageData.get());
        image.setUrl(dto.getUrl());
        image.setTitle(dto.getTitle());
        image.setDescription(dto.getDescription());
        image.setAlt(dto.getAlt());
        image.setImgOrder(dto.getImgOrder());
        image.setTag(tag);
        image.setIsActive(dto.getIsActive());

        // Save to database
        return imageRepository.save(image);
    }
}
