package com.example.demo.framework.imageslider.repo;

import com.example.demo.framework.imageslider.model.ImgMp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgMpRepository extends JpaRepository<ImgMp, Long> {
}
