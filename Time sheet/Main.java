
  
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int su,m,t,w,th,f,sa,hour,sur,mr,tr,wr,thr,fr,sar,total_hours,f1,final;
  std::cin>>su>>m>>t>>w>>th>>f>>sa;
  total_hours=su+m+t+w+th+f+sa;
  if(su==0)
  {
      sur=0;
  }
  else
  {
      if(su>=1 && su<=8)
        sur=su*100+(su*(100*50)/100);
    else
        sur=su*100+(su*(100*50)/100)+(su-8)*15;
  }
  if(m==0)
  {
      mr=0;
  }
  else
  {
      if(m>=1 && m<=8)
        mr=m*100;
    else
        mr=m*100+(m-8)*15;
  }
  if(t==0)
  {
      tr=0;
  }
  else
  {
      if(t>=1 && t<=8)
        tr=t*100;
    else
        tr=t*100+(t-8)*15;
  }
  if(w==0)
  {
      wr=0;
  }
  else
  {
      if(w>=1 && w<=8)
        wr=w*100;
    else
        wr=w*100+(w-8)*15;
  }
  if(th==0)
  {
      thr=0;
  }
  else
  {
      if(th>=1 && th<=8)
        thr=th*100;
    else
        thr=th*100+(th-8)*15;
  }
  if(f==0)
  {
      fr=0;
  }
  else
  {
      if(f>=1 && f<=8)
        fr=f*100;
    else
        fr=f*100+(f-8)*15;
  }
  if(sa==0)
  {
      sar=0;
  }
  else
  {
      if(sa>=1 && sa<=8)
        sar=sa*100+(sa*(100*25)/100);
    else
        sar=sa*100+(sa-8)*15+(sa*(100*25)/100);
  }
  std::cout<<(f1=sur+mr+tr+wr+thr+fr+sar);
  
  
  
 
}