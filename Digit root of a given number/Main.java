#include<iostream>
using namespace std;
int nav(int n)
{
  int rem,sum=0;
  while(n>0)
    {
      rem=n%10;
      sum+=rem;
      n=n/10;
    }
  if(sum<=9)
    return sum;
  else
    nav(sum);
}
int main()
{
  int n;
  cin>>n;
  cout<<nav(n);
}