package com.garethabrahams;
import java.util.*;
/**
 * DVDInterface Application!
 *
 */
public class addDVD
{
    List dvdList = new ArrayList();
    Set dvdSet = new HashSet();
    Map dvdMap = new HashMap();
    Collection<DVDInterface> dvdcollect;


        public void addDVDList() {
            DVDInterface Speed = new DVDServiceImpl();
            String name = "Speed";
            Speed.createDVD(name);
            dvdList.add(Speed.getDvdName());
        }

        public  void addDVDSet() {
            DVDInterface Jumanji = new DVDServiceImpl();
            String name = "Jumanji";
            Jumanji.createDVD(name);
            dvdSet.add(Jumanji.getDvdName());
        }

        public void addDVDMap() {
            DVDInterface Next_Friday = new DVDServiceImpl();
            String name = "Next Friday";
            Next_Friday.createDVD(name);
            dvdMap.put(0,Next_Friday.getDvdName());
        }

        public void addDVDCollect(){
            dvdcollect = new HashSet<DVDInterface>();
            DVDInterface Creed = new DVDServiceImpl();
            String name = "Creed";
            Creed.createDVD(name);
            dvdSet.add(Creed.getDvdName());

        }



}
