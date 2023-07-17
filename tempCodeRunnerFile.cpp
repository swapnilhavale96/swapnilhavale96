#include <iostream>
using namespace std;

int main() {
  // Define item names, prices, and quantities
  string item1 = "Bread";
  float price1 = 55;
  int quantity1;

  string item2 = "Milk";
  float price2 = 26;
  int quantity2;

  string item3 = "Eggs";
  float price3 = 6;
  int quantity3;

  // Get the quantities of each item from the user
  cout << "Enter the quantity of " << item1 << ": ";
  cin >> quantity1;

  cout << "Enter the quantity of " << item2 << ": ";
  cin >> quantity2;

  cout << "Enter the quantity of " << item3 << ": ";
  cin >> quantity3;

  // Calculate the total cost
  float totalCost = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

  // Print the bill
  cout << "\n===== Bill =====" << endl;
  cout << item1 << " x " << quantity1 << " = $" << (price1 * quantity1) << endl;
  cout << item2 << " x " << quantity2 << " = $" << (price2 * quantity2) << endl;
  cout << item3 << " x " << quantity3 << " = $" << (price3 * quantity3) << endl;
  cout << "-----------------" << endl;
  cout << "Total: $" << totalCost << endl;

  return 0;
}