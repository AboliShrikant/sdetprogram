package inheritancepkg;

class A
{
	int a; 
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}


class B extends A
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}


public class Test1 {

	public static void main(String[] args) 
	{
		A aobj=new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();


       B bobj=new B();
       bobj.x=125;
       bobj.y=135;
       bobj.show();
       
       bobj.a=129;
       bobj.b=123;
       bobj.display();
		
	

	}

}
