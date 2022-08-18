package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Video;

/**
 * @author jtech
 *
 */
public interface IVideoDAO extends JpaRepository<Video, Long> {

}
