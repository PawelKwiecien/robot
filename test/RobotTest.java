import org.junit.Test;
import RobotManager;

import static org.junit.Assert.*;
public class RobotTest {

    @Test
    public void test() {
        RobotManager robot = new RobotManager();
        assertEquals("0211000000", robot.executeCommands("PMLPMMMLPMLPMML"));
    }
}
