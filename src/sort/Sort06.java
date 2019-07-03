package sort;

/**
 * 快速排序
 * Created by haoweima on 2019/7/3.
 */
public class Sort06 implements Sort{
    @Override
    public int[] sort(int[] arr) {
        sortPart(arr, 0, arr.length - 1);
        return arr;
    }

    private void sortPart(int[] arr, int low, int high){
        if(low > high){
            return;
        }

        int begin = low;
        int end = high;
        int pivot = arr[begin];

        while(begin < end){
            while(begin < end && arr[end] >= pivot){
                end--;
            }

            arr[begin] = arr[end];

            while(begin < end && arr[begin] <= pivot){
                begin++;
            }

            arr[end] = arr[begin];
        }

        arr[begin] = pivot;
        sortPart(arr, low, begin - 1);
        sortPart(arr, begin + 1, high);
    }
}
