/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaapp1;

/**
 *
 * @author jzadmin
 */
public class FirstClass {
    static String vip(Integer prinum){
    if ((prinum>=0) && (prinum<=10)){
        return "yes";
    }else{
        return "no";
    } 
    }
    public static void main(String[] args) {
    FirstClass guest = new FirstClass();
    System.out.println("Maven Proj - JavaApp1");
    if ("yes".equals(guest.vip(16))){
        System.out.println("This user is VIP");
    }else{
        System.out.println("This user is not VIP");
    }  
    
    }
}
