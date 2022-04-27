// parameterised static method

class AdditionParameter
{
	
	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static void addFloat(float e, float f)
	{
		float g=e+f;
		System.out.println(g);
	}
	
	
	public static void main(String args[])
	{
		AdditionParameter.add(20,30);
		AdditionParameter.addFloat(12.5f, 10.5f);
	}
}
