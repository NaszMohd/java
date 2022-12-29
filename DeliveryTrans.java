import java.util.*;
import java.util.Scanner;

class Delivery
{

String answer;
double weight,distance,slprice=0.50,btprice=1.20,total;
Delivery(){};

}

public class DeliveryTrans
{

public static void main (String[]args){
    Delivery delivery = new Delivery();
    Scanner sc = new Scanner (System.in);
    Scanner x = new Scanner(System.in);
    System.out.println("<----------United Transportation Delivery Services---------->");
    System.out.println("");
    System.out.println("Small Lorry price per kilometers ----------- RM0.5");
    System.out.println("Big Truck price per kilometers   ----------- RM1.2");
    System.out.println("");
    System.out.println ("Please enter the amount of material (in KG):");
    delivery.weight = sc.nextDouble();
    System.out.println ("Please enter the distance (in KM):");
    delivery.distance = sc.nextDouble();

    if(delivery.weight<100 && delivery.distance<200){
        System.out.println("Suggested Transportations : Small Lorry");
        System.out.println("Continue?(Yes/No)");
        delivery.answer = x.nextLine();
        switch(delivery.answer){

            case "Yes":
                        delivery.total=delivery.distance*delivery.slprice;
                        System.out.println("Your delivery price is RM"+delivery.total);
                        break;

            case "No" :
                        System.out.println("Thank you.");
                        break;

            default   :
                        System.out.println("Error!");
                        break;

        }
        
    }else if(delivery.weight>=100 && delivery.distance>=200 || delivery.distance<200){
        if(delivery.weight<=1000 && delivery.distance<=1000){
            System.out.println("Suggested Transportations : Big Truck");
            System.out.println("Continue?(Yes/No)");
            delivery.answer = x.nextLine();
            switch(delivery.answer){

                case "Yes":
                            delivery.total=delivery.distance*delivery.btprice;
                            System.out.println("Your delivery price is RM"+delivery.total);
                            break;

                case "No" :
                            System.out.println("Thank you.");
                            break;

                default   :
                            System.out.println("Error!");
                            break;

        }
    }   else 

        System.out.println ("Sorry No Transport Available!");
    }
    
}
}
