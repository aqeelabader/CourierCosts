/*
Aqeel Abader
18008885
Programming Assignment
Question 3
 */
package question3;

/**
 *
 * @author  Aqeel Abader 18008885
 */

import javax.swing.JOptionPane;
public class Delivery_Details {
    
    //variables
    private String town;
    private String company;
    private int category;
    private double total;
    private double VAT;
    private String weight;
    private double price;
    
    public Delivery_Details(){
        
        this.town="";
        this.company="";
        this.category=0;
        this.total=0;
        this.VAT=0;
        this.weight="";
        this.price=0;
    }
    
    /*the following is the set and get methods for the above listed variables:*/
    public void setTown(String town){
        
        int choice=Integer.parseInt(town);
        switch(choice){
            case 1:
                this.town="Cape Town";
                break;
            case 2:
                this.town="Pretoria";
                break;
            case 3:
                this.town="Durban";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong input for town ");
        }
    }
    
    public String getTown(){
        return this.town;
    }
    
    public void setCompany(String company){
        int choice=Integer.parseInt(company);
        switch(choice){
            case 1:
                this.company="ABC Couriers";
                break;
            case 2:
                this.company="Fast Track";
                break;
            case 3:
                this.company="Rest Assured";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong input for Company name ");
        }
    }
    
    public String getCompany(){
        return this.company;
    }
    
    public void setCategory(int category){
        
        this.category=category;
        switch(category){
            case 1:
                this.weight="0kg-4kg";
                this.price=300;
                this.VAT=this.getPrice()*0.14;
                this.total=this.getPrice()+this.getVat();
                break;
            case 2:
                this.weight="5kg-9kg";
                this.price=500;
                this.VAT=this.getPrice()*0.14;
                this.total=this.getPrice()+this.getVat();
                break;
            case 3:
                this.weight="Over 10kg";
                this.price=700;
                this.VAT=this.getPrice()*0.14;
                this.total=this.getPrice()+this.getVat();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Wrong input for Category!");
        }
    }
    
    public int getCategory(){
        return this.category;
    }
    
    public double getTotal(){
        return this.total;
    }
    
    public double getVat(){
        return this.VAT;
    }
    
    public String getWeight(){
        return this.weight;
    }
    
    public double getPrice(){
        return this.price;
    }
}


