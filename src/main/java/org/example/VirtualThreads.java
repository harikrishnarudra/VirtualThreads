package org.example;

public class VirtualThreads {

     static class Task implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println("Number from thread: "+i);
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        /*Runnable task = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Number from thread: "+i);
                }
            }
        };*/
        for(int i=0;i<10;i++){
            System.out.println("New Thread kicks off: "+ i);
            Thread.startVirtualThread(new Task());
        }
    }
}