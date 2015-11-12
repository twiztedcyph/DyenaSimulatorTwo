/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author Cypher
 */
public class PushOn
{
    private float[] pinValues;
    private Random rand;
    
    public PushOn()
    {
        rand = new Random();
        pinValues = new float[12];
    }
    
    public float[] getValues()
    {
        for (int i = 0; i < 12; i++)
        {
            pinValues[i] = rand.nextFloat();
        }
        return pinValues;
    }
}
