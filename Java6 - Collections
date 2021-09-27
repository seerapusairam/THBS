//-------------Collections MapDemo2------------------
Customer.java
package Customer;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
Main.java
package com.thbs.mainpack;

import Customer.Customer;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Customer,Integer> c=new HashMap<Customer, Integer>() ;
        c.put(new Customer(10,"sairam"),6000);
        c.put(new Customer(12,"vishnu"),12000);
        c.put(new Customer(13,"srinu"),23000);

        for(Customer cust:c.keySet()){
            System.out.println(cust+" "+c.get(cust));
        }

        int salamt=0;
        for(Customer cust:c.keySet()){
            salamt+=c.get(cust);
        }
        System.out.println("Total sales "+salamt);
    }
}
Output:
Customer{id=12, name='vishnu'} 12000
Customer{id=10, name='sairam'} 6000
Customer{id=13, name='srinu'} 23000
Total sales 41000

//-------------Collections MapDemo------------------
package com.thbs.mainpack;

import Customer.Customer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("Sofa", 16000);
        m.put("Table", 3000);
        m.put("Lamp", 2000);
        m.put("TV", 20000);

        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());

        for (String key : m.keySet()) {
            System.out.println(key + " - " + m.get(key));
        }
        int amt = 0;
        for (String key : m.keySet()) {
            amt += m.get(key);
        }
        System.out.println("Total amount is " + amt);
    }
}
Output:
[Sofa, TV, Table, Lamp]
[16000, 20000, 3000, 2000]
[Sofa=16000, TV=20000, Table=3000, Lamp=2000]
Sofa - 16000
TV - 20000
Table - 3000
Lamp - 2000
Total amount is 41000

//-------------Collections Map------------------
package com.thbs.mainpack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //HashMap
        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(1,"Books");
        m.put(null,null);
        m.put(100,"Books");
        m.put(2,null);
        m.put(null,"pen");
        System.out.println(m);

        //LinkedHashMap
        Map<Integer,String> lm=new LinkedHashMap<Integer,String>();
        lm.put(1,"Books");
        lm.put(null,null);
        lm.put(100,"Books");
        lm.put(2,null);
        lm.put(null,"pen");
        System.out.println(lm);

        //Treemap
        Map<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(1,"Books");
        tm.put(2,"pens");
        tm.put(100,"Books");
        tm.put(4,"cycle");
        tm.put(3,"Bike");
        System.out.println(tm);

        //Hashtable
        Map<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(1,"Books");
        ht.put(2,"pens");
        ht.put(100,"Books");
        ht.put(4,"cycle");
        ht.put(3,"Bike");
        System.out.println(ht);
    }
}
Output:
{null=pen, 1=Books, 2=null, 100=Books}
{1=Books, null=pen, 100=Books, 2=null}
{1=Books, 2=pens, 3=Bike, 4=cycle, 100=Books}
{4=cycle, 3=Bike, 2=pens, 100=Books, 1=Books}

//-------------Collections Queues------------------
package com.thbs.mainpack;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> q=new LinkedList<String>();
        q.add("Java");
        q.add("HTML");
        q.add("AI");
        q.add(".NET");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
    }
}
Output:
[Java, HTML, AI, .NET]
Java
[HTML, AI, .NET]
HTML

//-------------Collections Stack------------------
package com.thbs.mainpack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> s=new Stack<String>();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());

        s.add(2,"c");
        System.out.println(s);

        System.out.println(s.search("a"));
        System.out.println(s.contains("b"));
    }
}
Output:
[a, b, c]
[a, b]
b
[a, b, c]
3
true

//-------------Collections Vector------------------
package com.thbs.mainpack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("sai");
        v.add("srinu");
        v.add("vishnu");

        Enumeration<String> e=v.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement()+"    ");
        }

        Iterator<String> i=v.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+"     ");
        }
    }
}
Output:
sai    
srinu    
vishnu    
sai     srinu     vishnu    

//-------------Collections Linked list-------------
package com.thbs.mainpack;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> s=new LinkedList<String>();
        s.add("apple");
        s.add("orange");
        s.add("pineapple");
        System.out.println(s.isEmpty());
        System.out.print("is empty?: "+s.contains("apple"));

        ListIterator<String> it=s.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        Collections.sort(s);
        System.out.println(s);
        Collections.reverse(s);
        System.out.println(s);
    }
}
Output:
false
is empty?: trueapple
orange
pineapple
pineapple
orange
apple
[apple, orange, pineapple]
[pineapple, orange, apple]


//--------Collection list using arrays--------------
package com.thbs.mainpack;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("No. of  elements in the arraylist");
        int n = sc.nextInt();
        ArrayList<Integer> ilist = new ArrayList<Integer>(n);
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element:");
            int ele = sc.nextInt();
            ilist.add(ele);
        }
        int sum=0;
        Iterator<Integer> it1 = ilist.iterator();
        while (it1.hasNext())
        {
            int ele1 = it1.next();
            System.out.print(ele1+"   ");
            sum+=ele1;
        }
        System.out.println();
        System.out.println("sum : "+sum);


        sc.close();

    }
}

Output:
No. of  elements in the arraylist
4
Enter the element:
12
Enter the element:
23
Enter the element:
34
Enter the element:
45
12   23   34   45   
sum : 114
//------------Collections-List--------------------
package com.thbs.mainpack;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> s=new ArrayList<String>();
        s.add("sai");
        s.add("ram");
        s.add("vishnu");
        s.add("srinu");
        s.add("lav");
        s.add("sai");
        System.out.println(s);

        s.add(1,"Sairam");
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
        s.remove("lav");
        System.out.println(s);

        ArrayList<String> sub=new ArrayList<String>();
        sub.add("1");
        sub.add("2");

        s.addAll(1,sub);
        System.out.println(s);

        System.out.println("Using for loop");
        for(int i=0;i<s.size();i++){
            System.out.print(s.get(i)+"   ");
        }
        System.out.println("Using instance loop");
        for(String i:s){
            System.out.print(i+"  ");
        }
        System.out.println("Using Iterator");
        Iterator<String> a=s.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }

    }
}
Output:
[sai, ram, vishnu, srinu, lav, sai]
[sai, Sairam, ram, vishnu, srinu, lav, sai]
[sai, Sairam, ram, vishnu, srinu, sai]
[sai, Sairam, ram, vishnu, srinu, sai]
[sai, 1, 2, Sairam, ram, vishnu, srinu, sai]
Using for loop
sai   1   2   Sairam   ram   vishnu   srinu   sai   
Using instance loop
sai  1  2  Sairam  ram  vishnu  srinu  sai  
Using Iterator
sai
1
2
Sairam
ram
vishnu
srinu
sai

//------------Collectionset-----------------
package com.thbs.mainpack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set s = new HashSet();

        s.add(1);
        s.add(12.4);
        s.add("java");
        s.add(null);
        System.out.println(s);

        Set<String> s2=new HashSet<String>();
            s2.add("sai");
            s2.add("ram");
            s2.add("seerapu");
            s2.add("sai");

        System.out.println(s2);

        Set<String> s3=new LinkedHashSet<String>();
        s3.add("sai");
        s3.add("ram");
        s3.add("seerapu");
        s3.add("sai");
        System.out.println(s3);

        Set<String> s4=new TreeSet<String>();
        s4.add("sai");
        s4.add("ram");
        s4.add("seerapu");
        s4.add("sai");
        System.out.println(s4);

    }
}
output:
[null, 1, java, 12.4]
[sai, seerapu, ram]
[sai, ram, seerapu]
[ram, sai, seerapu]
