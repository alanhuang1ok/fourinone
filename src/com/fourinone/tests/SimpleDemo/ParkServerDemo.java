package com.fourinone.tests.SimpleDemo;

import com.fourinone.BeanContext;

public class ParkServerDemo {

        public static void main(String[] args) {
                BeanContext.setConfigFile ("E:\\work\\java\\fourinone-4.05.06\\config.xml") ;
                BeanContext.startPark();
        }
}
