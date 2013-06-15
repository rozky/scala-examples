package com.mrozky.example.scala

import org.scalatest.{Matchers, GivenWhenThen, FunSpec}

class LoggerSpec extends FunSpec with GivenWhenThen with Matchers {

    describe("Eager logger | Example of call by value") {
        it("should evalute function argument even if it is not used in the function body") {
            val logger: Logger = new Logger(false)
            logger.debugEager(generateLogMessage(logger))
            logger.messages match {
                case entry :: _ => entry should be("generating log message")
                case messages => messages.size should be(1)
            }
        }

        it("should evalute function argument if used in the function body") {
            val logger: Logger = new Logger(true)
            logger.debugEager(generateLogMessage(logger))
            logger.messages match {
                case firstEntry :: secondEntry :: _ => {
                    firstEntry should be("Hello World")
                    secondEntry should be("generating log message")
                }
                case messages => messages.size should be(2)
            }
        }
    }

    describe("Lazy Logger | Example of call by name") {
        it("should not evalute function argument even if it is not used in the function body") {
            val logger: Logger = new Logger(false)
            logger.debugLazy(generateLogMessage(logger))
            logger.messages.size should be(0)
        }
    }

    private def generateLogMessage(logger: Logger): String = {
        logger.log("generating log message")
        "Hello World"
    }

}
