package com.mrozky.example.scala

import org.scalatest.{Matchers, GivenWhenThen, FunSpec}

class PascalTriangleSpec extends FunSpec with GivenWhenThen with Matchers {

    it("should calculate any value in the triangle correctly") {
        PascalTriangle.pascal(0, -1) should be(0)
        PascalTriangle.pascal(-1, 0) should be(0)
        PascalTriangle.pascal(1, 0) should be(0)
        PascalTriangle.pascal(5, 4) should be(0)
        PascalTriangle.pascal(0, 0) should be(1)
        PascalTriangle.pascal(0, 1) should be(1)
        PascalTriangle.pascal(1, 1) should be(1)
        PascalTriangle.pascal(0, 2) should be(1)
        PascalTriangle.pascal(1, 2) should be(2)
        PascalTriangle.pascal(2, 2) should be(1)
        PascalTriangle.pascal(0, 3) should be(1)
        PascalTriangle.pascal(1, 3) should be(3)
        PascalTriangle.pascal(2, 3) should be(3)
        PascalTriangle.pascal(3, 3) should be(1)
        PascalTriangle.pascal(0, 4) should be(1)
        PascalTriangle.pascal(1, 4) should be(4)
        PascalTriangle.pascal(2, 4) should be(6)
        PascalTriangle.pascal(3, 4) should be(4)
        PascalTriangle.pascal(4, 4) should be(1)
    }
}
