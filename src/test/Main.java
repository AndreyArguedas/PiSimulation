/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Simulation;

/**
 * @author LAPTOP
 */
public class Main {
    
    public static void main(String [] args){
        Simulation sim = new Simulation(6, (int) 1e7); //3 seconds using 6 threads
        System.out.println(sim.pi());    
    }
}
