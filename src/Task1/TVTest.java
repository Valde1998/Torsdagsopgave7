package Task1;
import static org.junit.jupiter.api.Assertions.*;
import Task1.TV;
import org.junit.jupiter.api.Test;
class TVTest {
    TV tv1;

    TV tv2;
    TV tv3;

    void setUp() {
        tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();

        tv3 = new TV();
    }
}

