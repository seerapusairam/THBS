package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Year : ");
        int y = sc.nextInt();
        leapYear(y);

    }

    public static void leapYear(int n) {

        int flag;
        if((n % 4 == 0) || (n % 100 == 0) || (n % 400 == 0)){
            System.out.println(n+" is a leap year");
        }else{
            System.out.println(n+" not a leap year");
        }
    }
}

Output:
enter Year : 2000
2000 is a leap year

---------------------

enter Year : 2001
2000 is not a leap year

2.
package com.thbs;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int rem = 0, arm = 0;
        int size = String.valueOf(num).length();

           if (armstr(num) == num) {
                System.out.println(num+" is armstrong number");
            } else {
                System.out.println(num+" is not a armstrong number");
            }

        }

    public static int armstr(int num) {
        int rem = 0, arm = 0;
        int size = String.valueOf(num).length();

        while (num > 0) {
            rem = num % 10;
            arm = arm + (int)(Math.pow(rem,size));
            num = num / 10;
        }

        return arm;
    }
}

Output:
Enter number: 153
153 is armstrong number
-------------------------
Enter number: 123
123 is not armstrong number

3.
package com.thbs;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        for(int i=1;i<10;i++){
            System.out.println(a+ " x " +i+" = "+a*i);
        }
    }
}

Output:
Enter number
5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45

4.
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st and 2nd no: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        int hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);
    }
}
Output:
Enter 1st and 2nd no: 10
35
HCF : 5
LCM : 70

5.
package com.thbs;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, sum=0;
        System.out.print("Enter the number: ");
        n=sc.nextLong();
        int i=1;
        while(i <= n/2)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
            System.out.println(n+" is not a perfect number");
    }
}
Output:
Enter the number: 28
28 is a perfect number
------------------------
Enter the number: 20
20 is not a perfect number

