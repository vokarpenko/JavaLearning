public class Ellipse extends Figure
{
    Ellipse(String name,int a,int b)
    {
        this.a=a;
        this.b=b;
        this.name=name;
    }
    double P()
    {
        return 4*(Math.PI*a*b+a-b)/(a+b);
    }
    double S()
    {
        return Math.PI*a*b;
    }
}
