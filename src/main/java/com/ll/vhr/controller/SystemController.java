package com.ll.vhr.controller;

import com.ll.vhr.model.Menu;
import com.ll.vhr.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by a handsome man
 *
 * @Author: mental_test
 * @Date: 2023/02/13/21:55
 * @Description:
 */
@RestController
@RequestMapping("/system/config")
public class SystemController {

    @Resource
    MenuService menuService;

    /**
     * 前端的数据是不可信的
     */
    @GetMapping("/menu")
    public List<Menu> getMenuByHrId() {
        return menuService.getMenuByHrId();
    }
}
