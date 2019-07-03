package sort;

/**
 * 选择排序
 * Created by haoweima on 2019/7/3.
 */
public class Sort03 implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int index;
        int Sentry;
        for(int i = 0; i < arr.length; i++){
            Sentry = Integer.MIN_VALUE;
            index = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] > Sentry){
                    Sentry = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
