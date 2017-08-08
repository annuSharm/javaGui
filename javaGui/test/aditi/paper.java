
package Aditi;

public class paper {
    String quality,orientation;
    float size,cost,qty,type;
    paper(float t, String qua, String o, float s, float q, float c)
    {
        type=t;
        quality=qua;
        orientation=o;
        size=s;       
        qty=q;
        cost=c;
    }

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
/*class ArtPaper extends paper
{
String type;

}*/

class print {
    
    int PrintQuantity;
    float color,sides, printCost;
    String printType;

    print(float col, float Si, String pt, float pc,int pq)
    {
        color= col;
        sides=Si;
        printType=pt;
        printCost=pc;
        PrintQuantity=pq;
    }
     
    static float getcolorCost(String c1)
    {
    switch(c1)
    {
        case"colourful":
            return 2f;
        default:
           return 1f;  
    }
    }
    
    static float getsidesCost(String s2)
    {
    switch(s2)
    {
        case"double":
            return 1f;
        default:
           return 2f;  
    }
    }
   
    void showprint()
    {
        System.out.println("PrintCost:- "+this.printCost+" PrintType:-"+this.printType+" Sides:-"+this.sides+"Color:-"+this.color+"PrintQuantity:-"+this.PrintQuantity);
    }
    float costOfPrint()
    {
        return this.sides*this.color*this.PrintQuantity;
    }
}

class bind
{
    float bindType;
    
    bind(float bt)
    {
    bindType=bt;
    }
    
    static float getBindType(String b1)
    {
        switch(b1)
        {
        case"Spiral":
          return 20f;
        case"HardBinding":  
          return 60f;
        default:
          return 1f;
        }
    }
        
    void BindCost()
    {
      System.out.println("BindCost:"+this.bindType);  
    }
     
}
class total {
    public static void main(String[] args) 
    {
        
        
       
    }
}
