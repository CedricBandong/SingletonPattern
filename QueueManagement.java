import java.util.Scanner;

public class QueueManagement {
    public static void main(String[] args) {
        OfficeQueueApp helpDesk = OfficeQueueApp.getInstance();
        Scanner scanner = new Scanner(System.in);

        helpDesk.nextQueueNo("Help Desk Station 1");
        helpDesk.nextQueueNo("Help Desk Station 2");
        helpDesk.nextQueueNo("Help Desk Station 3");

        helpDesk.currentQueueNo();

        System.out.print("\nReset the queue number? yes or no?: ");
        String resetChoice = scanner.nextLine();
        if (resetChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter new number: ");
            int newNo = scanner.nextInt();
            helpDesk.resetQueueNo(newNo);
        }

        helpDesk.nextQueueNo("\nHelp Desk Station 1");
        helpDesk.nextQueueNo("Help Desk Station 2");
        helpDesk.nextQueueNo("Help Desk Station 3");

        scanner.close();
    }
}
