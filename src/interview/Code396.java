package interview;


/**
 * 旋转函数
 * 给定一个长度为 n 的整数数组 A 。
 *
 * 假设 Bk 是数组 A 顺时针旋转 k 个位置后的数组，我们定义 A 的“旋转函数” F 为：
 *
 * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]。
 *
 * 计算F(0), F(1), ..., F(n-1)中的最大值。
 */
public class Code396 {
    public int maxRotateFunction(int[] A) {
        if(A.length == 0){
            return 0;
        }

        int[] res = new int[A.length];
        for(int i = 0; i < A.length; i++){
            res[i] = getFuncResult(i, A);
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < res.length; i++){
            if(res[i] > max){
                max = res[i];
            }
        }

        return max;
    }

    private int getFuncResult(int n, int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += i * arr[n];
            n++;
            n = n % arr.length;
        }
        return sum;
    }
}
