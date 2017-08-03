package com.mystudy.rhino;

import org.mozilla.javascript.*;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 脚本语言学习
 * Created by vanpersie on 2017/8/3.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        test();
        System.out.println(Main.class.getResource("/"));//得到classpath绝对路径
        System.out.println(Main.class.getResource("")); //得到当前类的绝对路径
    }

    public static void test() throws IOException{
        InputStream in = Main.class.getResourceAsStream("test1.js");
        InputStreamReader reader = new InputStreamReader(in, Charset.forName("utf-8"));
        BufferedReader bufr = new BufferedReader(reader);//缓冲
        String line = null;
        String str = "";
        while((line = bufr.readLine())!=null){
            str+=line;
        }
        Context ctx = ContextFactory.getGlobal().enterContext();
        ctx.setOptimizationLevel(9);
        Scriptable scope = new ImporterTopLevel(ctx);
        Function fun = ctx.compileFunction(scope, "function(rspData, msgCtx){"
                + System.lineSeparator() + str
                + "}", "testjs", 1, null);

        List msgCtx = new ArrayList();
        msgCtx.add("fff");
        String rspData = "hello world";

        Object obj = fun.call(ctx, scope, fun, new Object[] {rspData, msgCtx});
        System.out.println(obj);
    }
}
