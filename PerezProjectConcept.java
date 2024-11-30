
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean completed;
    LocalDate date;

    Task(String description, LocalDate date) {
        this.description = description;
        this.completed = false;
        this.date = date;
    }
}

public class ToDoListApp {
    private ArrayList<Task> tasks;
    private Scanner scanner;

    ToDoListApp() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. **Add Task**");
            System.out.println("2. **View Tasks**");
            System.out.println("3. **Mark Task Completed**");
            System.out.println("4. **Display Statistics**");
            System.out.println("5. **Display Completed Tasks by Date**");
            System.out.println("6. **Exit**");
            System.out.print("***Choose***: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    app.addTask();
                    break;
                case 2:
                    app.viewTasks();
                    break;
                case 3:
                    app.markTaskCompleted();
                    break;
                case 4:
                    app.displayStatistics();
                    break;
                case 5:
                    app.displayCompletedTasksByDate();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

   public void addTask() {
        System.out.print("Task description: ");
        String description = scanner.nextLine();
        System.out.print("Task date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        tasks.add(new Task(description, date));
        System.out.println("Task added!");
    }

   public void viewTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.description + " [" + (task.completed ? "Completed" : "Not Completed") + "] - " + task.date);
        }
    }

   public void markTaskCompleted() {
        System.out.print("Task number to mark completed: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.get(taskNumber - 1).completed = true;
            System.out.println("Task marked completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

   public void displayStatistics() {
        int totalTasks = tasks.size();
        int completedTasks = 0;
        for (Task task : tasks) {
            if (task.completed) {
                completedTasks++;
            }
        }
        int undoneTasks = totalTasks - completedTasks;
        double completionPercentage = ((double) completedTasks / totalTasks) * 100;
        System.out.println("Total Tasks: " + totalTasks);
        System.out.println("Completed Tasks: " + completedTasks);
        System.out.println("Undone Tasks: " + undoneTasks);
        System.out.println("Completion Percentage: " + completionPercentage + "%");
        
    }

    public void displayCompletedTasksByDate() {
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Completed Tasks for " + date + ":");
        for (Task task : tasks) {
            if (task.date.equals(date) && task.completed) {
                System.out.println(task.description);
            }
        }
    }

   
}
