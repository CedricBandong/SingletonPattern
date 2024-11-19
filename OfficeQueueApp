class OfficeQueueApp {
    private static OfficeQueueApp
 instance;
    private int queueNo = 0;
    private OfficeQueueApp() {
    }

    public static synchronized OfficeQueueApp
 getInstance() {
        if (instance == null)
            instance = new OfficeQueueApp
        ();
        return instance;
    }

    public synchronized void currentQueueNo() {
        System.out.println("Current Queue Number: " + queueNo);
    }

    public synchronized void nextQueueNo(String station) {
        queueNo++;
        System.out.println(station + ": " + "Customer " + queueNo);
    }

    public synchronized void resetQueueNo(int newQueueNo) {
        queueNo = newQueueNo;
        System.out.println("\nQueue Number Reset to " + queueNo);
    }
}
