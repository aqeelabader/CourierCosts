/*
Aqeel Abader
18008885
Programming Assignment
Question 3
 */
package question3;

/**
 *
 * @author Aqeel Abader 18008885
 */
    //
    import javax.swing.JOptionPane;
    import java.util.Calendar;
    import java.util.Date;


public class Question3 {


    public static void main(String[] args) {
        
        Delivery_Details d=new Delivery_Details();//creates a new object in the delivery details class
        
        Date today=Calendar.getInstance().getTime();//gets the date and time
        
        /*the following sets the data according to user input*/
        
        d.setTown(JOptionPane.showInputDialog("Select the town the parcel will be delivered to\n1)Cape Town\n2)Pretoria\n3)Durban"));//sets the town according to input
        d.setCategory(Integer.parseInt(JOptionPane.showInputDialog("Select The weight category of the parcel to be delivered to:"+d.getTown()+"\n1)0kg-4kg\n2)5kg-9kg\n3)Over 10kg")));//sets the category according to input
        d.setCompany(JOptionPane.showInputDialog("Select the courier Company to deliver the parcel weight of "+ d.getWeight()+" to "+ d.getTown()+"\n1)ABC Courier\n2)Fast Track\n3)Rest Assured"));//sets the company according to input
        
        /*the following generates the delivery report according to the data that the user has entered*/
        
        System.out.println("Delivery Report - Created on "+today+"\n"+
                    "********************************"+"\n"+
                    "TOWN:\t\t"+d.getTown()+"\n"+
                    "WEIGHT:\t\t"+d.getWeight()+"\n"+
                    "PRICE:\t\tR"+d.getPrice()+"\n"+
                    "VAT (14%):\tR"+d.getVat()+"\n"+
                    "TOTAL   DUE:\tR"+d.getTotal()+"\n"+
                    "COURIER:\t"+d.getCompany()+"\n"+
                    "********************************"+"\n"); 
    }
}
