/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nataraj.myotest;

import com.thalmic.myo.AbstractDeviceListener;
import com.thalmic.myo.FirmwareVersion;
import com.thalmic.myo.Myo;
import com.thalmic.myo.Pose;
import com.thalmic.myo.Quaternion;
import com.thalmic.myo.Vector3;
import com.thalmic.myo.enums.Arm;
import com.thalmic.myo.enums.WarmupResult;
import com.thalmic.myo.enums.WarmupState;
import com.thalmic.myo.enums.XDirection;

/**
 *
 * @author natarajmehalingam
 */
public class MyoListener extends AbstractDeviceListener {

    @Override
    public void onPair(Myo myo, long l, FirmwareVersion fv) {
        System.out.println("on pair");
    }

    @Override
    public void onUnpair(Myo myo, long l) {
        System.out.println("on unPair");
    }

    @Override
    public void onConnect(Myo myo, long l, FirmwareVersion fv) {
        System.out.println("on connect");
    }

    @Override
    public void onDisconnect(Myo myo, long l) {
        System.out.println("on disconnect");
    }

    @Override
    public void onArmSync(Myo myo, long l, Arm arm, XDirection xd, float f, WarmupState ws) {
        System.out.println("on sync");
    }

    @Override
    public void onArmUnsync(Myo myo, long l) {
        System.out.println("on unsync");
    }

    @Override
    public void onUnlock(Myo myo, long l) {
        System.out.println("on unlock");
    }

    @Override
    public void onLock(Myo myo, long l) {
        System.out.println("on lock");
    }

    @Override
    public void onPose(Myo myo, long l, Pose pose) {
        System.out.println("on pose"+pose.toString());
    }

//    @Override
//    public void onOrientationData(Myo myo, long l, Quaternion qtrn) {
//        System.out.println("on onOrientationData");
//    }

//    @Override
//    public void onAccelerometerData(Myo myo, long l, Vector3 vctr) {
//        System.out.println("on onAccelerometerData");
//    }

//    @Override
//    public void onGyroscopeData(Myo myo, long l, Vector3 vctr) {
//        System.out.println("on onGyroscopeData");
//    }

    @Override
    public void onRssi(Myo myo, long l, int i) {
        System.out.println("on onRssi");
    }

    @Override
    public void onBatteryLevelReceived(Myo myo, long l, int i) {
        System.out.println("on onBatteryLevelReceived");
    }

//    @Override
//    public void onEmgData(Myo myo, long l, byte[] bytes) {
//        System.out.println("on onEmgData");
//    }

    @Override
    public void onWarmupCompleted(Myo myo, long l, WarmupResult wr) {
        System.out.println("on onWarmupCompleted");
    }
    
}
