public class Bubble implements Container {
    double arr[];
     Bubble(double a[]){
         this.arr=a;
    }
    public  void sort(){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                double tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

    public void foreach(){
         for(int i=0;i<arr.length;i++){
             arr[i] = Math.sqrt(arr[i]);
         }
    }
}
