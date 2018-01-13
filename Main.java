package com.alexanderbehrens.ipundportscanner;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
           
      ipErreichbar myIpBereich = new ipErreichbar();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("IP und Port Scanner");
      System.out.println();
      
      System.out.println("Bitte die ersten drei Zahlen Paare eingeben.");
      System.out.println("z.B. 192.168.100 ");
      
      String ipScannen = keyboard.nextLine();
      
      System.out.print("Anfang: ");
      String ipAnfang = keyboard.nextLine();
      
      System.out.println();
      System.out.print("Ende: ");
      String ipEnde = keyboard.nextLine();
      
      System.out.println();
      System.out.print("Zeit zum scannen in Millisekunden. 500 ist ein guter Wert.");
      int Zeit = keyboard.nextInt();
      
      myIpBereich.scannen(ipScannen + ".", ipAnfang, ipEnde, false, Zeit);
    }
    
}
