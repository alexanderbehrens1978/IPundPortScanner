
package com.alexanderbehrens.ipundportscanner;

import java.io.IOException; 
import java.net.InetAddress; 

/**
 *
 * @author alex
 */
public class ipErreichbar {
    
    
    public void scannen (String ipBereich, String ipBegin, String ipEnd, boolean fehler, int time) throws IOException {
        
        boolean anzeigen = fehler;
               
        String host = ipBereich;
        
        String ipAnfang = ipBegin;
        String ipEnde   = ipEnd;
        int Time = time; // bei 200 gibt es fehler wegen der Erreichbarkeit
        
        String host_zum_scannen = host + ipAnfang;
        
    //    System.out.println("host " + host_zum_scannen);
    //    System.out.println("ipAnfang " + ipAnfang);
    //    System.out.println("ipEnde " + ipEnde);
   
        int zahl1 = Integer.parseInt(ipAnfang);
        int zahl2 = Integer.parseInt(ipEnde);
        
       // System.out.println(host_zum_scannen);
        try { 
            for (int i = zahl1; i <= zahl2; i++) {
                host_zum_scannen = host + i;
               // System.out.println("host zum scannen " + host_zum_scannen);
                InetAddress iAdr = InetAddress.getByName(host_zum_scannen); 
                if (iAdr.isReachable(time)) { 
                  System.out.println("Host " + host_zum_scannen
                            + " ist erreichbar");
                } else if(anzeigen==true) { 
                    System.out.println("Host " + host_zum_scannen + " ist nicht erreichbar"); 
                } 
            }
        } catch (IOException e) { 
                System.err 
                    .println("IOProbleme beim Testen der Erreichbarkeit von: '" 
                            + host + ipAnfang); 
            
        }
    }
    
}
