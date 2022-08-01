package com.dzh.mapper;

import com.dzh.entity.Sheet;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Hello Baby
 * @Date: 2022/8/1
 * @Descriptin: ssm_music
 * @version: 1.0
 */
@Repository
public interface SheetMapper {
    List<Sheet> findAll();

    void addSheet(String sheetName);
}
