#include<iostream>
int main()
{
  int i=0,n;
  std::cin>>n;
  do
  {
    i++;
    n=n/10;
  }while(n>0);
  std::cout<<i;
}