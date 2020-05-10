#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  std::cin>>r>>c>>t;
  if((t<=r*c)&&((t<=c)||(t%c==1)||(t/c==0)))
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}