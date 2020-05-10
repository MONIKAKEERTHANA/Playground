#include<iostream>
int main()
{
  int n,i,c;
  std::cin>>n;
  for(i=6;c<n;c=c+1,i=i+(5*c))
  {
    std::cout<<i<<" ";
  }
}