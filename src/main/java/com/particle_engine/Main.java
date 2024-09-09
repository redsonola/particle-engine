/*
 * Coder: Courtney Brown
 * Date: Sep. 2024
 * Description: Particle Engine - 2nd CCII - Create a particle engine with basic physics and some interactivity
 * 
 */

package com.particle_engine;

import processing.core.*; 

public class Main extends PApplet {

    Balls balls; //a particle engine that we are running in the main

    //sets up processing and prints the hello world message to the console.
    public static void main(String[] args) {
        PApplet.main("com.particle_engine.Main");
    }

    //sets up the size of the window
    public void settings()
    {
        size(500, 500); 
        balls = new Balls(this);
    }

    //changes background color to black
    public void setup()
    {
        balls.setup();
    }

    //draws everything on the screen -- in this case - a ball 
    public void draw()
    {
        balls.draw(); 
    }

    //TBD -- gonna do something with some particles.
    public void mousePressed()
    {
        balls.mousePressed(); 
    }


}