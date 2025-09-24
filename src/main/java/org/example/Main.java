package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech", "dummy desc", "ann", Status.ASSIGNED, Priority.MED);
        Task taskAnn2 = new Task("workintech", "dummy desc2", "ann", Status.ASSIGNED, Priority.HIGH);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("workintech", "dummy desc", "bob", Status.ASSIGNED, Priority.MED);
        Task taskBob2 = new Task("workintech", "dummy desc2", "bob", Status.ASSIGNED, Priority.HIGH);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("workintech", "dummy desc", "carol", Status.ASSIGNED, Priority.MED);
        Task taskCarol2 = new Task("workintech", "dummy desc2", "carol", Status.ASSIGNED, Priority.HIGH);

        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);


        Set<Task> unassignedTasks = new HashSet<>();
        Task taskUnassigned = new Task("workintech", "dummy desc", "ann", Status.ASSIGNED, Priority.MED);

        unassignedTasks.add(taskUnassigned);
        TaskData taskData = new TaskData(annsTasks,bobsTasks, carolsTasks,unassignedTasks);

        System.out.println("bobstasks : " + taskData.getTasks("bob"));
        System.out.println("annstasks : " + taskData.getTasks("ann"));
        System.out.println("unassignedtasks : " + taskData.getTasks("all"));
        taskData.getIntersect(annsTasks,bobsTasks);
        taskData.getIntersect(annsTasks,carolsTasks);
        taskData.getIntersect(bobsTasks,carolsTasks);

        System.out.println("unassigned" + taskData.getDifference(unassignedTasks,taskData.getTasks("ann")));


        StringSet.findUniqueWords();


    }
}