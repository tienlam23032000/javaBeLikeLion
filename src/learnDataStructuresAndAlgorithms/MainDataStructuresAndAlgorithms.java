package learnDataStructuresAndAlgorithms;
public class MainDataStructuresAndAlgorithms {
    public static void main(String[] args) {
        MainDataStructuresAndAlgorithms test = new MainDataStructuresAndAlgorithms();
        int[] arr = {5, 2, 9, 3, 6, 8, 1, 7};
        test.quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    // bubbleSort
    public int[] bubbleSort(int[] arr){
        if (arr == null){
            System.out.println("array null");
            return null;
        } else if (arr.length == 1 || arr.length == 0){
            return arr;
        } else {
            for (int i = 0; i < arr.length; i ++){
                for (int j = i + 1; j < arr.length; j ++){
                    if (arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j]  = temp;
                    }
                }
            }
        }
        return arr;
    }


    //quickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}