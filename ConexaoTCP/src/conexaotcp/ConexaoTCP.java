/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaotcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author JAVA
 */
public class ConexaoTCP {

    public static void main(String[] args) throws Exception{
        ServerSocket serversocket =new ServerSocket(3000);
        Socket clientsocket = serversocket.accept();  
        
        InputStream is = clientsocket.getInputStream();
        OutputStream os = clientsocket.getOutputStream();
        
        DataInputStream dis = new DataInputStream(is);
        DataOutputStream dos = new DataOutputStream(os);
        
        char s = dis.readChar();
        System.out.println(s);
        
        dos.writeChars(s+" + do céu");
        
        clientsocket.close();
        serversocket.close();
    }
    
}
