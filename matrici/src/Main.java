public class Main {
    public static void  main(String args[]){
        Matrix A = new Matrix();
        A.read();
        Matrix B = new Matrix();
        B.read();
        A.print("A");
        B.print("B");
        A.plus(B).print("Сумма");
        A.minus(B).print("Разность");
        A.mulptiply(B).print("Произведение");
        A.transpose();
        A.print("Транспонированная");
    }
}
