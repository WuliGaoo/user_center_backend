package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author WuliGao
 */
@Data //才能使用get，set方法
// 序列化后返回Json格式
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 7851750037521868036L;
    private String userAccount;
    private String userPassword;
}
