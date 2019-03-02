package com.garethabrahams;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

import static org.junit.Assert.*;

public class addDVDTest {

    private DVDInterface dvd;

    @Test
    public void addDVDList() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        dvd = (DVDInterface)ctx.getBean("dvd");

        List dvdList = new ArrayList();
        List dvdList2 = new ArrayList();
        String name = "Speed";
        dvd.createDVD(name);
        dvdList.add(dvd.getDvdName());
        dvdList2.add(name);

        Assert.assertEquals(dvdList,dvdList2);
    }

    @Test
    public void addDVDSet() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        dvd = (DVDInterface)ctx.getBean("dvd");

        Set dvdSet = new HashSet();
        Set dvdSet2 = new HashSet();

        String name = "Jumanji";
        dvd.createDVD(name);

        dvdSet.add(dvd.getDvdName());
        dvdSet2.add(name);

        Assert.assertEquals(dvdSet,dvdSet2);
    }

    @Test
    public void addDVDMap() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        dvd = (DVDInterface)ctx.getBean("dvd");

        Map dvdMap = new HashMap();
        Map dvdMap2 = new HashMap();

        String name = "Next Friday";
        dvd.createDVD(name);

        dvdMap.put(0,dvd.getDvdName());
        dvdMap2.put(0,name);

        Assert.assertEquals(dvdMap,dvdMap2);
    }

    @Test
    public void addDVDCollect() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        dvd = (DVDInterface)ctx.getBean("dvd");

        Collection<DVDInterface> dvdcollect;
        Collection<DVDInterface> dvdcollect2;
        dvdcollect = new HashSet<DVDInterface>();
        dvdcollect2 = new HashSet<DVDInterface>();

        String name = "Creed";
        dvd.createDVD(name);
        dvdcollect.add(dvd);
        dvdcollect2.add(dvd);

        Assert.assertEquals(dvdcollect,dvdcollect2);
    }
}