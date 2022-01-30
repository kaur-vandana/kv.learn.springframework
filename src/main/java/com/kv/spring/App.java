package com.kv.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /*
        BeanFactory is an interface which is implemented by XmlBeanFactory class
        https://mvnrepository.com/artifact/org.springframework/spring-context
        */

        /*
        org.springframework.beans.factory.BeanDefinitionStoreException :
         IOException parsing XML document from file [C:\Users\csc\eclipse-workspace\kv.learn.springframework];
         nested exception is java.nio.file.AccessDeniedException:
        */
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        BeanSeva beanSevaSingleton = (BeanSeva) factory.getBean("beanSeva");
//        beanSevaSingleton.iAmBeanSeva();

//        instead of using BeanFactory directly, we now use ApplicationContext
//        move "spring.xml" under src folder
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        even if you don't instantiate the BeanSeva, object will be created by the Spring
//        Spring creates bean for the every class that you mention in the "spring.xml"
//        inside JVM, we have a container which will contain the spring beans
        BeanSeva beanSevaSingleton = (BeanSeva) context.getBean("beanSevaSingleton");
        beanSevaSingleton.setBeanInt(15);
        beanSevaSingleton.printInt();

        System.out.println("------------------------------Singleton design Pattern-----------------------------------");
//        Singleton design Pattern
    /*
      to check if the beanSeva is singleton
        even if we are instantiating two objects beanSevaSingleton and beanSevaSingleton2,
        both are pointing to the same reference
    */
        BeanSeva beanSevaSingleton2 = (BeanSeva) context.getBean("beanSevaSingleton");
        beanSevaSingleton2.printInt();

        BeanSeva beanSevaSingleton3 = (BeanSeva) context.getBean("beanSevaSingleton");
        beanSevaSingleton3.printInt();


        System.out.println("----------------------------Prototype design Pattern-------------------------------------");

//       Prototype design Pattern
        BeanSeva beanSevaPrototype = (BeanSeva) context.getBean("beanSevaPrototype");
        beanSevaPrototype.setBeanInt(55555);
        beanSevaPrototype.printInt();

//        new object is created
        BeanSeva beanSevaPrototype1 = (BeanSeva) context.getBean("beanSevaPrototype");
        beanSevaPrototype1.printInt();


        System.out.println("-----------------Setter Injection--------------setting deafult value for variable---------");
        BeanSeva beanSevaSetProperty = (BeanSeva) context.getBean("beanSevaSetProperty");
        beanSevaSetProperty.printInt();

        System.out.println("---------------Setter Injection-------------------Reference Attribute--------------------");
        BeanSeva beanSevaRefAttribute = (BeanSeva) context.getBean("beanSevaSetProperty2");
        beanSevaSetProperty.printInt();
        beanSevaRefAttribute.printAttributeMethod();


        System.out.println("--------Constructor Injection-------setting deafult value for variable-------------------");
        BeanSeva beanSevaConstructorInjection = (BeanSeva) context.getBean("beanSevaConstructorInjection");
        beanSevaConstructorInjection.printInt();

        System.out.println("----------Constructor Injection----------Reference Attribute-----------------------------");
        BeanSeva beanSevaConstructorInjectionRef = (BeanSeva) context.getBean("beanSevaConstructorInjectionRef");
        beanSevaConstructorInjectionRef.printAttributeMethod();

        System.out.println("----------Autowire------------------------------------------------------------------------");
        AutowireSeva autowireSeva = (AutowireSeva) context.getBean("autowireSevaLaptopBean");
        autowireSeva.printMethod();

        AutowireSeva autowireSeva1 = (AutowireSeva) context.getBean("autowireSevaDestopBean");
        autowireSeva1.printMethod();

        AutowireSeva autowireSeva2 = (AutowireSeva) context.getBean("autowireSevaBean");
        autowireSeva2.printMethod();

        AutowireSeva autowireSeva3 = (AutowireSeva) context.getBean("autowireSevaBeanByType");
        autowireSeva3.printMethod();
    }
}