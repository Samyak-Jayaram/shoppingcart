package shoppingcart;
import java.util.Scanner;

public class DeleteItem {

	     static int number;
		 static int quantity;
         static int deletetotal=0;
	    
	     static void delete()
    {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter item number and it's quantity to be deleted:\n");
            number = s.nextInt();
            quantity =  s.nextInt();
            Cart.resetSum();
            deletetotal += Cart.total(number,quantity);
    }
	}