#include <iostream>

using namespace std;


class Car {
    public:
    string carName;
    string carModel;
    int manufactureDate;
    Car(string name, string model, int date){
        carName = name;
        carModel = model;
        manufactureDate = date;
    }
};

int main(){
    Car car1("Toyota", "Corona", 1990);
    Car car2("Toyota", "Supra", 2019);

    cout << car1.carName << " " << car1.carModel << " " << car1.manufactureDate << "\n";
    cout << car2.carName << " " << car2.carModel << " " << car2.manufactureDate << "\n";

    return 0;
}