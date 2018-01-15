public class BlocksManager {
    private int[] blocks = new int[10];
    private int maxBlockCapacity = 15;

    void dropBox(int position) {
        if (blocks[position] < maxBlockCapacity) {
            blocks[position]++;
        }
    }

    String getBlockValues() {
        StringBuilder builder = new StringBuilder();
        for (int box : blocks) {
            builder.append(box);
        }
        return builder.toString();
    }
}
