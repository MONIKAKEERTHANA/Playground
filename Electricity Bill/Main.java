#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  std::cin>>x;
  if(x<=200)
  {
    std::cout<<"Rs."<<int(x*0.5);
  }
  else if(x<=400)
  {
std::cout<<"Rs."<<0.65*400+100;
  }
  else if(x<=600)
  {
    std::cout<<"Rs."<<0.80*600+200;
  }
  else
  {
    std::cout<<"Rs."<<0.25*600+425;
  }

}