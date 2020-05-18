/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;
import jade.core.Agent;
import java.util.Iterator;

/**
 *
 * @author Thole
 */
public class HelloWorldAgent extends Agent{
    @Override
    protected void setup() {
        System.out.println("Hai Kamu. Saya agent!");
        System.out.println("my local-name is : " + getAID().getLocalName());
        System.out.println("my gide is : " + getAID().getName());
        System.out.println("my address are : ");
        Iterator it = getAID().getAllAddresses();
        while (it.hasNext()) {
            System.out.println("-" + it.next());
        }
    }
}
