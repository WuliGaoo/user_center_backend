package com.yupi.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void TestMD5(){
        final String SALT = "wuliGao";
        String newPassword = DigestUtils.md5DigestAsHex((SALT + "userPassword").getBytes());
        System.out.println(newPassword);
    }

}
