public class BubbleSortingClass {

    public BubbleSortingClass(){

    }

    public void ascendingOrder(int[] args){
        int n = args.length;

        for (int i=0; i< n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(args[j] > args[j+1]){
                    int k = args[j];
                    args[j] = args[j+1];
                    args[j+1] = k;
                }
            }
        }
    }

    public void descendingOrder(int[] args){
        int n = args.length;

        for (int i=0; i< n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(args[j] < args[j+1]){
                    int k = args[j];
                    args[j] = args[j+1];
                    args[j+1] = k;
                }
            }
        }
    }
}
