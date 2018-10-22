public class SmartPhone extends Mobile
{
    int OS;
    SmartPhone(String svyaz,double vremya_raboti, int proizvoditelnost,int OS)
    {
        super(svyaz,vremya_raboti,proizvoditelnost);
        this.OS=OS;
    }
    void print()
    {
        super.print();
        System.out.println("Версия ОС:"+OS);
    }
    void OS_change()
    {
        System.out.println("Введите новую версию ОС: ");
        OS=in.nextInt();
    }
}
