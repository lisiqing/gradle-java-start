package com.leenanxi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leenanxi on 16/6/29.
 */
public class DemoTest {
    @Test
    public void sayHello() throws Exception {
        String expect = "hello";
        String result = Demo.sayHello();

        System.out.println(result);

        if (!expect.equals(result)){
            throw new Exception("hello does not work");
        }

    }

}