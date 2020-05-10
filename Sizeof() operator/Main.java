#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char c;
  int i;
  float f;
  double d;
  std::cin>>c>>i>>f>>d;
  std::cout<<sizeof(c)<<"\n"<<sizeof(i)<<"\n"<<sizeof(f)<<"\n"<<sizeof(d);
}