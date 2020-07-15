package com.naruto.web.controller;

import com.naruto.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author quandaoran3
 * @date 2020-07-15 16:51
 */
@RestController
public class DemoController {

    private final DemoDao demoDao;

    public DemoController(DemoDao demoDao) {
        this.demoDao = demoDao;
    }


    @GetMapping("demo")
    public String getDemo(String param) {
        return demoDao.getDemo(param);
    }
}
