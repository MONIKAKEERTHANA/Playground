#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,temp1=0,temp2=1,temp3,i;
  std::cin>>m;
  
  for(i=2;i<m;i++)
  {
	temp3=temp1+temp2;
    temp1=temp2;
    temp2=temp3;
  }
  std::cout<<temp3;
}