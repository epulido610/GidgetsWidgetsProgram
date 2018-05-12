/*
Ethan Pulido 
2/27/18
Lab 2
Program 1.


Psuedocode
----------

create int numGidgets, numWidgets, discountGid, discountWid;
create double totalDiscount, taxRate, totalTax, total, gidgetPrice, widgetPrice;

gidgetPrice = 19.99;
widgetPrice = 23.59;
taxRate = 7.5;


Display "Welcome to the Gidget and Widget store!"
Display "How many Gidgets do you want?"
get numGidgets;
Display "How man Widgets do you want?"
get numWidgets;


if numGidgets is 5 or more, 10% off

else if numWidgets is 7 or more, 15% off



Display "You ordered " numGidgets " at "


*/
import java.util.Scanner;

public class gidgetWidgets
{
   public static void main(String[] args){
   
     int numGidgets, numWidgets, discountGid, discountWid;
     double totalDiscount, widgetDiscount, gidgetDiscount, taxRate, totalTax, total, gidgetPrice, widgetPrice, widgetTotal, gidgetTotal;
     double gidgetGrandTotal, widgetGrandTotal;
   
     Scanner reader = new Scanner(System.in);
   
     gidgetPrice = 19.99;
     widgetPrice = 23.59;
     taxRate = 0.075;
   
     System.out.println("Welcome to the Gidget and Widget store!");
     System.out.println("How many Gidgets do you want?");
     numGidgets = reader.nextInt();
   
     System.out.println("How many Widgest do you want?");
     numWidgets = reader.nextInt();
   
     widgetTotal = (numWidgets * 23.59);
     gidgetTotal = (numGidgets * 19.99);
   
     widgetDiscount = gidgetDiscount = gidgetGrandTotal = widgetGrandTotal = 0;
   
   
       if(numWidgets >= 7)
        {
          widgetDiscount =  (widgetTotal * .15);
        }
       else if(numWidgets < 7)
        {
          widgetDiscount = 0;
          //widgetGrandTotal = widgetTotal;
        }
   
   
       if(numGidgets >= 5)
        {
          gidgetDiscount = (gidgetTotal * .10);
        }
       else if(numGidgets < 5)
        {
          gidgetDiscount = 0;
        }
   
        totalDiscount = gidgetDiscount + widgetDiscount;
   
        System.out.println("You ordered " + numGidgets + " gidgets at " + gidgetPrice);
   
       if(numGidgets >= 5)
        {
         System.out.println("10% Discount of " + gidgetDiscount);
        }
       else if(numGidgets < 5)
        {
          System.out.println("No Discount ");
        }
   
       System.out.println("You ordered " + numWidgets + " widgets at " + widgetPrice);
   
   
       if(numWidgets >= 7)
        {
         System.out.println("15% Discount of " + widgetDiscount);
        }
      else if(numWidgets < 7)
        {
           System.out.println("No Discount ");
        }
   
       gidgetGrandTotal = gidgetTotal - gidgetDiscount;
       widgetGrandTotal = widgetTotal - widgetDiscount;
   
       total = (gidgetGrandTotal + widgetGrandTotal);
       totalTax = (total * taxRate);
   
   
   
     System.out.println("Receipt ");
     System.out.println(numGidgets + " Gidgets, $" + gidgetGrandTotal);
     System.out.println(numWidgets + " Widgets, $" + widgetGrandTotal);
     System.out.println("Sales tax, $" + totalTax);
     System.out.println("Total   $" + (total + totalTax));
   
  } 
}