package com.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.api.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
         context.start();
         DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
         String hello = demoService.testDubbo("ygy"); // 执行远程方法
         System.out.println( hello ); // 显示调用结果
     }
}
