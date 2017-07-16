/* 
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
		System.out.println(c);
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