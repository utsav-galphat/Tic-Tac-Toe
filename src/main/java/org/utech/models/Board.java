package org.utech.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<List<Cell>> board ;


    public Board(int Diamension) {
        this.board = new ArrayList<>();

        for(int i=0; i<Diamension; i++){
            List<Cell> row = new ArrayList<>();
            for(int j=0; j<Diamension; j++){
                row.add(new Cell(i, j));
            }
            this.board.add(row);
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void displayBoard(){
        for(List<Cell> row : this.board){
            for(Cell cell : row){
                System.out.print(cell.getCellStatus() + " ");
            }
            System.out.println();
        }
    }
}
