package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();
        System.out.println(inst1);
        System.out.println(inst2);
        Main.printMsg(inst1);

        Proxy proxy = new Proxy(inst1);
        System.out.println(proxy);
        Main.printMsg(proxy);


        }

    public static void printMsg(Singl obj) {
        System.out.println(obj.getMsg());
    }
}
