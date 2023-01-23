package MissingNumber;

public class MissingNumber {
    public static void main(String args[]){

        int arr[] = {1,2,4,5,6};
        int x = arr.length+1;
        int add = (x*(x+1))/2;

            for(int j=0;j<arr.length;j++){
                add = add - arr[j];
            }
        System.out.print(" Missing Number is:" +add);

    }

        }

