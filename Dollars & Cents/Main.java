#include<iostream>
using namespace std;
int main()
{
int dollar, cent, dollar1, cent1;
std::cin>>dollar>>cent>>dollar1>>cent1;
int totaldollar=dollar+dollar1;
int totalcent=cent+cent1;
while(totalcent>100)
{
totalcent=totalcent-100;
totaldollar=totaldollar+1;

break;
}
std::cout<<totaldollar<<"\n"<<totalcent;
}