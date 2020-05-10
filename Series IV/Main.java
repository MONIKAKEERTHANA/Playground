#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,c=0,a;
  cin>>n;
  for(i=1;c<n;c++,i++)
  {
    a=i*i;
    if(a%2==0)
    {
      cout<<a-2<<" ";
    }
    else
    {
      cout<<a-1<<" ";
    }
  }
}