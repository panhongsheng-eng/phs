import java.util.Scanner;

//�Ի����˶���ϵͳ
public class OrderFoodSys {
	public static void main(String[] args) {
		//�����������壺��Ʒ
		String[] dishNames = {"���մ���","������˿","ʱ���߲�"};  //��Ʒ����
		double[] prices = {38.0,20.0,10.0};//����
		int[] praiseNums = new int[3];//������
		//�����������壺����-������	��Ʒ��Ϣ		�Ͳ�ʱ��	�Ͳ͵�ַ		�ܽ��	����״̬
		String[] names = new String[4];
		String[] dishMsg = new String[4] ; //��Ʒ����+������
		int[] times = new int[4];
		String[] adresses = new String[4];
		double[] sumPrices = new double[4];
		int[] states = new int[4]; //0����Ԥ��   1�������
		
		//��ʼ��2��������Ϣ 
		names[0] = "����";
		dishMsg[0] = "���մ��� 2��";
		times[0] = 10;
		adresses[0] = "֪��·223��";
		sumPrices[0] = 76; //�ͷ�>50 �����ͷѣ���Ȼ�����ͷ�6Ԫ
		states[0] = 0;
		
		names[1] = "����";
		dishMsg[1] = "������˿ 1��";
		times[1] = 13;
		adresses[1] = "���·207��";
		sumPrices[1] = 26; //�ͷ�>50 �����ͷѣ���Ȼ�����ͷ�6Ԫ
		states[1] = 1;
		
		//���Ŀ�������̿��
		Scanner input = new Scanner(System.in);
		int num = -1; //�û�����0����ʱ���������֣�num=0ʱ�ظ���ʾ���˵�;num���û�ÿ�ζ��Ͳ����������ʾ���¸�ֵ
//		System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
		System.out.println("��ӭʹ��\"�Ի����˶���ϵͳ\"");
		
		do{
			System.out.println("*************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("*************************");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			switch(choose){
				case 1:
					System.out.println("*********��Ҫ����**************");
					//���͡��������� 
					
					break;
				case 2:
					System.out.println("*********�鿴�ʹ�**************");
					break;
				case 3:
					System.out.println("*********ǩ�ն���**************");
					break;
				case 4:
					System.out.println("*********ɾ������**************");
					break;
				case 5:
					System.out.println("*********��Ҫ����**************");
					break;
				case 6:
					//�˳�ϵͳ
					break;
				default:
					//�˳�ϵͳ
					break;
			}
		}while(num==0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
	}
}
