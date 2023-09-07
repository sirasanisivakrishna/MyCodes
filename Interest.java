interface Interests {
	double getROI();
	double computeSI();

}
class TempClass implements Interests{
	private double pa,tm;
	TempClass(double p,double t){
		this.pa=p;
		this.tm=t;
	}
	public double getROI() {
		return 6.7;
	}
	public double computeSI() {
		return (pa*tm*getROI())/100;
	}
}
class TempClass1 implements Interests{
	private double pa,tm;
	TempClass1(double p,double t){
		this.pa=p;
		this.tm=t;
	}
	public double getROI() {
		return 6.7;
	}
	public double computeSI() {
		return (pa*tm*getROI())/100;
	}
}
class TempClass2 implements Interests{
	private double pa,tm;
	TempClass2(double p,double t){
		this.pa=p;
		this.tm=t;
	}
	public double getROI() {
		return 7.3;
	}
	public double computeSI() {
		return (pa*tm*getROI())/100;
	}
}
class Main
{
	public static void main(String args[]) {
		    Interests i;
	        TempClass t=new TempClass(20000,2);
	        i=t;
	        System.out.println("Simple intesret of sbi bank->"+i.computeSI());

	        TempClass1 t1=new  TempClass1(20000,2);
	        i=t1;
	        System.out.println("Simple interest of BOBbank->"+i.computeSI());
	        TempClass1 t2=new  TempClass1(20000,2);
	        i=t2;
	        System.out.println("Simple interest of BOBbank->"+i.computeSI());

	        

	}
}