package com.example.demo.framework.imageslider.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageSliderDto {
    private String url;
    private String title;
    private String description;
    private String alt;
    private Integer imgOrder;
}
