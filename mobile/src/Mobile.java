import java.util.Scanner;

public class Mobile
{
    Mobile(String svyaz,double vremya_raboti, int proizvoditelnost)
    {
     this.svyaz=svyaz;
     this.vremya_raboti=vremya_raboti;
     this.proizvoditelnost=proizvoditelnost;
    }
    String svyaz;
    double vremya_raboti;
    int proizvoditelnost;
    void print()
    {
        System.out.println("Формат связи= "+svyaz);
        System.out.println("Время работы= "+vremya_raboti);
        System.out.println("Производительность= "+proizvoditelnost);
    }
    Scanner in = new Scanner(System.in);
    void svyaz_change()
    {
        System.out.println("Введите новый формат связи: ");
        svyaz=in.nextLine();
    }
    void vremya_raboti_change()
    {
        System.out.println("Введите новое время работы: ");
        vremya_raboti=in.nextDouble();
    }
    void proizvoditelnost_change()
    {
        System.out.println("Введите новую производительность: ");
        proizvoditelnost=in.nextInt();
    }
}
