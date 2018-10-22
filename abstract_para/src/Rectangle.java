public class Rectangle extends Figure
{
    Rectangle(String name,int a,int b)
    {
        this.a=a;
        this.b=b;
        this.name=name;
    }
    double P()
    {
        return 2*(a+b);
    }
    double S()
    {
        return a*b;
    }
}
