//Heap Sort
public class Main {
    public static void main(String[] args)
    {
        int[] arr = {22,13,17,11,10,14,12};
        Main hs = new Main();
        hs.sort(arr);
        hs.printArray(arr);
    }
    void sort(int[] arr)
    {
        int len = arr.length;
        for(int i=len/2-1;i>=0;i--)
        {
            heapify(arr, len, i);
        }

        //swap the elements and heapify again
        for(int i=len-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
    void heapify(int[] arr, int n, int i)
    {
        int largest = i;  //parent node index position
        int leftindex = 2*i+1; //left child index
        int rightindex = 2*i+2; //right child index
        if(leftindex < n && arr[leftindex] > arr[largest])
        {
            largest = leftindex;
        }
        if(rightindex < n && arr[rightindex] > arr[largest])
        {
            largest = rightindex;
        }
        if(largest != i)
        {
            //swaping
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
    void printArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}