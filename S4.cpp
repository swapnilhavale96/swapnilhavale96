#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;

    int i = 1;
    
    while (i<n)
    {
        if(n%i==0)
        {
            cout<<"Not prime For  "<< i <<endl;
        }
        else
        {
            cout<<" Prime for "<< i <<endl;
        }
        i = i + 1;
    }
}
