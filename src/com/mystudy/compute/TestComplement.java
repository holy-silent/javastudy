package com.mystudy.compute;

/**
 * Created by vanpersie on 2017/8/2.
 */
public class TestComplement {
    public static void main(String[] args) {
        //整数在计算机中以补码形式存在
        //byte short int long: 8 16 32 64位
        int a = -10;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000>>>i)>>>(31-i);
            System.out.print(t);
        }

        System.out.println("");
        byte b = -10;//10001010
        System.out.println(b>>>3);
    }
}
