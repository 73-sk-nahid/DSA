#include <iostream>
using namespace std;

int main(){
    bool ship[4][4] = 
    {
        {0, 0, 0, 1},
        {0, 1, 0, 0},
        {1, 0, 0, 0},
        {0, 0, 1, 0}
    };

    int hits = 0;
    int numberOfTurns = 0;

    while (hits < 4)
    {
        /* code */
        int row, column;
        cout << "Selecting Co-ordinates....\n";
        cout << "Choose a row (0-3): ";
        cin  >> row;
        cout << "Choose a column (0-3): ";
        cin >> column;

        if (ship[row][column])
        {
            /* code */
            ship[row][column] = 0;
            hits++;

            cout << "Hits" << (4-hits) << "left.\n\n";
        }
        else
        {
            cout << "Miss\n\n";
        }
        numberOfTurns++;
    }

    cout << "Victory\n";
    cout << "You win in" << numberOfTurns << "turns";
    
    
    return 0;
}