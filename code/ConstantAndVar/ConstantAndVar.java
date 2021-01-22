/*
常量和变量
*/
public class ConstantAndVar
{
	static int d;
	//注意：在类内定义的变量一定要初始化，类外不用。
	public static void main(String[] args){
		
		//声明和赋值分开变量
		int a;
		a = 10;

		//声明同时赋值
		int bp = 10;

		//在一行中可以定义多个变量，但是不规范
		int x=10,y=20;
		
		//输出类外定义未初始化的值
		System.out.println(d);

		//final修饰的变量叫做常量，或最终常量，值不可更改
		final int CONSTANT_VALUE=20;
		//CONSTANT_VALUE=30;
		System.out.println(CONSTANT_VALUE);

	}
}