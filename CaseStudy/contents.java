import lombok.Data;
 @Data
 class Passenger {
    private String name;
    private int age;
    private char gender;

}

package modelpack;
public class Train
{
    private int trainNo;
    private String trainName;
    private String source;
    private String destination;
    private double ticketPrice;
    public Train(int trainNo, String trainName, String source, String destination, double ticketPrice) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNo=" + trainNo +
                ", trainName='" + trainName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}


//dao
import java.sql.*;
 
public class Train_DAO {
    public static Connection con = DBManager.getConnection();
 
    public static Train findTrain(int trainNum) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from trains where train_no =" + trainNum);
        rs.next();
        return new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
    }
}

//main
package mainUIpack;

import model.Train;
import model.Passenger;
import ticketpack.Ticket;

import java.util.GregorianCalendar;

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        int date=0, month=0, year = 0;
        int numOfPass=0;
        int trainNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the train number : ");
        trainNumber = sc.nextInt();

        while(true)
        {
            try
            {
                if(trainNumber > 1000 && trainNumber < 1006)
                {
                    break;
                }
                else
                {
                    System.out.println("Enter the valid train number : ");
                }

            }
            catch (Exception e)
            {
                System.out.println("Enter the valid train number.");
            }
        }
        Train train = findTrain(trainNumber);

        System.out.println("Enter the Date of travel : ");
        while (true)
        {
            try
            {
                System.out.println("Enter the date of the travel : ");
                date = sc.nextInt();
                System.out.println("Enter the month of the travel : ");
                month = sc.nextInt();
                System.out.println("Enter the year of the trave;");
                year = sc.nextInt();
                if(new GregorianCalendar(year, month,date).after(new GregorianCalendar()))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter the day that is after today.");
                }
            }
            catch (Exception e)
            {
                System.out.println("Enter the valid date.");
            }
            //todo
            Ticket ticket = new Ticket(train, year, month, date);
        }

        System.out.println("Enter the number of passengers : ");
        numOfPass = sc.nextInt();
        for(int i=0;i<numOfPass;i++)
        {
            System.out.println("Enter the Passenger Name : ");
            String passName = sc.nextLine();

            System.out.println("Enter the age of the Passenger : ");
            int passAge = sc.nextInt();

            System.out.println("Enter the gender of the Passengere : (Type 'M' or 'F') : " );
            char passGen = sc.nextLine().charAt(0);

            while(true)
            {
                if(Character.toString(passGen).toUpperCase().equals("M") || Character.toString(passGen).toUpperCase().equals("F"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter 'M' or 'F' : ");
                    passGen = sc.nextLine().charAt(0);
                }
                Ticket.addPassenger(passName, passAge, passGen);

            }
        }
        myTicket.generateTicket();
        System.out.println("Ticket Booked Successfully.");
    }
}
