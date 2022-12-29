import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class Delivery{

String fruitType1,fruitType2;
double distance,weight,weight1,weight2,price1,price2,total1,total2;
double  qty1,qty2;

}

class FruitDelivery{
	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static double Tweight1;
	public static double Tweight2;
	public static double weight;
	/**
	 * @param args
	 */
	public static void main(String[] args){

    Scanner fs = new Scanner(System.in); 
    Scanner ss= new Scanner(System.in);
	
    int transport;

	System.out.println("		Fruits Type");
	System.out.println("Small fruits");
	System.out.println("1.Strawberry	RM10/kg");
	System.out.println("2.Grape		RM12/kg");
	System.out.println("3.Cherry	RM8/kg");
	System.out.println("Big fruits");
	System.out.println("1.Red Watermelon 	RM15/piece");
	System.out.println("2.HoneyDew		RM15/piece");

	System.out.println("What type of Transportation did you wanna choose?");
	System.out.println("1. Small Lorry (weight less than 100kg & distance equal and less than 200km).");
	System.out.println("2. Big Truck (weight equal and more than 100kg & distance more than 200km). ");
	System.out.println("3. Self pickup.");
	
	
    transport=fs.nextInt();
    switch (transport){
	case 1:
			
			Smallfruit(fs,ss,Tweight1);
			Bigfruit(fs,ss);
			System.out.println("the tweight"+Tweight1);
			SmallLorry(Tweight1,Tweight2);
			break;
	case 2:
			
			Smallfruit(fs,ss,Tweight1);
			Bigfruit(fs,ss);
			BigTruck(weight,Tweight1,Tweight2);
			break;
	case 3:
			Selfpickup(fs,ss);
			break;
	default:
			System.out.println("You put a wrong number, please try it again!");
			break;
	}
}
    
	/**
	 * @param fs
	 * @param ss
	 */
	public static void Selfpickup(Scanner fs, Scanner ss) {
		System.out.println("How many type of small's fruit did you wanna enter? ");
    
		int x = Integer.parseInt(ss.nextLine());
		Delivery ft[] = new Delivery[x];
		
		double Tweight2=0.0;
	
		for(int i=0;i<x;i++){
		
			ft[i] = new Delivery();
		
		System.out.println("Enter the fruit name : ");
		ft[i].fruitType1 = ss.nextLine();
		System.out.println("Enter the fruit weight/kg: ");
		ft[i].weight1 = fs.nextDouble();
		System.out.println("Enter the fruit price: ");
		ft[i].price1 = fs.nextDouble();
		ft[i].total1 = ft[i].weight1*ft[i].price1;
		Tweight1 = ft[i].weight1;
		
		System.out.println("Total price "+ (i+1) +" fruit: RM"+ df.format(ft[i].total1));
		}
	
		System.out.println("Bil.	Fruit Type 	Kg 	Price(RM)");
		double allTotal1 = 0.00;
	
		 for(int i=0;i<x;i++){
			System.out.println(""+(i+1)+"	"+ft[i].fruitType1+"		"+ft[i].weight1+"	"+ft[i].total1);
			allTotal1 += ft[i].total1;
			
			
		}System.out.println("Total price: RM"+ df.format(allTotal1));
		System.out.println("the weight 2 is"+Tweight1);

		System.out.println("How many type of big's fruit did you wanna enter? ");
    
		int y = Integer.parseInt(ss.nextLine());
		Delivery ft1[] = new Delivery[y];
		
		
	
		for(int j=0;j<y;j++){
		
			ft1[j] = new Delivery();
		
		System.out.println("Enter the fruit name : ");
		ft1[j].fruitType2 = ss.nextLine();
		System.out.println("Enter the fruit quantity: ");
		ft1[j].qty2 = fs.nextDouble();
		System.out.println("Enter the fruit weight/kg: ");
		ft1[j].weight2 = fs.nextDouble();
		System.out.println("Enter the fruit price: ");
		ft1[j].price2 = fs.nextDouble();
		ft1[j].total2 = ft1[j].qty2*ft[j].price2;
		Tweight2 = ft[j].weight2;
		
		System.out.println("Total price "+ (j+1) +" fruit: RM"+ df.format(ft[j].total2));
		}
	
		System.out.println("Bil.	Fruit Type 	Qty 	Price(RM)");
		double allTotal2 = 0.00;
	
		 for(int j=0;j<y;j++){
			
			System.out.println(""+(j+1)+"	"+ft1[j].fruitType2+"		"+ft1[j].qty2+"	"+ft1[j].total2);
			allTotal2 += ft1[j].total2;
			
			
		}System.out.println("Total price: RM"+ df.format(allTotal2));

		double GrandTot=allTotal1+allTotal2;

		

		if(GrandTot>=200.00){
			double discount=0.00;
			double FGrandTotal=0.00;
			discount = GrandTot*10/100;
			FGrandTotal=GrandTot-discount;

			System.out.println("Your Final total after 10% Discount RM"+FGrandTotal);
		}else
			System.out.println("Your final total is RM"+GrandTot);


		System.out.println("the weight 2 is"+Tweight2);
	
		
	}

	public static double BigTruck(double weight,double Tweight1,double Tweight2) {
		double BTdelivery;
		double BTprice=12.00;

		weight=Tweight1+Tweight2;
		System.out.println("the weight is"+weight);
		BTdelivery=BTprice*weight;

		System.out.println("The Big Truck's delivery price is RM"+BTdelivery);

		return weight;
		
	}
	public static void SmallLorry(double Tweight1,double Tweight2) {
		double weight=0.0;
		double SLdelivery;
		double SLprice=7.00;

		

		System.out.println("the weight TL1 is"+Tweight1);
		weight=Tweight1+Tweight2;
		System.out.println("the weight SL is"+weight);

		SLdelivery=SLprice*weight;

		System.out.println("The Small Lorry's delivery price is RM"+SLdelivery);
		
		
	}
	public static double Bigfruit(Scanner fs, Scanner ss) {
        System.out.println("How many type of big's fruit did you wanna enter? ");
    
	int x = Integer.parseInt(ss.nextLine());
    Delivery ft[] = new Delivery[x];
	
	double Tweight2=0.0;

    for(int i=0;i<x;i++){
	
		ft[i] = new Delivery();
	
	System.out.println("Enter the fruit name : ");
	ft[i].fruitType2 = ss.nextLine();
	System.out.println("Enter the fruit quantity: ");
	ft[i].qty2 = fs.nextInt();
    System.out.println("Enter the fruit weight/kg: ");
	ft[i].weight2 = fs.nextDouble();
	System.out.println("Enter the fruit price: ");
	ft[i].price2 = fs.nextDouble();
	ft[i].total2 = ft[i].qty2*ft[i].price2;
	Tweight2 = ft[i].weight2;
    if(ft[i].total2>=200.00){
        double discount = ft[i].total2*10/100;
        ft[i].total2=ft[i].total2-discount;
    }
	System.out.println("Total price "+ (i+1) +" fruit: RM"+ df.format(ft[i].total2));
	}

    System.out.println("Bil.	Fruit Type 	Qty 	Price(RM)");
	Double allTotal = 0.00;

     for(int i=0;i<x;i++){
		System.out.println(""+(i+1)+"	"+ft[i].fruitType2+"		"+ft[i].qty2+"	"+ft[i].price2);
		allTotal += ft[i].total2;
		
		
    }System.out.println("Total price: RM"+ df.format(allTotal));
	System.out.println("the weight 2 is"+Tweight2);

	return Tweight2;
    
    }
    
    public static void Smallfruit(Scanner fs, Scanner ss, double Tweight1) {
    

    System.out.println("How many type of small's fruit did you wanna enter? ");
    
	int x = Integer.parseInt(ss.nextLine());
    Delivery ft[] = new Delivery[x];


    for(int i=0;i<x;i++){
	
		ft[i] = new Delivery();
	
	System.out.println("Enter the fruit name : ");
	ft[i].fruitType1 = ss.nextLine();
    System.out.println("Enter the fruit weight/kg: ");
	ft[i].weight1 = fs.nextDouble();
	System.out.println("Enter the fruit price: ");
	ft[i].price1 = fs.nextDouble();
	ft[i].total1 = ft[i].weight1*ft[i].price1;
	Tweight1 += ft[i].weight1;
    if(ft[i].total1>=200.00){
        double discount = ft[i].total1*10/100;
        ft[i].total1=ft[i].total1-discount;
    }
	System.out.println("Total price "+ (i+1) +" fruit: RM"+ df.format(ft[i].total1));
	}

    System.out.println("Bil.	Fruit Type 	Qty 	Price(RM)");
	Double allTotal = 0.00;

     for(int i=0;i<x;i++){
		System.out.println(""+(i+1)+"	"+ft[i].fruitType1+"		"+ft[i].qty1+"	"+ft[i].price1);
		allTotal += ft[i].total1;
		
		
    }System.out.println("Total price: RM"+ df.format(allTotal));
	System.out.println("the weight 1 is"+Tweight1);

    
    }
}

