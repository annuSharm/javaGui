/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aditi;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayank
 */
public class Client extends Frame implements ActionListener,Runnable{
    Socket s;
    BufferedReader br;
    BufferedWriter bw;
    TextField text;
    Button send,exit;
    List list;
    
    public static void main (String args[]){
        Client client = new Client("Client Process");
    }
    public void run(){
        try {
            s.setSoTimeout(1);
           
        } catch (SocketException ex) {
           System.out.println("Socket Exception");
        }
        while(true){
            try {
                list.add(br.readLine());
            } catch (IOException ex) {
                //System.out.println("IO Exception");
            }
        }
        
    }
    public Client (String m)
    {
        super(m);
        setSize(200,300);
        setLocation(300,0);
        
        this.setLayout(new BorderLayout());
        
        send = new Button("send");
        exit = new Button("exit");
        send.addActionListener(this);
        exit.addActionListener(this);
        
        list = new List();
        text= new TextField();
        
        add(list,"Center");
        add(send,"West");
        add(exit,"East");
        add(text,"South");
        setVisible(true);
        
       try {
           s= new Socket("127.0.0.1",9999);
        br= new BufferedReader(new InputStreamReader(s.getInputStream()));
        bw= new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        Thread th = new Thread(this);
        th.start();
       }
       catch(Exception e){}
       
    }
    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource().equals(exit))
            System.exit(0);
        else
        {
            try{
                bw.write(text.getText());
                bw.newLine();
                bw.flush();
            }
            catch(Exception e1){}
            
        }
    }
}

