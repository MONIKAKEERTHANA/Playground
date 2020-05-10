#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 
  int  n;
  float h{.2f},i{.2f},j{.2f},c,res1;
  std::cin>>n>>h;
  i=n*h;
  j=h*50/100;
  if(n<=2)
  {
    (res1=i-j);
    std::cout<<std::fixed<<std::setprecision (2);
      std::cout<<res1;
  }
  else if(n==3)
  {
    (c=2*h);
    std::cout<<std::fixed<<std::setprecision (2);
    std::cout<<c;
  }
  else
  {
    std::cout<<"Number of items is more";
  }
}
