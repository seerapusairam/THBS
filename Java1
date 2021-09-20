package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1=10, num2=12;
        int sum = num1+num2;
        System.out.println("sum = " +sum);
}
}
Output:
sum = 22
--------------------------Sum--------------------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
       System.out.println("Sum is = " +sum);
}
}
Output:
Enter number:
12
20
Sum is = 32
------------------------even or odd-----------------------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 	System.out.println("Enter number:");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println(num1+" even number");
        }else{
            System.out.println(num1+" Odd number");
        }
    }
}
}
Output:
Enter number:
2
2 is even number
--------------------------largest number----------------------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        long n2 = sc.nextLong();
       double n3 = sc.nextDouble();
       double l1 = (n1 > n2) ? n1 : n2;
       double l2 = (l1 > n3) ? l1 : n3;
        System.out.println(l1 + "is the largest number");
}
}
Output:
12
1.34
11.23456
12 is the largest number
----------------------explict and implict convention-------------------------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float f1 = 13.66F;

        double d1 = f1;

        float f2 = (float)d1;

        int i1 = (int)f2;
        System.out.println("f2 value : "+f2);
        System.out.println("i1 value : "+i1);
        System.out.println("d1 value : "+d1);
        System.out.printf("d1 : %.2f",d1);
Output:
f2 value : 13.66
i1 value : 13
d1 value : 13.669234
d1 : 13.66
----------------------pre and post increment--------------------------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=10;
        int ans = ++i;
        System.out.println(i+" "+ans);
        int ans1 = i++;
        System.out.println(i+" "+ans1);

        int x=3,y=5,z=10;
        int res1 = (z + (++y) - y + z + (++x));
        System.out.println(res1);
}
}
Output:
11 11
12 11
24
-------------------------------------------------------------------------------
        // reverse of num
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int revnum = revNum(num);
        System.out.println(revnum);
}
}
public static int revNum(int n){
            int rem=0 , rev =0;
            while(n!=0){
                rem = n % 10;
                rev = (rev*10)+rem;
                n = n/10;
        }
            return rev;
    }

Output:
123
321
------------------------------------------------------------------------------
        //prime number or not
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
}
}
 public static boolean isPrime(int n){

            boolean flag = false;
            int m=n/2;
            for(int i=2;i<m;i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
                return flag;
        }
Output:
enter number:
7
7 is prime number
---------------------no of days by month number---------------------------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number : ");
        int mon = sc.nextInt();
        String msg = findMonth(mon);
        System.out.println("This Month contains "+msg);

    }
}
        public static String findMonth(int mon){
            String msg;
                switch(mon){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        msg = "31 days";
                        break;
                    case 2:
                        msg = "28 0r 29 days";
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        msg = "30 days";
                        break;
                    default:
                        msg = "invalid month";
                }
                return msg;
}
Output:
enter month number : 
7
This month has 31 days
-------------------------------Array-----------------------------------------------
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s[] = {1,2,3,4};
	for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
}
       for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]+" ");
}

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
         int n = sc.nextInt();
         int arr[] = new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
OutPut:
1 2 3 4
4 3 2 1
enter size of array
4
enter elements:
12
23
45
56
elements:
12 23 45 56 
