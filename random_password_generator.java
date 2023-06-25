import java.util.*;
public class project1{
	public static void main(String[] args) {
		int ch1;
		do{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the length of the password which you want:");
		int l=sc.nextInt();
		System.out.print("Enter the character set \npress 1 for Alphanumeric\npress 2 for Alphabets \npress 3 for special char \npress 4 for Custom\nPlease enter your choice:");
        int ch=sc.nextInt();
        switch(ch){
        	case 1:
        		String chset1="qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM9874563210";
        		System.out.println("\nGenerated password is:"+generatepassword(l,chset1));
        		break;
        	case 2:
        		String chset2="qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        		System.out.println("\nGenerated password is:"+generatepassword(l,chset2));
        		break;
        	case 3:
        		String chset3="!@#$%^&*()_+}{][-=`~/?:;'><,";
        		System.out.println("\nGenerated password is:"+generatepassword(l,chset3));
        		break;
        	case 4:
        		System.out.print("\nEnter your own characterSet(except white space):");
            	String chset4=sc.next();
            	System.out.println("\nGenerated password is:"+generatepassword(l,chset4));
            	break;
            default:
            	System.out.print("\nPlease enter a valid option....");
            }
            System.out.println("\nPress 0-->to stop\nPress 1-->to continue\nPlease enter:");
            ch1=sc.nextInt();
            }while(ch1==1);
}
	public static String generatepassword(int l,String chset)
	{
		String p="";
		for(int i=0;i<l;i++)
		{
			int position=new Random().nextInt(chset.length());
			p+=chset.charAt(position);
		}
		return p;
	}
}
