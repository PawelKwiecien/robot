public class RobotArm {
    private int armPosition = 0;
    private boolean holdsBlock = false;
    private final int finalPosition = 9;
    BlocksManager blocksManager = new BlocksManager();

    void pickupBlock() {
        holdsBlock = true;
        armPosition = 0;
    }

    void moveArm() {
        if (armPosition < finalPosition) {
            armPosition++;
        }
    }

    void lowerBlock() {
        holdsBlock = false;
        blocksManager.dropBox(armPosition);
    }
}
