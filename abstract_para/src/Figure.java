abstract public class Figure
{
    String name;
    int a,b;
    abstract double P();
    abstract double S();
    void print()
    {
        System.out.println("Фигура"+name+" с размерами "+a+" "+b);
    }
}
