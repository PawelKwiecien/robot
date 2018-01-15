public class RobotManager {

    public  String executeCommands(String commands) {
        char command;
        RobotArm robotArm = new RobotArm();
        for (int i = 0; i < commands.length(); i++) {
            command = commands.charAt(i);
            if (command == 'P') {
                robotArm.pickupBlock();
            } else if (command == 'M') {
                robotArm.moveArm();
            } else if (command == 'L') {
                robotArm.lowerBlock();
            }
        }
        return robotArm.blocksManager.getBlockValues();
    }

}
