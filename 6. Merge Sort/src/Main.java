public class Main
{
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args)
    {
        int[] inputArr = {48, 36, 13, 52, 19, 21};
        Main ms = new Main();
        ms.sort(inputArr);
        for(int i:inputArr)
        {
            System.out.print(i+" ");
        }
    }
    public void sort(int[] inputArr)
    {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int lowerindex, int higherindex)
    {
        if(lowerindex < higherindex)
        {
            int middle = lowerindex+(higherindex-lowerindex)/2;
            //sort left side of array
            divideArray(lowerindex, middle);

            //sort the right side of the array
            divideArray(middle+1, higherindex);
            mergeArray(lowerindex, middle, higherindex);
        }

    }
    public void mergeArray(int lowerindex, int middle, int higherindex)
    {
        for (int i = lowerindex; i <= higherindex; i++)
        {
            tempMergeArr[i] = array[i];
        }
        int i = lowerindex;
        int j = middle + 1;
        int k = lowerindex;
        while(i<=middle && j<=higherindex)
        {
            if(tempMergeArr[i] <= tempMergeArr[j])
            {
                array[k] = tempMergeArr[i];
                i++;
            }
            else
            {
                array[k] = tempMergeArr[i];
                j++;
            }
            k++;
        }
        while(i<=middle)
        {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }



}