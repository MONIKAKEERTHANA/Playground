#include<iostream>
using namespace std;
int fib(int n)
{
  if(n==1)
    return 0;
  else if(n==2)
    return 1;
  else
    return fib(n-2)+fib(n-1);
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
}