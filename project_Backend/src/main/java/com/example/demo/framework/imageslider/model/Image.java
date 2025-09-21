package com.example.demo.framework.imageslider.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgId;

    @ManyToOne
    @JoinColumn(name = "record_id", nullable = false)
    private ImageData imageData;

    @Column(nullable = false)
    private String url;

    private String title;
    private String description;
    private String alt;

    @Column(name = "img_order")
    private Integer imgOrder;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
