package com.AE;

/**
 * Created by Angel on 11/12/16.
 */
public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages = 0;
    private Boolean duplex;

    public Printer(int tonerLevel, int numberOfPages, Boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        if (this.numberOfPages >= 0){
            this.numberOfPages = numberOfPages;
        }

        this.duplex = duplex;
    }

    public int fillToner(int addToner) {

        if (tonerLevel >=0 && tonerLevel <= 100) {
            if (this.tonerLevel + addToner > 100) {
                System.out.println("Too much toner...");
                return this.tonerLevel;
            }
            return tonerLevel = this.tonerLevel + addToner;
        }
        return this.tonerLevel;
    }


    public int printPages(int pages){
        if(duplex == true){
            pages = pages/2;
        }
        if (pages > tonerLevel){
            System.out.println("not enough toner to print pages....");
        }else{
            for (int i = pages;i >= pages;--i){
                this.tonerLevel = this.tonerLevel - i;
            }
        }


        return numberOfPages =  pages;


    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
