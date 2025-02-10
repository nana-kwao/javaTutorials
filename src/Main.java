import java.util.Arrays;

public class Main {
/*    //Creating a static method so that we would not to create an instance of the class before
    // using the method

    //bubbleSortAscending method
    static void bubbleSortAscending(int[] arrg){
        int n = arrg.length;

        for (int x = 0; x < n-1; x++){
            for (int y = 0; y <n-1-x; y++){
                if (arrg[y] > arrg[y+1]){
                    int z = arrg[y];
                    arrg[y] = arrg[y+1];
                    arrg[y+1] = z;
                }
            }
        }
    }

    //bubbleSortDescending method
    static void bubbleSortDescending(int[] arrg){
        int n = arrg.length;

        for (int x = 0; x < n-1; x++){
            for (int y = 0; y <n-1-x; y++){
                if (arrg[y] < arrg[y+1]){
                    int z = arrg[y];
                    arrg[y] = arrg[y+1];
                    arrg[y+1] = z;
                }
            }
        }
    }
*/

    public static void main(String[] args) {
        int[] MenAges = {54,13,65,72,35,23,63,11,45,73};
        int[] WomenAges = {44,13,75,22,35,23,63,11,55,74};

/*        bubbleSortAscending(MenAges);
        bubbleSortDescending(WomenAges);

        System.out.println(Arrays.toString(MenAges));
        System.out.println(Arrays.toString(WomenAges));

        //Get the array from the user

       Scanner scanner = new Scanner(System.in);

        //get array size
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        //create new array with the size above
        int[] ages = new int[arraySize];

        //get array element from user
        System.out.println("Enter the elements: ");
        for (int x=0; x<arraySize; x++){
            ages[x] = scanner.nextInt();
        }

        //sort ascending
        bubbleSortAscending(ages);

        //print array
        System.out.println(Arrays.toString(ages));
*/

        //instantiate Sorting class
        BubbleSortingClass sorting = new BubbleSortingClass();


        sorting.ascendingOrder(MenAges);
        System.out.println(Arrays.toString(MenAges));

        sorting.descendingOrder(WomenAges);
        System.out.println(Arrays.toString(WomenAges));
    }
}