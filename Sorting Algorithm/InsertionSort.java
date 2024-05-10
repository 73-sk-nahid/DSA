class InsertionSort {
    static void Sort(int a[], int n){
        int i, j, key;
        for(j=1; j<n; j++){
            key = a[j];
            i = j -1;
            while ((i>-1) && a[i]>key) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
    }
    

    public static void main(String args[]){
        int array[] = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        int arrayLength = array.length;
        System.out.print("before Sort: ");
        for(int i=0; i<arrayLength; i++){
            System.out.print(array[i]+" ");
        }
        Sort(array, arrayLength);
        System.out.print("\nAfter  Sort: ");
        for(int i=0; i<arrayLength; i++){
            System.out.print(array[i]+" ");
        }
    }
}
