//create Java program contain two class with constructor to calculate size of string. for example name ALI, address, phone number the string need to be input
// keyboard. list all the input
import java.util.*;

class Profile1{

    String name,address;
    String phone;
    int stringSize;
    Profile1(){};
}
class Profile2{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        Profile1 pf = new Profile1();
       
        
    
        System.out.println("Enter Name :");
        pf.name=sc.nextLine();
        pf.stringSize=pf.name.length();
        System.out.println("Name length :"+pf.stringSize);
        System.out.println("Enter Address :");
        pf.address=sc.nextLine();
        pf.stringSize=pf.address.length();
        System.out.println("Address length :"+pf.stringSize);
        System.out.println("Enter Phone number:");
        pf.phone=sc.nextLine();
        pf.stringSize=pf.phone.length();
        System.out.println("Phone Number length :"+pf.stringSize);


        
       
        


    }
}