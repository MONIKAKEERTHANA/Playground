#include<iostream>
#include <cmath>
int main()
{
  float n,a=0.5,b=1.5,c,count,i;
  std::cin>>n;
  if(n==1)
  {
    std::cout<<a;
  }
  else if(n==2)
  {
    std::cout<<a<<" "<<b<<" ";
  }
  else
  {
    count=n-1;
    std::cout<<a<<" "<<b<<" ";
    double x=b;
    for(i=2;i<=count;i++)
    {
      double t=pow(3,i-1);
      x=t+x;
      std::cout<<x<<" ";
    }
  }
}