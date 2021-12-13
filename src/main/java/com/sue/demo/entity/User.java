package com.sue.demo.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User {
    @NotBlank(message = "姓名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6, max = 16, message = "密码长度为6-16位")
    private String password;
    //支持使用正则表达式的校验
    @Pattern(regexp = "0?(13|14|15|17|18|19)[0-9]{9}", message = "手机号格式不正确")
    private String phone;
    // 嵌套必须加 @Valid，否则嵌套中的验证不生效
    @Valid
    @NotNull(message = "userInfo不能为空")
    private UserInfo userInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
