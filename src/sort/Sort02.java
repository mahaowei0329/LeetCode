package sort;

import java.util.Random;

/**
 * 希尔排序
 * Created by haoweima on 2019/7/3.
 */
public class Sort02 implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int k = new Random(47).nextInt(arr.length / 2);
        shellSort(arr, k);

        return arr;
    }

    public void shellSort(int[] arr, int k){
        if(k == 0){
            return;
        }

        for(int i = k; i < arr.length; i += k){
            for(int j = 0; j < i; j += k){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    sweep(arr, j, i, k);
                    arr[j] = temp;
                }
            }
        }
        shellSort(arr, k - 1);
    }

    private void sweep(int[] arr, int begin, int end, int k){
        for(int i = end; i > begin; i-=k){
            arr[i] = arr[i - k];
        }
    }
}
