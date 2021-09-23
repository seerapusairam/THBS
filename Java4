//-----------------InterfaceAbstract---------------------
Automobile.java
package com.thbs.vpack;

public interface Automobile {

    String start();
    int  increSpeed(int n);
    String stop();


}
Vehicle.java
package com.thbs.vpack;

public abstract class Vehicle implements Automobile {
    protected int regno;
    protected String model;
    protected int currSpeed;

    @Override
    public String start() {
        return "Vehicle Stated";
    }

    @Override
    public abstract int increSpeed(int n);

    @Override
    public String stop() {
        return "Vehicle Stopped";
    }

    public Vehicle(int regno, String model, int currSpeed) {
        this.regno = regno;
        this.model = model;
        this.currSpeed = currSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regno=" + regno +
                ", model='" + model + '\'' +
                ", currSpeed=" + currSpeed +
                '}';
    }
}
Car.java
package com.thbs.vpack;

public class Car extends Vehicle{

    private int maxSpeed;
    private String type;

    public Car(int regno, String model, int currSpeed, int maxSpeed, String type) {
        super(regno, model, currSpeed);
        this.maxSpeed = maxSpeed;
        this.type = type;
    }


    @Override
    public int increSpeed(int n) {
        if(currSpeed+n < maxSpeed)
            currSpeed+=n;
        else
            currSpeed=-1;
        return(currSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                ", regno=" + regno +
                ", model='" + model + '\'' +
                ", currSpeed=" + currSpeed +
                '}';
    }
}
Main.java
package com.thbs.mainpack;

import com.thbs.vpack.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car c = new Car(5600,"4 sit",45,120,"suv");
        System.out.println(c.start());
        int speed = c.increSpeed(20);
	//int speed = c.increSpeed(120);

        if(speed == -1){
            System.out.println("Alert low the speed");
        }else{
            System.out.println("Njoy your ride");
        }
        System.out.println(c.stop());
    }
}
Output:
Vehicle Stated
Njoy your ride
Vehicle Stopped
----------------
Vehicle Stated
Alert low the speed
Vehicle Stopped

//-----------------Interface------------------------------
I1.java
package com.thbs.pack1;

public interface I1 {
    void m1();
    void m2();
    void m3();
}
I2.java
package com.thbs.pack1;

public interface I2 extends I3,I4 {
    void m4();
    int count=10;
}
I3.java
package com.thbs.pack1;

public interface I3 {
    void i3m1();
    void i3m2();
}
I4.java
package com.thbs.pack1;

public interface I4 {
    void m11();
    void m22();
}
Class.java
package com.thbs.pack1;

public class Class1 implements I1,I2{
    @Override
    public void m1() {
        System.out.println("In m1");
    }

    @Override
    public void m2() {
        System.out.println("In m2");
    }

    @Override
    public void m3() {
        System.out.println("In m3");
    }

    @Override
    public void m4() {
        System.out.println("In m4");
        System.out.println("Count value "+I2.count);
    }

    @Override
    public void i3m1() {
        System.out.println("in I3m1");
    }

    @Override
    public void i3m2() {
        System.out.println("in I3m2");
    }

    @Override
    public void m11() {
        System.out.println("in m11");
    }

    @Override
    public void m22() {
        System.out.println("in m22");
    }
}
Main.java
package com.thbs.mainpack;

import com.thbs.pack1.Class1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Class1 c = new Class1();
        c.m1();
        c.m2();
        c.m4();
        c.i3m1();
        c.i3m2();
    }
}
Output:
In m1
In m2
In m4
Count value 10
in I3m1
in I3m2
//-----------------Abstract-------------------------------
Employee.java
package com.thbs.emppack;

public abstract class Employee {
    protected int empId;
    protected String empName;
    protected double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String getDetails(){
        return(empId+" "+empName+" "+salary);
    }

    public abstract double calNetsal();

    public double getSalary() {
        return salary;
    }
}
Manager.java
package com.thbs.emppack;

public class Manager extends Employee {

    protected String departName;
    protected int empcount;

    public Manager(int empId, String empName, double salary, String departName, int empcount) {
        super(empId, empName, salary);
        this.departName = departName;
        this.empcount = empcount;
    }

    /*public  String getDetails(){
        return(super.getDetails()+" "+departName+" "+empcount);
    }*/

    @Override
    public String toString() {
        return "Manager{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", departName='" + departName + '\'' +
                ", empcount=" + empcount + "Net Salary = " +calNetsal()+
                '}';
    }

    @Override
    public double calNetsal() {
        return 15000;
    }

    public String getDepartName() {
        return departName;
    }

    public int getEmpcount() {
        return empcount;
    }
}

Programmer.java
package com.thbs.emppack;

public class Programmer extends Employee {
    protected int noOfProject;
    protected String skill;

    public Programmer(int empId, String empName, double salary, int noOfProject, String skill) {
        super(empId, empName, salary);
        this.noOfProject = noOfProject;
        this.skill = skill;
    }

    /*public String getDetails() {
        return (super.getDetails() + " " + noOfProject + " " + skill);
    }*/

    @Override
    public String toString() {
        return "Programmer{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", noOfProject=" + noOfProject +
                ", skill='" + skill + '\''+
                '}';
    }

    @Override
    public double calNetsal() {
        return 25000;
    }

    public int getNoOfProject() {
        return noOfProject;
    }

    public String getSkill() {
        return skill;
    }
}

Main.java
package com.thbs.mainpack;

import com.thbs.emppack.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager m=new Manager(102,"Sam",50000,"HR",5);
        System.out.println(m);

        Programmer p=new Programmer(102,"Vishnu",60000,6,"Java,HTML");
        System.out.println(p+" Net salary = "+p.calNetsal());

    }
}
Output:
Manager{empId=102, empName='Sam', salary=50000.0, departName='HR', empcount=5Net Salary = 15000.0}
Programmer{empId=102, empName='Vishnu', salary=60000.0, noOfProject=6, skill='Java,HTML'} Net salary = 25000.0

//----------------Inheritance-----------------------------
Employee.java
package com.thbs.employee;

public class Employee {
    protected int empId;
    protected String empName;
    protected double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String getDetails(){
        return(empId+" "+empName+" "+salary);
    }

    public double getSalary() {
        return salary;
    }
}

Manager.java
package com.thbs.employee;

public class Manager extends Employee {

    protected String departName;
    protected int empcount;

    public Manager(int empId, String empName, double salary, String departName, int empcount) {
        super(empId, empName, salary);
        this.departName = departName;
        this.empcount = empcount;
    }

    public  String getDetails(){
        return(super.getDetails()+" "+departName+" "+empcount);
    }

    public String getDepartName() {
        return departName;
    }

    public int getEmpcount() {
        return empcount;
    }
}

Programmer.java
package com.thbs.employee;

public class Programmer extends Employee {
    protected int noOfProject;
    protected String skill;

    public Programmer(int empId, String empName, double salary, int noOfProject, String skill) {
        super(empId, empName, salary);
        this.noOfProject = noOfProject;
        this.skill = skill;
    }

    public String getDetails() {
        return (super.getDetails() + " " + noOfProject + " " + skill);
    }

    public int getNoOfProject() {
        return noOfProject;
    }

    public String getSkill() {
        return skill;
    }
}

Tax.java
package com.thbs.tax;

import com.thbs.employee.Employee;
import com.thbs.employee.Manager;
import com.thbs.employee.Programmer;

public class Tax {
    public static double cal_tax(Employee e){
        if(e instanceof Manager)
            return(e.getSalary()*0.25);
        else
            if(e instanceof Programmer)
                return(e.getSalary()*0.1);
                else
                    return 0;
    }
}

Main.java
package com.thbs.mainpack;

import com.thbs.employee.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e =new Employee(101,"Sairam",25000);
        System.out.println(e.getEmpdetail());

        Manager m=new Manager(102,"Sam",50000,"HR",5);
        System.out.println(m.getDetails());

        Programmer p=new Programmer(102,"Vishnu",60000,6,"Java,HTML");
        System.out.println(p.getDetails());

    //dynamic polymorphism
        Employee s = new Manager(121, "sa", 123, "dr", 6);
        System.out.println(s.getDetails());
        //downcasting
        Manager m2 = (Manager)s;
        System.out.println(m2.getDepartName());

        Employee[] emp = new Employee[4];
        emp[0] = new Employee(121, "ram", 5400);
        emp[1] = new Manager(234, "Jack", 4500, "IT", 6);
        emp[2] = new Programmer(123, "son", 5467, 6, "java");
        emp[3] = new Programmer(123, "sony", 5067, 8, "java");

        for (Employee e1 : emp) {
            System.out.println(e1.getDetails() + "tax :" + Tax.cal_tax(e1));
        }


    }
}

Output:
101 Sairam 25000.0
102 Sam 50000.0 HR 5
102 Vishnu 60000.0 6 Java,HTML
121 sa 123.0 dr 6
dr
121 ram 5400.0tax :0.0
234 Jack 4500.0 IT 6tax :1125.0
123 son 5467.0 6 javatax :546.7
123 sony 5067.0 8 javatax :506.70000000000005
//----------------Bank static function---------------------
Account.java
package com.thbs.account;

import java.util.Random;

public class Account {

    private static long count;
    private final long accNo;
    private String  accType;
    private double bal;

    static{
        count=0;
    }

    public static long getCount() {
        //return ++count;
        Random r = new Random();
        count = r.nextInt(1000)+2000;
        return count;
    }

    public Account(String accType, double bal) {
        this.accNo = getCount();
        this.accType = accType;
        this.bal = bal;
    }

    public double deposit(int amt){
        bal+=amt;
        return amt;
    }

    public double withdraw(int amt){
        bal-=amt;
        return amt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", bal=" + bal +
                '}';
    }
}
Main.java
package com.thbs.bankpack;

import com.thbs.account.Account;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account a =new Account("Savings",25000);
        System.out.println(a);
        System.out.println(a.deposit(5000));
        System.out.println(a);
        System.out.println(a.withdraw(2000));
        System.out.println(a);
        System.out.println("-------------------------------");
        Account a1 =new Account("Savings",80000);
        System.out.println(a1);

    }
}
Output:
Account{accNo=2986, accType='Savings', bal=25000.0}
5000.0
Account{accNo=2986, accType='Savings', bal=30000.0}
2000.0
Account{accNo=2986, accType='Savings', bal=28000.0}
-------------------------------
Account{accNo=2390, accType='Savings', bal=80000.0}
