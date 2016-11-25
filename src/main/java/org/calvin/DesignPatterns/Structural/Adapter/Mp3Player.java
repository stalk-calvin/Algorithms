/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import lombok.Getter;

@Getter
public class Mp3Player implements MediaPlayer {
    private static final String type = "mp3";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String play(String fileName) {
        return "Playing "+type+" file. Name: "+ fileName;
    }
}