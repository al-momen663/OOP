package tutorial;

public class Sudoku extends JigSaw {
    public void puzzle2() {

        int rubics = 200;
        System.out.println(rubics);
        System.out.println(instance);
        System.out.println(check);
    }

    public static void main(String[] args) {
        Sudoku solve1 = new Sudoku();
        Sudoku solve2 = new Sudoku();
        solve1.puzzle1();
        solve2.puzzle2();

    }

}
