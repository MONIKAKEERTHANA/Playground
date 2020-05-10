#include <iostream>
#include<cmath>
int main() 
{
	// Type your code here

  int n,rev=0,i,rem;
  std::cin>>n;
  while(n!= 0){
 rem=n%10;
rev=rev*10+rem;
n/=10;
 }
  std::cout<<rev;
}