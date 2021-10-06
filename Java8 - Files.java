//-----------Read Write File------
package com.thbs.mainpack;

import java.io.*;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\user119\\Desktop", "THBS.txt");
        File f2 = new File("C:\\Users\\user119\\Desktop", "THBS2.txt");
        try (FileReader fd = new FileReader(f1);
             BufferedReader bf = new BufferedReader(fd);
             FileWriter fw = new FileWriter(f2,true);
             BufferedWriter bw = new BufferedWriter(fw);) {
            String st;
            while ((st = bf.readLine()) != null) {
                System.out.println(st);
                bw.write(st);
                bw.newLine();
            }
            System.out.println("All data from "+f1.getName()+" added to "+f2.getName());

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
the END
All data from THBS.txt added to THBS2.txt
//--------------File Read Write Byte by byte ------------
package com.thbs.mainpack;

import java.io.*;

public class Main {

    private static InputStream input;

    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\user119\\Desktop\\THBS.txt");
        File f2 = new File("C:\\Users\\user119\\Desktop\\THBS2.txt");

        try (FileInputStream fi = new FileInputStream(f1);
             BufferedInputStream bi = new BufferedInputStream(fi);

             FileOutputStream fo = new FileOutputStream(f2);
             BufferedOutputStream bo = new BufferedOutputStream(fo);) {
            int c;
            while ((c = bi.read()) != -1) {
                bo.write(c);
                System.out.println((char) c);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
Output:
g
o
o
d
 
m
r
n
g



g
u
d
 
a
f
t
n
o
o
n



g
u
d
 
e
v
e
n
i
n
g



g
u
d
 
n
i
8



E
N
D



t
h
e
 
E
N
D
//---------File Byte Arrya-------------
package com.thbs.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\user119\\Desktop\\THBS.txt");
        File file2 = new File("C:\\Users\\user119\\Desktop\\THBS4.txt");

        try (FileInputStream input = new FileInputStream(file1);
             BufferedInputStream bis = new BufferedInputStream(input);
             
             FileOutputStream output = new FileOutputStream(file2);
             BufferedOutputStream bos = new BufferedOutputStream(output);) {

            byte[] buffer = new byte[input.available()];
            bis.read(buffer);
            bos.write(buffer);
            for (byte b : buffer) {
                System.out.print((char) b);
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
the END
//-----------File Read Write Object ----------
package com.thbs.mainpack;

import spack.Customer;
import spack.Student;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\user119\\Desktop\\Cus.dat");
        // destination file
        try (
                FileOutputStream output = new FileOutputStream(file1);
                ObjectOutputStream out = new ObjectOutputStream(output);
                FileInputStream input = new FileInputStream(file1);
                ObjectInputStream in= new ObjectInputStream(input);
        ) {

            Customer c=new Customer(101,"sname","tvs",5);
            out.writeObject(c);

            while(input.available()>0)
            {
                Customer cs=(Customer) in.readObject();
                System.out.println(cs);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
Customer:
package spack;

import java.io.Serializable;

public class Customer implements Serializable {
    private int cid;
    private String cname;
    private String company;
    private int exp;

    public Customer(int cid, String cname, String company, int exp) {
        this.cid = cid;
        this.cname = cname;
        this.company = company;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", company='" + company + '\'' +
                ", exp=" + exp +
                '}';
    }
}

Output:
Customer{cid=101, cname='sname', company='tvs', exp=5}
