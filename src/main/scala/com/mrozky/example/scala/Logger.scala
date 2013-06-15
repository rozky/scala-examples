package com.mrozky.example.scala

class Logger(val debugMode: Boolean) {
    var messages = List[String]()

    /**
     * Function that evaluates its arguments by-value (that is default evaluation in scala)
     * @param message the message to log
     */
    def debugEager(message: String) {
        if(debugMode) {
            messages = message :: messages
        }
    }

    /**
     * Function that evaluates its arguments by-name (that is NON default evaluation in scala). By-name = lazy, only when needed
     * @param message the message to log
     */
    def debugLazy(message: => String) {
        if(debugMode) {
            messages = message :: messages
        }
    }

    def log(message: String) {
        messages = message :: messages
    }
}
