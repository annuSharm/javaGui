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
    String type,size,partition,orientation;
    float cost;
    int qty;
    Paper(String t, String s, String p, String o, int q){
        type=t;
        size=s;
        partition=p;
        orientation=o;
        qty=q;
    }
}
