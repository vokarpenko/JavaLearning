public class Ship
{
    String name;
    int speed;
    String capitan;
    float cordX;
    float cordY;
    String getName() {return name;}
    int getSpeed() {return speed;}
    String getCapitan() {return capitan;}
    float getCordX() {return cordX;}
    float getCordY() {return cordY;}

    Ship(String name, int speed, String capitan, float cordX, float cordY)
    {
        this.capitan=capitan;
        this.name=name;
        this.speed= speed;
        this.cordX=cordX;
        this.cordY=cordY;
    }
    void setName(String name) {
        this.name = name ;
    }
    void setCapitan(String capitan) {
        this.capitan = capitan ;
    }
    void setSpeed(int speed) {
        this.speed = speed ;
    }
    void setCordX(float cordX) {
        this.cordX = cordX ;
    }
    void setCordY(float cordY){this.cordY=cordY;}
    void print()
    {
        System.out.println("Название корабля: "+this.name);
        System.out.println("Капитан: "+this.capitan);
        System.out.println("Скорость: "+this.speed);
        System.out.println("Координаты: "+"["+this.cordX+","+this.cordY+"]");

    }
    void moveUp()
    {
        this.cordY+=this.speed;
        return;
    }
    void moveDown()
    {
        this.cordY-=this.speed;
        return;
    }
    void moveRight()
    {
        this.cordX+=this.speed;
        return;
    }
    void moveLeft()
    {
        this.cordX-=this.speed;
        return;
    }
}
