package sort;

/**
 * 归并排序
 * Created by haoweima on 2019/7/3.
 */
public class Sort05{

    public int[] sort(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        int i = 0, j = 0;
        for(int index = 0; index < res.length; index++){
            if(arr1[i] > arr2[j]){
                res[index] = arr2[j];
                j++;
            }else{
                res[index] = arr1[i];
                i++;
            }

            if(i == arr1.length){
                index++;
                for(; j < arr2.length; j++, index++){
                    res[index] = arr2[j];
                }
                break;
            }

            if(j == arr2.length){
                index++;
                for(; i < arr1.length; i++, index++){
                    res[index] = arr1[i];
                }
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,0,1,2,3,6,6,8,9,12,15,24,43};
        int[] arr2 = {4,5,7,10,11,13,14,16};

        Sort05 sort = new Sort05();
        int[] res = sort.sort(arr1, arr2);

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
