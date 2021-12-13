package com.sue.demo.entity;

import com.sue.demo.validator.IdentityCardNumber;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserInfo {
    @NotNull(message = "用户id不能为空")
    private Integer id;
    @NotBlank(message = "年龄不为空")
    @Max(value = 18, message = "不能超过18岁")
    private String age;
    @NotBlank(message = "性别不能为空")
    private String gender;
//    @NotBlank(message = "身份证号不能为空")
//    @IdentityCardNumber(message = "身份证信息有误,请核对后提交")
//    private String clientCardNo;
}
