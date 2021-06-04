package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem8 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("How many people? ");
        int ppl = a.nextInt();
        System.out.print("How many pizzas? ");
        int pz = a.nextInt();
        System.out.print("How many slices per pizza? ");
        int slc = a.nextInt();
        System.out.println(ppl + " people with " + pz +" pizzas (" + slc*pz + " slices)");
        System.out.println("Each person gets " + ((slc*pz)/ppl)+" slices");
        System.out.println("There are " + ((slc*pz)/ppl) + " leftover slices");
    }
}
