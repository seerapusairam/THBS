//App
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
        context.register(AppConfig.class);
        context.refresh();

        Client c1=(Client) context.getBean("client1");
        c1.doSomething();

        Client c2=(Client) context.getBean("client2");
        c2.doSomething();


    }
}

//Appconfig
package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("service1")
    public Service getService1(){
        return new ServiceA();
    }

    @Bean("client1")
    public Client getClient1(Service service1){
        return new ClientA(service1);
    }

    @Bean("service2")
    public Service Service2(){
        return new ServiceB();
    }

    @Bean("client2")
    public Client getClient2(Service service2){
        return new ClientA(service2);
    }

}

//Client
package org.example;

public interface Client {

    void doSomething();
}

//clientA
package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class ClientA implements Client{
    Service service;


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

public class ClientB implements Client{
    Service service;


    public ClientB(Service service2) {
        this.service = service2;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getInfo());
    }
}

//service
package org.example;

public interface Service {

    String getInfo();
}

//sA
package org.example;

import org.springframework.stereotype.Component;


public class ServiceA implements Service{
    @Override
    public String getInfo() {
        return "ServiceA info";
    }
}

//SB
package org.example;

import org.springframework.stereotype.Component;


public class ServiceB implements Service{
    @Override
    public String getInfo() {
        return "ServiceB info";
    }
}
