package Day04;

public class Prison {
    private boolean[] cell = new boolean[100];

    public boolean[] getCell() {
        return cell;
    }

    public void openFreeCells() {
        int day = 0;
        for (int i = 0; i < cell.length; i++) {
            for (int j = day; j < cell.length; j += (day + 1)) {
                cell[j] = !cell[j];
            }
            day++;
        }
    }
}