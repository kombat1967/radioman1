package radio;

public class Radio {
    private int currentRadioStation;

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentVolume;

    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int sumRadioStation) {
        this.maxRadioStation = sumRadioStation - 1;

    }

    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
            return;
        } else {
            currentRadioStation = minRadioStation;
            // return;
        }
    }

    public void prev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--
            ;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
            return;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {

            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}


