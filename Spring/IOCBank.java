<?xml version="1.0" encoding="UTF-8" ?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <!--    A pojo class is called as a bean-->
    <bean id="ICICI" class="org.example.ICICI"/>
    <bean id="HDFC" class="org.example.HDFC" />
<!--    <bean id="THClient" class="org.example.THClient">-->
<!--    <property name="bank" ref="ICICI"/>-->
<!--    <property name="bank" ref="HDFC"/>-->

<!--    </bean>-->

    <bean id="client1" class="org.example.THClient" scope="prototype" autowire="no">
        <constructor-arg ref="ICICI"/>

    </bean>

    <bean id="client2" class="org.example.THClient" scope="prototype" autowire="no">
        <constructor-arg ref="HDFC"/>

    </bean>
</beans>

//java

package org.example;

public interface Bank {
    double getBalance(long accId);
    double withdraw(long accId, double amount);
    double deposit(long accId, double amount);
}

//hdfc
package org.example;

import java.util.Random;

public class HDFC implements Bank {
    @Override
    public double getBalance(long accId) {
        System.out.println("HDFC");
        return new Random().nextInt(1000)+1000;
    }

    @Override
    public double withdraw(long accId, double amount) {
        System.out.println("HDFC:withdraw");
        return new Random().nextInt(1000)+1000;

    }

    @Override
    public double deposit(long accId, double amount) {
        System.out.println("HDFC:deposit");
        return new Random().nextInt(1000)+1000;
    }
}


//icici

package org.example;

import java.util.Random;

public class ICICI implements Bank {
    @Override
    public double getBalance(long accId) {
        System.out.println("ICICI");
        return new Random().nextInt(1000)+1000;
    }

    @Override
    public double withdraw(long accId, double amount) {
        System.out.println("ICICI:withdraw");
        return new Random().nextInt(1000)+1000;

    }

    @Override
    public double deposit(long accId, double amount) {
        System.out.println("ICICI:deposit");
        return new Random().nextInt(1000)+1000;
    }
}


//thbs client
package org.example;

public class THClient {
    Bank bank;
    //for Constructor injection


    public THClient(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance(long accId){
        System.out.println("In THBS client module: GetBalance");
        return bank.getBalance(accId);
    }

    double withdraw(long accId, double amount){
        System.out.println("In THBS client module: withdraw");
        return bank.withdraw(accId,amount);

    }

    double deposit(long accId, double amount){
        System.out.println("In THBS client module: deposit");
        return bank.deposit(accId,amount);


    }


}


//main
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("" +
                "file:src/main/java/beans.xml");
        THClient thClient1 = (THClient) context.getBean("client1");

        System.out.println("ICICI");
        System.out.println(thClient1.getBalance(123));
        System.out.println(thClient1.withdraw(123,1000));
        System.out.println( thClient1.deposit(123,1000));


        THClient thClient11 = (THClient) context.getBean("client1");
        System.out.println("ICICI");
        System.out.println(thClient11.getBalance(123));
        System.out.println(thClient11.withdraw(123,1000));
        System.out.println( thClient11.deposit(123,1000));


        THClient thClient22 = (THClient) context.getBean("client2");

        System.out.println("HDFC");
        System.out.println(thClient22.getBalance(123));
        System.out.println(thClient22.withdraw(123,1000));
        System.out.println( thClient22.deposit(123,2000));


        THClient thClient2 = (THClient) context.getBean("client2");

        System.out.println("HDFC");
        System.out.println(thClient2.getBalance(123));
        System.out.println(thClient2.withdraw(123,1000));
        System.out.println( thClient2.deposit(123,2000));




    }
}
