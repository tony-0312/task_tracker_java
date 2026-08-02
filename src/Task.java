import java.time.LocalDateTime;

public class Task {

    private static Integer taskID = 0;

    private Integer id;
    private String description;
    private Status status;
    private String createdAt;
    private String updatedAt;

    // No args Constructor
    public Task() {
        
    }

    // All arguments Constructor
    public Task(Integer id, String description, 
        Status status, String createdAt, String updatedAt) {
        
            this.id = id;
            this.description = description;
            this.status = status;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;

    }


    // Getters and Setters

    public Integer getTaskID() {
        return Task.taskID;
    }

    public Integer getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setTaskID(Integer taskID) {
        Task.taskID = taskID;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String toString() {
        return "Id: " + this.id + 
               "\nDescription: " + this.description + 
               "\nStatus: " + this.status + 
               "\nCreated At: " + this.createdAt + 
               "\nUpdated At: " + this.updatedAt + 
               "\n";
    }

    // JSON Conversions
    public String toJson() {
        return "{\n\t\"Id\": " + this.id + ",\n\t\"Description\": " + "\"" + this.description + "\"" + ",\n\t\"Status\": " + "\"" + this.status + "\"" + ",\n\t\"Created At\": " + "\"" + this.createdAt + "\"" + ",\n\t\"Updated\": " + "\"" + this.updatedAt + "\"" + "\n}" + "\n";
    }

}
