public class app {
    static Thread odd = new Thread(new Runnable() {
        @Override
        public void run() {
            int number = 0;
            do {
                System.out.println(number);
                number += 2;
            } while (number <= 10);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    });
    static Thread even = new Thread(new Runnable() {
        @Override
        public void run() {
            int number = 1;
            do {
                System.out.println(number);
                number += 2;
            } while (number < 10);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    });

    public static void main(String[] args) throws InterruptedException {
        even.start();
        even.join();
        odd.start();

    }
}
