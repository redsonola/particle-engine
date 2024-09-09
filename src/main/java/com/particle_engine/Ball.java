/*
 * Coder: Courtney Brown
 * Date: Sep. 2024
 * Description: Ball -- a bouncing ball. Bounces up and down.
 * 
 */

package com.particle_engine;

import processing.core.*;

public class Ball {
    PApplet main; //the main class -- provides all the functionality of processing -- YAY!!

    float x, y; //location of the ball
    float yVel = 1; //how fast the ball moves
    float y_direction = 1; //which direction the ball goes, 1 is down -- adding & -1 is up -- subtracting

    float radius; //how big the ball is
    int ballColor; 
    
    Ball(float x_, float y_, float radius_, PApplet main_, int c)
    {
        x = x_; 
        y = y_; 
        radius = radius_; 
        ballColor = c;

        main = main_; 
    }

    void draw()
    {
       main.ellipse(x, y, radius, radius);
       move(); 
    }

    void move()
    {
        y += yVel*y_direction; 
        if( y > main.height )
        {
            y_direction = -1; 
        }
        if( y < 0 )
        {
            y_direction = 1; 
        }

    }

    void faster()
    {
        yVel++; 
    }

}
