public class Operator{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		//ȡ��������ȡ��
		System.out.println(a/b);
		//ȡ�࣬��ȡģ
		System.out.println(a%b);
		//��Ŀ�����
		//++
		//a++�ȴ�ӡa��ֵ����++
		System.out.println(a++);
		//++a����++�ٴ�ӡa��ֵ
		System.out.println(++a);
		//--
		System.out.println(b--);
		System.out.println(--b);

		//��Ȥ����Ŀ:���6
		System.out.println(++b+b++);

		//��չ�����+=
		int c = 1;
		c = c + 2;
		c += 2;


		//��չ�������������Ŀ
		byte d = 10;
		//d = d + 1;
		//����ᱨ���漰������ת����d=d+1ʱ�������int���ͣ���Ҫת�����ͣ�����ȱʧ
		//���ǣ�d+=1;���ᱨ��,���ԣ�
		d+=1;


		//��ϵ����������ص�ֵʱboolean���͵�

		System.out.println(1>2);
		System.out.println(1==1);

		//�߼������

		System.out.println(3>5 && 3<4);
		System.out.println(3>5 || 3<4);
		System.out.println(!( 4>5));

		//λ����
		System.out.println(4 & 5);
		//λ�����е��룺ת���ɶ����ƣ����бȽϣ�ȫ1Ϊ1����0��0����Ϊ4�Ķ�����ʱ100��5�Ķ�������101�����ԣ������4
		System.out.println(4 | 5);
		//λ�����еĻ�ת���ɶ����ƣ����бȽϣ���1��1��ȫ0Ϊ0����Ϊ4�Ķ�����ʱ100��5�Ķ�������101�����ԣ����5
		System.out.println(4 ^ 5);
		//λ�����е����ת���ɶ����ƣ����бȽϣ���ͬΪ0����ͬΪ1����Ϊ4�Ķ�����ʱ100��5�Ķ�������101�����ԣ����1
		System.out.println(~4);//���-5
		//��������룬���룬ԭ�룬�������


		//�����������Ŀ����2���8���ķ�ʽ��ô����
		System.out.println(2<<2);
		//������������λ 0010-��1000


		//���������������Ŀ�����
		//ʹ�õ�ʱ����Ҫ��һ�����ʽ�����ʽ�����true,�򷵻أ���Ľ������֮�����أ���Ľ��
		System.out.println(3>2?3:2);//���3

		//�����������
		system.out.println(true?false:true?false:true);//����false
		//��Ϊ�����ʺţ�true���أ�ǰ�ģ�����ĺ����û��ϵ��false�Ļ����ٿ�����


	}
}