public class laba1_2 {

    public int removeElementInplace(int[] arr, int val) {
        if ( arr.length > 100 || val<0 || val > 100) {
            return 0;
        } else {
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>50 || arr[i]<0){
                    return 0;
                }
                if (arr[i] != val) {
                    arr[k] = arr[i];
                    k++;
                }
            }
            return k;
        }
    }

    void main() {

        int[] arr = {51,4,4,1};
        int val=-5;
        int k = removeElementInplace(arr,val);
        System.out.print(k + ", arr = [");
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                System.out.print(arr[i] );
            } else {
                System.out.print("_" );
            }
            if(i < arr.length - 1) System.out.print(", ") ;
        }
        System.out.print("]");

    }
}
