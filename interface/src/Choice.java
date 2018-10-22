public class Choice implements Container {
    double arr[];
    Choice(double a[]){
        this.arr=a;
    }
    public void sort(){
        for (int i = 0; i < arr.length; i++) {
            double min = arr[i];
            int min_i = i;
        for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                double tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
    public void foreach(){
        for (int i=0;i<arr.length;i++){
            arr[i] = Math.log(arr[i]);
        }
    }
}
