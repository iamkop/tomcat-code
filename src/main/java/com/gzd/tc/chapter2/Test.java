package com.gzd.tc.chapter2;

/**
 * @author gzd
 * @date 2018/1/5 9:47
 * @desc input the desc
 */
public class Test {

    private void myprint(int i) {
        System.out.println(i);
    }

    public void test() {
        int m = 100;
        for (int i = 2; i < Math.sqrt(m); i++) {
            for (int j = 2 * i; j < m; j += i) {
                myprint(j);
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        long l = System.currentTimeMillis();
        System.out.println(l);
        test.test();
        long e = System.currentTimeMillis();
        System.out.println(e-l);

    }

}
