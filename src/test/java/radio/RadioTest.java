package radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldNextRadioStation() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStation(19);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();


        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStation(18);
        radio.next();
        int expected = 19;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    void testPrevRadioStation1() {
        Radio radio = new Radio(23);

        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 22;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void testPrevRadioStation9() {
        Radio radio = new Radio(11);

        radio.setCurrentRadioStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentRadioStation() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(-1);
        //radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentRadioStation11() {
        Radio radio = new Radio(11);

        radio.setCurrentRadioStation(11);
        //radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeOver10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

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

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolume10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolumeOver100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 1;
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