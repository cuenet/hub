/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluepyjama.ihstech.CueNet.Hub;

/**
 *
 * @author buckbanzai
 */
public class HubMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread TCP = new Thread(new TCPComm());
        TCP.start();
    }
}
