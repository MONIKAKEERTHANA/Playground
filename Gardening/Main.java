#include<iostream>
int main()

{

 int r,c,t;

 std::cin>>r>>c>>t;

 if((t>r && t<=r*2) || (t<=(r*c-r) &&t>(r*c-r-c)))

    std::cout<<"It is a mango tree";

    else

    std::cout<<"It is not a mango tree";}