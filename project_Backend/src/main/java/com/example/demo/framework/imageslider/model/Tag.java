package com.example.demo.framework.imageslider.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tags_img")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
