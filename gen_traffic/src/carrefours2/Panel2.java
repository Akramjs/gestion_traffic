/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefours2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel2 extends JPanel implements Runnable { 

	private static final long serialVersionUID = 1L;
private static int t=-1,V,VB,VC,VD;  
  Thread runer=new Thread(this);
  
     int vitesse=500;
     int r1,r2,r3,r4;
     int rV,rVB,rVC,rVD;
     int xcarrefour=1115,ycarrefour=250,width=170,height=100;
     


public Panel2(int r1,int r2,int r3,int r4 ) { 

        runer.start(); 
   
       
        if(r1==0)
   {
       rV=190;  
   }
    else if(r1==1)
   {
       rV=180;  
   }else if(r1==2)
   {
       rV=160;
   }
   else if(r1==3)
   {
       rV=140;
   }
   else if(r1==4)
   {
       rV=120;
   }
   else if(r1==5)
   {
       rV=100;
   }else if(r1==6)
   {
       rV=80;
   }else if(r1==7)
   {
       rV=60;
   }else if(r1==8)
   {
       rV=40;
   }else if(r1==9)
   {
       rV=20;
   }
    else if(r1==10)
   {
       rV=0;
   }
    
     if(r2==0)
   {
       rVB=985;  
   }
    else if(r2==1)
   {
       rVB=1005;  
   }else if(r2==2)
   {
       rVB=985;
   }
   else if(r2==3)
   {
       rVB=965;
   }
     
   else if(r2==4)
   {
       rVB=945;
   }
   else if(r2==5)
   {
       rVB=925;
   }else if(r1==6)
   {
       rVB=905;
   }else if(r2==7)
   {
       rVB=885;
   }else if(r2==8)
   {
       rVB=865;
   }else if(r2==9)
   {
       rVB=845;
   }else if(r2==10)
   {
       rVB=0;
   }
     
      if(r3==1)
   {
       rVC=305;  
   }
    else if(r3==2)
   {
       rVC=325;  
   }else if(r3==3)
   {
       rVC=345;
   }
   else if(r3==4)
   {
       rVC=365;
   }
   else if(r3==5)
   {
       rVC=385;
   }
   else if(r3==6)
   {
       rVC=405;
   }else if(r3==7)
   {
       rVC=425;
   }else if(r3==8)
   {
       rVC=445;
   }else if(r3==9)
   {
       rVC=465;
   }else if(r3==10)
   {
       rVC=485;
   }else if(r3==11)
   {
       rVC=505;
   }
   else if(r3==12)
   {
       rVC=525;
   }
    else if(r3==13)
   {
       rVC=545;
   }
    else if(r3==14)
   {
       rVC=565;
   }
   else if(r3==15)
   {
       rVC=585;
   }
    
      
      
       if(r4==1)
   {
       rVD=1211;  
   }
    else if(r4==2)
   {
       rVD=1231;  
   }else if(r4==3)
   {
       rVD=1251;
   }
   else if(r4==4)
   {
       rVC=1271;
   }
   else if(r4==5)
   {
       rVD=1291;
   }
   else if(r4==6)
   {
       rVD=1311;
   }else if(r4==7)
   {
       rVD=1331;
   }else if(r4==8)
   {
       rVD=1351;
   }else if(r4==9)
   {
       rVD=1371;
   }else if(r4==10)
   {
       rVD=1391;
   }else if(r4==11)
   {
       rVD=1411;
   }
   else if(r4==12)
   {
       rVD=1451;
   }
    else if(r4==13)
   {
       rVD=1471;
   }
    else if(r4==14)
   {
       rVD=1491;
   }
   else if(r4==15)
   {
       rVD=1511;
   }
   else if(r4==16)
   {
       rVD=1531;
   }
   else if(r4==17)
   {
       rVD=1551;
   }
   else if(r4==18)
   {
       rVD=1571;
   }
   else if(r4==19)
   {
       rVD=1591;
   }
   else if(r4==20)
   {
       rVD=1611;
   }

    V=rV;
    VB=rVB;
    VC=rVC;
    VD=rVD;
} 

public void paintComponent (Graphics g) 
{
  t+=1;
  //System.out.println(t);
  super.paintComponent(g); 

//feux 
/***********************/ 


//g.drawRoundRect(1115,250,85,90,10,10);
//Feux B
g.drawRoundRect(xcarrefour-width*2/3,ycarrefour-height/4,width/8,height/2,10,10); 

// Feux A
g.drawRoundRect(xcarrefour-height/4,ycarrefour-width/8-height/2,height/2,width/8,10,10); 

//Feux C
g.drawRoundRect(xcarrefour-height/4,ycarrefour+height/2,height/2,width/8,10,10);

// Feux  D

g.drawRoundRect(xcarrefour+width*2/3-width/8,ycarrefour-height/4,width/8,height/2,10,10); 


g.setColor(Color.gray);
g.fillRect(xcarrefour-width*2/3,ycarrefour-height/4,width/8,height/2);
g.fillRect(xcarrefour-height/4,ycarrefour-width/8-height/2,height/2,width/8);
g.fillRect(xcarrefour-height/4,ycarrefour+height/2,height/2,width/8);
g.fillRect(xcarrefour+width*2/3-width/8,ycarrefour-height/4,width/8,height/2);
g.setColor(Color.red); 
g.setColor(Color.black);


//

//g.fillOval(0,0,30,30);
//FA

//V

g.fillOval(1094,183,11,11);
//O
g.fillOval(1108,183,11,11);

//R
g.fillOval(1124,183,11,11);


//FB

//V
g.fillOval(1005,228,11,11);
//O
g.fillOval(1005,242,11,11);

//R

g.fillOval(1005,256,11,11);
//g.drawString("salut", 600, 257);


//FC

//V

g.fillOval(1094,305,11,11);
//O
g.fillOval(1108,305,11,11);

//R
g.fillOval(1124,305,11,11);


//FD
//V
g.fillOval(1211,228,11,11);
//O
g.fillOval(1211,242,11,11);

//R

g.fillOval(1211,256,11,11);

g.setColor(Color.red);
//A
g.fillOval(1124,183,11,11);
//B
g.fillOval(1005,256,11,11);
//C
g.fillOval(1124,305,11,11);
//D
g.fillOval(1211,256,11,11);

g.setColor(Color.black);


 
// Animation
 

 System.out.println(t);
      
if (t<60) 
  {
           
g.setColor(Color.green); 
g.fillOval(1094,183,11,11); // v feux A
          
           
g.setColor(Color.black); 
g.fillOval(1124,183,11,11); // R feux A
             
    if(t==5)
{
 V+=20;
            
    for(int y=180;y>=V;y-=20)
    {
g.drawOval(1037, y,20,20);
    }
            
}  
        
    else if(t==10)
{
V+=20;
            
    for(int y=180;y>=V;y-=20)
{
g.drawOval(1037, y,20,20);
}
            
}
    else  if(t==15)
{
V+=20;          
    for(int y=180;y>=V;y-=20)
{
g.drawOval(1037, y,20,20);
}            
}
else if(t==20)
{
V+=20;
            
for(int y=180;y>=V;y-=20)
{
g.drawOval(1037, y,20,20);
}
            
}
 else if(t==25)
{
V+=20;
for(int y=180;y>=V;y-=20)
{
 g.drawOval(1037, y,20,20);
}
}
else if(t==30)
{
V+=20;
            
for(int y=180;y>=V;y-=20)
{
 g.drawOval(1037, y,20,20);
}
            
}
else if(t==35)
{
V+=20;
            
for(int y=180;y>=V;y-=20)
{
 g.drawOval(1037, y,20,20);
}
            
} 
else if(t==40)
{
V+=20;
            
for(int y=180;y>=V;y-=20)
{
 g.drawOval(1037, y,20,20);
 }          
} 
else if(t==45)
{
 V+=20;
            
for(int y=180;y>=V;y-=20)
 {
g.drawOval(1037, y,20,20);
}
} 
 else if(t==50)
{
 V+=20;
            
 for(int y=180;y>=V;y-=20)
{
g.drawOval(1037, y,20,20);
 }
            
} 
 else if(t==55)
{
 V+=20;
            
for(int y=180;y>=V;y-=20)
{
g.drawOval(1037, y,20,20);
}      
} 
else if(t==60)
{
V+=20;  
for(int y=180;y>=V;y-=20)
{
g.drawOval(1037, y,20,20);
}     
} 
else 
{   
for(int y=180;y>=V;y-=20)
{
g.drawOval(1037, y,20,20);
         
}
} 
         
for(int x=1005;x>=VB;x-=20)         
{
g.drawOval(x, 265,20,20);
}
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
for(int x=VD;x>=400;x-=20)
{
g.drawOval(x,210,20,20);
}
}
     
if (t>=60){g.setColor(Color.red); 
             
g.fillOval(1124,183,11,11);
   
for(int y=180;y>=V;y-=20)
{
g.drawOval(220, y,20,20);
}
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);      
}
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
     
}     
if ((t>=60) && (t<120)) 
{
   
g.setColor(Color.green);           
g.fillOval(1005,228,11,11);;
g.setColor(Color.black); 
g.fillOval(1005,256,11,11);
           
for(int y=180;y>=V;y-=20)                     
{
g.drawOval(1037, y,20,20);   
     
}
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
              
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x,210,20,20);  
}
         
if(t==65)          
{
VB+=20;
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x,265,20,20);                 
}
            
}  
 else if(t==70)
{
VB+=20;
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
}
else  if(t==75)
{
VB+=20;
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
            
}
else if(t==80)
{
VB+=20;
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
            
}
else if(t==85)
{
VB+=20;
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}            
} 
else if(t==90)
{
VB+=20;
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
            
} 
else if(t==95)
{
VB+=20;
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
            
} 
else if(t==100)
{
VB+=20;            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}           
} 
else if(t==105)
{
VB+=20;           
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}           
}
else if(t==110)
{
 VB+=20;
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
            
} 
else if(t==115)
{
VB+=20;
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}            
} 
else if(t==120)
{
VB+=20;          
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}      
} 
else 
{    
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
  
} 

}       
if (t>120) 
{ 
g.setColor(Color.red); g.fillOval(1005,256,11,11); 
       
for(int y=180;y>=V;y-=20)
{
g.drawOval(220, y,20,20);
                   
}
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
   
}
          
if  ((t>=50) && (t<60)) 
{      
g.setColor(Color.orange);
g.fillOval(1005,242,11,11); 
g.setColor(Color.black); 
g.fillOval(1005,256,11,11);
            
for(int y=180;y>=V;y-=20)
{
g.drawOval(220, y,20,20);

}
             
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
             
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
             
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
     
}
    
if  ((t>=110) && (t<120)) 
{  
g.setColor(Color.orange);
g.fillOval(1108,305,11,11);   
g.setColor(Color.black); 
g.fillOval(1124,305,11,11); 
           
for(int y=180;y>=V;y-=20)
{
g.drawOval(220, y,20,20);

}
            
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}           
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
}

 if  ((t>=120) && (t<180)) {  
g.setColor(Color.green);  
g.fillOval(1094,305,11,11); 
g.setColor(Color.black); g.fillOval(1124,305,11,11);
 
for(int y=180;y>=V;y-=20)
{
 g.drawOval(220, y,20,20);
        
}           
for(int x=1005;x>=VB;x-=20)
{
 g.drawOval(x, 265,20,20);
}
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
                      
if(t==125) 
{
 VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
            
}  
        
else if(t==130)
{
VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
 g.drawOval(1160, y,20,20);
 }
            
}
else  if(t==135)
 {
 VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}        
}
else if(t==140)
{
            
VC-=20;
            
for(int y=VC;y>=305;y-=20)
 {
 g.drawOval(1160, y,20,20);
}           
}
else if(t==145)
{
VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
 g.drawOval(1160, y,20,20);
}
            
} 
else if(t==150)
{
VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}           
}
else if(t==155)
{
VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
            
}
else if(t==160)
{
VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
 g.drawOval(1160, y,20,20);
}           
}
 else if(t==165)
{
VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}          
}
else if(t==170)
{
VC-=20;
            
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}           
}
else if(t==175)
{
 VC-=20;
            
 for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}           
}
else if(t==180)
{
VC-=20;           
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}          
}
else 
{
          
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
        
} 
              
}
           
if  (t>=180)  { 
g.setColor(Color.red); 
g.fillOval(1124,305,11,11);  
       
for(int y=180;y>=V;y-=20)
{
g.drawOval(220, y,20,20);

}
                     
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
for(int x=VD;x>=1211;x-=20)
{
 g.drawOval(x, 210,20,20);
}
        
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
 }     
}
              
if  ((t>=170) && (t<180)) {  
g.setColor(Color.orange); 
g.fillOval(1211,242,11,11); 
g.setColor(Color.black); 
g.fillOval(1211,256,11,11);
           
for(int y=180;y>=V;y-=20)
{
g.drawOval(220, y,20,20);
         
}
for(int x=1005;x>=VB;x-=20)
{
g.drawOval(x, 265,20,20);
}
for(int y=VC;y>=305;y-=20)
{
g.drawOval(1160, y,20,20);
}
    for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
           
}
       
       
if  ((t>=180) && (t<240)) { 
g.setColor(Color.green); 
g.fillOval(1211,228,11,11); 
g.setColor(Color.black); 
g.fillOval(1211,256,11,11);
            
for(int y=180;y>=V;y-=20)
           {
g.drawOval(220, y,20,20);
         
        
}
             
for(int x=1005;x>=VB;x-=20)
    {
g.drawOval(x, 265,20,20);
   }
   for(int y=VC;y>=305;y-=20)
 {
g.drawOval(1160, y,20,20);
}
              
         
if(t==185)
 {
VD-=20;
            
for(int x=VD;x>=1211;x-=20)
 {
g.drawOval(x, 210,20,20);
}
            
}  
        
else if(t==190)
{
VD-=20;
            
for(int x=VD;x>=1211;x-=20)
{
 g.drawOval(x, 210,20,20);
}
            
   }
 else  if(t==195)
  {
  VD-=20;
            
for(int x=VD;x>=1211;x-=20)
{
 g.drawOval(x, 210,20,20);
 }
            
 }
 else if(t==200)
{
 VD-=20;
            
for(int x=VD;x>=1211;x-=20)
{
 g.drawOval(x, 210,20,20);
}
            
 }
else if(t==205)
{
            
            
 VD-=20;
            
for(int x=VD;x>=1211;x-=20)
 {
g.drawOval(x, 210,20,20);
 }
            
}
 else if(t==210)
 {
 VD-=20;
            
for(int x=VD;x>=1211;x-=20)
    {
 g.drawOval(x, 210,20,20);
  }
            
    }
 else if(t==215)
    {
 VD-=20;
            
 for(int x=VD;x>=1211;x-=20)
    {
g.drawOval(x, 210,20,20);
  }
            
 }
 else if(t==220)
{
 VD-=20;
            
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
            
 }
else if(t==225)
{
VD-=20;
            
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
            
 }
  else if(t==230)
 {
  VD-=20;
            
for(int x=VD;x>=1211;x-=20)
{
g.drawOval(x, 210,20,20);
}
            
}
 else 
  {
             
        
            
for(int x=VD;x>=1211;x-=20)
    {
g.drawOval(x, 210,20,20);
    }
 } 
}
       
       
 if  ((t>=240)) {  
g.setColor(Color.red); 
g.fillOval(1211,256,11,11);
g.setColor(Color.black);
g.fillOval(1124,183,11,11);
g.fillOval(1094,183,11,11);
             
         
          for(int y=180;y>=V;y-=20)
           {
               g.drawOval(220, y,20,20);
         
            
            }
          
          for(int x=1005;x>=VB;x-=20)
        {
         g.drawOval(x, 265,20,20);
        }
             for(int y=VC;y>=305;y-=20)
        {
         g.drawOval(1160, y,20,20);
        }
              for(int x=VD;x>=1211;x-=20)
        {
         g.drawOval(x, 210,20,20);
        }
         
         }
         
         
          if  ((t>230) && t<240) {  
              g.setColor(Color.orange); 
              g.fillOval(1108,183,11,11);
              g.setColor(Color.black); 
              g.fillOval(1124,183,11,11);
          
           for(int y=180;y>=V;y-=20)
           {
               g.drawOval(220, y,20,20);
         
            // System.out.println(y);
            }
           
           for(int x=1005;x>=VB;x-=20)
        {
         g.drawOval(x, 265,20,20);
        }
            for(int y=VC;y>=305;y-=20)
        {
         g.drawOval(1160, y,20,20);
        }
             for(int x=VD;x>=1211;x-=20)
        {
         g.drawOval(x, 210,20,20);
        }
          }
       
         
        if (t>240) t=-1;
       

        
g.drawLine(1030,0,1030,200); 
g.drawLine(700,200,1030,200); 

g.drawLine(830,300,1030,300); 


   
g.drawLine(830,330,1030,500); 
g.drawLine(830,300,1030,300); 
g.drawLine(1030,300,1030,500); 
g.drawLine(830,330,830,300); 

g.drawLine(1200,0,1200,200);
g.drawLine(1500,200,1200,200);

g.drawLine(1500,300,1200,300);

g.drawLine(1500,800,1200,800);

g.drawLine(1500,800,1200,800);

g.drawLine(1500,600,1200,600);

g.drawLine(1200,800,700,400);

g.drawLine(1200,300,1200,600);

   

//ligne médiane 
/*****************/ 
        
g.setColor(Color.black); 

int x =20; 
int x2 =300; 
for (x=20; x<200; x+=10) 
g.drawString("_",x,300); 
for (x2=400; x2<700; x2+=10) 
g.drawString("_",x2,300); 

int y=50; 
int y2=300; 
for (y=20; y<201; y+=10) 
g.drawString("¦",300,y); 
for (y2=400; y2<800; y2+=10) 
g.drawString("¦",300,y2); 

//carrefour 
/*****************/ 
        
g.drawLine(0,200,200,200); 
g.drawLine(0,400,200,400); 
g.drawLine(400,200,700,200); 
g.drawLine(400,400,700,400); 
g.drawLine(200,0,200,200); 
g.drawLine(400,0,400,200); 
g.drawLine(200,400,200,800); 
g.drawLine(400,400,400,800); 



} 





    @Override
    public void run() {
        
        Thread thisThread = Thread.currentThread();
     
         while (runer == thisThread) {	// si runner == null, mort du thread
             
              repaint();
              
             try {Thread.sleep(vitesse);
             
                   Thread.sleep(vitesse);
                   
             } catch (InterruptedException e) { }
               
             
              
         }
    }

}