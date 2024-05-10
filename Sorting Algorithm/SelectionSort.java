class SelectionSort {
    static void Sort(int a[], int n) {
        int i, j;
        for (i = 0; i < n - 1; i++) {
            int iMin = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[iMin]) {
                    iMin = j;
                }
            }
            if (iMin != i) {
                int temp = a[i];
                a[i] = a[iMin];
                a[iMin] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        int n = a.length;
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        Sort(a, n);
        System.out.print("\nSorted   Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}