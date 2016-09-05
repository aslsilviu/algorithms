import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.out;
import static java.lang.System.out;
public class algorithms {

    public void bubbleSort(int[] array) {
        for (int j = array.length-1; j > 1; j--) {

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }

    public void selectionSort(int array[]){
        for (int i=0; i<array.length; i++){
            int min = i;
            for (int j=i+1; j<array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }

    public void insertionSort(int array[]){
        for (int i=1; i<array.length; i++ ){
            int j=i;
            int toInsert = array[i];
            while(j>0 && array[j-1]>toInsert){
                array[j] = array[j-1];
                j--;
            }
            array[j] = toInsert;
        }
    }

    public int[] mergeSort(int array[]){
        System.out.println(Arrays.toString(array));
        if (array.length == 1){
            return array;
        }
        if(array.length ==2){
            if(array[0] <= array[1]){
                return array;
            }
            else{
                int arr[] = new int[2];
                arr[0] = array[1];
                arr[1] = array[0];
                return arr;
            }
        }
        //length >=3
        int middle = array.length/2;
        int arr1[] = new int[middle];
        int arr2[] = new int[array.length-middle];
        for (int i=0, j=0; i<array.length;i++){
            if (i<middle){
                arr1[i] = array[i];
            }
            else{
                arr2[j++] = array[i];
            }

        }
//        mergeSort(arr1);
//        mergeSort(arr2);

        return mergeSortInterclasare(mergeSort(arr1),mergeSort(arr2));

    }
    int[] mergeSortInterclasare(int array1[], int array2[]){
        int[] array11 = Arrays.copyOf(array1, array1.length+1);
        int[] array22 = Arrays.copyOf(array2, array2.length+1);
        int len1 = array11.length;
        int len2 = array22.length;

        array11[len1-1] = 9999;
        array22[len2-1] = 9999;
        int interclasat[] = new int[len1+len2-2];
        int i=0, j=0, x=0;

        while(array11[i] != 9999 || array22[j] != 9999){
            if(array11[i] <= array22[j]){
                interclasat[x++] = array11[i++];
            }
            else{
                interclasat[x++] = array22[j++];
            }
        }
        return interclasat;
    }

    public static void main(String args[]){
//        int[] myArray = {2, 1, 6, 4, 8, 4, 5, 3, 9, 7};
        int[] myArray = {2,1,3,5,7};

//        EntryPoint sortMe = new EntryPoint();
        algorithms sortMe = new algorithms();
//        sortMe.bubbleSort(myArray);
//        sortMe.selectionSort(myArray);
//        sortMe.insertionSort(myArray);
        System.out.println("sorted: " + Arrays.toString(sortMe.mergeSort(myArray)));

        System.out.println(Arrays.toString(myArray));

//        System.out.println("------------------------");
//        int[] myArray1 = {1, 3, 6, 9,11,12,16};
//        int[] myArray2 = {2, 4, 5, 10, 11,16};
//        System.out.println(Arrays.toString(sortMe.mergeSortInterclasare(myArray1, myArray2)));

    }
}


// 0 1 2 3