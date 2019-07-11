package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import pojo.Test;

public class Client {

    public static void main(String args[]){

        //find xml
        Resource resource = new ClassPathResource("resources/Spring.xml");

        //load xml into container
        BeanFactory beanfactory = new XmlBeanFactory(resource);

        //instantiate Test class object
        Object obj1 = beanfactory.getBean("t");
        Object obj2 = beanfactory.getBean("t");
        Object obj3 = beanfactory.getBean("t");

        System.out.println(obj1 == obj2);
        System.out.println(obj2 == obj3);
        Test testObj = (Test)obj1;
        testObj.hello();

    }

}
