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
public class ChatServer extends Frame implements ActionListener,Runnable{
    ServerSocket s;
    Socket s1;
    BufferedReader br;
    BufferedWriter bw;
    TextField text;
    Button send,exit;
    List list;
    
    public void run()
    {
        try {
            s1.setSoTimeout(1);
        } catch (SocketException ex) {
            //Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (true)
        {
            try {
                list.add(br.readLine());
            } catch (IOException ex) {
               // Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
        }
    }
    public static void main(String args[])
    {
        new ChatServer("aditi");
    }
    public ChatServer(String m)
    {
        super(m);
        setSize(200,300);
        setLocation(300,500);
        
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
        try
        {
            s= new ServerSocket(9999);
            s1=s.accept();
            br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
            bw.write("hello");
            bw.newLine();
            bw.flush();
            
            Thread th = new Thread (this);
            th.start();
            
        }
        catch(Exception e1){}
        
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
                text.setText("");
            }
            catch (Exception e2){}
            
        }
    }
}


