//App.java
package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("org.example");
        context.refresh();

        Client c1 = (Client) context.getBean("Client1");
        c1.doSomething();

        Client c2 = (Client) context.getBean("Client2");
        c1.doSomething();

    }
}
//client.java
package org.example;

public interface Client {

    void doSomething();
}
//clientA
package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ClientA")
public class ClientA implements Client{
    Service service;

    @Autowired
    public ClientA(Service service1) {
        this.service = service1;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getInfo());
    }
}
//clientB
package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ClientB")
public class ClientB implements Client{
    Service service;

    @Autowired
    public ClientB(Service service2) {
        this.service = service2;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getInfo());
    }
}
//Service
package org.example;

public interface Service {

    String getInfo();
}
//serviceA
package org.example;

import org.springframework.stereotype.Component;

//@Resoures
@Component("ServiceA")
public class ServiceA implements Service{
    @Override
    public String getInfo() {
        return "ServiceA info";
    }
}
//serviceB
package org.example;

import org.springframework.stereotype.Component;

@Component("ServiceB")
public class ServiceB implements Service{
    @Override
    public String getInfo() {
        return "ServiceB info";
    }
}
