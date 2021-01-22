public class Operator{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		//取整除，或取商
		System.out.println(a/b);
		//取余，或取模
		System.out.println(a%b);
		//单目运算符
		//++
		//a++先打印a的值，再++
		System.out.println(a++);
		//++a会先++再打印a的值
		System.out.println(++a);
		//--
		System.out.println(b--);
		System.out.println(--b);

		//有趣的题目:输出6
		System.out.println(++b+b++);

		//扩展运算符+=
		int c = 1;
		c = c + 2;
		c += 2;


		//扩展运算符的面试题目
		byte d = 10;
		//d = d + 1;
		//这个会报错；涉及到类型转化，d=d+1时整体会编程int类型，需要转化类型，精度缺失
		//但是，d+=1;不会报错,所以，
		d+=1;


		//关系运算符，返回的值时boolean类型的

		System.out.println(1>2);
		System.out.println(1==1);

		//逻辑运算符

		System.out.println(3>5 && 3<4);
		System.out.println(3>5 || 3<4);
		System.out.println(!( 4>5));

		//位运算
		System.out.println(4 & 5);
		//位运算中的与：转化成二进制，进行比较，全1为1，有0则0，因为4的二进制时100，5的二进制是101，所以，会输出4
		System.out.println(4 | 5);
		//位运算中的或：转化成二进制，进行比较，有1则1，全0为0，因为4的二进制时100，5的二进制是101，所以，输出5
		System.out.println(4 ^ 5);
		//位运算中的异或：转化成二进制，进行比较，相同为0，不同为1，因为4的二进制时100，5的二进制是101，所以，输出1
		System.out.println(~4);//输出-5
		//这个和移码，补码，原码，反码相关


		//经典的面试题目：把2变成8最快的方式怎么做？
		System.out.println(2<<2);
		//二进制左移两位 0010-》1000


		//条件运算符或者三目运算符
		//使用的时候需要跟一个表达式，表达式如果是true,则返回？后的结果，反之，返回：后的结果
		System.out.println(3>2?3:2);//输出3

		//好玩的面试题
		system.out.println(true?false:true?false:true);//返回false
		//因为：看问号，true返回？前的，后面的和输出没关系，false的话，再看后面


	}
}