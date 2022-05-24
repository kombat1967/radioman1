package radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();


        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    void testPrevRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void testPrevRadioStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    void testSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        //radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentRadioStation11() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);
        //radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    void setCurrentVolumeOver10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolume10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetIncreaseVolumeOver10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetDecreaseVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolumeUnder0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


}