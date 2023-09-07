import java.util.Scanner;
public class FirstWeekTask{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next();
		System.out.println("Name is "+name);
		Scanner in=new Scanner(System.in);
		System.out.println("enter no of taks");
		int task=in.nextInt();
		int taskarr[]=new int[task];
		System.out.println("enter the tasks");
		for(int i=0;i<task;i++) {
			taskarr[i]=in.nextInt();
		}
                System.out.println("The Tasks are:");
		for(int i=0;i<task;i++) {
			System.out.println(taskarr[i]);
		}
		int temp=0;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(taskarr[i]>taskarr[j]) {
					temp=taskarr[i];
					taskarr[i]=taskarr[j];
					taskarr[j]=temp;
				}
			}
		}
		System.out.println("Task in ascending order");
		for(int i=0;i<5;i++) {
		System.out.println(taskarr[i]+" ");
		
	}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(taskarr[i]<taskarr[j]) {
					temp=taskarr[i];
					taskarr[i]=taskarr[j];
					taskarr[j]=temp;
				}
			}
		}
		System.out.println("Tasks in desending order");
		for(int j=0;j<5;j++) {
		System.out.println(taskarr[j]+" ");
		
	}
		System.out.println("repeated tasks");
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(taskarr[i]==taskarr[j])
				System.out.println(taskarr[j]);
			}
		}
		

}
}
