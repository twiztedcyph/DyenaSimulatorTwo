/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Cypher
 */
public class Updater implements Runnable
{
    private int count = 0;
    
    public Updater()
    {
        
    }

    @Override
    public void run()
    {
        while(true)
        {
            count++;
            if (count > Integer.MAX_VALUE)
            {
                count = 0;
            }
            
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public int getCount()
    {
        return count;
    }
}
