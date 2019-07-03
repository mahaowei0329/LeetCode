package sort;

/**
 * 插入排序
 * Created by haoweima on 2019/7/3.
 */
public class Sort01 implements Sort{

    @Override
    public int[] sort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[j] <= arr[i]){
                    continue;
                }else{
                    int temp = arr[i];
                    sweep(arr, j, i);
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public void sweep(int[] arr, int begin, int end){
        for(int i = end; i > begin; i--){
            arr[i] = arr[i - 1];
        }
    }
}
