import java.util.Arrays;

import static org.junit.Assert.*;

public class algorithmsTest {
    @org.junit.Test
    public void insertionSortDesc() throws Exception {
        algorithms ins = new algorithms();
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        ins.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, arr);

    }
    @org.junit.Test
    public void insertionSortAsc() throws Exception {
        algorithms ins = new algorithms();
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        ins.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, arr);

    }
}