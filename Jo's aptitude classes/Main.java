#include<iostream>
using namespace std;
int main()
{
  int a,b,c,hcf,gcd,i,min;
  cin>>a>>b>>c>>hcf;
  min = (a < b ? a : b);
  min = (min < c ? min : c);
  for(i=min;i>0;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      gcd=i;
      break;
    }
  }
  if(gcd==hcf)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}