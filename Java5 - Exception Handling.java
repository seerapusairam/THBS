//------------Wapper class & boxing and unboxing----------------
package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //boxing
        int i=10;
        Integer w=new Integer(i);
        System.out.println(w);
        //unboxing
        int i1=w.intValue();
        System.out.println(i1);
        //autoboxing
        Integer a=120;
        System.out.println(a);
        int i2=a.intValue();

        String s1="123";
        int s=Integer.parseInt(s1);
        int s2=Integer.valueOf(s1).intValue();
        System.out.println(s);
        System.out.println(s2);
    }
}
Output:
10
10
120
123
123
//------------Custom exception----------------------------------
InvalidAgeException
package InvalidAgeException;

public class InvalidAgeException extends Exception{
    private String msg;

    public InvalidAgeException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
Citizen.java
package com.thbs.mainpack.cpack;

import InvalidAgeException.InvalidAgeException;

public class citizen {
    private int aadharNo;
    private String name;
    private int age;

    public String licence() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You age is "+age+" licence cannot be issued");
        } else if ((age <= 75) && (age > 18)) {
            return ("Congarts licence issued");
        } else {
            throw new InvalidAgeException("Your age is "+age+" licence cannot be issued");
        }
    }

    public citizen(int aadharNo, String name, int age) {
        this.aadharNo = aadharNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "citizen{" +
                "aadharNo=" + aadharNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
Main.java
package com.thbs.mainpack;

import InvalidAgeException.InvalidAgeException;
import com.thbs.mainpack.cpack.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        citizen c =new citizen(1234,"Sairam",90);
        try {
            System.out.println(c.licence());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
Output:
Your age is 90 licence cannot be issued
//------------Io EXCEPTION with return and parent exception-----
package com.thbs.exceptpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readinput {

    public static String readinput1() {

        try (InputStreamReader ir = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(ir);) {
            System.out.println("Read two input values : ");

            String st1,st2;
            st1 = br.readLine();
            st2 = br.readLine();
            int result = Integer.parseInt(st1) / Integer.parseInt(st2);
            return("Result " +result);

        } catch (ArithmeticException e) {
            return ("Denominator is zero    " + e.getMessage());
        } /*catch (NumberFormatException e) {
            return ("Invalid inputs...    " + e.getMessage());
        }*/ catch (IOException e) {
            return (e.getMessage());
        } catch (Exception e){
            return("Exception occus..."+e.getMessage());
        }
    }
Main
package com.thbs;

import com.thbs.exceptpack.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Readinput.readinput1());
}
}
Read two input values : 
12
sai
Exception occusFor input string: "sai"
//------------------IOException(checked exception)---------------------
Readinput.java
package com.thbs.exceptpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readinput {

    public static void readinput1() {//method 2

        try (InputStreamReader ir = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(ir);) {
            System.out.println("Read two input values : ");
            String str1 = br.readLine();
            String str2 = br.readLine();
            int result = Integer.parseInt(str1) / Integer.parseInt(str2);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Denominator is zero    " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid inputs...    " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readinput3() throws IOException,ArithmeticException,NumberFormatException { //method 3
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        {
            System.out.println("Read two input values : ");
            String str1 = br.readLine();
            String str2 = br.readLine();
            int result = Integer.parseInt(str1) / Integer.parseInt(str2);
            System.out.println(result);
        }
    }

    public static void readInput() {//method 1
        InputStreamReader ir = null;
        BufferedReader br = null;
        String str1, str2;
        try {
            ir = new InputStreamReader(System.in);
            br = new BufferedReader(ir);
            System.out.println("Read two input values : ");
            str1 = br.readLine();
            str2 = br.readLine();
            int result = Integer.parseInt(str1) / Integer.parseInt(str2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Denominator is zero    " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid inputs...    " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        } finally {
            try {
                ir.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
Main.java
package com.thbs;

import com.thbs.exceptpack.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Readinput.readinput1();
        //Readinput.readInput();
        
        try {
            Readinput.readinput3();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Output:
method 1
Read two input values : 
15
0
Denominator is zero    / by zero
method 2
Read two input values : 
15
0
Denominator is zero    / by zero
method 3
Read two input values : 
13
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.thbs.exceptpack.Readinput.readinput3(Readinput.java:35)
	at com.thbs.Main.main(Main.java:13)

//------------------Exception-----------------------
package com.thbs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 0;
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            result = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException c) {
            System.out.println(c.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException s) {
            System.out.println(s.getMessage());
        } finally {
            System.out.println(result);
        }
    }
}
Output:
For input string: "sai"
0
