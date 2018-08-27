package com.example.javacore;

import org.junit.Ignore;
import org.junit.Test;

public class LoopsTest {
    @Ignore
    public void testForLoops() throws Exception{
        ForLoop testForLoop = new ForLoop();
       testForLoop.ForLoop();
        testForLoop.ForSum(4);
        testForLoop.ForFactorial(4);

    }
    @Ignore
    public void testWhileLoops(){
        WhileLoop testWhileLoop = new WhileLoop();
        testWhileLoop.WhileLoop();
        testWhileLoop.DoWhileLoop();
        testWhileLoop.WhileSum(7);
        testWhileLoop.WhileFibonacci(4);
    }
    @Test
    public void testBreakContinue(){
        BreakContinue testBreakContinue = new BreakContinue();
        testBreakContinue.SwitchCaseBreak(2);
        testBreakContinue.WhileContinue();

       }
}
