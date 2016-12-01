/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Mediator;

public class BEventHandler {
    IMediator pMediator;

    public void setMediator(IMediator pMediator) {
        this.pMediator = pMediator;
    }

    public void fireEvent(String ev) {
        pMediator.sendEvent("B", ev);
    }

    public void receiveEvent(String name, String ev) {
        System.out.println("B: Receive " + ev + " Event from " + name);
    }
}