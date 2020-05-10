#include<iostream>

using namespace std;
int main()
{
  //Type your code here.
  string str1;
  string str2("front");
  int p;
  std::cin>>str1>>p;
  if(!(str1.compare(str2)))
  {
    if(p==1)
    {
    std::cout<<"Left Handed";
    }
    else
    {
      std::cout<<"Right Handed";
    }
  }
  else
  {
    if(p==1)
    {
    std::cout<<"Right Handed";
  }
    else
    {
      std::cout<<"Left Handed";
    }
  }
}