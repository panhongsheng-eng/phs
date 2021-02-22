import java.util.Scanner;

//吃货联盟订餐系统
public class OrderFoodSys {
	public static void main(String[] args) {
		//定义数据主体：菜品
		String[] dishNames = {"红烧带鱼","鱼香肉丝","时令蔬菜"};  //菜品名称
		double[] prices = {38.0,20.0,10.0};//单价
		int[] praiseNums = new int[3];//点赞数
		//定义数据主体：订单-订餐人	餐品信息		送餐时间	送餐地址		总金额	订单状态
		String[] names = new String[4];
		String[] dishMsg = new String[4] ; //菜品名称+订份数
		int[] times = new int[4];
		String[] adresses = new String[4];
		double[] sumPrices = new double[4];
		int[] states = new int[4]; //0：已预订   1：已完成
		
		//初始化2个订单信息 
		names[0] = "张三";
		dishMsg[0] = "红烧带鱼 2份";
		times[0] = 10;
		adresses[0] = "知春路223号";
		sumPrices[0] = 76; //餐费>50 免配送费，不然，配送费6元
		states[0] = 0;
		
		names[1] = "李四";
		dishMsg[1] = "鱼香肉丝 1份";
		times[1] = 13;
		adresses[1] = "天成路207号";
		sumPrices[1] = 26; //餐费>50 免配送费，不然，配送费6元
		states[1] = 1;
		
		//搭建项目整体流程框架
		Scanner input = new Scanner(System.in);
		int num = -1; //用户输入0返回时的输入数字，num=0时重复显示主菜单;num在用户每次订餐操作后进行提示重新赋值
//		System.out.println("欢迎使用“吃货联盟订餐系统”");
		System.out.println("欢迎使用\"吃货联盟订餐系统\"");
		
		do{
			System.out.println("*************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("*************************");
			System.out.println("请选择：");
			int choose = input.nextInt();
			switch(choose){
				case 1:
					System.out.println("*********我要订餐**************");
					//订餐。。。。。 
					
					break;
				case 2:
					System.out.println("*********查看餐袋**************");
					break;
				case 3:
					System.out.println("*********签收订单**************");
					break;
				case 4:
					System.out.println("*********删除订单**************");
					break;
				case 5:
					System.out.println("*********我要点赞**************");
					break;
				case 6:
					//退出系统
					break;
				default:
					//退出系统
					break;
			}
		}while(num==0);
		System.out.println("谢谢使用，欢迎下次光临！");
	}
}
