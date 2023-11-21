public class task2 {
    public static void main(String[] args) {
        int rows = 8;
        int columns = 8;
        char[][] array = new char[rows][columns];
        char B = 'B';
        char W = 'W';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = W;
                } else {
                    array[i][j] = B;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}