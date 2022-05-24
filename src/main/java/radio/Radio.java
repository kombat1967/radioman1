package radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
            return;
        } else {
            currentRadioStation = 0;
            // return;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--
            ;
        } else {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {

            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}


