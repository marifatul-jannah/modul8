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
public class BehaviourAgent1 extends Agent{

    protected void setup() {
        addBehaviour(new sifat(this));
    }
}
