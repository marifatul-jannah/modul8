/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author Thole
 */
public class sifat extends Behaviour{

    public sifat(Agent a){
        super(a);
    }
    
    @Override
    public void action() {
        System.out.println("local name" + myAgent.getLocalName());
    }
    
    @Override
    public boolean done() {
        return true;
    }
    
}
