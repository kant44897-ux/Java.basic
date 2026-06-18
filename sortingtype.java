public class BasicSorting {

    public static void bubblesort(int n, int arr[]) {
        for (int trns = 0; trns < n - 1; trns++) {
            for (int j = 0; j < n - 1 - trns; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void slectionSort(int n, int arr[]) {
        for( int i = 0; i < n-1; i++){
            int minPos = i;
            for( int j = i + 1; j < n; j++){
                if( arr[minPos] < arr[j]){
                     minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }
     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       slectionSort(n, arr);

        System.out.println("Sorted array:");
        printArr(n, arr);

        sc.close();
    }
}
