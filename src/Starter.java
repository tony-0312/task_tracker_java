public class Starter {

    // Task Service Initialization
    private static TaskTrackerService taskTrackerService = new TaskTrackerServiceImpl();

    public static void main(String[] args) {

        // System.out.println(taskTrackerService.addTask("Wash Clothes"));

        if (args.length > 0) {

            if (args[0].equals("add")) {
                // System.out.println("Add new Task");
                // System.out.println("Description: " + args[1]);
                // taskTrackerService.addTask("Buy Groceries");
                taskTrackerService.addTask(args[1]);
            } else {
                System.out.println("Not Available right now");
            }
        }

    }
}