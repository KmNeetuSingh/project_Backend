package com.example.demo.framework.imageslider.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "imgmp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImgMp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
