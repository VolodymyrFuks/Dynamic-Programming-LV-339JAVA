
package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StartFile {
    public static void main(String[] args) {
        Map<Integer, Task> tasks = new HashMap<>();
        int i=1;
/*        tasks.put(i++,new Task1());
        tasks.put(i++,new Task2());
        tasks.put(i++,new Task3());
        tasks.put(i++,new Task4());
        tasks.put(i++,new Task5());
        tasks.put(i++,new Task6());
        tasks.put(i++,new Task7());
        tasks.put(i++,new Task8());
        tasks.put(i++,new Task9());
        tasks.put(i++,new Task10());
        tasks.put(i++,new Task11());
        tasks.put(i++,new Task12());
        tasks.put(i++,new Task13());
        tasks.put(i,new Task14());*/
        System.out.println("Enter number of task:");
        Scanner in = new Scanner(System.in);
        tasks.get(Integer.valueOf(in.nextInt())).solveTask();

    }
}
