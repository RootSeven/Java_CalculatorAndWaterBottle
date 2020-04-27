public class Printer {

    private int numberOfSheets = 100;
    private int toner = 3000;

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public int getToner() {
        return this.toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public void printCopies(int pages, int copies) {
        int pagesToPrint = pages * copies;
        if (this.numberOfSheets >= pagesToPrint) {
            this.setNumberOfSheets(this.getNumberOfSheets() - pagesToPrint);
            this.setToner(this.getToner() - pagesToPrint);
        }
    }


}
