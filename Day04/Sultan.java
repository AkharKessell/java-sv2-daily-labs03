package Day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();

        prison.openFreeCells();
        System.out.println("Open cell:");
        for (int i = 0; i < prison.getCell().length; i++) {
            if (prison.getCell()[i]) {
                System.out.println((i + 1) + ". cell");
            }
        }
    }
}
