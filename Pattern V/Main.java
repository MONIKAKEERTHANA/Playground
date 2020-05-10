#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k,l,r;
  cin>>n;
  l=1;
  r=n*n+1;
  for(i=n;i>0;i--)
  {
    for(k=i;k<n;k++)
      cout<<"--";
    	for(j=1;j<=i;j++)
    	{
      	cout<<l<<"*";
          l=l+1;
    	}
    	for(j=1;j<i;j++)
    	{
      	cout<<r<<"*";
          r=r+1;
    	}
    	cout<<r++<<endl;
    	r=r-(i-1)*2-1;
  }
}
  