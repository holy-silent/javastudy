package com.mystudy.inter;

/**
 * 业务场景主类
 * Created by vanpersie on 2017/8/1.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 父类引用指向子类对象
         * 要理解Java提供的接口机制带来的灵活性和可扩展性
         */
        Shape s1 = new Circle();
        s1.draw();

        s1 = new Square();
        s1.draw();

        Main m = new Main();
        m.draw(new Circle());
        m.draw(new Square());
    }

    /**
     * 对于该方法，只要我传入Shape的某个实现类，就会得到该实现类所反馈的内容。
     * 举个例子：假如原先我们用数据库存储数据，而现在要用文件存储，为不影响核心业务处理代码，
     * 那么我们只需要多追加一个文件存储的类即可，
     * 当然要实现共同的存储接口，请看Store类
     * @param s
     */
    public void draw(Shape s) {
        s.draw();
    }
}
