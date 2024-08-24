package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    @SuppressWarnings("checkstyle:EmptyBlock")
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (tasks.isEmpty()) {
                tasks.add(index, element);
                break;
            } else if (element.getPriority() == task.getPriority()) {
                index++;
                continue;
            } else if (element.getPriority() < task.getPriority()) {
                index = task.getPriority() - 1;
                break;
            }
        }

        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
