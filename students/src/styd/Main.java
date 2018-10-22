package styd;
import java.util.*;

public class Main {
	public static void main(String []args) {

		Scanner in = new Scanner(System.in);
		StudentList s=new StudentList();
		System.out.println("Введите кол-во студентов");
		int k = in.nextInt();
		for (int i=0;i<k;i++)
			{	String q = in.nextLine();
				System.out.println("Введите ФИО");
				String fio = in.nextLine();

				System.out.println("Введите возраст");
				int age = in.nextInt();

				System.out.println("Группа");
				int group = in.nextInt();

				System.out.println("Балл");
				double av = in.nextDouble();

				styd st=new styd(fio,age,group,av);
				s.add(st);
			}
			s.sort();
			s.print();
		}

	}
	

