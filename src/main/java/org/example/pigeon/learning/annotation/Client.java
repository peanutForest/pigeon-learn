package org.example.pigeon.learning.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/annotation/invoker.xml"});
        context.start();

        AnnotationTestService annotationTestService = (AnnotationTestService) context.getBean("annotationTestService");
        String annoHello = annotationTestService.testAnnoEcho("world");
        System.out.println(annoHello);
	}
}
