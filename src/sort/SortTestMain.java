package sort;

import interview.Code001;

/**
 * Created by haoweima on 2019/7/3.
 */
public class SortTestMain {

//    public static void main(String[] args) {
//        int[] arr = {9, 8, 6, 12, 24, 3, 43, 15, 6, 1, 2, 0, 0};
//        Sort sort = new Code001();
//        int[] res = sort.sort(arr);
//
//        for(int i = 0; i < res.length; i++){
//            System.out.print(res[i] + " ");
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 12, 24, 3, 43, 15, 6, 1, 2, 0, 0};
        Sort sort = new Code001();
        int[] res = sort.sort(arr);
        int[] weight = new int[res.length];

        for(int i = 1; i < res.length; i++){
            if(res[i - 1] + 1 == res[i]){
                weight[i] = weight[i - 1] + 1;
            }
        }

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < weight.length; i++){
            System.out.print(weight[i] + " ");
        }
    }
}
