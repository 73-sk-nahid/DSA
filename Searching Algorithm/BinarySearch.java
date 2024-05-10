class BinarySearch {
    static int search(int a[], int n, int x){
        int mid;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == x) {
                return mid;
            }
            if (a[mid] < x) {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = a.length;
        int x = 7;

        int index = BinarySearch.search(a, n, x);
        if (index == -1)
            System.out.println("Element is absent here");
        else
            System.out.println("Element position is: " + index);
    }
}
