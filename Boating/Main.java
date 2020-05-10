#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,res;
 
  std::cin>>x>>y>>z;
  res=y*75+z*30;
  std::string r=((res<=x)?"Boat is stable":"Boat will drow");
  std::cout<<r;
}