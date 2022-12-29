import javax.swing.*;

class Buahx{

    public static void main(String[] args){

    String buah,harga,kuantiti;
    int harga1;
    float qty;
    double output;

    harga1= Integer.parseInt(harga);
    qty= Float.parseFloat(kuantiti);


    String name= JOptionPane.showInputDialog(f,"Masukkan Nama Buah: ");
	namaBuah2 = next();
	JOptionPane.showMessageDialog(null,name);
	kuantiti = JOptionPane.showInputDialog(f,"Masukkan Kuantiti Buah: ");
	kuantiti2 = nextInt();
	JOptionPane.showMessageDialog(null,kuantiti);
	harga = JOptionPane.showInputDialog(f,"Masukkan Harga Buah: ");
	harga = nextFloat();
	JOptionPane.showMessageDialog(null,harga);
	output = qty*harga1;
	JOptionPane.showMessageDialog(null,output);
	
	//jb.harga1 = sc.nextFloat();
	//jb.total1 = jb.kuantiti1*jb.harga1;
	//JOptionPane.showMessageDialog(null,"Jumlah Harga Buah 1: RM"+ df.format(jb.total1));
	System.exit(0);


}
}