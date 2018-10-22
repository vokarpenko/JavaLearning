import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        WarShip warShip1 = new WarShip("Эсминец",15,"Макаров",0,10, 3,11,10);
        WarShip warShip2 = new WarShip("Крейсер",30,"Епифанцев",0,20, 5,2,5);
        UnderWaterShip warShip3 = new UnderWaterShip("Тополь М1",30,"Подводный",20,15, 5,2,3,20);
        /*
        warShip2.print();
        warShip2.moveDown();
        warShip2.shoot(warShip1);
        warShip2.print();
        */
        warShip3.print();
        warShip3.dive();
        warShip3.print();
    }

}

