//-----------Reading a file------------------
package com.thbs.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\user119\\Desktop", "THBS.txt");

        try (FileReader f = new FileReader(file1);
             BufferedReader bf = new BufferedReader(f);)
        {
           /* String st;
            st= bf.readLine();
            while(!st.equals("END")){
                System.out.println(st);
                st=bf.readLine();
            }*/
            String st;
            while((st= bf.readLine())!=null){
                System.out.println(st);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
Output:
good mrng
gud aftnoon
gud evening
gud ni8
END
-----------
good mrng
gud aftnoon
gud evening
gud ni8
//---------------JUnitSuitdemo--------------------
msg.java
public class Msg {
    private String ms;

    public Msg(String ms) {
        this.ms = ms;
    }
    public String printms(){
        System.out.println(ms);
        return ms;
    }
    public String Smessage(){
        ms="Hello"+ms;
        System.out.println(ms);
        return ms;
    }
}
Test1.java
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Test1 {

    String ms = "Sairam";

    Msg mob = new Msg(ms);
    @Test
    public void Test(){
        System.out.println("Inside");
        assertEquals(ms,mob.printms());
    }
}
Test2
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Test2 {

    String ms = "Sairam";

    Msg mob = new Msg(ms);
    @Test
    public void Test(){
        System.out.println("Inside Test2");
        ms="Hello"+ms;
        assertEquals(ms,mob.Smessage());
    }
Output:
Inside
Sairam
Inside Test2
HelloSairam
//------------------Generic with Bounds---------------------
package tpack;

import java.util.List;

public class Test {
    //upper bounds
    public static Number sumOfList(List<? extends Number> nlist){
        double s=0.0;
        for(Number n:nlist){
            s+=n.doubleValue();
        }
        return s;
    }
    //lower bound
    public static Number sumOfList1(List<? super Double> llist){
        double s=0.0;
        for(Object n:llist){
            s+=((Number)n).doubleValue();
        }
        return s;
    }
    //unbound
    public static Number sumOfList2(List<?> list){
        double s=0.0;
        for(Object n:list){
            s+=((Number)n).doubleValue();
        }
        return s;
    }

}
Main.java
package com.thbs.mainpack;

import tpack.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //upper bound
        ArrayList<Integer> ilist=new ArrayList<Integer>();
        ilist.add(10);
        ilist.add(10);
        ilist.add(10);
        ilist.add(10);
        ilist.add(10);
        ilist.add(10);

        System.out.println(Test.sumOfList(ilist));
        //lower bound
        ArrayList<Object> dlist=new ArrayList<Object>();
        dlist.add(10f);
        dlist.add(10f);
        dlist.add(10f);
        dlist.add(10f);
        dlist.add(10f);
        dlist.add(10f);

        System.out.println(Test.sumOfList1(dlist));

        //unbounded
        ArrayList<Object> ulist=new ArrayList<Object>();
        ulist.add(10);
        ulist.add(10);
        ulist.add(10);
        ulist.add(10);
        ulist.add(10);
        ulist.add(10);

        System.out.println(Test.sumOfList2(ulist));
    }
}
Output:
60.0
60.0
60.0
//------------------Generic---------------------
Test
package gpack;

public class Test <T,U> {

    private T ob1;
    private U ob2;

    public Test(T ob1, U ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public U getOb2() {
        return ob2;
    }

    @Override
    public String toString() {
        return "Test{" +
                "ob1=" + ob1 +
                ", ob2=" + ob2 +
                '}';
    }
}
Pro
package gpack;

public class Pro <R>{
    private R ob3;

    public Pro(R ob3) {
        this.ob3 = ob3;
    }

    public R getOb3() {
        return ob3;
    }

    @Override
    public String toString() {
        return "Pro{" +
                "ob3=" + ob3 +
                '}';
    }
}
Main
package com.thbs.mainpack;

import gpack.*;

public class Main {

    public static void main(String[] args) {

        Test<String,String> o=new Test<String,String>("hello","world");
        System.out.println(o);

        Test<Integer,String> o1=new Test<Integer,String>(1,"sairam");
        System.out.println(o1);

        Test<Integer,Pro> o2=new Test<Integer,Pro>(1,new Pro(12));
        System.out.println(o2);

    }
}
Output:
Test{ob1=hello, ob2=world}
Test{ob1=1, ob2=sairam}
Test{ob1=1, ob2=Pro{ob3=12}}
//------------------ComparableDemo-------------------
Main.java
package com.thbs.mainpack;

import spack.Students;

import java.util.*;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Students> slist = new ArrayList<Students>();
        slist.add(new Students(12, "sai", 75));
        slist.add(new Students(16, "sairam", 65));
        slist.add(new Students(19, "srinu", 80));
        slist.add(new Students(22, "vishnu", 95));


        for (Students s : slist)
            System.out.println(s);
        Collections.sort(slist);
    }
}
Students.java
package spack;

public class Students implements Comparable<Students> {
    private int id;
    private String name;
    private int marks;

    public Students(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Students s) {
        if(marks>s.marks)
            return 1;
        else
            if(marks==s.marks){
                if(id>s.id)
                    return 1;
                else
                    if(id==s.id)
                        return 0;
                    else
                        return -1;
            }
                return -1;
    }
}
Output:
Students{id=12, name='sai', marks=75}
Students{id=16, name='sairam', marks=65}
Students{id=19, name='srinu', marks=80}
Students{id=22, name='vishnu', marks=95}
//----------------------Comparator Demo---------------
Person.java
package ppack;
//lombok libs
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
NameCompartor.java
package ppack;
//lombok libs
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
AgeComparator.java
package ppack;
//lombok libs
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
Output:
[Person{id=20, name='airam', age=21}, Person{id=12, name='srinu', age=26}, Person{id=29, name='ram', age=12}, Person{id=56, name='seerapu', age=50}, Person{id=8, name='vishnu', age=9}]
[Person{id=8, name='vishnu', age=9}, Person{id=29, name='ram', age=12}, Person{id=20, name='airam', age=21}, Person{id=12, name='srinu', age=26}, Person{id=56, name='seerapu', age=50}]
[Person{id=20, name='airam', age=21}, Person{id=29, name='ram', age=12}, Person{id=56, name='seerapu', age=50}, Person{id=12, name='srinu', age=26}, Person{id=8, name='vishnu', age=9}]
