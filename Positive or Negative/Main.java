#include<iostream>
int main()
{
  int s;
  std::cin>>s;
  if(s>=0)
  {
    std::cout<<s<<" is a positive number.";
  }
  else
  {
    std::cout<<s<<" is a negative number.";
  }
}