package com.dzh.service.impl;

import com.dzh.entity.Music;
import com.dzh.mapper.MusicMapper;
import com.dzh.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Hello Baby
 * 2022/8/1
 * ssm_music
 */
@Service
public class MusicServiceImpl implements MusicService {

    private final MusicMapper mapper;

    @Autowired
    public MusicServiceImpl(MusicMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Music> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Music> findByMusicName(String musicName) {
        return mapper.findByMusicName(musicName);
    }

    @Override
    public Music findById(Integer musicId) {
        return mapper.findById(musicId);
    }



    @Override
    public Music nextSong(Integer musicId) {
        //思路：通过传递当前歌曲的id，找到当前歌曲在所有歌曲这个集合中所对应的下标，通过下标获取下一首
        //声明一个变量，用于接收当前歌曲对应的下标
        int currentMusicIndex = 0;
        //获取所有歌曲
        List<Music> musicList = mapper.findAll();
        //判断
        if(musicList.size() > 0){
            //遍历
            for (int i = 0; i < musicList.size(); i++) {
                //判断当前歌曲的id
                if(musicList.get(i).getMusicId().equals(musicId)){
                    //赋值
                    currentMusicIndex = i;
                    break;
                }
            }
        }

        //通过当前歌曲的下标，获取下一首歌歌曲的下标
        //由于我们获取的是下一首歌曲，所以我们要判断当前歌曲是不是最后一首
        //如果有下一首，下标 + 1，如果是最后一首，返回第一首
        int nextSongIndex =
                currentMusicIndex == musicList.size() - 1 ? 0 : currentMusicIndex + 1;

        //返回下一首歌曲对象
        return musicList.get(nextSongIndex);
    }

    @Override
    public Music lastSong(Integer musicId) {
        //思路：通过传递当前歌曲的id，找到当前歌曲在所有歌曲这个集合中所对应的下标，通过下标获取上一首
        //声明一个变量，用于接收当前歌曲对应的下标
        //获取所有歌曲
        List<Music> musicList = mapper.findAll();
        //判断
        int currentMusicIndex = 0;
        if(musicList.size() > 0){
            //遍历
            for (int i = 0; i < musicList.size(); i++) {
                //判断当前歌曲的id
                if(musicList.get(i).getMusicId().equals(musicId)){
                    //赋值
                    currentMusicIndex = i;
                    break;
                }
            }
        }

        //通过当前歌曲的下标，获取上一首歌歌曲的下标
        //由于我们获取的是上一首歌曲，所以我们要判断当前歌曲是不是第一首
        //如果有上一首，下标 - 1，如果是第一首，返回最后一首
        int nextSongIndex =
                currentMusicIndex == 0 ? musicList.size() - 1 : currentMusicIndex - 1;

        //返回上一首歌曲对象
        return musicList.get(nextSongIndex);
    }
}

