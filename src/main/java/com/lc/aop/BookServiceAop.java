package com.lc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by leich on 2017/3/15.
 */
@Component(value = "bookServiceAop")
public class BookServiceAop {

    public void doSomthing()
    {
        System.out.print("AOP Execute");
    }

    public void doReturning()
    {
        System.out.print("AOP Returning");
    }

    public void doThrowing()
    {
        System.out.print("AOP Throwing");
    }


    public void doAround(ProceedingJoinPoint proceedingJoinPoint) {

        boolean isDown = true;
        int count = 0;
        do
        {
            try {
                System.out.print(" Around Before " + count);
                proceedingJoinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                count++;
                if (count >= 3)
                {
                    break;
                }
            }
        }while (isDown);

        System.out.print(" Around Before  End" );
    }

    public void doAfter(JoinPoint joinPoint) throws Throwable {
        System.out.print("AOP After");
    }
}
