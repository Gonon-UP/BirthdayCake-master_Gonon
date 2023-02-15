package cs301.birthdaycake;


/* This class is a strictly data-containing class. It will contain information about the current
* state of the cake */


public class CakeModel {

    // Public instance variables for the cake
    public boolean isLit = true;
    public int numCandles = 2;
    public boolean isFrost = true;
    public boolean hasCandles = true;


    // Setter Method for Button Event
    public void setLit(boolean lit) {
        this.isLit = lit;
    }

    // Getter method for Button Event
    public boolean getLit() {
        return isLit;
    }


    // Setter method for Candle Switch
    public boolean getHasCandles() {
        return hasCandles;
    }

    // Getter method for Candles Switch
    public void setHasCandles(boolean checked) {
        this.hasCandles = checked;
    }


    // Setter method for SeekBar
    public int getNumCandles() {
        return numCandles;
    }

    // Getter method for SeekBar
    public void setNumCandles(int numCandles) {
        this.numCandles = numCandles;
    }
}



