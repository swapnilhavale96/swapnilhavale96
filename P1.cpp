#include <iostream>
using namespace std;

int main() {
    int itemCount;
    double price, total = 0.0;

    cout << "Enter the number of items purchased: ";
    cin >> itemCount;

    cout << endl;

    for (int i = 1; i <= itemCount; i++) {
        cout << "Enter the price of item " << i << ": ";
        cin >> price;
        total += price;
    }

    cout << endl;

    cout << "Total bill amount: $" << total << endl;

    return 0;
}