public class UnderWaterShip extends WarShip
{
    int deep;
    String state;
    UnderWaterShip(String name,int speed, String capitan, float cordX, float cordY,int kol_weapon,int range_weapon,int health,int deep)
    {
        super(name,speed,capitan,cordX,cordY,kol_weapon,range_weapon, health);
        this.deep=deep;
        this.state="На воде";
    }
    void print()
    {
        WarShip temp = new WarShip(this.name,this.speed,this.capitan,this.cordX,this.cordY,this.kolWeapon,this.rangeWeapon,this.health);
        temp.print();
        System.out.println("Глубина погружения: "+this.deep);
        System.out.println("Текущее состояние: "+this.state);


    }
    void dive()
    {
         if (this.state=="На воде")
         {
             this.speed+=20;
             this.state="Под водой";
         }
         else{
             this.speed-=20;
             this.state="На воде";
         }
         return;
    }
}
