//-----------------Static variable ------------------------------
package com.thbs.mainpack;

import com.thbs.spack.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p1 = new Person(100,"SAM");
        System.out.println(p1);
        System.out.println("No of objects :"+Person.getCount());

        Person p2 = new Person(101,"LISA");
        System.out.println(p2);
        System.out.println("No of objects :"+Person.getCount());
    }
}
Person.java
package com.thbs.spack;

public class Person {

    private static int count;
    private int pid;
    private String pname;

    static{//to intilize value to static var
        count=0;
    }

    public Person(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
        count++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public static int getCount() {
        return count;
    }
}
Output:
Person{pid=100, pname='SAM'}
No of objects :1
Person{pid=101, pname='LISA'}
No of objects :2

//-----------------fucn overloading generic fucntion(...)---------
Avg.java
package com.thbs.utility;

public class Avg {

    public double cal_avg(int ... numbers){
        int sum=0;
        for(int n : numbers){
            sum+=n;
        }
        return(sum/numbers.length);
    }

    public double cal_avg(double l,int ... numbers){
        double sum=l;
        for(int n : numbers){
            sum+=n;
        }
        return(sum/numbers.length+1);
    }

    public double cal_avg(int a,double l,double ... numbers){
        double sum=l+a;
        for(double n : numbers){
            sum+=n;
        }
        return(sum/numbers.length+2);
    }
}
main.java
package com.thbs.mainpack;

import com.thbs.utility.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Avg a = new Avg();
        System.out.println("Average is " +a.cal_avg(23,56,12,19));
        System.out.println("Average 2 para " +a.cal_avg(12.3,12,34,56));
        System.out.println("Average 3 para " +a.cal_avg(2,12.7,11.3,45.3,65.2));
    }
}
Output:
Average is 27.0
Average 2 para 39.1
Average 3 para 47.5
//--------------------Function Overloading(add and tax)-------------------
Summation.java
package com.thbs.utility;

public class Summation {

    public int add(int x,int y){
        return (x+y);
    }

    public double add(int x,float y,double z){
        return (x+y+z);
    }

    public String add(String a,String b){
        return(a+b);
    }
}

tax.java
package com.thbs.utility;

public class tax {

    public double cal_tax(long amt,char status){
        return (amt*0.1);
    }

    public int cal_tax(long amt){
        return ((int)(amt*0.25));
    }
}

main.java
package com.thbs.mainpack;

import com.thbs.utility.Summation;

public class Main {

    public static void main(String[] args) {

        Summation sc = new Summation();
        System.out.println(sc.add(10,45));
        System.out.println(sc.add(10,4.5F,12.0));
        System.out.println(sc.add("sairam"," seerapu"));

	tax t =new tax();
        System.out.println("Tax calculation for consultant :"+t.cal_tax(20000,'c'));
        System.out.println("Tax calculation for employee :"+t.cal_tax(20000));
    }
}
Output:
55
26.5
sairam seerapu
Tax calculation for consultant :2000.0
Tax calculation for employee :5000
//--------------------Constractor Overloading-----------------
Circle.java
package com.thbs.circle;

public class Circle {
    private double radius;
    private String colour;
    //non parameter
    public Circle() {
       /* this.radius = 6.2;
        this.colour = "Red";*/
        this(6.2,"red");//invoking comple parameter con

    }

    public Circle(double radius) {
        this(radius,"blue");
    }

    public Circle(String colour) {
        this(8.8,colour);
    }

    //complete parameter
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}
Main.java(canvers)
package com.thbs.canvas;

import com.thbs.circle.Circle;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(6.5,"Black");
        System.out.println(c2);

        Circle c3 = new Circle(6.8);
        System.out.println(c3);

        Circle c4 = new Circle("Pink");
        System.out.println(c4);


    }
}
Output:
Circle{radius=6.2, colour='red'}
Circle{radius=6.5, colour='Black'}
Circle{radius=6.8, colour='blue'}
Circle{radius=8.8, colour='Pink'}

//---------------------------Dice game------------------------
Player.java
package com.thbs.player;

public class Player {

    private Dice d1;
    private Dice d2;

    public Player() {
        d1 = new Dice();
        d2 = new Dice();
    }

    public int play(){
        return (d1.roll()+d2.roll());
    }

    public int getd1(){
        return (d1.getfvalue());
    }

    public int getd2(){
        return (d2.getfvalue());
    }
}

Dice.java
package com.thbs.player;

import java.util.Random;

public class Dice {

    private int fvalue;

    public int roll(){
            Random r = new Random();
        fvalue = ((int)r.nextInt(5)+1);
        return fvalue;
    }

    public int getfvalue(){
        return fvalue;
    }
}

main.java
package com.thbs.studium;

import com.thbs.player.*;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player();
        int p1score = p1.play();
        int p1d1score = p1.getd1();
        int p1d2score = p1.getd2();

        System.out.println("P1 Score : "+p1score);
        System.out.println("P1 D1 :"+p1d1score+" P1 D2 : "+p1d2score);

        Player p2 = new Player();
        int p2score = p2.play();
        int p2d1score = p2.getd1();
        int p2d2score = p2.getd2();

        System.out.println("P2 Score : "+p2score);
        System.out.println("P2 D1 :"+p2d1score+" P2 D2 : "+p2d2score);

        if (p1score>p2score)
            System.out.println("P1 won the game!!!");
        else
        if (p1score==p2score)
            System.out.println(" Game Draw !!!! ");
        else
            System.out.println(("P2 won the game!!!!"));
    }
}
Output:
P1 Score : 7
P1 D1 :5 P1 D2 : 2
P2 Score : 5
P2 D1 :1 P2 D2 : 4
P1 won the game!!!
--------------------
P1 Score : 6
P1 D1 :5 P1 D2 : 1
P2 Score : 7
P2 D1 :4 P2 D2 : 3
P2 won the game!!!!
--------------------
P1 Score : 6
P1 D1 :2 P1 D2 : 4
P2 Score : 6
P2 D1 :1 P2 D2 : 5
 Game Draw !!!! 
//---------------------------HAS-A----------------------------
Main.java

package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address ad = new Address(21-1-2,"5th Street","RJY","AP",533104);
        Person p = new Person(101,"sairam",ad);
        System.out.println(p);
    }
}

Address.java

package com.thbs;

public class Address {
    private int door_no;
    private String street;
    private String city;
    private String state;
    private int pincode;

    public Address(int door_no, String street, String city, String state, int pincode) {
        this.door_no = door_no;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "door_no=" + door_no +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}

Person.java

package com.thbs;

public class Person {
    private int person_id;
    private String personName;
    private Address addr;

    public Person(int person_id, String personName, Address addr) {
        this.person_id = person_id;
        this.personName = personName;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", personName='" + personName + '\'' +
                ", addr=" + addr +
                '}';
    }
}

Output:
Person{person_id=101, personName='sairam', addr=Address{door_no=18, street='5th Street', city='RJY', state='AP', pincode=533104}}
