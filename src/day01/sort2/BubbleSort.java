package day01.sort2;

/**
 * Created by QiYan on 2021/12/21.
 */
public class BubbleSort {

    /**
     * 1、时间复杂度（O(n)^2） 排序总次数：1+2+3+...(n-1)
     * 2、数组有次序时排序优化
     */
    public void bubbleSort(int[] array) {
        boolean flag = true;
        for (int i = 1; i < array.length && flag; i++) {
            flag = false;
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j] < array[j - 1]) {//相邻元素
                    swap(array, j, j - 1);
                    flag = true;
                }
            }
        }
    }

    public void swap(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
        array[i] = array[i] ^ array[j];
        array[j] = array[j] ^ array[i];
        array[i] = array[j] ^ array[i];

    }



}
