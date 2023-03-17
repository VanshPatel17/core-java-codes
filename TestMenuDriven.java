import java.util.Scanner;

public class TestMenuDriven {

	public static void main(String[] args) {
		int ch = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("1:if 2:while 3:for 4:exit");

		do {
			System.out.println("Enter Choice ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("----if----");
				System.out.println("Enter No1 No2");
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (a > b) {
					System.out.println("Max=" + a);
				} else {
					System.out.println("Max=" + b);
				}

				break;
			case 2:
				System.out.println("----for----");
				System.out.println("Display even Number from 1- 10");
				for(int i=1;i<=50;i++)
				{
					if(i%2==0)
					System.out.print(i+"  ");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("----while----");
				int no=1;
				while(no<=10)
				{
					System.out.print (no+"  ");
					no++;
				}
				System.out.println();
				break;
			case 4:ch=10;
				System.out.println("----exit----");
				break;

			}// end switch
		} while (ch <= 4);

		System.out.println("-------Thank You------Main Ends Here");

	}

}
