import java.util.Scanner;

class student{
    String name,grade;
    int bm,bi,mm,am,pai,history,acc,ps,geo,bio,phy,chem;
    student(){};
}
class Ambition{
    public static void main(String[] args){
        
        Scanner fs = new Scanner(System.in);
        Scanner ts = new Scanner(System.in);

        //System.out.println("How many Student data do you want to enter? ");
        //int x = Integer.parseInt(sc.nextLine());
        student std = new student();
        //student std[] = new student[x];

        System.out.println("Name:");
        std.name = fs.nextLine();
        System.out.println("BM :G");
        std.bm = ts.nextInt();
        System.out.println("BI :G");
        std.bi = ts.nextInt();
        System.out.println("Modern Math :G");
        std.mm = ts.nextInt();
        System.out.println("Add Math :G");
        std.am = ts.nextInt();
        System.out.println("Pendidikan Islam :G");
        std.pai = ts.nextInt();
        System.out.println("History :G");
        std.history = ts.nextInt();
        System.out.println("Account :G");
        std.acc = ts.nextInt();
        System.out.println("Pendidikan Seni :G");
        std.ps = ts.nextInt();
        System.out.println("Geography :G");
        std.geo = ts.nextInt();
        System.out.println("Biology :G");
        std.bio = ts.nextInt();
        System.out.println("Physic :G");
        std.phy = ts.nextInt();
        System.out.println("Chemistry :G");
        std.chem = ts.nextInt();

        Amb2.Job(std.name,std.bm,std.bi,std.mm,std.am,std.pai,std.history,std.acc,std.ps,std.geo,std.bio,std.phy,std.chem);
        

    }
}
class Amb2{
    public static void Job(String name,int bm,int bi,int mm,int am,int pai,int history,int acc,int ps,int geo,int bio,int phy,int chem){
    String teacher,doctor,artist;
    int answer;
    
    //System.out.println("Your BM "+bm);
    Scanner ss = new Scanner(System.in);

    System.out.println("What is your ambition ?");
    System.out.println("1.Teacher");
    System.out.println("2.Doctor");
    System.out.println("3.Artist");
    
    answer=ss.nextInt();
        if(answer==1){
           
            if(bm>=1&& bm<=3 && bi>=1 && bi<=3 && mm>=1 && mm<=6 && am>=1 && am<=5 && pai>=1 && pai<=6 && acc==0 && ps==0 && history>=1 && history<=5 && geo>=1 && geo<=6 && bio>=1 && bio<=4 && phy>=1 && phy<=4 && chem>=1 && chem<=4){
                System.out.println("Eligible");
            }
             else{
            System.out.println("not-Eligible");
            }
        }else if(answer==2){
            if(bm>=1&& bm<=3 && bi>=1 && bi<=3 && mm>=1 && mm<=4 && am>=1 && am<=5 && pai>=1 && pai<=6 && acc==0 && ps==0 && history>=1 && history<=5 && geo>=1 && geo<=6 && bio>=1 && bio<=4 && phy>=1 && phy<=4 && chem>=1 && chem<=4){
                System.out.println("Eligible");
            }
             else{
            System.out.println("not-Eligible");
            }
        }else if(answer==3){
            if(bm>=1&& bm<=3 && bi>=1 && bi<=5 && pai>=1 && pai<=7 && mm==0&& am>=0 &&bio==0 && phy==0&& chem==0 &&history>=1 && history<=6 && geo>=1 && geo<=6 && acc>=1 && acc<=6 && ps>=1 && ps<=3 ){
                System.out.println("Eligible");
            }
             else{
            System.out.println("not-Eligible");
            }
        }
    
    }    

}

//,bi,mm,am,pai,history,acc,ps,geo,bio,phy,chem