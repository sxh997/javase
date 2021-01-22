public class DateType
{
	public static void main(String[] args){
		byte b =127;
		//byte:使用一个字节存储，因此范围是 -128-127

		short s =32767;
		//short :使用两个字节存储，因此繁为是 -32768-32767

		int a = 111111;
		//int :使用四个字节存储，因此字节范围是 正负21亿

		long l = 11111111111L;
		//long ：使用八个字节存储，字节范围-2的63次方到2的63次方-1
		//整型常量：默认为int；如果需要使用long的话，超过int长度必须后面加L
		//十进制整数，八进制整数0开头，十六进制整数0X开头

		float f = 1.1111111F;
		//float : 单精度浮点型，尾数精确到小数点后7位有效数字
		//注意：
			//1.默认浮点类型是double类型
			//2.使用float的时候，数字后要添加F
			//3.精度是小数点后7位，再多了会损失精确度判断

		double df=314e2;//314*10^2-->31400.0
		//浮点类型常量：十进制形式；科学计数法（314E2）
		//浮点型变量：

		double d = 1.11;
		//double :双精度浮点，精度是float类型的两倍，绝大数情况下使用这个
		
		char c = 'h';
		//char :字符类型，定义使用单引号
		//char类型可以当作int类型来处理，因为char类型是用来表示Unicode编码表中的字符
		
		String sa = "A";
		//String：字符串类型，定义是用双引号
		
		char ch = '\n';
		System.out.println("["+ch+"]");
		//转义字符

		boolean bl = true;
		//boolean :只有true和false，存储的时候占一位
		//boolean类型一般用来判断逻辑条件，一般用于程序流程控制
		//注意：请去掉所有的 ==fasle和 ==true  使用if(whether&&!done)


		
	}
}