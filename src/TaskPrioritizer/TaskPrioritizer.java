package TaskPrioritizer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class TaskPrioritizer {
    private int id;
    private String description;
    private int priority;
    private LocalDate dueDate;

    TaskPrioritizer(int id, String description, int priority, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id= " + id +
                ", description=  " +description +
                ", priority= " + priority +
                ", dueDate= " + dueDate + " }";

    }

    public void prioritize() {
        List<TaskPrioritizer> tasks = new ArrayList<>();
        tasks.add(new TaskPrioritizer(1, "Finish project", 2, LocalDate.of(2025,2,15)));
        tasks.add(new TaskPrioritizer(2, "Submit homework", 3, LocalDate.of(2025,3,10)));
        tasks.add(new TaskPrioritizer(3, "Research topic", 1, LocalDate.of(2025,1,26)));
        //Sort tasks based on priority
        tasks.sort((t1, t2)-> Integer.compare(t1.getPriority(), t2.getPriority()));

        System.out.println("Tasks sorted by priority: ");
        tasks.forEach(System.out::println);

        //Sort tasks based on dueDate
        System.out.println("dueDate: ");
        tasks.stream()
                .filter(task -> task.getDueDate().isBefore(LocalDate.now()))
                .forEach(System.out::println);

    }


}


