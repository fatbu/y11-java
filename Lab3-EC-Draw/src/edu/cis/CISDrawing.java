package edu.cis;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class CISDrawing extends GraphicsProgram
{
    private int maxIterations = 100;
    private int width = 1000;
    private int height = 666;


    public CISDrawing()
    {
        run();
    }

    public void render(double topX, double topY, double zoomFactor){

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){

                double x0 = ((double)(j+topX)/((double)width)-0.6)*3.75/zoomFactor;
                double y0 = ((double)(i+topY)/((double)height)-0.5)*2.5/zoomFactor;
                double x = 0;
                double y = 0;
                int iteration = 0;

                while(x*x + y*y <= 4 && iteration<maxIterations){
                    double xtemp = x*x - y*y + x0;
                    y = 2*x*y + y0;
                    x=xtemp;
                    iteration++;
                }

                GLine point = new GLine(j,i,j,i);
                if(iteration==maxIterations){
                    point.setColor(Color.black);
                }else{

                    point.setColor(Color.getHSBColor((float)(iteration)/(float)maxIterations, 0.9f, 0.9f));
                }
                add(point);
            }
        }
    }

    @Override
    public void run()
    {
        setSize(width, height);

        render(0,0,1);
    }

    public static void main(String[] args)
    {
        CISDrawing draw = new CISDrawing();
        draw.start(args);
    }

}
