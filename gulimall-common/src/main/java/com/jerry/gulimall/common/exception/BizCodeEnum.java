package com.jerry.gulimall.common.exception;

/**
 * @author liuzemin
 * @date 2020/12/28 13:12
 * @description
 * 错误码列表
 *  10：通用
 *      001：参数格式校验
 *      002：短信验证码频率太高
 *  11：商品
 *  12：订单
 *  13：购物车
 *  14：物流
 *  15：用户
 *  21: 库存
 */
public enum BizCodeEnum {
    UNKNOW_EXCEPTION(10000, "系统出现未知异常"),
    VALID_EXCEPTION(10001, "参数格式校验失败"),
    SMS_CODE_EXCEPTION(10002, "验证码获取频率太高，请稍后再试"),
    PRODUCT_UP_EXCEPTION(11000,"商品上架异常"),
    USER_EXIST_EXCEPTION(15001,"用户存在异常"),
    PHONE_EXIST_EXCEPTION(15002,"电话存在异常"),
    NO_STOCK_EXCEPTION(21000,"商品库存不足"),
    LOGINACCT_PASSWORD_INVAILD_EXCEPTION(15003,"账号密码错误");


    private int code;
    private String message;

    BizCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
