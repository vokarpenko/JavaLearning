package styd;
import java.util.*;

public class Main {
	public static void main(String []args) {

		Scanner in = new Scanner(System.in);
		StudentList s=new StudentList();
		System.out.println("������� ���-�� ���������");
		int k = in.nextInt();
		for (int i=0;i<k;i++)
			{	String q = in.nextLine();
				System.out.println("������� ���");
				String fio = in.nextLine();

				System.out.println("������� �������");
				int age = in.nextInt();

				System.out.println("������");
				int group = in.nextInt();

				System.out.println("����");
				double av = in.nextDouble();

				styd st=new styd(fio,age,group,av);
				s.add(st);
			}
			s.sort();
			s.print();
		}

	}
	

