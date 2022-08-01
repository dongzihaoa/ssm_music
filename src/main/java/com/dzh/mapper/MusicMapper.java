package com.dzh.mapper;

import com.dzh.entity.Music;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Hello Baby
 * 2022/8/1
 * ssm_music
 */

@Repository
public interface MusicMapper {
    List<Music> findAll();

    List<Music> findByMusicName(String musicName);

    Music findById(Integer musicId);

}
