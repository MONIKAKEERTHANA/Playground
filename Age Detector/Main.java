#include<iostream>
int main()
{
  int b_year,c_year,res;
  std::cin>>b_year>>c_year;
  if(b_year>c_year)
  {
    std::cout<<(res=c_year+(100-b_year));
  }
  else
  {
    std::cout<<(res=c_year-b_year);
  }
}