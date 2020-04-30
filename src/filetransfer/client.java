/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yahya
 */
package filetransfer;

import java.net.*;
import java.io.*;


public class client {
     public static void main(String[] args) throws Exception{
         
        byte []b = new byte[20000];
        Socket sr = new Socket("localhost",797);
        InputStream is = sr.getInputStream();
        FileOutputStream fr = new FileOutputStream("F:\\Hasil.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
    }
    
}
