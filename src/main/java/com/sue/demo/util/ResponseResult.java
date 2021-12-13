package com.sue.demo.util;

import com.sue.demo.enums.ResultEnum;
import lombok.Data;

@Data
public class ResponseResult {
    private Integer code;
    private String msg;

    public ResponseResult() {
    }

    public ResponseResult(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }

    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult( String msg) {
        this.code = 200;
        this.msg = msg;
    }
}