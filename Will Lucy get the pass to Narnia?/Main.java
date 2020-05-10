#include<iostream>
int main()
{
  int x,y,z;
  std::cin>>x>>y>>z;
  std::cout<<"Enter first number : Enter second number : Menu";
  
  std::cout<<"\n"<<"1.Addition";
  std::cout<<"\n"<<"2.Subtraction";
  std::cout<<"\n"<<"3.Multiplication";
  std::cout<<"\n"<<"4.Division";
  std::cout<<"\n"<<"5.Remainder"<<"\n";
  switch(z)
  {
    case 1: std::cout<<x+y;
      break;
    case 2: std::cout<<x-y;
      break;
    case 3: std::cout<<x*y;
      break;
    case 4: std::cout<<x/y;
      break;
    case 5: std::cout<<x%y;
      break;
      default : std::cout<<"Invalid operation";
  }
}
  