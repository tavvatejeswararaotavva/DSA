package Arrays;

public class FINDMAXANDMIN {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

       System.out.println( findmax(arr));
       System.out.println(findmin(arr));
    }
    public static int findmin(int[] arr){
        int min = arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }

    public static int  findmax(int[] arr) {
        int max = arr[0];
        for(int num: arr){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
}
