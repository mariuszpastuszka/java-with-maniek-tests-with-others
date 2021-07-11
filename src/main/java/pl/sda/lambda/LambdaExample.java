package pl.sda.lambda;

public class LambdaExample {

    public static void main(String[] args) {
        Runnable job = () -> {};
        job.run();

        Runnable myJob = new MyRunnable();
        myJob.run();

        Runnable myAnonymousJob = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm maniek and I'm java developer:)");
            }
        };

        Runnable myAnonymousJob2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm maniek and I'm java developer:)");
            }
        };

        Runnable myLambdaJob = () -> System.out.println("I'm maniek and I'm java developer:)");
        Runnable myLambdaJob2 = () -> System.out.println("I'm maniek and I'm java developer:)");

        myLambdaJob.run();
    }
}
