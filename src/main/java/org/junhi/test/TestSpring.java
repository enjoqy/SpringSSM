package org.junhi.test;

import org.junhi.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhi
 * @date 2019/7/9 20:16
 */
public class TestSpring {

    @Test
    public void test01(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContent.xml");
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        AccountService as = ac.getBean("accountService", AccountService.class);
        as.findAll();
    }
}
