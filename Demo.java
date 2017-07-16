/* 输出两个值a,b中的较小值
输出a乘b的值
输出1到10整数和
输出1到10的偶数
*/
class Demo{
	public static void main(String args[]){
		int a=1,b=2,c=0,i=0,sum=0;
		if(a<b){
			c=a;
		}
		if(a>b){
			c=b;
		}
		System.out.println(c);//输出较小值
		switch(a*b){
			case 2:
				System.out.println(2);
				break;
			case 1:
				System.out.println(1);
				break;
			default:
				System.out.println("无匹配");
				}
			while(i<10){
				sum+=i;
				i++;
			System.out.println(sum);//输出1到10整数和
			do{
				sum+=i;
				i++;
				}while(i<=10);
			System.out.println(sum);
			for(i=0;i<10;i++){
				if(i%2!=0){
					continue;
				}
				System.out.print(i);//输出偶数
		}
	}
	}
	}