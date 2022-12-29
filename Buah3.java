import java.util. *;
import java.text.DecimalFormat;
import javax.swing.*;


class Buah1
{
	int kuantiti;
	String namaBuah,qty,price,nb,kb,hb;
	Float harga,total;
	Buah1(){};
}


class Buah3
{
	private static final DecimalFormat df = new DecimalFormat("0.00");
	/**
	 * @param args
	 */
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	Scanner y = new Scanner(System.in);
	
	String index;
	
	index = JOptionPane.showInputDialog("Berapa Jenis Buah yang akan dimasukkan? ");
	int x = Integer.parseInt(index);
	
	
	//StockBuah Nstock = new StockBuah();
	
	Buah1 jb[] = new Buah1[x];//variables reference
	
	for(int i=0;i<x;i++){
	
		jb[i] = new Buah1();
	
	
	jb[i].namaBuah = JOptionPane.showInputDialog("Masukkan Nama Buah: ");
	
	jb[i].qty = JOptionPane.showInputDialog("Masukkan Kuantiti Buah: ");
	jb[i].kuantiti = Integer.parseInt(jb[i].qty);
	jb[i].price = JOptionPane.showInputDialog("Masukkan Harga Buah: ");
	jb[i].harga = Float.parseFloat(jb[i].price);
	jb[i].total = jb[i].kuantiti*jb[i].harga;
	JOptionPane.showMessageDialog(null,"Jumlah Harga Buah "+ (i+1) +": RM"+ df.format(jb[i].total));
	}
	String BList[]= new String[x];
	String newline = System.lineSeparator();
	
	Float allTotal = 0.00f;
     for(int i=0;i<x;i++){
		
		BList[i]=newline+"Nama buah :"+jb[i].namaBuah+
		newline+"Kuantiti buah :"+ Integer.parseInt(jb[i].qty)+
		newline+"Harga buah :RM"+ Float.parseFloat(jb[i].price);
		
		allTotal += jb[i].total;
		allTotal=Float.parseFloat(BList[]);	
    }

	JOptionPane optionPane = new JOptionPane();
	optionPane.setMessage(BList);
	

	String[] options = new String[] {"OK", "Cancel"};
    int response = JOptionPane.showOptionDialog(null, optionPane, "List Harga",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
	//JList JList = new JList(BList);
	//JList.setVisibleRowCount(x);
	//JOptionPane.showMessageDialog(null, new JScrollPane(JList));
	//JOptionPane.showMessageDialog(null,optionPane,"List Harga",1,null,button);
	//JOptionPane.showMessageDialog(null,"Jumlah Keseluruhan Harga Buah: RM"+ df.format(allTotal));

	
	}
}