#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrol_available,distance,r;
  std::cin>>mileage>>petrol_available>>distance;
  r=mileage*petrol_available;
  std::string o=(r>=distance)?"Can reach":"Cannot reach";
  std::cout<<o;
}