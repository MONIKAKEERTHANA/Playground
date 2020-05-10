#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int c=0,rem,sum=0,temp;
  temp=n;
  while(n>0)
  {
    n=n/10;
    c=c+1;
  }
  n=temp;
  while(n>0)
  {
    rem=n%10;
    sum+=power(rem,c);
    n=n/10;
  }
  if(sum==temp)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}