import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Svyaz;
        double Vremya_raboti;
        int Proizvoditelnost;
        int n;
        int os;
        Mobile[] listMobile = new Mobile [10];
        SmartPhone[] listSmart = new SmartPhone [10];
        int km=0;
        int ks=0;
        while (true)
        {
            System.out.println();
            System.out.println("1.Добавить устройство");
            System.out.println("2.Показать все телефоны");
            System.out.println("3.Показать все смартфоны");
            System.out.println("4.Изменить данные телефона");
            System.out.println("5.Изменить данные смартфона");
            System.out.println("6.Закрыть программу");
            int x=in.nextInt();
            switch (x){
                case 1:
                    System.out.println("1.Телефон");
                    System.out.println("2.Смартфон");
                    int y=in.nextInt();
                    if (y==1)
                    {
                        System.out.println("Формат связи: ");
                        Svyaz = in.nextLine();
                        Svyaz = in.nextLine();
                        System.out.println("Время работы: ");
                        Vremya_raboti = in.nextDouble();
                        System.out.println("Производительность: ");
                        Proizvoditelnost = in.nextInt();
                        Mobile temp = new Mobile(Svyaz,Vremya_raboti,Proizvoditelnost);
                        listMobile[km]=temp;
                        km++;
                     }
                    else
                    {
                        System.out.println("Формат связи: ");
                        Svyaz = in.nextLine();
                        Svyaz = in.nextLine();
                        System.out.println("Время работы: ");
                        Vremya_raboti = in.nextDouble();
                        System.out.println("Производительность: ");
                        Proizvoditelnost = in.nextInt();
                        System.out.println("ОС:");
                        os =in.nextInt();
                        SmartPhone temp = new SmartPhone(Svyaz,Vremya_raboti,Proizvoditelnost,os);
                        listSmart[ks]=temp;
                        ks++;
                    }
                    break;
                case 2:
                        for(int i=0;i<=km-1;i++)
                        {
                            System.out.println();
                            System.out.println("Телефон №"+i);
                            listMobile[i].print();
                        }
                        break;
                case 3:
                        for(int i=0;i<=ks-1;i++)
                        {
                            System.out.println();
                            System.out.println("Смартфон №"+i);
                            listSmart[i].print();
                        }
                        break;
                case 4:
                        System.out.println("Номер телефона: ");
                        int number=in.nextInt();
                        System.out.println("1.Изменить формат связи\n2.Изменить время работы\n3.Изменить производительность");
                        int type=in.nextInt();
                        switch (type)
                        {
                            case 1:listMobile[number].svyaz_change();
                                break;
                            case 2:listMobile[number].vremya_raboti_change();
                                break;
                            case 3:listMobile[number].proizvoditelnost_change();
                                break;
                        }
                        break;
                case 5:
                        System.out.println("Номер смартфона: ");
                        number=in.nextInt();
                        System.out.println("1.Изменить формат связи\n2.Изменить время работы\n3.Изменить производительность\n4.Изменить ОС");
                        type=in.nextInt();
                        switch (type)
                        {
                            case 1:listSmart[number].svyaz_change();
                                break;
                            case 2:listSmart[number].vremya_raboti_change();
                                break;
                            case 3:listSmart[number].proizvoditelnost_change();
                                break;
                            case 4:listSmart[number].OS_change();
                                break;
                        }
                        break;
                case 6:
                    System.exit(0);
                    break;
                }
            }
        }
    }