/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Cypher
 */
public class Updater implements Runnable
{
    private Message.Eng eng;
    private Message.Head head;
    private Message.Inf inf;
    private Message.Sys sys;
    private Message.Vmms vmms;

    private ArrayList<Double> hve, pit, rol, hed, ax, ay, az;

    private Message message;

    private SimpleDateFormat dateFormatGmt;
    private PushOn po;
    float[] localPo;

    public Updater()
    {

        dateFormatGmt = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("UTC"));

        po = new PushOn();
        localPo = new float[12];

        message = new Message();
        head = new Message().new Head();
        vmms = new Message().new Vmms();
        eng = new Message().new Eng();
        inf = new Message().new Inf();

        sys = new Message().new Sys();

        hve = new ArrayList<>();
        pit = new ArrayList<>();
        rol = new ArrayList<>();
        hed = new ArrayList<>();
        ax = new ArrayList<>();
        ay = new ArrayList<>();
        az = new ArrayList<>();

        for (int i = 0; i < 25; i++)
        {
            hve.add(0.0);
            pit.add(0.0);
            rol.add(0.0);
            hed.add(0.0);
            ax.add(0.0);
            ay.add(0.0);
            az.add(0.0);
        }

    }

    @Override
    public void run()
    {
        while (true)
        {
            //Head

            head.setVid(9718040);
            head.setDt(dateFormatGmt.format(new Date()));
            head.setSta(255);
            //Rest from Vilius
            //Static data for now
            head.setLat(52.99999);
            head.setLon(1.99999);
            head.setSog(22);
            head.setCog(256.0);

            //VMMS
            vmms.setAx(ax);
            vmms.setAy(ay);
            vmms.setAz(az);
            vmms.setHed(hed);
            vmms.setHve(hve);
            vmms.setPit(pit);
            vmms.setRol(rol);
            vmms.setHrms(0.0);
            vmms.setPrms(1.0);
            vmms.setRrms(1.0);
            //From Geogios.
            //Static dummy data.
            //Inf
            inf.setAll(po.getValues());

            //Engine
            eng.setFca(1000.0);
            eng.setFcb(1000.0);
            eng.setRpma(1800);
            eng.setRpmb(1800);
            eng.setTha(60);
            eng.setThb(60);

            //System
            sys.setTemp(22.0);
            sys.setVolt(56.0);

            //Message(Integer bt, Head head, Vmms vmms, Inf inf, Eng eng, Sys sys)
            message = new Message(257, head, vmms, inf, eng, sys);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public Message getMessage()
    {
        return message;
    }
}
