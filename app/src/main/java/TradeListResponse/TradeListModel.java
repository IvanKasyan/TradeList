package TradeListResponse;

import com.google.gson.annotations.SerializedName;

public class TradeListModel {

    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("skilled")
    private String skilled;
    @SerializedName("description")
    private String description;
    @SerializedName("task_count")
    private int tasks_count;

    public TradeListModel(int id, String title, String skilled, String description, int tasks_count) {
        this.id = id;
        this.title = title;
        this.skilled = skilled;
        this.description = description;
        this.tasks_count = tasks_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSkilled() {
        return skilled;
    }

    public void setSkilled(String skilled) {
        this.skilled = skilled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTasks_count() {
        return tasks_count;
    }

    public void setTasks_count(int tasks_count) {
        this.tasks_count = tasks_count;
    }
}
