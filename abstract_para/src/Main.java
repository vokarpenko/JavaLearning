import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.Scanner;

public class Main
{
     static void main(String[] args)
     {

         Scanner in = new Scanner(System.in);
         System.out.println("1- прямоугольник\n2-эллипс");
         int x = in.nextInt();
         if (x==1)
         {
             String name="Прямоугольник";
             System.out.println("Введите стороны прямоугольника");
             int a = in.nextInt();
             int b = in.nextInt();
             Rectangle rectangle = new Rectangle(name,a,b);
             rectangle.P();
         }
         else  if (x==2)
         {
             String name="Элипс";
             System.out.println("Введите размеры элипса");
             int a = in.nextInt();
             int b = in.nextInt();
             Ellipse ellipse = new Ellipse(name,a,b);
         }
     }
}
