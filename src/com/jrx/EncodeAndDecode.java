package com.jrx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * 在java8之前我们需要用base64时需要引用apache的commons包或第三方jar包来实现，
 * 现在内置了api更加的方便
 */
public class EncodeAndDecode {
    public  static  void  main (String[] args){

        String password = "123456";
         //加密 已编码的字节序列getEncoder  encodeToString 是BASE64做转码功能
        String encoded = Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
        //解密
        String decoded = new String(Base64.getDecoder().decode( encoded ),StandardCharsets.UTF_8 );
        System.out.println(encoded);
        System.out.println(decoded);

    }
}
