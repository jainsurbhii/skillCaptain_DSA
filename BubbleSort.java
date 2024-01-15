public class Main {
    public static void main(String[] args) {
        int arr[]={1,9,3,4,7,5,8};
        bubbleSort(arr);
    }
    static void bubbleSort(int array[]){
        int n=array.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

