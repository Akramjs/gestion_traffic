package carrefours;



import java.awt.*; 

import javax.swing.*; 



public class Panel extends JPanel implements Runnable
    { 

	private static final long serialVersionUID = 1L;
	private static int t=-1,V,VB,VC,VD;  
    Thread runner=new Thread(this); // declation de Thread
    
  
     int vitesse=500; 
     int r1,r2,r3,r4; // nb voiture
     int rV,rVB,rVC,rVD; // X et Y
     

public   Panel(int r1,int r2,int r3,int r4 ) { // constructeur

 runner.start();  
 //JPanel g=new JPanel();
 //g.setLayout(new FlowLayout());
   
 // capteur pour implementer les voiture a partir de donner réel 
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
       rV=0; // jusqu'a 0
   }
   
 
        
//Route 2
        
  
     if(r2==0)
   {
       rVB=190;  
   }
    else if(r2==1)
   {
       rVB=180;  
   }else if(r2==2)
   {
       rVB=160;
   }
   else if(r2==3)
   {
       rVB=140;
   }
   else if(r2==4)
   {
       rVB=120;
   }
   else if(r2==5)
   {
       rVB=100;
   }else if(r1==6)
   {
       rVB=80;
   }else if(r2==7)
   {
       rVB=60;
   }
   else if(r2==8)
   {
       rVB=40;
   }
   else if(r2==9)
   {
       rVB=20;
   }
else if(r2==10)
   {
       rVB=0;
   }
  
     //Route 3
     
    
if(r3==1)
   {
       rVC=410;  
   }
else if(r3==2)
   {
       rVC=430;  
   }
else if(r3==3)
   {
       rVC=450;
   }
else if(r3==4)
   {
       rVC=470;
   }
else if(r3==5)
   {
       rVC=490;
   }
else if(r3==6)
   {
       rVC=510;
   }
else if(r3==7)
   {
       rVC=530;
   }
else if(r3==8)
   {
       rVC=550;
   }
else if(r3==9)
   {
       rVC=570;
   }
else if(r3==10)
   {
       rVC=590;
   }
else if(r3==11)
   {
       rVC=610;
   }
else if(r3==12)
   {
       rVC=630;
   }
else if(r3==13)
   {
       rVC=650;
   }
else if(r3==14)
   {
       rVC=670;
   }
else if(r3==15)
   {
       rVC=690;
   }
    
      //  Route 4   ////
   
   
if(r4==1)
   {
       rVD=410;  
   }
else if(r4==2)
   {
       rVD=420;  
   }
else if(r4==3)
   {
       rVD=440;
   }
else if(r4==4)
   {
       rVC=460;
   }
else if(r4==5)
   {
       rVD=480;
   }
else if(r4==6)
   {
       rVD=500;
   }
else if(r4==7)
   {
       rVD=520;
   }
else if(r4==8)
   {
       rVD=540;
   }
else if(r4==9)
   {
       rVD=560;
   }
else if(r4==10)
   {
       rVD=580;
   }
else if(r4==11)
   {
       rVD=600;
   }
else if(r4==12)
   {
       rVD=620;
   }
else if(r4==13)
   {
       rVD=640;
   }
else if(r4==14)
   {
       rVD=660;
   }
else if(r4==15)
   {
       rVD=680;
   }
else if(r4==16)
   {
       rVD=700;
   }
else if(r4==17)
   {
       rVD=720;
   }
else if(r4==18)
   {
       rVD=740;
   }
else if(r4==19)
   {
       rVD=760;
   }
else if(r4==20)
   {
       rVD=780;
   }
else if(r4==21)
   {
       rVD=800;
   }
else if(r4==22)
   {
       rVD=820;
   }
else if(r4==23)
   {
       rVD=840;
   }
else if(r4==24)
   {
       rVD=860;
   }
else if(r4==25)
   {
       rVD=880;
   }
else if(r4==26)
   {
       rVD=900;
   }
  
    V=rV;
    VB=rVB;
    VC=rVC;
    VD=rVD;
} 

public void paintComponent  (Graphics g) // méthode pour le traçage des feux aide par jgraph
{
    t+=1;
    //System.out.println(t);
    super.paintComponent(g); 
   

//feux 
/***********************/ 

//  Feux B
g.drawRoundRect(150,250,40,90,10,10); 
//  Feux A
g.drawRoundRect(250,160,90,40,10,10); 
//  Feux C
g.drawRoundRect(250,400,90,40,10,10);
//  Feux  D
g.drawRoundRect(400,250,40,90,10,10); 

// na3tih il couleur l gris w nched les cercle i s8ar in ta3 les feux 
g.setColor(Color.gray);
g.fillRect(150,250,40,90);
g.fillRect(250,160,90,40);
g.fillRect(250,400,90,40);
g.fillRect(400,250,40,90);
g.setColor(Color.red); 
g.setColor(Color.black);

//FA 1

//V
g.fillOval(260,170,20,20);

//O
g.fillOval(280,170,20,20);

//R
g.fillOval(300,170,20,20);

//FB 2

//V
g.fillOval(160,260,20,20); 
//O
g.fillOval(160,280,20,20);
//R
g.fillOval(160,300,20,20);

//FC 3

//V
g.fillOval(260,410,20,20); 
//O
g.fillOval(280,410,20,20); 

//R //g.fillOval(300,410,20,20)

//FD 4
//V
g.fillOval(410,260,20,20);
//O
g.fillOval(410,280,20,20);

//R g.fillOval(410,300,20,20);


g.setColor(Color.red);
//A
g.fillOval(300,170,20,20); //////////////////////
//B
g.fillOval(160,300,20,20);
//C
g.fillOval(300,410,20,20); 
//D
g.fillOval(410,300,20,20);

g.setColor(Color.black);


 
// Animation         // pour a chaque fois 
 
System.out.println(t);
      
if (t<60) 
       {
           
           g.setColor(Color.green); // couleur vert pour la premier cercle  vert 
           g.fillOval(260,170,20,20);            
           g.setColor(Color.black); // tafi il feux rouge bech yab9a kén vert comme 1ér etape Feux A
           g.fillOval(300,170,20,20);
      
           
         /// pour les position des voitures dans la 1ér voix   
           
if(t==5)  // temps pour faire soutir une voiture de la file d'attente (carffour)
   {
    V+=20;
            
for(int y=180;y>=V;y-=20) // raka7et il (Y,X) f 180 w bdit in na9es b 20 (bel ka3ba b ka3ba)
  {
g.drawOval(220, y,20,20); // position in ta3 lekraheb f rue A
        }        
   }          
else if(t==10)
    
    {
     V+=20;
            
for(int y=180;y>=V;y-=20)
    
        {
         g.drawOval(220, y,20,20); // je fixe il X w Y tet7arek f axe car traitement verticale 
        }
            
        }
else  if(t==15)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        }
         else if(t==20)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        }
         else if(t==25)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        }
         else if(t==30)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        }
         else if(t==35)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        } 
         else if(t==40)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        } 
         else if(t==45)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        } 
         else if(t==50)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        } 
         else if(t==55)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        } 
         else if(t==60)
        {
            V+=20;
            
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
        }
            
        } 
         else 
         {
             
        for(int y=180;y>=V;y-=20)
        {
         g.drawOval(220, y,20,20);
         
        }
        } 

// bech in fexi les autres voiture f voix B, C, D
         
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
                  
       }
       
// en cas mon compteur dépase i 60 nch3el il feux rouge wen fexi les autres voiture f voix B, C, D zeda
       
if (t>=60){g.setColor(Color.red); 
  
  g.fillOval(300,170,20,20); // mettre f voix A il feux f rouge 
        
for(int y=180;y>=V;y-=20) // b9iyet lekraheb machdoudin 
        {
  g.drawOval(220, y,20,20); 
        }
// bech in fexi les autres voiture f voix  B , C ,D

for(int x=180;x>=VB;x-=20)
        {
  g.drawOval(x, 350,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
  g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
  g.drawOval(x, 220,20,20);
        }     
       }

// Traitement de la 2éme voix B 
       
if ((t>=60) && (t<120)) 
       {
           
    g.setColor(Color.green); // in cha3el la5dher f voix B 
    g.fillOval(160,260,20,20);
    g.setColor(Color.black); // w in tafi i  rouge f voix B 
    g.fillOval(160,300,20,20);
           
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);          
                     
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
              
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);                               /////////////////////////////
        }
           
           
if(t==65)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }           
        }  
else if(t==70)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }        
        }
else  if(t==75)
        {
        VB+=20;
            
 for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }           
        }
else if(t==80)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }           
        }
else if(t==85)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }           
        } 
else if(t==90)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }           
        } 
else if(t==95)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }            
        } 
else if(t==100)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }            
        } 
else if(t==105)
        {
        VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }           
        }
else if(t==110)
        {
    VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }          
        } 
else if(t==115)
        {
     VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
            
        } 
else if(t==120)
        {
     VB+=20;
            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }            
        } 
else 
        {           
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }   
        }    
        }
// traitement finale de la voix B et la fixation de tout les voix 
if (t>120) { 
    g.setColor(Color.red); g.fillOval(160,300,20,20); // voix B le f feux en rouge lezmou
           
// Fixation de tout les voix      
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
   
       }
 
// Traitement de le voix A et B  ouwel cas ta3 feux Oranger  
// f position ta3 le voix B 

if  ((t>=50) && (t<60)) 
       {        
    g.setColor(Color.orange);
    g.fillOval(160,280,20,20); // t5adem l'oranger f 10 seconde 
    g.setColor(Color.black); 
    g.fillOval(160,300,20,20); // in tafi i rouge eli ye5dem b tbi3tou 
  
// kif il 3ada in fixi les voiture f les voie in te7houm bech ma yetna7awech m carte maps 
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);        
        }            
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
// Traitement de le voix B et C  ouwel cas ta3 feux Oranger  
// f position ta3 le voix C       
       
if  ((t>=110) && (t<120)) 
       {  
    g.setColor(Color.orange);
    g.fillOval(280,410,20,20); // in cha3el il feux oranger f voix C   
    g.setColor(Color.black); 
    g.fillOval(300,410,20,20); // in tafi il rouge eli houwa yech3el b tbi3tou 
 
// kif il 3ada in fixi les voiture f les voie in te7houm bech ma yetna7awech m carte maps 
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
       
// tawa Traitement de la 3éme voix C        
       
if  ((t>=120) && (t<180)) {  
    g.setColor(Color.green);  
    g.fillOval(260,410,20,20); // in cha3el la5der 
    g.setColor(Color.black); 
    g.fillOval(300,410,20,20); // w tafi i rouge eli b tbi3tou ye5dem
    
// en même temps nesta7fedh 3al position in ta3 lekraheb f les autres voix (A, B, D)  

for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
            
 // traitement kif l3ada in ta3 fil d'attente ta3 lekraheb a chaque 5 seconde in na9es wa7dha           
            
            
if(t==125)
        {
    VC-=20;
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }  
 else if(t==130)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else  if(t==135)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==140)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==145)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        } 
else if(t==150)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==155)
        {
    VC-=20;
            
 for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==160)
        {
    VC-=20;
            
 for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==165)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==170)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==175)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else if(t==180)
        {
    VC-=20;
            
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        }
else 
        {
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
        } 
        }
       
              
if  (t>=180)  
       {  
    g.setColor(Color.red); 
    g.fillOval(300,410,20,20); // fet il wa9et badlou a7mer voix C 

    // Kif l3ada in 7afdou 3al position in ta3 lekraheb f tout les voix 
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
        }
       
 // Traitement in ta3 il cas il feux oranger ye5dem f voix D       
            
if  ((t>=170) && (t<180)) {  
    g.setColor(Color.orange); g.fillOval(410,280,20,20);
    g.setColor(Color.black); g.fillOval(410,300,20,20);
// Kif l3ada in 7afdou 3al position in ta3 lekraheb f tout les voix           
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
       
// Traitement de la 4éme voix , ou kif l3ada nafes il 5edma 3al fil d'attente na7i koul 5 seconde wa7dha

if  ((t>=180) && (t<240)) { 
    g.setColor(Color.green); // n5adem la5der 
    g.fillOval(410,260,20,20); 
    g.setColor(Color.black); 
    g.fillOval(410,300,20,20);// w tafi la7mer eli f tbi3tou yech3el 
            
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
 for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
if(t==185)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }  
else if(t==190)
        {
    VD-=20;
    
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else  if(t==195)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else if(t==200)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else if(t==205)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else if(t==210)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else if(t==215)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
            
        }
else if(t==220)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else if(t==225)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else if(t==230)
        {
    VD-=20;
            
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
else 
        {

for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        } 
        }
       
if  ((t>=240)) {  
    g.setColor(Color.red); 
    g.fillOval(410,300,20,20); // 5adem i rouge f voix D
    g.setColor(Color.black);
    g.fillOval(300,170,20,20); // tafi il rouge f voix A
    g.setColor(Color.green);
    g.fillOval(260,170,20,20);// 5adem i dhaw la5dher f voix A 
             
// Kif l3adha koul ma fama la3ba in ta3 dhw wela changement f programme 
// n7efedh 3al position ta3 leKraheb f (fil d'attende)          
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
    g.drawOval(x, 220,20,20);
        }
        }
         
// Traitement in ta3 feux Orange f voix A 
// kif i 3awed m jdid (cas le5ra) 
if  ((t>230) && t<240) {  
    g.setColor(Color.orange); 
    g.fillOval(280,170,20,20); // ncha3el i dhaw oranger f voix A
    g.setColor(Color.black); 
    g.fillOval(300,170,20,20); // w in tafi il rouge eli b tbi3tou ye5dem 
  
// Kif l3adha koul ma fama la3ba in ta3 dhw wela changement f programme 
// n7efedh 3al position ta3 leKraheb f (fil d'attende)     
for(int y=180;y>=V;y-=20)
        {
    g.drawOval(220, y,20,20);
        }
for(int x=180;x>=VB;x-=20)
        {
    g.drawOval(x, 350,20,20);
        }
for(int y=VC;y>=410;y-=20)
        {
    g.drawOval(350, y,20,20);
        }
for(int x=VD;x>=400;x-=20)
        {
g.drawOval(x, 220,20,20);
        }
        }
       
if (t>240) t=-1; // 3awed leni in 5alih l programme boucli
       

/// il maps 

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

   

//ligne médiane il met9at3a
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
     
         while (runner == thisThread) {	// si runner == null, mort du thread
              
              repaint(); //appel a repaint() pour mettre à jour le panel
              
             try {Thread.sleep(vitesse);
             
                   Thread.sleep(vitesse);
                   
             } catch (InterruptedException e) { }
               
             
              
         }
    }

	} 


