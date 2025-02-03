import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = " ";
		int age = 0;
		int salary = 0;
		
		System.out.print("Enter your name? : ");
		name = sc.nextLine();
		
		System.out.print("How old are you? : ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Are you employed? (Yes / No ) : ");
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("Yes")){
			System.out.print("How much do you earn? :");
			salary = sc.nextInt();
		}
		else if (input.equalsIgnoreCase("No"))
		{
			System.out.print("Are you a student ? (Yes / No ) :");
			String input2 =sc.nextLine();
			
			if(input2.equalsIgnoreCase("Yes")) {
				
			}
				
		}
				
		System.out.println("\nHello " + name + ", Age : "+ age + ", Your Salary is : " + salary);
		sc.close();
	}

}
