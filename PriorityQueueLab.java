import java.util.*;
import java.io.*;

public class PriorityQueueLab {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue;
        Scanner scan = null;
        pQueue = new PriorityQueue<Integer>();

        try {
            scan = new Scanner(new File("RandIntegers.txt"));

            while (scan.hasNextInt()) {
                pQueue.add(scan.nextInt());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("PriorityQueue contents: " + pQueue);
    }
}