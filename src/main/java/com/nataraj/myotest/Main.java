/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nataraj.myotest;

import com.thalmic.myo.Hub;
import com.thalmic.myo.Myo;
import com.thalmic.myo.enums.LockingPolicy;

/**
 *
 * @author natarajmehalingam
 */
public class Main {
    public static void main(String[] args) {
        Hub hub = new Hub("com.nataraj.Main");  
        Myo myo = hub.waitForMyo(10000);  
        hub.setLockingPolicy(LockingPolicy.LOCKING_POLICY_STANDARD);
        
        hub.addListener(new MyoListener());  
        
        while (true) {  
            hub.run(1000 / 20);
        }
        
    }
}
