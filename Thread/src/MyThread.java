import java.util.Random;

public class MyThread extends Thread {
    Random random = new Random();
    int myArr[];
    int max = Integer.MIN_VALUE;
    MyThread(int myArr[]){
        this.myArr=myArr;
    }
    public void run(){
        for (int i=0;i<myArr.length;i++){
            max=Math.max(myArr[i],max);
        }
    }
    int getMax(){
        return max;
    }
}
