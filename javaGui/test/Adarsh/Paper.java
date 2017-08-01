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
