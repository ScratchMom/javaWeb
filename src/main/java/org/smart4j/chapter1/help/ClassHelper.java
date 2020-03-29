package org.smart4j.chapter1.help;

import lombok.extern.slf4j.Slf4j;
import org.smart4j.chapter1.util.ClassUtil;

import java.util.Set;

/**
 * @author laowang
 * @date 2020/3/29 17:55
 * @Description: 类操作助手
 */
@Slf4j
public class ClassHelper {
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        log.info(">>> ClassHelper basePackage=[{}]", basePackage);
        CLASS_SET = ClassUtil.getClassSet(basePackage);
        CLASS_SET.stream().forEach(x->{
            log.info("*****" + x.getSimpleName());
        });
    }
}
