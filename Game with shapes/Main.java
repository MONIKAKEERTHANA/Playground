#include<iostream>
#define pi 3.14
using namespace std;
int main()
{
  //Type your code here.
  int c,s;
  std::cin>>c>>s;
  
  std::string r=((2*c<=s)?"circle can be inside a square":"circle cannot be inside a square");
  std::cout<<r;
                 
}