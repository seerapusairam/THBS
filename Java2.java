//-------------------Student percentage with array----------------------------
Percent.java
package com.thbs;

public class Percent {

    private int std_id;
    private String std_name;
    private int sub1;
    private int sub2;
    private int sub3;

    public Percent(int std_id, String std_name, int sub1, int sub2, int sub3) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    private double cal_per(){
        return ((sub1+sub2+sub3)/3);
    }

    @Override
    public String toString() {
        return "Percent{" +
                "std_id=" + std_id +
                ", std_name='" + std_name + '\'' +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 + " Percentage : "+cal_per()+
                '}';
    }
}

Main.java

package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int len = sc.nextInt();

        Percent[] arr = new Percent[len];

        for(int i=0;i<len;i++){
            System.out.println("Enter details of "+(i+1));
             int std_id = sc.nextInt();
             String std_name = sc.next();
             int sub1 = sc.nextInt();
             int sub2 = sc.nextInt();
             int sub3 = sc.nextInt();
             arr[i] = new Percent(std_id,std_name,sub1,sub2,sub3);
        }
        for(int i=0;i<len;i++){
            System.out.println("details of student "+(i+1));
            System.out.println(arr[i]);
        }
    }
}
Output:
Enter number of students : 
2
Enter details of 1
1
sai
67
78
99
Enter details of 2
2
sair
67
78
90
details of student 1
Percent{std_id=1, std_name='sai', sub1=67, sub2=78, sub3=99 Percentage : 81.0}
details of student 2
Percent{std_id=2, std_name='sair', sub1=67, sub2=78, sub3=90 Percentage : 78.0}


//--------------------Student Percentage with private modifier-----------------------
package com.thbs;

public class Percent {

    private int std_id;
    private String std_name;
    private int sub1;
    private int sub2;
    private int sub3;

    public Percent(int std_id, String std_name, int sub1, int sub2, int sub3) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    private double cal_per(){
        return ((sub1+sub2+sub3)/3);
    }

    @Override
    public String toString() {
        return "Percent{" +
                "std_id=" + std_id +
                ", std_name='" + std_name + '\'' +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 + " Percentage : "+cal_per()+
                '}';
    }
}

package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Percent p = new Percent(101,"sairam",68,79,90);
        System.out.println(p);
    }
}
Output:
Percent{std_id=101, std_name='sairam', sub1=68, sub2=79, sub3=90 Percentage : 79.0}

//--------------------Student Percentage with public modifier------------------------
package com.thbs;

public class Percent {

    private int std_id;
    private String std_name;
    private int sub1;
    private int sub2;
    private int sub3;

    public Percent(int std_id, String std_name, int sub1, int sub2, int sub3) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public double cal_per(){
        return ((sub1+sub2+sub3)/3);
    }

    @Override
    public String toString() {
        return "Percent{" +
                "std_id=" + std_id +
                ", std_name='" + std_name + '\'' +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 +
                '}';
    }
}

package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Percent p = new Percent(101,"sairam",68,79,90);
        System.out.println("Percentage : "+p.cal_per());
        System.out.println(p);
    }
}
Output:
Percentage : 79.0
Percent{std_id=101, std_name='sairam', sub1=68, sub2=79, sub3=90}

//--------------------electric bill with array-------------------
Customer.java
package com.thbs;

public class Customer {

    private int cust_id;
    private String cust;
    private int unit_con;
    private int unit_price;

    public Customer(int cust_id, String cust, int unit_con, int unit_price) {
        this.cust_id = cust_id;
        this.cust = cust;
        this.unit_con = unit_con;
        this.unit_price = unit_price;
    }

   public int cal_bal(){

        return(unit_con*unit_price);
   }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", cust='" + cust + '\'' +
                ", unit_con=" + unit_con +
                ", unit_price=" + unit_price + " Bill amount :"+cal_bal()+
                '}';
    }
}
main.java
package com.thbs;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter no of customer :");
                int len = sc.nextInt();
                Customer[] arr = new Customer[len];
                //for loop for taking details
                for(int i=0;i<len;i++){
                    System.out.println("Enter details :");
                    int cust_id = sc.nextInt();
                    String cust =sc.next();
                    int unit_con =sc.nextInt();
                    int unit_price =sc.nextInt();
                    arr[i] = new Customer(cust_id,cust,unit_con,unit_price);
                }

                for(int i=0;i<len;i++){
                    System.out.println("Details of customer "+(i+1));
                    System.out.println(arr[i]);
                }

            }
        }
output:
enter no of customer :
2
Enter details :
1
sairam
2300
8
Enter details :
2
vishnu
3009
6
Details of customer 1
Customer{cust_id=1, cust='sairam', unit_con=2300, unit_price=8 Bill amount :18400}
Details of customer 2
Customer{cust_id=2, cust='vishnu', unit_con=3009, unit_price=6 Bill amount :18054}


//--------------------Electric bill----------------------------
package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer c = new Customer(1,"sairam",2000,5);
        System.out.println("Bill Amount : "+c.cal_bal());
        System.out.println(c);
    }
}
Customer.java
package com.thbs;

public class Customer {

    private int cust_id;
    private String cust;
    private int unit_con;
    private int unit_price;

    public Customer(int cust_id, String cust, int unit_con, int unit_price) {
        this.cust_id = cust_id;
        this.cust = cust;
        this.unit_con = unit_con;
        this.unit_price = unit_price;
    }

   public int cal_bal(){

        return(unit_con*unit_price);
   }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", cust='" + cust + '\'' +
                ", unit_con=" + unit_con +
                ", unit_price=" + unit_price +
                '}';
    }
}
Output:
Bill Amount : 10000
Customer{cust_id=1, cust='sairam', unit_con=2000, unit_price=5}

//--------------------Bubble sort-------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int len = Integer.parseInt(args[0]);

        int[] arr = new int[len];

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter numbers : ");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        //sorting
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Printing the array ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
Output:
5
Enter numbers : 
12
34
5
56
7
Printing the array 
5 7 12 34 56 

//--------------------Command line args-------------------------------
package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String str1 = args[0];
        String str2 = args[1];

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("sum :"+(num1+num2));
    }
}

Output:
10 20
sum: 30

//---------------------Max and min in array -------------------------
package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {23,45,121,3,5};
                int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

//----------------------Book store using class-------------
Book.java(class)

package com.thbs;

public class Book {
        int Book_id ;
        String bookName ;
        int bookPrice ;

        public Book(int book_id, String bookName, int bookPrice) {
            Book_id = book_id;
            this.bookName = bookName;
            this.bookPrice = bookPrice;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "Book_id=" + Book_id +
                    ", bookName='" + bookName + '\'' +
                    ", bookPrice=" + bookPrice +
                    '}';
        }
    }

package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Book b = new Book(100,"Java",2000);
        System.out.println(b);

        Book b1 = new Book(101,"HTML",2500);
        System.out.println(b1);

    }
}
Output:
Book{Book_id=100, bookName='Java', bookPrice=2000}
Book{Book_id=101, bookName='HTML', bookPrice=2500}


//---------------------single book details  by user input ---------------
package com.thbs;

public class Book {
        int Book_id ;
        String bookName ;
        int bookPrice ;

        public Book(int book_id, String bookName, int bookPrice) {
            Book_id = book_id;
            this.bookName = bookName;
            this.bookPrice = bookPrice;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "Book_id=" + Book_id +
                    ", bookName='" + bookName + '\'' +
                    ", bookPrice=" + bookPrice +
                    '}';
        }
    }
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details : ");
        int Book_id = sc.nextInt() ;
        String bookName = sc.next();
        int bookPrice = sc.nextInt();

        Book book1 = new Book(Book_id,bookName,bookPrice);
        System.out.println(book1);

    }
}


Output:
Enter details : 
101
Java
232
Book{Book_id=101, bookName='Java', bookPrice=232}



//------------------Book Store-with user input------------------------------------
package com.thbs;

public class Book {
        int Book_id ;
        String bookName ;
        int bookPrice ;

        public Book(int book_id, String bookName, int bookPrice) {
            Book_id = book_id;
            this.bookName = bookName;
            this.bookPrice = bookPrice;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "Book_id=" + Book_id +
                    ", bookName='" + bookName + '\'' +
                    ", bookPrice=" + bookPrice +
                    '}';
        }
    }
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int len = sc.nextInt();
	//array decl
        Book[] arr = new Book[len];
	//for loop for taking details
        for(int i=0;i<len;i++){
            System.out.println("Enter details :"+(i+1));
            int book_id = sc.nextInt() ;
            sc.nextLine();
            String bookName = sc.nextLine();
            int bookPrice = sc.nextInt();
            arr[i] = new Book(book_id,bookName,bookPrice);
        }

        for(int i=0;i<len;i++){
            System.out.println("Details of Book "+(i+1));
            System.out.println(arr[i].toString());
        }
    }
}


Output:
Enter no of elements : 
2
Enter details :1
101
JAVA SCRIPT
2000
Enter details :2
102
HTML CSS
3249
Details of Book 1
Book{Book_id=101, bookName='JAVA SCRIPT', bookPrice=2000}
Details of Book 2
Book{Book_id=102, bookName='HTML CSS', bookPrice=3249}
