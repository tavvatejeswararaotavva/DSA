package Arrays;

public class MoveZerostoright {
    public static void main(String[] args){
        int[] arr = {1,2,0,3,0,4,5,0,6,0,7,8,9,10};

        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++] =arr[i];
            }
        }
        if(index<arr.length){
            for(int i =index;i<arr.length;i++){
                arr[i]=0;
            }
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
