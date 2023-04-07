package com.global.CodingChallengeLambdaExpression;

/*
 Problem Statement - 1

Change the following anonymous Runnable class implementation to Lambda Expression:

public class DemoThreadMine {
    public static void main(String pars[]) {
        Thread threadInstance = new Thread(new Runnable() {
            //run --- implementation
            public void run() {
                System.out.println(" Its me from thread");
            }
        });
        threadInstance.start();
    }
}

 */

public class RunnableToLambdaP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(() -> {
			 System.out.println(" Its me from thread");
		}).start();

	}

}
