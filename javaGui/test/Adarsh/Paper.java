
package Adarsh;


public class Paper {
    String quality,orientation;
    float size,cost,qty,type;
    Paper(float t, String qua, String o, float s, float q, float c)
    {
        type=t;
        quality=qua;
        orientation=o;
        size=s;       
        qty=q;
        cost=c;
    }
   /* void write(){
        System.out.println(" ");
    }
    */
    static float getPriceOfSize(String s1)
    {
        switch (s1){
            case "A1" :
                return 0.54f;
            case "A2" :
                return 0.65f;
            case "A3" :
                return 0.41f;
            case "A4" :
                return 0.5f;
            case "A8" :
                return 0.6f;
            case "A16" :
                return 0.7f;
             default:
                 return 1f;
        }  
    }
     static float getType(String t1)
    {
        switch (t1){
            case "100 GSM Maplitho" :
                return 0.54f;
            case "Orient" :
                return 0.65f;
            case "Ledger Paper" :
                return 0.41f;
            case "Card Sheet" :
                return 0.5f;
            case "Sirpur Color Paper" :
                return 0.6f;
            case "Duplicate Paper" :
                return 0.7f;
            case "Duplex Paper" :
                return 0.8f;
             default:
                 return 1f;
            }         
    }
    void showPaper()
    {
        System.out.println("Cost:- "+this.cost+" Quality"+this.quality+" Type:-"+this.type+" Orientation:-"+this.orientation);
    }
    float costPaper()
    {
        return this.size*this.qty*this.type;
    }
}
class ArtPaper extends Paper
{
String type;

}

class print {
 
    String colour,sides, printType;  

    print(String col, String Si, String pt)
    {
        colour= col;
        sides=Si;
        printType=pt;
    }
     
    static float colourCost(c1)
    {
    switch(c1)
    {
    
    
    }
        
    
    }
}
class total {
    public static void main(String[] args) {
        
       
    }
}
