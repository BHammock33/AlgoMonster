package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class solution {
    public static List<Integer> execute(List<String> program){
        ArrayList<Integer> stack = new ArrayList<>();
        for(String instruction: program){
            if(instruction.equals("peek")){
                System.out.println(stack.get(stack.size()-1));
            }else if (instruction.equals("pop")){
                stack.remove(stack.size() -1);
            }else{
                int data = Integer.parseInt(instruction.substring(5));
                stack.add(data);
            }
        }
        return stack;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int programLength = Integer.parseInt(scanner.nextLine());
        List<String> program = new ArrayList<>();
        for (int i =0; i < programLength; i++){
            program.add(scanner.nextLine());
        }
        scanner.close();
        List<Integer> res = execute(program);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
