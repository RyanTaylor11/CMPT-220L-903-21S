package com.company;

public class Main {

    public static void main(String[] args) {
        listitem rov = new listitem();
        rov.setName("Curiosity").setYear(2020).setOnline(true).setlocation("Aeolis Palus").info();
        // write your code here
    }

    static class listitem {
        private String rover;
        private int year;
        private boolean online;
        private String location;

        public listitem setName(String rover) {
            this.rover=rover;
            return this;
        }
        public listitem setYear(int year){
            this.year = year;
            return this;
        }
        public listitem setOnline(boolean online){
            this.online = online;
            return this;
        }
        public listitem setlocation(String location){
            this.location = location;
            return this;
        }
        public void info(){
            System.out.println("The Rover "+rover+" was sent to Mars in "+year+" The rover is currently operational "+online+" this rover was sent to "+location);
        }


    }
}