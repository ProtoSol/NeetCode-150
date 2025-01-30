import java.util.HashSet;

public class ValidSudoku {
    // Here the empty spaces are given by .
    // We need to validate the filled sudoku board cells
    // if it is valid or not

    private boolean isValidSudoku(char[][] board){
        // We will use 3 hashsets to store the row, column and the 3x3 grid
        // and check if the element is already present in the hashset
        // if it is present then return false
        // else add the element to the hashset
        // if we reach the end of the board then return true
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char num = board[i][j];
                if(num != '.'){
                    int box_index = (i / 3) * 3 + j / 3;
                    if(rows[i].contains(num) || columns[j].contains(num) || boxes[box_index].contains(num)){
                        return false;
                    }
                    rows[i].add(num);
                    columns[j].add(num);
                    boxes[box_index].add(num);
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        ValidSudoku obj = new ValidSudoku();
        System.out.println(obj.isValidSudoku(board));
    }
}
