package com.example.demo.framework.imageslider.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "images_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "mapping")
    private ImgMp imgMp;

    @Column(name = "cre_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "mod_date")
    private LocalDateTime modifiedDate;

    @Column(name = "mod_by")
    private Integer modifiedBy;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
