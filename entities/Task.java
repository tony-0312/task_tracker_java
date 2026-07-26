package entities;

import java.time.LocalDateTime;

public class Task {

    private Integer id;
    private String description;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // No args Constructor
    public Task() {
        
    }

    // All arguments Constructor
    public Task(Integer id, String description, 
        Status status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        
            this.id = id;
            this.description = description;
            this.status = status;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;

    }


    // Getters and Setters
    public Integer getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Status getStatus() {
        return this.status;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
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

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
