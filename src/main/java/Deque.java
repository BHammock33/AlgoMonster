package src.main.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Deque {
    public static ArrayDeque<Integer> execute(List<String> program) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (String instruction : program) {
            if (instruction.equals("peek")) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println(queue.peek());
                }
            } else if (instruction.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    queue.poll();
                }
            } else {
                int data = Integer.parseInt(instruction.substring(5));
                queue.add(data);
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int programLength = Integer.parseInt(scanner.nextLine());
        List<String> program = new ArrayList<>();
        for (int i = 0; i < programLength; i++) {
            program.add(scanner.nextLine());
        }
        scanner.close();
        ArrayDeque<Integer> res = execute(program);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
