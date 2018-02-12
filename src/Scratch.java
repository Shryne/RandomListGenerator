import java.util.Timer;
import java.util.TimerTask;

public class Scratch {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("I was called");
            }
        };

        timer.schedule(timerTask, 1000);

        long startTime = System.currentTimeMillis();
        int n = 0;
        while (n < 5) {
            if (800 < System.currentTimeMillis() - startTime) {
                timerTask.cancel();
                timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("I was called");
                    }
                };
                startTime = System.currentTimeMillis();
                timer.schedule(timerTask, 1000);
                System.out.println("restarted");
                n++;
            }
        }

        timer.cancel();
        timer.purge();
    }
}