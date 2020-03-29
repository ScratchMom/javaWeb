package org.smart4j.chapter1.help;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author laowang
 * @date 2020/3/29 18:40
 * @Description:
 */
public class ClassHelperTest {

    private ClassHelper classHelper;

    @Before
    public void init() {
        classHelper = new ClassHelper();
    }

    @Test
    public void test1(){
        System.out.println(123);
    }

}