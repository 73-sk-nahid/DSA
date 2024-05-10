class MergeSort {
    static void Merge(int a[], int start, int mid, int end){
        int i,j,k;
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for(i=0; i<n1; i++){
            leftArray[i] = a[start+i];
        }

        for(j=0; j<n2; j++){
            rightArray[j] = a[mid+1+j];
        }

        i=0;
        j=0;
        k=start;

        while (i<n1 && j<n2) {  
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            }
            else{
                a[k] = rightArray[j];
                j++;
            }
            k++; 
        }

        while (i<n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }


    static void mergeSort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid+1, end);
            Merge(a, start, mid, end);
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        int n = a.length;
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        mergeSort(a, 0, n-1);
        System.out.print("\nSorted   Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}