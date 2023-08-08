package MenuRestaurant;

import java.util.concurrent.Semaphore;

public class Stove {

    private Semaphore semaphore;

    public Stove(int permits) {
        semaphore = new Semaphore(permits);
    }

    public boolean tryToCook() {
        return semaphore.tryAcquire();
    }

    public void releaseTheStove() {
        semaphore.release();
    }

    public int getAvailableSpots() {
        return semaphore.availablePermits();
    }
}
