class LinearSearch {
    static int search(int a[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        int n = a.length;
        int x = 4;

        int index = search(a, n, x);
        if (index == -1)
            System.out.println("Element is absent here");
        else
            System.out.println("Element position is: " + index);
    }
}


// time complexity is O(n)