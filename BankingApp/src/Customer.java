import java.util.Scanner;

public class Customer {
	int custId;          //instance variables......
	String name;
	String email;
	float accountBalance;
	
	//instance method used to input customer details from console
	public void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID :");
		custId=sc.nextInt();
		
		System.out.println("Enter name :");
		name=sc.next();
		
		System.out.println("Enter email :");
		email=sc.next();
		
		System.out.println("Enter balance:");
		accountBalance=sc.nextFloat();	
		
		displayDetails(); //call/execute		
	}
	
	
	public int add() {
		float a=5.5f;
		
		return (int)a;
		
		
	}
	public void displayDetails() {
		System.out.println(" **** Displaying Customer ****");
		System.out.println("ID      :"+custId);
		System.out.println("Name    :"+name);
		System.out.println("Email   :"+email);
		System.out.println("Balance :"+accountBalance);
	}
	
	public static void main(String[] args) {
		Customer custObj = new Customer();	
		custObj.acceptDetails(); //call/execute
		custObj.displayDetails();
	}
}
