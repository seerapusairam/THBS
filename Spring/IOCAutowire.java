//beans.xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"

       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

       xsi:schemaLocation="http://www.springframework.org/schema/beans

       http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <bean id="add" class="org.example.Address"/>
    <bean id="account" class="org.example.Account"/>
    <bean id="customer" class="org.example.Customer" scope="prototype" autowire="constructor">
<!--        <property name="add" ref="add"/>-->
<!--        <property name="account" ref="account"/>-->

<!--        <constructor-arg ref="add"/>-->
<!--        <constructor-arg ref="account"/>-->
    </bean>
</beans>

//account
package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    private String accId;
    private String accName;

}

//address
package org.example;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Address {
    private int doorNo;
    private String street;
    private String city;
    private String state;
    private int pin;

}

//customer
package org.example;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private int cusId;
    private String cusName;
    private Address add;
    private Account account;

    public Customer(Address address,Account account) {
        this.add = address;
        this.account=account;
    }

}

//App
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/org/example/beans.xml");
        Customer customer=(Customer)context.getBean("customer");
        customer.setCusId(101);
        customer.setCusName("sairam");

        Address address=(Address)customer.getAdd();
        address.setDoorNo(21);
        address.setPin(533104);
        address.setCity("Rjy");
        address.setState("AP");
        address.setStreet("5th street");

        Account ac=(Account)customer.getAccount();
        ac.setAccId("121");
        ac.setAccName("Saving");

        System.out.println(customer);

        ClassPathXmlApplicationContext cpc = (ClassPathXmlApplicationContext) context;
        cpc.close();


    }
}
