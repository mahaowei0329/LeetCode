package sort;

/**
 * 冒泡
 * Created by haoweima on 2019/7/3.
 */
public class Sort04 implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
