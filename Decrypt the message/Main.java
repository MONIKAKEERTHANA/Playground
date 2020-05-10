#include<iostream>
int main()
{
  int en,tn,sum,num=0,i;
  std::cin>>en>>tn;
  sum=en+tn;
  for(i=1;i<=(sum/2);i++)
  {
    if(sum%i==0)
    {
      num=num+i;
    }
  }
  if(num==sum)
  {
    std::cout<<"They can read the message";
  }
  else{
    std::cout<<"They can't read the message";
  }
  
}
    
    