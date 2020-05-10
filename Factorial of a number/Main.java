#include<iostream>
int main(){
  // Type your code here
  int n,fact=1,i;
  std::cin>>n>>fact;
 if(n<0)
 {
   std::cout<<0;
 }
  else if(n==0)
  {
    std::cout<<1;
  }
  else
  {
    for(i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    std::cout<<fact;
  }
}