package com.dzh.controller;

import com.dzh.entity.Music;
import com.dzh.service.MusicService;
import com.dzh.service.impl.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Hello Baby
 * 2022/8/1
 * ssm_music
 */
@RequestMapping("music")
@RestController
public class MusicController {

    private final MusicService musicService;

    @Autowired
    public MusicController(MusicServiceImpl musicService) {
        this.musicService = musicService;
    }

    @RequestMapping("findAll")
    public List<Music> findAll() {
        return musicService.findAll();
    }

    @RequestMapping("findByMusicName")
    public List<Music> findByMusicName(String musicName) {
        return musicService.findByMusicName(musicName);
    }

    @RequestMapping("findById/{musicId}")
    public Music findById(@PathVariable("musicId") Integer musicId) {
        return musicService.findById(musicId);
    }

    //下一首
    @RequestMapping("nextSong")
    public Music nextSong(Integer musicId){
        return musicService.nextSong(musicId);
    }

    //上一首
    @RequestMapping("lastSong")
    public Music lastSong(Integer musicId){
        return musicService.lastSong(musicId);
    }

}
