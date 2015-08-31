package com.fourinone.tests.SimpleDemo;

import com.fourinone.BeanContext;
import com.fourinone.Contractor;
import com.fourinone.WareHouse;
import com.fourinone.WorkerLocal;
import java.util.ArrayList;

public class SimpleCtor extends Contractor {

        public WareHouse giveTask(WareHouse inhouse) {
                WorkerLocal[] wks = getWaitingWorkers("simpleworker");
                System.out.println("wks.length:" + wks.length);

                WareHouse wh = new WareHouse("word", "hello");
                for(int i=0;i<wks.length;++i){
                WareHouse result = wks[i].doTask(wh);
                }
//                while (true) {
//                        if (result.getStatus() == WareHouse.READY) {
//                                System.out.println("result:" + result);
//                                break;
//                        }
//                }

                return null;
        }

        public static void main(String[] args) {
                BeanContext.setConfigFile("E:\\work\\java\\fourinone-4.05.06\\config.xml");
                SimpleCtor a = new SimpleCtor();
                a.giveTask(null);
        }
}
