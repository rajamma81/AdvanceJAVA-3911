
package day01;

public class Exampleforconditional {

    //Conditional Statement --> Decision making statements
/* 
 * 1. Simple if
 * 2. if else
 * 3. if else if(Ladder if)
 * 4. Nested if
 * 5. Switch
 */

    public static void main(String[] args) {
		
		//Simple if
		int n = 15;
		if(n <= 10)
		{
			System.out.println(n + " is lesser than or equal to 10 ");
		}
		
		System.out.println("-----------------------------------------------------------");
		//if else
		
		int a = 50;
		int b = 20;
		
		if(a<=b)
		{
			System.out.println(a + " lesser than or equal to " + b);
		}
		else
		{
			System.out.println(a + " is not lesser than or equal to " + b);
		}
		
		System.out.println("-----------------------------------------------------------");
		//Ladder if 
		
		int x = 5;
		int y = 10;
		
		if(x < y)
		{
			System.out.println("x is lesser than y");
		}
		else if(x > y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("x is equal to y");
		}
	}
    
}
