import java.lang.*;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name......");
		String name=s.next();
		System.out.println("My name is is..."+" "+name);
                Scanner t=new Scanner(System.in);
                System.out.println("enter time of the day"); 
                int time=t.nextInt();                
		
                        if(time==8)
                           System.out.println("Login into the greatlearning");
                        else if(time>=9)
                        System.out.println("Attend the webniar");
                        else if(time>=12)
                        System.out.println("lunch"); 
                        else if(time>=2)
                        System.out.println("lab section");
                        else if(time>=5)
                        System.out.println("completing the lab section");
                        else
                        System.out.println("exit");	
		}
		
}
