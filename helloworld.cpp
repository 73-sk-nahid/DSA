#include <iostream>
#include <string>
using namespace std;

int main() {
  string fullName;
  string lastName = "Ahmed";
  cout << "Type your full name: ";
  getline (cin, fullName);
  cout << "Your name is: " << fullName << " " << lastName;
  return 0;
}
