#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int tb,tr,rs,bb;
  float o,r,trr;
  std::cin>>tb>>tr>>rs>>bb;
  std::cout<<tb/6;
  std::cout<<"\n"<<(o=(bb/6)+(float((bb%6))/10));
  (r=(rs/o));
  std::cout<<"\n"<<std::fixed<<std::setprecision(1);
  std::cout<<r;
  std::cout<<"\n"<<(trr=(float)tr/50);
  std::string z=((r>trr)?"\nEligible to Win":"\nNot Eligible to Win");
 std::cout<<z;
}