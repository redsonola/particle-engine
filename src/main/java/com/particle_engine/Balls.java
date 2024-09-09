/*
 * Coder: Courtney Brown
 * Date: Sep. 2024
 * Description: Balls -- particle engine simulation 
 * 
 */

package com.particle_engine;

import java.util.ArrayList;
import processing.core.*;


public class Balls {

    PApplet main; //the main class -- provides all the functionality of processing -- YAY!!
    ArrayList<Ball> balls;

    Ball ball; //test case ball

    Balls(PApplet main_)
    {
        main = main_; 
        balls = new ArrayList<Ball>(); 
    }

    //setup everything you need for the particle engine
    void setup()
    {
        main.background(0);
        ball = new Ball(main.width/2.0f, main.height*.10f, 50.f, main, main.color(main.random(255), main.random(255), main.random(255))); //I had to make everything floats by adding f at the end of the hard-coded numbers....
    }

    //draws the balls man
    void draw()
    {
        main.noStroke();
        main.background(0); //clear the background from the last frame
        ball.draw(); 
    }


    //setup everything you need for the mouse interaction -- processing.org/reference has more examples
    void mousePressed()
    {
        ball.faster(); 
    }

}
