class calculator{
	public static int add(int num1, int num2){
	int sum=num1+num2;
	return sum;
}
public static double area(double r){
	double area=r*r*3.1415;
	return area;
} 
public static double areat(double b, double h){
	double areat=0.5*b*h;
	return areat;
}
public static int add3(int x, int y, int z){
	int sum3=x+y+z;
	return sum3;
}
public static double conversiont(double celcius){
	double fahrenheit=celcius*1.8+32;
	return fahrenheit;
}
public static double conversiont1(double fahrenheit1){
	double celcius1=(fahrenheit1-32)/1.8;
	return celcius1;
}
public static double conversion(double rupee){
	double dollar=rupee*70;
	return dollar;
}
public static boolean leap(int year){
	if(year%400==0 && year%4==0 || year%100!=0)
		return true;
	else
		return false;
}
public static boolean iseven(int num){
	if(num%2==0)
	return true;
else
	return false;
}
public static boolean isodd(int num){
	if(num%2!=0)
	return true;
else
	return false;
}
public static boolean ispalindrome(int num, int rev, int original){
	int check, temp;
	check=num;
		while(num!=0){
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		if(check==rev)
		return true;
	else
		return false;
}
public static boolean d6(int num){
	if(num%6==0)
		return true;
	else
		return false;

}
public static boolean prime(int n,int m){
	int i;
	for(i=1; i<=n; i++){
			if(n%i==0)
				m++;
		}
		if (m==2)
			return true;
		else 
			return false;
}
public static String generatevenos(int from, int to){
	String result5="";
	int i;
	for(i=from; i<=to;i++){
		if(i%2==0)
			result5+= " " + i;
		}
	
	return result5;
}
public static String generateprimenos(int from, int to){
	int i,j; int k=0;
	String result6="";
	for(i=from; i<=to; i++){
		k=0;
			for(j=2; j<i; j++){
				if(i%j==0)
					k++;
			}
if(k==0)
result6=result6 + "" +i;
}
return result6;
}
public static String generatepalindrome(int from, int to){
	String result="";
	for(int num=from; num<=to; num++){
			int check, rev=0, temp=0, original=num;
			check=num;
			while(check!=0){
				temp=check%10;
				rev=rev*10+temp;
				check=check/10;
			}
			if (rev==original)
				result= result + "" +num;
		}
		return result;
}
public static String fibonacci(int count){
	String result="";
	int a=0; int b=1; int c;
		System.out.println(a);
		System.out.println(b);
		for( int n=0;n<10;n++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			result=result + "" + c;
		}
		return result;
}
public static double add(double num1, double num2){
	double sum=num1+num2;
	return sum;
}
public static double speed(double distance, double time){
	double speed=distance/time;
	return speed;
}
public static int factorial(int num){
	int fact=1;
	for(int i=num;i>=1;i--){
		fact=fact*i;
	}
return fact;
}
public static double hour(int num){
	double hours=num/3600;
	return hours;
}
public static int nofdigits(int num){
	int count=0;
	while(num>0){
		num=num/10;
		count++;
	}
	return count;
}
public static boolean perfect(int num){
	int sum=0;
	for(int i=num;i<num;i++){
		if(num%i==0){
			sum=sum+i;
		}
	}
		if(num==sum)
			return true;
		else
			return false;
		}
public static int reverse3(int num){
	int temp=0, rev=0;
	while(num!=0){
		temp=num%10;
		num=num/10;
		rev=rev*10+temp;
	}
	return rev;
}
public static int blackjack(int num1,int num2){
	int diff1, diff2;
		diff1=21-num1;
		diff2=21-num2;
	
	if(diff1<diff2)
	return num1;
	else 
	return num2;
}
public static int suml3(int num){
	int temp=0, sum=0;
	for(int i=1;i<=3;i++){
		temp=num%10;
		num=num/10;
		sum=sum+temp;
	}
	return sum;
}
public static boolean addforthird(int a, int b, int c){
	int num1,num2,num3;
	num1=a+b;
	num2=a+c;
	num3=b+c;
	if((a<=b && b<c) || ( b<=a && a<c)){
		if(num1==c)
		return true;
	}
	else if((a<=c && c<b) || (c<=a && a<b)){
		if(num2==b)
		return true;
	}
	else if((b<=c && c<a) || (c<=b && b<a)){
		if(num3==a)
		return true;
	}
	if(num1==c || num2==b || num3==a)
		return true;
	else
	return false;
}
public static boolean isdigit(char ch){
	int uni=ch;
	if((uni>=65) && (uni<=122))
		return false;
	else
		return true;
}
public static boolean samelastdigit(int a,int b){
	int temp1=a%10, temp2=b%10;
	if(temp1==temp2)
		return true;
	else
		return false;
}
public static char middlechar(char ch1, char ch2, char ch3){
	int uni1=ch1, uni2=ch2, uni3=ch3; char ch4='w';
	if(uni1<uni2 && uni1<uni3){
		if(uni2<uni3)
			return ch2;
		else 
			return ch3;
	}
	else if(uni2<uni1 && uni2<uni3){
		if(uni1<uni3)
			return ch1;
		else
			return ch3;
	}
	else if(uni3<uni2 && uni3<uni1){
		if(uni2<uni1)
			return ch2;
		else
			return ch1;
	}
	else return ch4;
}
public static char casechange(char ch){
	int uni=ch;
	if((uni>=65) && (uni<=90)){
		uni=uni+32;
	}
	else if((uni>=97) && (uni<=122)){
		uni=uni-32;
	}
	ch=(char)uni;
	return ch;
}
public static int daysinmonth(int month){
	switch(month){
		case 1:
		return 31;
		case 2:
		return 29;
		case 3:
		return 31;
		case 4:
		return 30;
		case 5:
		return 31;
		case 6:
		return 30;
		case 7:
		return 31;
		case 8:
		return 31;
		case 9:
		return 30;
		case 10:
		return 31;
		case 11:
		return 30;
		case 12:
		return 31;
		default:
		return 1;
	}

}
public static int largestofthree(int a,int b,int c){
	if(a>b && a>c){
		return a;
	}
	else if(b>c && b>a){
		return b;
	}
	else return c;
}
public static boolean multiple37(int num){
	if(num%3==0 || num%7==0)
		return true;
	else
		return false;
}
public static double areaofsquare(int x1, int x2, int y1, int y2){
	double areaofsquare=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))/2;
	return areaofsquare;
}
public static int sum4digits(int num){
	int temp,sum=0;
	for(int i=0;i<4;i++){
		temp=num%10;
		num=num/10;
		sum=sum+temp;
	}
	return sum;
}
public static boolean numberinascendingorder(int num, int num1, int num2){
	boolean ascendingorder=(num<num1)&&(num1<num2);
	return ascendingorder;
}
public static boolean andbool3(boolean a, boolean b, boolean c){
	boolean result;
	result=a&&b;
	result=result&&c;
	return result;
}
public static int sum2digit(int num){
	int temp=0, sum=0;
	for(int i=0;i<2;i++){
		temp=num%10;
		num=num/10;
		sum=sum+temp;
	}
	return sum;
}
public static double makedecimal(int a, int b, int c){
	int num=(a*100)+(b*10)+(c*1);
	double num1=num/100.00;
	return num1;
}
public static double requiredrunrate(double target, double maxovers, double currentscore, double oversbowled){
	double requiredruns=target-currentscore;
	double remainingovers=maxovers-oversbowled;
	double requiredrunrate=requiredruns/remainingovers;
	return requiredrunrate;
}
public static int hundredsdigit(int num){
	int i;
	int temp=0;
	for(i=0;i<3;i++){
		temp=num%10;
		num=num/10;
	}
	return temp;
}
public static int lotteryticket(int ticketnum){
	int reward=0;
	if(ticketnum%4==0 && ticketnum%7==0)
		reward=20;
	if(ticketnum%4==0)
		reward=6;
		if(ticketnum%7==0)
		reward=10;
	else reward=0;
	return reward;
}
public static int lotteryticket3(int ticketnum1, int ticketnum2, int ticketnum3){
	int reward1=0;
	if((ticketnum1%4==0 && ticketnum1%7==0) || (ticketnum2%4==0 && ticketnum2%7==0) || (ticketnum3%4==0 && ticketnum3%7==0))
		reward1=20;
	if(ticketnum1%4==0 || ticketnum2%4==0 || ticketnum3%4==0)
		reward1=6;
		if(ticketnum1%7==0 || ticketnum2%7==0 || ticketnum3%7==0)
		reward1=10;
	else reward1=0;
	return reward1;
}
public static int addigitnumbers(int a,int b,int c){
	int num1=1000*a+100*a+10*a+a;
	int num2=1000*b+100*b+10*b+b;
	int num3=1000*c+100*c+10*c+c;
	int result=num1+num2+num3;
	return result;
}
public static String repeat(String num){
	String a;
	a=num + num;
	return a;
}
public static boolean largerthanone(int num, int num1, int num2){
	boolean isgreater=(num>num1)||(num>num2);
	return isgreater;
}
public static void printarray(int[]array){
	for(int i=0;i<array.length;i++)
		System.out.println(array[i]);
}
public static int summation(int[]sarray){
	int sum=0;
	for(int i=0;i<sarray.length;i++){
		System.out.println(sarray[i]);
		sum=sum+sarray[i];
	}
	return sum;
}
public static int maxarray(int[]marray){
	int max=marray[0];
	for(int i=1;i<marray.length;i++){
		if(marray[i]>max){
			max=marray[i];
		}
	}
	return max;
}
public static boolean repeatednos(int[]marray){
	int count=0;
	for(int i=0;i<marray.length;i++){
		for(int j=0;j<marray.length;j++){
			if(i!=j)
			if(marray[i]==marray[j])
			count++;
		}
		}
		if(count>=1)
				return true;
			else return false;	
}
public static int positionsearch(int[]marray, int key){
	int j=-1;
	for(int i=0; i<marray.length;i++){
		if(key==marray[i])
		return i;
	}
	return j;
}
public static void reverse(int[]rarray){
	for(int i=rarray.length-1;i>=0;i--)
	System.out.println(rarray[i]);	
}
public static void sortarray(int[]array){
	int temp=0;
	for(int i=array.length-1;i>=0;i--){
		for(int j=1;j<array.length;j++){
			if(array[j-1]>array[j]){
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
	}
	for(int k=0;k<array.length;k++)
	System.out.println(array[k]);
}
public static void casechange(char[]carray){
	int num=0;
	for(int i=0;i<carray.length;i++){
		num=carray[i];
		if(num>=97 && num<=122)
			num=num-32;
		else
			num=num+32;
		carray[i]=(char)num;
	}
	for(int i=0;i<carray.length;i++)
		System.out.println(carray[i]);
}
public static int[] generatenaturalnos(int num){
	int[] naturalarray=new int[num];
		for(int i=0;i<naturalarray.length;i++)
			naturalarray[i]=i+1;
		return naturalarray;
}
public static int[] generaterandomnos(int num){
	int sum=0;
		int[]randomarray=new int[num];
		for(int i=0;i<randomarray.length;i++)
			randomarray[i]=(int)(Math.random()*1000);
			return randomarray;
}
public static int[] generateprimenosarray(int from, int to){
		int k=0; int j=0;
 		int[]primearray=new int[(to-from)/2];
 		int index=0;
 		for(int i=from;i<=to;i++){
 			k=0;
 			for(j=1;j<=i;j++){
 				if(i%j==0)
 					k++;
 			}
 			if(k==2){
 			primearray[index]=i;
 		index++;}
 	}
 	return primearray;
}
public static int [] generatevenosarray(int from, int to){
	int[]evenarray=new int[((to-from)/2)+1];
		int index=0;
		for(int i=from;i<=to;i++){
			if(i%2==0){
				evenarray[index]=i;
				index++;
			}
		}
		return evenarray;
}
public static int [] generatoddnosarray(int from, int to){
	int[]oddarray=new int[((to-from)/2)+1];
		int index=0;
		for(int i=from;i<=to;i++){
			if(i%2!=0){
				oddarray[index]=i;
				index++;
			}
		}
		return oddarray;
}
public static int[] generatefibarray(int num){
	int[]fibarray=new int[num];
	int index=0;
	int a=0; int b=1; int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<fibarray.length;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			fibarray[index]=fibarray[index]+c;
			index++;
		}
		return fibarray;
}
public static char[] randomchararray(int num){
	char[]rrandomarray= new char[num];
	char ch;
		int randomnum=0;
		for(int i=0;i<rrandomarray.length;i++){
			while(true){
				randomnum=(int)(Math.random()*1000);
				if((randomnum>96&&randomnum<123)||(randomnum>65&&randomnum<123)){
					break;
				}
			}
			ch=(char)randomnum;
			rrandomarray[i]=ch;
		}
		return rrandomarray;
}
public static int[] reversearray(int[] array){
	int[] revarray= new int[array.length];
	int index=0;
	for(int i=array.length-1;i>=0;i--){
		revarray[index]=array[i];
	index++;
}
	return revarray;
}
public static int[] palindrome(int from, int to){
	int[] array=new int[(to-from)/2];
	int temp=0, rev=0, index=0;
	for(int i=from; i<=to;i++){
		int j=i;
		rev=0;
		while(j>0){
			temp=j%10;
			j=j/10;
			rev=rev*10+temp;
		}
		if(rev==i)
			array[index++]=i;
		}
		return array;
}
public static int vowelcount(char[] array){
	char ch;
	int vowelcount=0;
	for(int i=0;i<array.length;i++){
		ch=array[i];
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
				vowelcount++;

	}
	return vowelcount;
}
public static void copyarray( int []a, int[]b){
	for(int i=0; i<a.length; i++){
		a[i]=b[i];
	}
}
public static int[] revNaturalnos(int num){
	int[] revNatural=new int[num];
	for(int i=0;i<revNatural.length;i++){
		revNatural[i]=i+1;
	}
	reversearray(revNatural);
	return revNatural;
}







}