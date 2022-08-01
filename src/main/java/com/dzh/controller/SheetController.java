package com.dzh.controller;

import com.dzh.entity.Sheet;
import com.dzh.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Hello Baby
 * @Date: 2022/8/1
 * @Descriptin: ssm_music
 * @version: 1.0
 */
@RestController
@RequestMapping("sheet")
public class SheetController {
    private final SheetService sheetService;

    @Autowired
    public SheetController(SheetService sheetService) {
        this.sheetService = sheetService;
    }

    @RequestMapping("findAll")
    public List<Sheet> findAll() {
        return sheetService.findAll();
    }

    @RequestMapping("addSheet")
    public void addSheet(String sheetName) {
        sheetService.addSheet(sheetName);
    }
}
