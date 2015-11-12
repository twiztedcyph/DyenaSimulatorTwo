/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author Georgios
 */
public class Data {
    
    //arrays
    private float[] hve = new float[25];
    private float[] pit = new float[25];
    private float[] rol = new float[25];
    private float[] hed = new float[25];
    
    //average values?(RMS)
    private float hRMS;
    private float pRMS;
    private float rRMS;
    private float hdRMS;//not sure???
    
    //acceleration
    private float[] ax = new float[25];
    private float[] ay = new float[25];
    private float[] az = new float[25];
    
    /**
     * 
     * @param hve
     * @param pit
     * @param rol
     * @param hed
     * @param hRMS
     * @param pRMS
     * @param rRMS
     * @param hdRMS
     * @param ax
     * @param ay
     * @param az 
     */
    public Data(float[] hve,float[] pit, float[] rol,float[] hed,float hRMS,
            float pRMS, float rRMS, float hdRMS, float[] ax, float[] ay, float[] az ){
        
        this.hve = hve;
        this.pit = pit;
        this.rol = rol;
        this.hed = hed;
         
        //hve = new float[25];
        //pit = new float[25];
        //rol = new float[25];
        //hed = new float[25];
        
        for (int i = 0; i < 25; i++) {
            hve[i] = new Random().nextFloat();
        }
        
        for (int i = 0; i < 25; i++) {
            pit[i] = new Random().nextFloat();
        }
        
        for (int i = 0; i < 25; i++) {
            rol[i] = new Random().nextFloat();
        }
        
        for (int i = 0; i < 25; i++) {
            hed[i] = new Random().nextFloat();
        }
        
        this.hRMS = hRMS;
        this.pRMS = pRMS;
        this.rRMS = rRMS;
        this.hdRMS = hdRMS;
        
        
        this.ax = ax;
        this.ay = ay;
        this.az = az;
        
        for (int i = 0; i < 25; i++) {
            ax[i] = new Random().nextFloat();
        }
        
        for (int i = 0; i < 25; i++) {
            ay[i] = new Random().nextFloat();
        }
        
        for (int i = 0; i < 25; i++) {
            az[i] = new Random().nextFloat();
        }
        
    }
    
    /**
     * 
     * @return 
     */
    
    public double getHeaveRMS(){
        float shve=0;
        for (int i = 0; i < 25; i++) {
            shve += hve[i];
        }
        return Math.sqrt((1/(float) hve.length) * shve);
    }
    
    /**
     * 
     * @return 
     */
    public double getPitchRMS(){
        float spit=0;
        for (int i = 0; i < 25; i++) {
            spit += pit[i];
        }      
        return Math.sqrt((1/(float) pit.length) * spit);
    }
    
    /**
     * 
     * @return 
     */
    public double getRollRMS(){
        float srol=0;
        for (int i = 0; i < 25; i++) {
            srol += rol[i];
        }
        return Math.sqrt((1/(float) rol.length) * srol);
    }
    
    /**
     * 
     * @return 
     */
    public float[] getHve(){
        return hve;
    }
    
    /**
     * 
     * @return 
     */
    public float[] getPit(){
        return pit;
    }
    
    /**
     * 
     * @return 
     */
    public float[] getRol(){
        return rol;
    }
    
    /**
     * 
     * @return 
     */
    public float[] getHed(){
        return hed;
    }  
    
    
    public float getData(){
        return 0;
    }
        
}
