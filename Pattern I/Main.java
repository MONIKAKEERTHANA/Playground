#include<iostream>
using namespace std;
int main()
{
  int n,i,j,c=1;
  cin>>n;
  for(i=n;i<4+n;i++)
  {
    for(j=1;j<=c;j++)
    {
      cout<<i;
    }
    c=c+1;
    cout<<"\n";
  }
  c=4;
  for(i=3+n;i>=n;i--)
  {
    for(j=c;j>0;j--)
    {
      cout<<i;
    }
    c=c-1;
    cout<<"\n";
  }
}
  