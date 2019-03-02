package com.garethabrahams;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class addDVDTest {

    @Test
    public void addDVDList() {
        List dvdList = new ArrayList();
        List dvdList2 = new ArrayList();
        DVDInterface Speed = new DVDServiceImpl();
        String name = "Speed";
        Speed.createDVD(name);
        dvdList.add(Speed.getDvdName());
        dvdList2.add(name);

        Assert.assertEquals(dvdList,dvdList2);
    }

    @Test
    public void addDVDSet() {
        Set dvdSet = new HashSet();
        Set dvdSet2 = new HashSet();
        DVDInterface Jumanji = new DVDServiceImpl();
        String name = "Jumanji";
        Jumanji.createDVD(name);
        dvdSet.add(Jumanji.getDvdName());
        dvdSet2.add(name);

        Assert.assertEquals(dvdSet,dvdSet2);
    }

    @Test
    public void addDVDMap() {
        Map dvdMap = new HashMap();
        Map dvdMap2 = new HashMap();
        DVDInterface Next_Friday = new DVDServiceImpl();
        String name = "Next Friday";
        Next_Friday.createDVD(name);
        dvdMap.put(0,Next_Friday.getDvdName());
        dvdMap2.put(0,name);

        Assert.assertEquals(dvdMap,dvdMap2);
    }

    @Test
    public void addDVDCollect() {
        Collection<DVDInterface> dvdcollect;
        Collection<DVDInterface> dvdcollect2;
        dvdcollect = new HashSet<DVDInterface>();
        dvdcollect2 = new HashSet<DVDInterface>();
        String name = "Creed";
        DVDInterface Creed = new DVDServiceImpl();
        Creed.createDVD(name);
        dvdcollect.add(Creed);
        dvdcollect2.add(Creed);

        Assert.assertEquals(dvdcollect,dvdcollect2);
    }
}