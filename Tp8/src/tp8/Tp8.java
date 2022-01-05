/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Patri
 */
public class Tp8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
HashSet<String> hs = new HashSet<String>();
hs.add("toto");
hs.add("tata");
hs.add("titi");
Iterator<String> it = hs.iterator();
while (it.hasNext()) {
System.out.println(it.next());
}
System.out.println("\nParcours avec un tableau d'objet");
System.out.println("----------------------------------");
Object[] obj = hs.toArray();
for (Object o : obj) {
System.out.println(o);
}
}
}    
    

