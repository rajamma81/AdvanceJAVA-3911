public class operator {
    public static void main(String[] args) {
		
		//Arithmetic operators --> + , - , * , /, %
		System.out.println("------------Arithmetic operators ------------------");
		int number1 = 500;
		int number2 = 100;
		
		System.out.println("Addition = " + (number1 + number2));
		System.out.println("Subtraction = " + (number1 - number2));
		System.out.println("Multiplication = " + (number1  * number2));
		System.out.println("Division = " + (number1 / number2));
		System.out.println("Reminder  = " + (number1 % number2));
		
		
		//Assignment operators --> =, +=, -=, *=, /=, %=
		System.out.println("-------------Assignment operators ------------------");
		int a = 10;
	    a += 5;   //a = a + 5
		System.out.println("a = " + a);
		a *= 2;   //a = a * 2
		System.out.println("a = " + a);
	    a /= 2;   //a = a / 2
	    System.out.println("a = " + a);
	    
	    //Relational operators --> <, <= , >, >= , == , != 
	    System.out.println("------------Relational Operators --------------------");
	    int x = 10;
	    int y = 20;
	    System.out.println("x < y = "+ (x<y));
	    System.out.println("x <= 5 = " + (x<=5));
	    System.out.println("x == y = " + (x==y));
	    
	    
	    //Logical operators --> &&, || ,!
	    System.out.println("-------------Logical operators-----------------------");
	    int p = 1;
	    int q = 2;
	    System.out.println((p==1) && (p < q));
	    System.out.println((p==2) || (q == 2));
	    System.out.println(!(p==1));
	    
	    //Ternary operators --> Syntax --> condition ? Statement1 : Statement2;
	    
	    System.out.println("-------------Ternary opertors -----------------------");
	    int c = 10;
	    int d = 5;
	    int max = c > d ? c : d;
	    System.out.println("Maximum of " + c + " & " + d +  " is " + max );
	    
	    
		

	}
    
}
