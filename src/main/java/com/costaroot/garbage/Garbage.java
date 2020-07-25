package com.costaroot.garbage;

import java.util.Scanner;

public class Garbage {
    private String line;

    public Garbage(String line){
        this.line = line;
    }

    public void memoryKiller(){
        while(true) {
            Scanner scan = new Scanner(line);
            line +=scan.nextLine();
            System.out.println("Free mem:" + Runtime.getRuntime().freeMemory());
        }
    }
}
