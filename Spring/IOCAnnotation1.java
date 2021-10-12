//address
package org.example;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
    private int doorNo;
    private String street;
    private String city;
    private String state;
    private int pin;

    public Address(){
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
//App
package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("org.example");
        context.refresh();

        Customer customer=(Customer) context.getBean("customer");
        customer.setCusId(120);
        customer.setCusName("sairam");

        Address  address=(Address) context.getBean("address");
        address.setDoorNo(121);
        address.setStreet("dm street");
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setPin(533104);

        System.out.println(customer);

    }
}
//customer
package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
    private int cusId;
    private String cusName;
    private Address add;

    public Customer(){
    }

    @Autowired
    public Customer(Address address) {
        this.add = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", cusName='" + cusName + '\'' +
                ", add=" + add +
                '}';
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public int getCusId() {
        return cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public Address getAdd() {
        return add;
    }
}
