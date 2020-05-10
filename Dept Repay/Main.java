#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,r;
  float i,a,d{.2f};
  std::cin>>x>>r>>y;
  
  std::cout<<(i=(x*r*y/100));
  std::cout<<"\n"<<(a=x+i);
  std::cout<<"\n"<<(d=(i*(float(2)/100)));
  std::cout<<"\n"<<a-d;
  

}