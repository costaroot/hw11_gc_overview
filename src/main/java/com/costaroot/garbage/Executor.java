package com.costaroot.garbage;

import java.util.Scanner;

public class Executor {
    private Scanner scanner;
    private Garbage garbage;

    public Executor(){
        scanner = new Scanner(System.in);
    }

    private void readLine(){
        System.out.println("Please enter some message.");
        garbage = new Garbage(scanner.nextLine());
    }

    public void run(){
        readLine();
        garbage.memoryKiller();
    }
}
