package interview;

import sort.Sort;

/**
 * 算法题：给一个无序数组，求最大连续整数的个数。
 例如： 给定数组 1 4 3 6  8 2 11 12，  那么1 2 3 4是最大的连续的整数  所以结果是4
 * Created by haoweima on 2019/7/3.
 */
public class Code001 implements Sort{

    @Override
    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

        return arr;
    }

    private void quickSort(int[] arr, int begin, int end){
        if(begin > end){
            return;
        }

        int l = begin, r = end;
        int key = arr[begin];

        while (l < r){
            while(l < r && arr[r] >= key){
                r--;
            }
            arr[l] = arr[r];

            while(l < r && arr[l] <= key){
                l++;
            }
            arr[r] = arr[l];
        }

        arr[l] = key;
        quickSort(arr, begin,l - 1);
        quickSort(arr, l + 1, end);
    }
}
