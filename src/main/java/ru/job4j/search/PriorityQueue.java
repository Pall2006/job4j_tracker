package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    @SuppressWarnings("checkstyle:EmptyBlock")
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                index = task.getPriority() - 1;
                break;
            }
            index++;
        }

        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
