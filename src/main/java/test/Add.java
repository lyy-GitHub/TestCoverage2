package test;

public class Add {
	public static void main(String args[])
	{
	System.out.print(TestAdd(5,20));
	}
	public static int TestAdd(int x,int y)
	{
		int c=0;
		if(x==10)
		{
			c=x+y;
		}
		else
		{
			c=(x+y)*2;
		}
		return c;
	}

}
