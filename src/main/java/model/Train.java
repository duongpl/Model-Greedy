package model;

import data.*;
import lib.Class;
import lib.Slot;
import lib.SlotGroup;

import java.util.Vector;

public class Train {

    public Schedule scheduleFrame;
    public Visualize visualize;
    Vector<OutputRecord> data;

    public Train() {
//        this.scheduleFrame = new Schedule();
//        this.visualize = new Visualize("GA visualization", "Without Minimizing standard deviation");
//        data = new Vector<>();
    }

//    public void notify(Chromosome c, int genId, double bestFitness, double avgFitness, int violation, double objectiveValue) {
//        scheduleFrame.addSchedule(c);
//        this.visualize.add(objectiveValue, avgFitness, violation);
//        data.add(new OutputRecord(genId, bestFitness, objectiveValue, violation, avgFitness));
//            DataWriter.writeToCsv(data, "out_1_3.csv");
//    }

    public static void main(String[] args) {

        Train train = new Train();
        InputData inputData = DataReader.getData();
        Vector<Slot> slots = SlotGroup.getSlotList(inputData.getSlots());
        for(Class s : inputData.getClasses()){
            System.out.println(inputData.getSubjects().get(s.getSubjectId()).getName()+ "-"+slots.get(s.getSlotId()).getName());
        }
        long start = System.currentTimeMillis();
        GeneticAlgorithm ga = new GeneticAlgorithm(inputData, train);
        ga.start();
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("time execution: "+timeElapsed/1000);
    }
}

