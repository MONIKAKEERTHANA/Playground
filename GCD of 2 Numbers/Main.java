#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,min,gcd,i;
  cin>>a>>b;
  min=(a>b)?a:b;
  for(i=min;i>=1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      gcd=i;
      break;
    }
  }
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd;
}