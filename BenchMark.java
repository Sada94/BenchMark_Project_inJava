import java.util.*;
import java.lang.*;
class TaskBubble extends Thread{
	public void run(){
		BenchMarkMeth.bubble(BenchMark.array);
	}
}
class TaskInsertion extends Thread{
	public void run(){
		BenchMarkMeth.insertion(BenchMark.array);
	}
}
class TaskSelection extends Thread{
	public void run(){
		BenchMarkMeth.selection(BenchMark.array);

	}
}

class BenchMark{
	static int[] array;
	public static void sort(int[] arr){
		int choice;
			Scanner S = new Scanner(System.in);
			do{
				System.out.println("\n Choose the sorting Algorithm.");
				System.out.println("\n 1.Bubble Sort \t 2.Insertion Sort \t 3.Selection Sort \n 4.Benchmark all \n 5.exit \n6.Start over ");
				System.out.print(" Enter your choice \t");
				choice = S.nextInt();
				System.out.println("****************************************");

				switch(choice){
			case 1: System.out.println("\n You have choosen - 1.Bubble Sort");
					BenchMarkMeth.bubble(arr);
					break;
			case 2: System.out.println("\n You have choosen - 2.Insertion Sort");
					BenchMarkMeth.insertion(arr);
					break;
			case 3: System.out.println("\n You have choosen - 3.Selection Sort");
					BenchMarkMeth.selection(arr);
					break;
			case 4:System.out.println("\n You have choosen - 4.BenchMark all ");
					array=arr;
					TaskBubble tB = new TaskBubble();
					tB.start();
					TaskInsertion tI = new TaskInsertion();
					tI.start();
					TaskSelection tS = new TaskSelection();
					tS.start();
					while(true){
						if(!(tB.isAlive()||tI.isAlive()||tS.isAlive())){
							break;
						}
					}
					
			case 5:System.out.println("\n Thank you ");
					System.exit(0);
			case 6:mainCall();

			default:System.out.println("\n Enter proper choice");
		}
	}

		while(choice!=5);

	}
	public static void mainCall(){
		Scanner S = new Scanner(System.in);
		int choice,size=0;
		System.out.println("enter the array size");
			size = S.nextInt();
			System.out.println("*******************************************");
			int[] arraysoln = new int[size];
			do{
			System.out.println("\n Choose the complexity");
			System.out.println("\n 1.Best Case \t 2.Average Case \t 3.Worst Case  ");
			System.out.print(" Enter Your choice -\t");
			choice = S.nextInt();
			System.out.println("***************************************************");
			switch(choice){
				case 1 : System.out.println("\n You have choosen - 1.Best Case");
						 arraysoln = calculator.generatenaturalnos(size);
						 System.out.println("\n Array for Best Case Scenario of size ("+size+")has been generated.");
						 sort(arraysoln);
						 break;
				case 2 : System.out.println("\n You have choosen - 1.Average Case");
						 arraysoln = calculator.generaterandomnos(size);
						 System.out.println("\n Array for Average Case Scenario of size ("+size+")has been generated");
						 sort(arraysoln);
						 break;
				case 3 : System.out.println("\n You have choosen - 1.Worst Case");
						 arraysoln = calculator.revNaturalnos(size);
						 System.out.println("\n Array for Worst Case Scenario of size ("+size+")has been generated");
						 sort(arraysoln);
						 break;
				default:System.out.println("\n Enter valid choice");
				break;
			}
			}while(!(choice== 1 || choice==2 || choice==3));
		}
		public static void main(String[]args){
			mainCall();
		}









		}
