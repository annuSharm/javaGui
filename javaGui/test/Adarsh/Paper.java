/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adarsh;

/**
 *
 * @author admin
 */
public class Paper {
    String type,quality,orientation;
    float size,cost,qty;
    Paper(String t, String qua, String o, float s, float q){
        type=t;
        quality=qua;
        orientation=o;
        size=s;       
        qty=q;
    }
    void write(){
        System.out.println("Adarsh.Paper.write()");
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
    void showPaper()
    {
        System.out.println("Cost:- "+this.size+" Quality"+this.quality+" Type:-"+this.type+" Orientation:-"+this.orientation);
    }
    float costPaper()
    {
        return this.size*this.qty;
    }
}

class print {
  String colour;  
}
class total {
    public static void main(String[] args) {
        Paper a=new Paper("a","b","c",2,3);
        a.write();
    }
}
