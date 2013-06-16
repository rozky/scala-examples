package com.mrozky.example.scala

object PascalTriangle {
    def pascal(column: Int, row: Int): Int = {
        def outside: Boolean = row < 0 || column < 0 || column > row
        def root: Boolean =  row == 0 && column == 0

        if (outside) {
            0
        } else if (root) {
            1
        } else {
            pascal(column - 1, row - 1) + pascal(column, row - 1)
        }
    }
}
