class QuickSort {
    static int Sort(int a[], int start, int end){
        int pivot = a[end];
        int i = start-1;

        for(int j=start; j<=end; j++){
            if (a[j]<pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;

        return (i+1);
    }


    static void quickSort(int a[], int start, int end) {
        if (start < end) {
            int p = Sort(a, start, end);
            quickSort(a, start, p-1);
            quickSort(a, p+1, end);
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        int n = a.length;
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        quickSort(a, 0, n-1);
        System.out.print("\nSorted   Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}