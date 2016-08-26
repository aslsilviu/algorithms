import java.io.IOException;
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

    public static void main(String args[]){
        int[] myArray = {2, 1, 6, 4, 8, 4, 5, 3, 9, 7};

        EntryPoint sortMe = new EntryPoint();
//        sortMe.bubbleSort(myArray);
//        sortMe.selectionSort(myArray);
//        sortMe.insertionSort(myArray);

        System.out.println(Arrays.toString(myArray));

    }
}


// 0 1 2 3