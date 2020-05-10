#include<iostream>
using namespace std;
#include<cmath>
int main()
{
  //Type your code here.
  int x,x1,xrev=0,rem,i;
  std::cin>>x;
  x1=x%10;
  for(i=0;i<=3;i++)
  {
    rem=x%10;
    xrev=xrev*10+rem;
    x=x/10;
  }
  std::cout<<(x1+(xrev%10));
    
  
}