public class MergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;

    public static void main(String[] args) {
        int[] inputArray={56,23,32,9,74,90,1};
        MergeSort ms= new MergeSort();
        ms.sort(inputArray);

        for (int i=0;i<=inputArray.length-1;i++){
            System.out.println(inputArray[i]);
        }
    }
    public void sort(int[] inputArray){
        this.array=inputArray;
        this.length=inputArray.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int lowerIndex, int higherIndex){

        if(lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;

            divideArray(lowerIndex,middle);//It will sort left side of array

            divideArray(middle+1,higherIndex);//It will sort right side of array
            mergeArray(lowerIndex,middle,higherIndex);
        }

    }
    public void mergeArray(int lowerIndex, int middle, int higherIndex){
        for(int i=lowerIndex;i<=higherIndex;i++){
            tempMergeArr[i]=array[i];
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;

        while (i<=middle && j<=higherIndex){
            if(tempMergeArr[i]<= tempMergeArr[j]){
                array[k]=tempMergeArr[i];
                i++;
            }
            else {
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }

    }
}
