public class WarShip extends Ship
{
    int kolWeapon;
    int rangeWeapon;
    int health;
    WarShip(String name, int speed, String capitan, float cordX, float cordY, int kolWeapon, int rangeWeapon, int health)
    {
        super(name,speed,capitan,cordX,cordY);
        this.health=health;
        this.kolWeapon = kolWeapon;
        this.rangeWeapon = rangeWeapon;
    }
    void shoot(WarShip o2)
    {
        this.kolWeapon -=1;
        double range = Math.sqrt(Math.pow(this.cordX-o2.cordX,2)+Math.pow(this.cordY-o2.cordY,2));
        if (range<=this.rangeWeapon)
        {
            System.out.println(this.name+ " попал по "+o2.name);
            o2.health-=1;
        }
        else System.out.println(this.name+ " не попал по "+o2.name);
        return;
    }
    void print()
    {   Ship temp = new Ship(this.name,this.speed,this.capitan,this.cordX,this.cordY);
        temp.print();
        System.out.println("Количество оружия: "+this.kolWeapon);
        System.out.println("Дальность оружия: "+this.rangeWeapon);
        System.out.println("Здоровье: "+this.health);
    }
}


