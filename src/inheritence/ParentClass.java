package inheritence;

public class ParentClass{

	int i =20;
	String name;
	public void dividebyZero() {
		
		try {
			int j=i/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ParentClass(int i,String name)
	{
		this.i=i;
		this.name=name;
		System.out.println("This is parent constructor");
	}
	public void colour()
	{
		System.out.println("Blue");
	}
	
	public void show()
	{
		System.out.println("This is parent's show");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
