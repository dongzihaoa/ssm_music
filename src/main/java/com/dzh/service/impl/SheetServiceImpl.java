package com.dzh.service.impl;

import com.dzh.entity.Sheet;
import com.dzh.mapper.SheetMapper;
import com.dzh.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Hello Baby
 * @Date: 2022/8/1
 * @Descriptin: ssm_music
 * @version: 1.0
 */

@Service
public class SheetServiceImpl implements SheetService {

    private final SheetMapper sheetMapper;

    @Autowired
    public SheetServiceImpl(SheetMapper sheetMapper) {
        this.sheetMapper = sheetMapper;
    }

    @Override
    public List<Sheet> findAll() {
        return sheetMapper.findAll();
    }

    @Override
    public void addSheet(String sheetName) {
        sheetMapper.addSheet(sheetName);
    }
}
