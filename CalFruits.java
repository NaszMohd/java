import java.util.*;


class Fruits
{
    int type;
    int code;
    int qty;
    double wm=4.0,hd=5.0,sb=15.0,gp=17.0,ap=12.0;
    double sum,total,Gtotal,discount=0.1,totDis,limit=200.00;
    
    Fruits(){};
}
class CalFruits{
public static void main (String [] args){
    Fruits fruit = new Fruits ();
    Scanner sc = new Scanner (System.in);


    System.out.println ("<----------Sunshine Friuts Shop---------->");
    System.out.println ("");
    System.out.println ("  <--------Fruits Price's Code-------->");
    System.out.println ("");
    System.out.println ("1. Watermelon RM4/Piece");
    System.out.println ("2. HoneyDew RM5/Piece ");
    System.out.println ("3. Strawberry RM15/Kg ");
    System.out.println ("4. Grape RM17/Kg ");
    System.out.println ("5. Apple RM12/Kg ");
    System.out.println ("");
    System.out.println ("Get 10% discount with RM200 and above purchased!!!");
    System.out.println ("");

    System.out.println("How many fruits price's code did you want to enter? ");
		int x = Integer.parseInt(sc.nextLine());
		Fruits ft[] = new Fruits[x];
		
        if(x<=5){
	
            for(int i=0;i<x;i++){
            
                ft[i] = new Fruits();

                System.out.println ("");
                System.out.println ("Please enter the fruits price's code "+(i+1)+":");
                ft[i].code = sc.nextInt();
                System.out.println ("Please enter fruit's quantity (kg/piece):");
                ft[i].qty = sc.nextInt();
            
                switch(ft[i].code){

                    case 1 : fruit.sum=ft[i].qty*fruit.wm;
                            System.out.println("Your Watermelons price is RM"+fruit.sum);
                            break;
                    case 2 : fruit.sum=ft[i].qty*fruit.hd;
                            System.out.println("Your HoneyDew price is RM"+fruit.sum);
                            break;
                    case 3 : fruit.sum=ft[i].qty*fruit.sb;
                            System.out.println("Your Strawberry price is RM"+fruit.sum);
                            break;
                    case 4 : fruit.sum=ft[i].qty*fruit.gp;
                            System.out.println("Your Grape price is RM"+fruit.sum);
                            break;
                    case 5 : fruit.sum=ft[i].qty*fruit.ap;
                            System.out.println("Your Apple price is RM"+fruit.sum);
                            break;
                    default:
                            System.out.println("Please put the right code!");
                            break;
                }
            
                fruit.total=fruit.total+fruit.sum;

                
            }

            if(fruit.total>=fruit.limit){
                fruit.totDis=fruit.total*fruit.discount;
                fruit.Gtotal=fruit.total-fruit.totDis;
                System.out.println ("");
                System.out.println("Your total price after 10% discount is RM"+fruit.Gtotal);
            }else if(fruit.total<fruit.limit){
                fruit.Gtotal=fruit.total;
                System.out.println ("");
                System.out.println("Your total price is RM"+fruit.Gtotal);
            }
        }else{
            System.out.println("Please put a suitable number!");
        }
        
    
    }
}