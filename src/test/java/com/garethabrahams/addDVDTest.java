package com.garethabrahams;

import junit.framework.TestListener;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class addDVDTest {

    @Test
    public void addDVDList(){

        List dvdList = new ArrayList();
        List dvdList2 = new ArrayList();
        DVD Speed = new DVD("Speed", "Action");
        dvdList.add(Speed);
        dvdList2.add(Speed);

        Assert.assertEquals(dvdList,dvdList2);
    }

    @Test
    public void addDVDSet() {
        Set dvdSet = new HashSet();
        Set dvdSet2 = new HashSet();
        DVD Jumanji = new DVD("Jumanji", "Comedy");
        dvdSet.add(Jumanji);
        dvdSet2.add(Jumanji);

        Assert.assertEquals(dvdSet,dvdSet2);
    }

    @Test
    public void addDVDMap() {
        Map dvdMap = new HashMap();
        Map dvdMap2 = new HashMap();
        DVD NextFriday = new DVD("Next Friday", "Horror");
        dvdMap.put(NextFriday.getCatergory(), NextFriday);
        dvdMap2.put(NextFriday.getCatergory(), NextFriday);

        Assert.assertEquals(dvdMap,dvdMap2);
    }

    @Test
    public void addDVDCollect() {
        Collection<DVD> dvdcollect;
        Collection<DVD> dvdcollect2;
        dvdcollect = new HashSet<DVD>();
        dvdcollect2 = new HashSet<DVD>();
        DVD Creed = new DVD("Creed", "Action");
        dvdcollect.add(Creed);
        dvdcollect2.add(Creed);

        Assert.assertEquals(dvdcollect,dvdcollect2);
    }
}