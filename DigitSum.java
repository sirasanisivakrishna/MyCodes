import java.lang.*;

class DigitSum
{
public static void main(String args[])
{

int m,num=121,sum=0;
while(num>0)
{
m=num%10;
sum=sum+m;
num=num/10;
}
System.out.println(sum);
}
}




