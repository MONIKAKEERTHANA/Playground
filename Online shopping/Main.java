#include<iostream>
using namespace std;
int main()
{
  
  //Type your code here.
  int f_amount,f_discount,f_shipping,s_amount,s_discount,s_shipping,a_amount,a_discount,a_shipping,res1,res2,res3;
  std::cin>>f_amount>>f_discount>>f_shipping>>s_amount>>s_discount>>s_shipping>>a_amount>>a_discount>>a_shipping;
  std::cout<<"In Flipkart Rs."<<(res1=f_amount-(f_amount*f_discount/100)+f_shipping);
  std::cout<<"\nIn Snapdeal Rs."<<(res2=s_amount-(s_amount*s_discount/100)+s_shipping);
  std::cout<<"\nIn Amazon Rs."<<(res3=a_amount-(a_amount*a_discount/100)+a_shipping);
  std::string res=((res1<=res2)?((res1<res3)?"\nHe will prefer Flipkart":"\nHe will prefer Amazon"):(res2<res3?"\nHe will prefer Snapdeal":"\nHe will prefer Amazon"));
 std::cout<<res;

}