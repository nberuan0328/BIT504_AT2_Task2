import java.awt.*;

public class Cell {
    // Row and column of this cell
    int row, col;
    // Content of this cell
    Player content;

    /** Constructor to initialize the cell with row and column */
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        // Initially, cell is empty
        clear();
    }

    /** Clear the cell content */
    public void clear() {
        content = Player.Empty;
    }

    /** Paint the cell with appropriate content */
    public void paint(Graphics g) {
        // Draw the cell border
        g.setColor(Color.BLACK);
        g.drawRect(col * GameMain.CELL_SIZE, row * GameMain.CELL_SIZE, GameMain.CELL_SIZE, GameMain.CELL_SIZE);

        // Draw the symbol (X or O) if not empty
        int x1 = col * GameMain.CELL_SIZE + GameMain.CELL_PADDING;
        int y1 = row * GameMain.CELL_SIZE + GameMain.CELL_PADDING;
        if (content == Player.Cross) {
            g.setColor(Color.RED);
            g.drawLine(x1, y1, x1 + GameMain.SYMBOL_SIZE, y1 + GameMain.SYMBOL_SIZE);
            g.drawLine(x1 + GameMain.SYMBOL_SIZE, y1, x1, y1 + GameMain.SYMBOL_SIZE);
        } else if (content == Player.Nought) {
            g.setColor(Color.BLUE);
            g.drawOval(x1, y1, GameMain.SYMBOL_SIZE, GameMain.SYMBOL_SIZE);
        }
    }
}
