package com.dzh.service;

import com.dzh.entity.Sheet;

import java.util.List;

/**
 * @Auther: Hello Baby
 * @Date: 2022/8/1
 * @Descriptin: ssm_music
 * @version: 1.0
 */
public interface SheetService {

    List<Sheet> findAll();

    void addSheet(String sheetName);
}
