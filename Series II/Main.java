#include<iostream>
#include<math.h>
int main()
{
  int n,i,c=0;
  std::cin>>n;
  for(i=11;c<n;i=i+4,c=c+1)
  {
    std::cout<<pow(i,2)<<" ";
  }
}