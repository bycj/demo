package com.anyuling.demo.baselearn.classloader;

/**
 * @description:
 * @author: xinan
 * @create: 2021-08-11 16:28
 **/
@DProcessor
public class Classloader3 implements ClassloaderInterface{
    @Override
    public void print() {
        System.out.println(this.getClass().getName());
    }
}
