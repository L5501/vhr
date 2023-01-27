package com.ll.vhr.controller;

import com.ll.vhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mentaltest
 * 时间： 2023/1/26
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("登录失败");
    }
}
