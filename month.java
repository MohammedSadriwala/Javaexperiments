package java_B1_05;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * UIN: 231P099
 * Roll No. 05*/
import java.util.*;
public class month_b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice of month:");
choice = sc.nextInt();

	switch(choice)

      {
      
		  	case 1:
				System.out.println("January");
				break;   
			case 2:
				System.out.println("February");
				break;  
			case 3:
				System.out.println("March");
				break; 
			case 4:
				System.out.println("April");
				break; 
			case 5:
				System.out.println("May");
				break; 
			case 6:
				System.out.println("June");
				break; 
			case 7:
				System.out.println("July");
				break; 
			case 8:
				System.out.println("August");
				break; 
			case 9:
				System.out.println("September");
				break; 
			case 10:
				System.out.println("October");
				break; 
			case 11:
				System.out.println("November");
				break; 
			case 12:
				System.out.println("December");
				break; 
	default:
		System.out.println("Enter Valid number of month");
		break;
      }
}
}