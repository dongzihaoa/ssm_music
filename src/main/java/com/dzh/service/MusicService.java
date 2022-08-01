package com.dzh.service;

import com.dzh.entity.Music;

import java.util.List;

/**
 * Hello Baby
 * 2022/8/1
 * ssm_music
 */
public interface MusicService {
     List<Music> findAll();

     List<Music> findByMusicName(String musicName);

     Music findById(Integer musicId);

     Music nextSong(Integer musicId);

     Music lastSong(Integer musicId);
}
