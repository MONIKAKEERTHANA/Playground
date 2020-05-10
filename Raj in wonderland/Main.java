#include<iostream>
#include<string>
int main()
{
  int a;
  std::cin>>a;
 std::string b=((a%2==0)?"Possible":"Not possible");
  std::cout<<b;
}