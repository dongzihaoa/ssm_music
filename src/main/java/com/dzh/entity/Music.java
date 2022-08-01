package com.dzh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*
  Hello Baby
  2022/8/1
  ssm_music
 */
/**
 *  tb_music
 * @author lucky
 *  2022-08-01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Music implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer musicId;
    private String musicName;
    private String musicAlbumName;
    private String musicAlbumPicurl;
    private String musicMp3url;
    private String musicArtistName;
    private Integer sheetId;

}
