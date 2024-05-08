class BubbleSort {
    static void Sort(int a[], int n){
        int i, j, temp;
        for(i=0; i<n-1; i++){
            for(j=i+1; j<n; j++){
                if (a[j] < a[i]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    

    public static void main(String args[]){
        int array[] = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        int arrayLength = array.length;
        System.out.println("before Sort");
        for(int i=0; i<arrayLength; i++){
            System.out.println(array[i]);
        }
        Sort(array, arrayLength);
        System.out.println("After Sorting");
        for(int i=0; i<arrayLength; i++){
            System.out.println(array[i]);
        }
    }
}
