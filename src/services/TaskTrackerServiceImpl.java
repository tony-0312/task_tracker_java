package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Status;
import entities.Task;

public class TaskTrackerServiceImpl implements TaskTrackerService {

    private static final Path FILE_PATH = Path.of("tasks.json");

    private static final DateTimeFormatter DATE_TIME_FORMATTER = 
                                                DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm");

    @Override
    public String addTask(String description) {

        Task task = populateTask(description);

        System.out.println("Displaying task");
        System.out.println(task.toString());

        // String savingTaskJson = 

        try {
            if (!Files.exists(FILE_PATH)) {

                Files.createFile(FILE_PATH);

            }

            // Files.writeString(FILE_PATH, description, StandardOpenOption.APPEND);
            Files.writeString(FILE_PATH, description);

        } catch (IOException e) {
            System.out.println("IO exception got caught");
        }

        return "File created and task added successfully";

    }

    // Helper functions
    public Task populateTask(String description) {

        Task task = new Task();

        task.setTaskID(task.getTaskID() + 1);
        Integer currTaskId = task.getTaskID();
        task.setId(currTaskId);
        task.setDescription(description);
        task.setStatus(Status.todo);
        task.setCreatedAt(LocalDateTime.now().format(DATE_TIME_FORMATTER));
        task.setUpdatedAt(LocalDateTime.now().format(DATE_TIME_FORMATTER));

        return task;

    }

}
