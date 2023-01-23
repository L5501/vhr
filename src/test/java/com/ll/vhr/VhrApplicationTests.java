package com.ll.vhr;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class VhrApplicationTests {

    // 加密yml信息
    @Resource
    StringEncryptor encryptor;

    @Test
    void contextLoads() {
        // 对铭感信息加密
        String url = encryptor.encrypt("jdbc:mysql://121.43.39.67:3306/vhr?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowMultiQueries=true&rewriteBatchedStatements=true&userSSL=false&allowLoadLocalInfile=true&allowUrlInLocalInfile=true");
        String username = encryptor.encrypt("root");
//        String password = encryptor.encrypt("121.43.39.67:9200");
        String password = encryptor.encrypt("hunter5501");
        System.out.println("链接地址-->"+url);
        System.out.println("用户名-->"+username);
        System.out.println("密码-->"+password);
    }

}
