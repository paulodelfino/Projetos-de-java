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
import java.net.Socket;

public class Java {
    public static void main(String[] args) throws Exception{
        Socket sk = new Socket("10.107.201.132",3000);
        
        InputStream is = sk.getInputStream();
        OutputStream os = sk.getOutputStream();
        
        DataInputStream dis = new DataInputStream(is);
        DataOutputStream dos = new DataOutputStream(os);
        
//        dos.writeInt(1000000);
        dos.writeChars("Maria");
        char valorincrementado = dis.readChar();
        
        System.out.println(valorincrementado);
        
        sk.close();
    }
}
