package org.utech.models;

public class Cell {

    private int row;

    private int col;

    private CellStatus cellStatus;

    private Player player;

    public Cell(int row, int col, Player player) {
        this.row = row;
        this.col = col;
        this.cellStatus = CellStatus.EMPTY;
        this.player = player;
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellStatus = CellStatus.EMPTY;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }
}
