#include <iostream>
using namespace std;

int addNumbers(int num1, int num2){
    int sum = num1 + num2;
    return sum;
}

void swapNumbers(int &x, int &y){
    int temp = x;
    x = y;
    y = temp;
}

int recursion(int i){
    if (i > 0){
        return i + recursion(i - 1);
    }
    else
    {
        /* code */
        return 0;
    }
}
    

int main(){
    int x = 1;
    int y = 2;
    cout << addNumbers(x, y);
    cout << "\nbefore swapping: " << x << "" << y;
    swapNumbers(x, y);
    cout << "\nAfter swapping: " << x << "" << y;
    cout << "\n" << recursion(10);
}