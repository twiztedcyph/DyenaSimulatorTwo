/*
 *
 *
 */
package Classes;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


@Generated("org.jsonschema2pojo")
public class Message
{

    @SerializedName("bt")
    @Expose
    private Integer bt;
    @SerializedName("head")
    @Expose
    private Head head;
    @SerializedName("vmms")
    @Expose
    private Vmms vmms;
    @SerializedName("if")
    @Expose
    private If inf;
    @SerializedName("eng")
    @Expose
    private Eng eng;
    @SerializedName("sys")
    @Expose
    private Sys sys;

    /**
     * No args constructor for use in serialization
     */
    public Message()
    {
    }

    /**
     * @param inf
     * @param sys
     * @param vmms
     * @param eng
     * @param head
     * @param bt
     */
    public Message(Integer bt, Head head, Vmms vmms, If inf, Eng eng, Sys sys)
    {
        this.bt = bt;
        this.head = head;
        this.vmms = vmms;
        this.inf = inf;
        this.eng = eng;
        this.sys = sys;
    }

    /**
     * @return The bt
     */
    public Integer getBt()
    {
        return bt;
    }

    /**
     * @param bt The bt
     */
    public void setBt(Integer bt)
    {
        this.bt = bt;
    }

    /**
     * @return The head
     */
    public Head getHead()
    {
        return head;
    }

    /**
     * @param head The head
     */
    public void setHead(Head head)
    {
        this.head = head;
    }

    /**
     * @return The vmms
     */
    public Vmms getVmms()
    {
        return vmms;
    }

    /**
     * @param vmms The vmms
     */
    public void setVmms(Vmms vmms)
    {
        this.vmms = vmms;
    }

    /**
     * @return The inf
     */
    public If getIf()
    {
        return inf;
    }

    /**
     * @param inf The if
     */
    public void setIf(If inf)
    {
        this.inf = inf;
    }

    /**
     * @return The eng
     */
    public Eng getEng()
    {
        return eng;
    }

    /**
     * @param eng The eng
     */
    public void setEng(Eng eng)
    {
        this.eng = eng;
    }

    /**
     * @return The sys
     */
    public Sys getSys()
    {
        return sys;
    }

    /**
     * @param sys The sys
     */
    public void setSys(Sys sys)
    {
        this.sys = sys;
    }


    @Generated("org.jsonschema2pojo")
    private class Eng
    {

        @SerializedName("fca")
        @Expose
        private Double fca;
        @SerializedName("fcb")
        @Expose
        private Double fcb;
        @SerializedName("rpma")
        @Expose
        private Integer rpma;
        @SerializedName("rpmb")
        @Expose
        private Integer rpmb;
        @SerializedName("tha")
        @Expose
        private Integer tha;
        @SerializedName("thb")
        @Expose
        private Integer thb;

        /**
         * No args constructor for use in serialization
         */
        public Eng()
        {
        }

        /**
         * @param thb
         * @param tha
         * @param rpmb
         * @param rpma
         * @param fcb
         * @param fca
         */
        public Eng(Double fca, Double fcb, Integer rpma, Integer rpmb, Integer tha, Integer thb)
        {
            this.fca = fca;
            this.fcb = fcb;
            this.rpma = rpma;
            this.rpmb = rpmb;
            this.tha = tha;
            this.thb = thb;
        }

        /**
         * @return The fca
         */
        public Double getFca()
        {
            return fca;
        }

        /**
         * @param fca The fca
         */
        public void setFca(Double fca)
        {
            this.fca = fca;
        }

        /**
         * @return The fcb
         */
        public Double getFcb()
        {
            return fcb;
        }

        /**
         * @param fcb The fcb
         */
        public void setFcb(Double fcb)
        {
            this.fcb = fcb;
        }

        /**
         * @return The rpma
         */
        public Integer getRpma()
        {
            return rpma;
        }

        /**
         * @param rpma The rpma
         */
        public void setRpma(Integer rpma)
        {
            this.rpma = rpma;
        }

        /**
         * @return The rpmb
         */
        public Integer getRpmb()
        {
            return rpmb;
        }

        /**
         * @param rpmb The rpmb
         */
        public void setRpmb(Integer rpmb)
        {
            this.rpmb = rpmb;
        }

        /**
         * @return The tha
         */
        public Integer getTha()
        {
            return tha;
        }

        /**
         * @param tha The tha
         */
        public void setTha(Integer tha)
        {
            this.tha = tha;
        }

        /**
         * @return The thb
         */
        public Integer getThb()
        {
            return thb;
        }

        /**
         * @param thb The thb
         */
        public void setThb(Integer thb)
        {
            this.thb = thb;
        }
    }

    @Generated("org.jsonschema2pojo")
    private class Head
    {

        @SerializedName("vid")
        @Expose
        private Integer vid;
        @SerializedName("dt")
        @Expose
        private String dt;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("sog")
        @Expose
        private Integer sog;
        @SerializedName("cog")
        @Expose
        private Double cog;
        @SerializedName("sta")
        @Expose
        private Integer sta;

        /**
         * No args constructor for use in serialization
         */
        public Head()
        {
        }

        /**
         * @param dt
         * @param sog
         * @param lon
         * @param sta
         * @param cog
         * @param vid
         * @param lat
         */
        public Head(Integer vid, String dt, Double lat, Double lon, Integer sog, Double cog, Integer sta)
        {
            this.vid = vid;
            this.dt = dt;
            this.lat = lat;
            this.lon = lon;
            this.sog = sog;
            this.cog = cog;
            this.sta = sta;
        }

        /**
         * @return The vid
         */
        public Integer getVid()
        {
            return vid;
        }

        /**
         * @param vid The vid
         */
        public void setVid(Integer vid)
        {
            this.vid = vid;
        }

        /**
         * @return The dt
         */
        public String getDt()
        {
            return dt;
        }

        /**
         * @param dt The dt
         */
        public void setDt(String dt)
        {
            this.dt = dt;
        }

        /**
         * @return The lat
         */
        public Double getLat()
        {
            return lat;
        }

        /**
         * @param lat The lat
         */
        public void setLat(Double lat)
        {
            this.lat = lat;
        }

        /**
         * @return The lon
         */
        public Double getLon()
        {
            return lon;
        }

        /**
         * @param lon The lon
         */
        public void setLon(Double lon)
        {
            this.lon = lon;
        }

        /**
         * @return The sog
         */
        public Integer getSog()
        {
            return sog;
        }

        /**
         * @param sog The sog
         */
        public void setSog(Integer sog)
        {
            this.sog = sog;
        }

        /**
         * @return The cog
         */
        public Double getCog()
        {
            return cog;
        }

        /**
         * @param cog The cog
         */
        public void setCog(Double cog)
        {
            this.cog = cog;
        }

        /**
         * @return The sta
         */
        public Integer getSta()
        {
            return sta;
        }

        /**
         * @param sta The sta
         */
        public void setSta(Integer sta)
        {
            this.sta = sta;
        }
    }

    @Generated("org.jsonschema2pojo")
    private class If
    {

        @SerializedName("pax")
        @Expose
        private Integer pax;
        @SerializedName("pay")
        @Expose
        private Integer pay;
        @SerializedName("paz")
        @Expose
        private Integer paz;
        @SerializedName("pbx")
        @Expose
        private Integer pbx;
        @SerializedName("pby")
        @Expose
        private Integer pby;
        @SerializedName("pbz")
        @Expose
        private Integer pbz;
        @SerializedName("pcx")
        @Expose
        private Integer pcx;
        @SerializedName("pcy")
        @Expose
        private Integer pcy;
        @SerializedName("pcz")
        @Expose
        private Integer pcz;
        @SerializedName("pdx")
        @Expose
        private Integer pdx;
        @SerializedName("pdy")
        @Expose
        private Integer pdy;
        @SerializedName("pdz")
        @Expose
        private Integer pdz;

        /**
         * No args constructor for use in serialization
         */
        public If()
        {
        }

        /**
         * @param pcx
         * @param pby
         * @param pbx
         * @param pcz
         * @param pcy
         * @param pax
         * @param paz
         * @param pay
         * @param pdx
         * @param pdy
         * @param pdz
         * @param pbz
         */
        public If(Integer pax, Integer pay, Integer paz, Integer pbx, Integer pby, Integer pbz, Integer pcx, Integer pcy, Integer pcz, Integer pdx, Integer pdy, Integer pdz)
        {
            this.pax = pax;
            this.pay = pay;
            this.paz = paz;
            this.pbx = pbx;
            this.pby = pby;
            this.pbz = pbz;
            this.pcx = pcx;
            this.pcy = pcy;
            this.pcz = pcz;
            this.pdx = pdx;
            this.pdy = pdy;
            this.pdz = pdz;
        }

        /**
         * @return The pax
         */
        public Integer getPax()
        {
            return pax;
        }

        /**
         * @param pax The pax
         */
        public void setPax(Integer pax)
        {
            this.pax = pax;
        }

        /**
         * @return The pay
         */
        public Integer getPay()
        {
            return pay;
        }

        /**
         * @param pay The pay
         */
        public void setPay(Integer pay)
        {
            this.pay = pay;
        }

        /**
         * @return The paz
         */
        public Integer getPaz()
        {
            return paz;
        }

        /**
         * @param paz The paz
         */
        public void setPaz(Integer paz)
        {
            this.paz = paz;
        }

        /**
         * @return The pbx
         */
        public Integer getPbx()
        {
            return pbx;
        }

        /**
         * @param pbx The pbx
         */
        public void setPbx(Integer pbx)
        {
            this.pbx = pbx;
        }

        /**
         * @return The pby
         */
        public Integer getPby()
        {
            return pby;
        }

        /**
         * @param pby The pby
         */
        public void setPby(Integer pby)
        {
            this.pby = pby;
        }

        /**
         * @return The pbz
         */
        public Integer getPbz()
        {
            return pbz;
        }

        /**
         * @param pbz The pbz
         */
        public void setPbz(Integer pbz)
        {
            this.pbz = pbz;
        }

        /**
         * @return The pcx
         */
        public Integer getPcx()
        {
            return pcx;
        }

        /**
         * @param pcx The pcx
         */
        public void setPcx(Integer pcx)
        {
            this.pcx = pcx;
        }

        /**
         * @return The pcy
         */
        public Integer getPcy()
        {
            return pcy;
        }

        /**
         * @param pcy The pcy
         */
        public void setPcy(Integer pcy)
        {
            this.pcy = pcy;
        }

        /**
         * @return The pcz
         */
        public Integer getPcz()
        {
            return pcz;
        }

        /**
         * @param pcz The pcz
         */
        public void setPcz(Integer pcz)
        {
            this.pcz = pcz;
        }

        /**
         * @return The pdx
         */
        public Integer getPdx()
        {
            return pdx;
        }

        /**
         * @param pdx The pdx
         */
        public void setPdx(Integer pdx)
        {
            this.pdx = pdx;
        }

        /**
         * @return The pdy
         */
        public Integer getPdy()
        {
            return pdy;
        }

        /**
         * @param pdy The pdy
         */
        public void setPdy(Integer pdy)
        {
            this.pdy = pdy;
        }

        /**
         * @return The pdz
         */
        public Integer getPdz()
        {
            return pdz;
        }

        /**
         * @param pdz The pdz
         */
        public void setPdz(Integer pdz)
        {
            this.pdz = pdz;
        }
    }

    @Generated("org.jsonschema2pojo")
    private class Sys
    {

        @SerializedName("volt")
        @Expose
        private Double volt;
        @SerializedName("temp")
        @Expose
        private Double temp;

        /**
         * No args constructor for use in serialization
         */
        public Sys()
        {
        }

        /**
         * @param volt
         * @param temp
         */
        public Sys(Double volt, Double temp)
        {
            this.volt = volt;
            this.temp = temp;
        }

        /**
         * @return The volt
         */
        public Double getVolt()
        {
            return volt;
        }

        /**
         * @param volt The volt
         */
        public void setVolt(Double volt)
        {
            this.volt = volt;
        }

        /**
         * @return The temp
         */
        public Double getTemp()
        {
            return temp;
        }

        /**
         * @param temp The temp
         */
        public void setTemp(Double temp)
        {
            this.temp = temp;
        }
    }

    @Generated("org.jsonschema2pojo")
    private class Vmms
    {

        @SerializedName("hve")
        @Expose
        private List<Double> hve = new ArrayList<Double>();
        @SerializedName("pit")
        @Expose
        private List<Double> pit = new ArrayList<Double>();
        @SerializedName("rol")
        @Expose
        private List<Double> rol = new ArrayList<Double>();
        @SerializedName("hed")
        @Expose
        private List<Double> hed = new ArrayList<Double>();
        @SerializedName("hrms")
        @Expose
        private Double hrms;
        @SerializedName("prms")
        @Expose
        private Integer prms;
        @SerializedName("rrms")
        @Expose
        private Integer rrms;
        @SerializedName("ax")
        @Expose
        private List<Double> ax = new ArrayList<Double>();
        @SerializedName("ay")
        @Expose
        private List<Double> ay = new ArrayList<Double>();
        @SerializedName("az")
        @Expose
        private List<Double> az = new ArrayList<Double>();

        /**
         * No args constructor for use in serialization
         */
        public Vmms()
        {
        }

        /**
         * @param az
         * @param ay
         * @param hve
         * @param rrms
         * @param prms
         * @param hrms
         * @param hed
         * @param rol
         * @param pit
         * @param ax
         */
        public Vmms(List<Double> hve, List<Double> pit, List<Double> rol, List<Double> hed, Double hrms, Integer prms, Integer rrms, List<Double> ax, List<Double> ay, List<Double> az)
        {
            this.hve = hve;
            this.pit = pit;
            this.rol = rol;
            this.hed = hed;
            this.hrms = hrms;
            this.prms = prms;
            this.rrms = rrms;
            this.ax = ax;
            this.ay = ay;
            this.az = az;
        }

        /**
         * @return The hve
         */
        public List<Double> getHve()
        {
            return hve;
        }

        /**
         * @param hve The hve
         */
        public void setHve(List<Double> hve)
        {
            this.hve = hve;
        }

        /**
         * @return The pit
         */
        public List<Double> getPit()
        {
            return pit;
        }

        /**
         * @param pit The pit
         */
        public void setPit(List<Double> pit)
        {
            this.pit = pit;
        }

        /**
         * @return The rol
         */
        public List<Double> getRol()
        {
            return rol;
        }

        /**
         * @param rol The rol
         */
        public void setRol(List<Double> rol)
        {
            this.rol = rol;
        }

        /**
         * @return The hed
         */
        public List<Double> getHed()
        {
            return hed;
        }

        /**
         * @param hed The hed
         */
        public void setHed(List<Double> hed)
        {
            this.hed = hed;
        }

        /**
         * @return The hrms
         */
        public Double getHrms()
        {
            return hrms;
        }

        /**
         * @param hrms The hrms
         */
        public void setHrms(Double hrms)
        {
            this.hrms = hrms;
        }

        /**
         * @return The prms
         */
        public Integer getPrms()
        {
            return prms;
        }

        /**
         * @param prms The prms
         */
        public void setPrms(Integer prms)
        {
            this.prms = prms;
        }

        /**
         * @return The rrms
         */
        public Integer getRrms()
        {
            return rrms;
        }

        /**
         * @param rrms The rrms
         */
        public void setRrms(Integer rrms)
        {
            this.rrms = rrms;
        }

        /**
         * @return The ax
         */
        public List<Double> getAx()
        {
            return ax;
        }

        /**
         * @param ax The ax
         */
        public void setAx(List<Double> ax)
        {
            this.ax = ax;
        }

        /**
         * @return The ay
         */
        public List<Double> getAy()
        {
            return ay;
        }

        /**
         * @param ay The ay
         */
        public void setAy(List<Double> ay)
        {
            this.ay = ay;
        }

        /**
         * @return The az
         */
        public List<Double> getAz()
        {
            return az;
        }

        /**
         * @param az The az
         */
        public void setAz(List<Double> az)
        {
            this.az = az;
        }
    }

    @Override
    public String toString()
    {
        return "Message{" +
                "bt=" + bt +
                ", head=" + head +
                ", vmms=" + vmms +
                ", inf=" + inf +
                ", eng=" + eng +
                ", sys=" + sys +
                '}';
    }
}