package com.company;

import java.util.ArrayList;

/**
 * Author: Mykhailo Dzhura
 */

public class task3 implements Task{

    /**
     * ArrayList for Jacobstal row
     */
    private static ArrayList<Integer> JacobstalNumbersList = new ArrayList<Integer>();

    /**
     * Initialisation of Jacobstal row
     */
    private static void initJacobstalList() {
        if (JacobstalNumbersList.isEmpty()) {
            JacobstalNumbersList.add(0);
            JacobstalNumbersList.add(1);
            for (int i = 2; i < 20; i++) {
                JacobstalNumbersList.add(JacobstalNumbersList.get(i - 1) + 2 * JacobstalNumbersList.get(i - 2));
            }
        }
    }

    /**
     * Print Jacobstal row
     */
    public static void printAllJacobstalRow() {
        System.out.println("All Jacobstal row:");
        for (int i = 0; i < JacobstalNumbersList.size(); i++) {
            System.out.println("Position[" + i + "]:" + JacobstalNumbersList.get(i));
        }
    }

    /**
     * Main function
     *
     * @param position - of element in Jacobstal row
     * @return value of element by position
     */
    public static int runTaskThree(int position) {
        initJacobstalList();
        if (JacobstalNumbersList.get(position) != null) {
            return JacobstalNumbersList.get(position);
        } else {
            System.out.println("We have only first 20 elements of this row:(((");
        }
        return 0;
    }

    @Override
    public void solveTask(String... args) {
        String array = args[0];
        int position = Integer.parseInt(array);
        runTaskThree(position);
    }
}
