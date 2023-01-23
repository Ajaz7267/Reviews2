package NonRepeatingNumber;

public class NonRepeating {
    public static void main(String args[]){
        int arr[] = {2,44,73,83,99,99,2,44,83,90};
        for(int i=0;i<arr.length;i++){
            int x =arr[i];
            int count=0;
            for(int k=0;k<arr.length;k++){
                if(arr[k]==x){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
