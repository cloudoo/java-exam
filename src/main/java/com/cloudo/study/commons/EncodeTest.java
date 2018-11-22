package com.cloudo.study.commons;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncodeTest {

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest messageDigest =  MessageDigest.getInstance("MD5");

        String test = "这只是一个测试消息";

        messageDigest.update(test.getBytes());

        byte[] bytes = messageDigest.digest();
        String msg = new String(bytes);



        //Base64 Encoded
        String encoded = Base64.getEncoder().encodeToString(bytes);

        System.out.println("原来数据："+test);
        System.out.println("md5:"+msg);
        System.out.println("encoded:"+encoded);

        System.out.println("网上方法:"+EncodeTest.bytesToHexString(bytes));

        //string转码
        String temp1 = new String(test.getBytes(),"UTF-8");

        String temp2 = URLEncoder.encode(test,"UTF-8");

        System.out.println("temp1:"+temp1);
        System.out.println("temp2:"+temp2);


    }
}
