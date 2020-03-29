package org.smart4j.chapter1.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author laowang
 * @date 2020/3/29 15:38
 * @Description:
 */
public class ClassUtilTest {

    ClassUtil classUtil;

    @Before
    public void init() {
        classUtil = new ClassUtil();
    }

    @Test
    public void testFileList() {
        classUtil.addClass(null,"/Users/meng/Documents/我的GitHub/javaWeb/chapter1/src/main/java/org/smart4j/chapter1","");
    }


}