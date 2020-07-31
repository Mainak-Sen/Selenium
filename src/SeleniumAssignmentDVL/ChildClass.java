package SeleniumAssignmentDVL;

public class ChildClass extends ParentClass {
//Program to explain Inheritence concept
	int i=30;
public void dividebyZero() {
		
		try {
			System.out.println("Dividing a number by Zero");
			int j=i/0;
			
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught the exception");
		}
	}
	public ChildClass(int i,String name,int age)
	{
	 
	 super(i, name);
	 System.out.println(i);
	 System.out.println(name);
	 System.out.println(age);
	 
	 
	 
	 System.out.println("This is child constructor ");
	 
	}
	
	@Override
	public void colour()
	{
		//super.colour();
		//System.out.println(super.i);
		System.out.println("Orange");
	}
	@Override
	public void show()
	{
		System.out.println("This is child's show");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass x=new ChildClass(5,"Baban", 27);
		/*x.colour();
		System.out.println(x.i);
		//System.out.println("Mainak");
		x.dividebyZero();
		x.show();*/
	}

}