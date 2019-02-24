package com.garethabrahams;
import java.util.*;
/**
 * DVD Application!
 *
 */
public class addDVD
{
    List dvdList = new ArrayList();
    Set dvdSet = new HashSet();
    Map dvdMap = new HashMap();
    Collection<DVD> dvdcollect;


        public void addDVDList() {
            DVD Speed = new DVD("Speed", "Action");
            dvdList.add(Speed);
        }

        public  void addDVDSet() {

            DVD Jumanji = new DVD("Jumanji", "Comedy");
            dvdSet.add(Jumanji);
        }

        public void addDVDMap() {
            DVD NextFriday = new DVD("Next Friday", "Horror");
            dvdMap.put(NextFriday.getCatergory(), NextFriday);
        }

        public void addDVDCollect(){
        dvdcollect = new HashSet<DVD>();
        DVD Creed = new DVD("Creed", "Action");
        dvdcollect.add(Creed);
        }


}
