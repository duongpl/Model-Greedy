package model;

import lib.Class;
import lib.Teacher;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Population {
    public Vector<Chromosome> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(Vector<Chromosome> individuals) {
        this.individuals = individuals;
    }

    private Vector<Chromosome> individuals;
    private int size;

    private InputData inputData;

    public Population(InputData inputData) {
        this.individuals = new Vector<>();
        this.size = 0;
        this.inputData = inputData;
    }

    public void addIndividual(Chromosome chromosome) {
        this.individuals.add(chromosome);
        this.size++;
    }


    public int getSize() {
        return size;
    }

    public Population(int size, InputData inputData) {
        this.size = size;
        this.inputData = inputData;
        this.individuals = new Vector<>();

        Vector<Integer> genesM1 = new Vector<>();
        Vector<Integer> genesM2 = new Vector<>();
        Vector<Integer> genesM3 = new Vector<>();
        Vector<Integer> genesE1 = new Vector<>();
        Vector<Integer> genesE2 = new Vector<>();
        Vector<Integer> genesE3 = new Vector<>();
        Vector<Integer> genesM4 = new Vector<>();
        Vector<Integer> genesM5 = new Vector<>();
        Vector<Integer> genesE4 = new Vector<>();
        Vector<Integer> genesE5 = new Vector<>();
        Vector<Integer> M1_temp = new Vector<>();
        Vector<Integer> M2_temp = new Vector<>();
        Vector<Integer> M2_temp2 = new Vector<>();
        Vector<Integer> M2_temp3 = new Vector<>();
        Vector<Integer> M3_temp = new Vector<>();
        Vector<Integer> M3_temp2 = new Vector<>();
        Vector<Integer> M3_temp3 = new Vector<>();
        Vector<Integer> E1_temp = new Vector<>();
        Vector<Integer> E2_temp = new Vector<>();
        Vector<Integer> E1_temp2 = new Vector<>();
        Vector<Integer> E2_temp2 = new Vector<>();
        Vector<Integer> E2_temp3 = new Vector<>();
        Vector<Integer> E2_temp4 = new Vector<>();
        Vector<Integer> E3_temp = new Vector<>();
        Vector<Integer> M4_temp = new Vector<>();
        Vector<Integer> M5_temp = new Vector<>();
        Vector<Integer> M5_temp2 = new Vector<>();
        Vector<Integer> M5_temp3 = new Vector<>();
        Vector<Integer> E4_temp = new Vector<>();
        Vector<Integer> E5_temp = new Vector<>();
        Vector<Integer> E5_temp2 = new Vector<>();
        Vector<Integer> E5_temp3 = new Vector<>();
        Vector<Integer> TEMP = new Vector<>();
        while (genesM1.size() < inputData.getTeachers().size()) {
            genesM1.add(-1);
            genesM2.add(-1);
            genesM3.add(-1);
            genesE1.add(-1);
            genesE2.add(-1);
            genesE3.add(-1);
            genesM4.add(-1);
            genesM5.add(-1);
            genesE4.add(-1);
            genesE5.add(-1);

            M1_temp.add(-1);
            M2_temp.add(-1);
            M3_temp.add(-1);
            E1_temp.add(-1);
            E2_temp.add(-1);
            E3_temp.add(-1);
            M4_temp.add(-1);
            M5_temp.add(-1);
            E4_temp.add(-1);
            E5_temp.add(-1);
            E1_temp2.add(-1);
            E2_temp2.add(-1);
            E2_temp3.add(-1);
            M2_temp2.add(-1);
            M3_temp2.add(-1);
            M5_temp2.add(-1);
            E5_temp2.add(-1);
            M2_temp3.add(-1);
            M3_temp3.add(-1);
            E2_temp4.add(-1);
            E5_temp3.add(-1);
            M5_temp3.add(-1);
            TEMP.add(-1);
        }
//        Vector<Vector<Integer>> genes = new Vector<>();
//        genesM1.add(-1);genesM1.add(-1);genesM1.add(-1);genesM1.add(-1);
//        genesM2.add(-1); genesM2.add(4); genesM2.add(-1);genesM2.add(-1);
//        genesM3.add(-1); genesM3.add(5); genesM3.add(-1);genesM3.add(-1);
//        genesE1.add(1); genesE1.add(-1);genesE1.add(-1);genesE1.add(-1);
//        genesE2.add(-1);genesE2.add(-1);genesE2.add(-1);genesE2.add(0);
//        genesE3.add(-1);genesE3.add(-1);genesE3.add(-1);genesE3.add(2);
//        genesM4.add(-1);genesM4.add(-1);genesM4.add(8);genesM4.add(-1);
//        genesM5.add(-1);genesM5.add(-1);genesM5.add(6);genesM5.add(-1);
//        genesE4.add(-1);genesE4.add(3);genesE4.add(-1);genesE4.add(-1);
//        genesE5.add(-1);genesE5.add(7);genesE5.add(-1);genesE5.add(-1);
//                                            genes.add(genesM1);
//                                            genes.add(genesM2);
//                                            genes.add(genesM3);
//                                            genes.add(genesE1);
//                                            genes.add(genesE2);
//                                            genes.add(genesE3);
//                                            genes.add(genesM4);
//                                            genes.add(genesM5);
//                                            genes.add(genesE4);
//                                            genes.add(genesE5);
//                                            for(int i = 0 ; i < 100;i++)
//                                                System.out.println(genes);
//                                                this.individuals.add(new Chromosome(inputData,genes));
//        for (int c : getLectureIDByClass(0)) {
//            Collections.copy(genesE1,TEMP);
//            Collections.copy(genesE2,TEMP);
//            genesE2.set(c, 0);
//            Collections.copy(E2_temp,genesE2);
//            Collections.copy(E1_temp, genesE1);
//            for (int c1 : getLectureIDByClass(1)) {
//                Collections.copy(genesE1, E1_temp);
//                genesE1.set(c1, 1);
//                Collections.copy(E2_temp2,E2_temp);
//                for (int c2 : getLectureIDByClass(2)) {
//                    Collections.copy(genesE2, E2_temp2);
//                    genesE2.set(c2, 2);
//                    Vector<Vector<Integer>> genes = new Vector<>();
//                    genes.add(genesE1);
//                    genes.add(genesE2);
//                    System.out.println(genes);
//                }
//            }
//        }

        for (int c : getLectureIDByClass(0)) {
            Collections.copy(genesM1, TEMP);
            Collections.copy(genesM2, TEMP);
            Collections.copy(genesM3, TEMP);
            Collections.copy(genesE1, TEMP);
            Collections.copy(genesE2, TEMP);
            Collections.copy(genesE3, TEMP);
            Collections.copy(genesM4, TEMP);
            Collections.copy(genesM5, TEMP);
            Collections.copy(genesE4, TEMP);
            Collections.copy(genesE5, TEMP);
            genesE2.set(c, 0);
            System.out.println(genesE2);
            Collections.copy(E2_temp, genesE2);
            Collections.copy(E1_temp, TEMP);
            for (int c1 : getLectureIDByClass(1)) {
                Collections.copy(genesE1, E1_temp);
                genesE1.set(c1, 1);
                Collections.copy(E2_temp2, E2_temp);
                for (int c2 : getLectureIDByClass(2)) {
                    Collections.copy(genesE2, E2_temp2);
                    genesE2.set(c2, 2);
                    Collections.copy(E2_temp3, genesE2);
                    Collections.copy(E4_temp, TEMP);
                    for (int c3 : getLectureIDByClass(3)) {
                        Collections.copy(genesE4, E4_temp);
                        genesE4.set(c3, 3);
                        Collections.copy(M2_temp, TEMP);
                        for (int c4 : getLectureIDByClass(4)) {
                            Collections.copy(genesM2, M2_temp);
                            genesM2.set(c4, 4);
                            Collections.copy(M2_temp2, genesM2);
                            Collections.copy(M3_temp, TEMP);
                            for (int c5 : getLectureIDByClass(5)) {
                                Collections.copy(genesM3, M3_temp);
                                genesM3.set(c5, 5);
                                Collections.copy(M3_temp2,genesM3);
                                Collections.copy(M5_temp, TEMP);
                                for (int c6 : getLectureIDByClass(6)) {
                                    Collections.copy(genesM5, M5_temp);
                                    genesM5.set(c6, 6);
                                    Collections.copy(M5_temp2, genesM5);
                                    Collections.copy(E5_temp, TEMP);
                                    for (int c7 : getLectureIDByClass(7)) {
                                        Collections.copy(genesE5, E5_temp);
                                        genesE5.set(c7, 7);
                                        Collections.copy(E5_temp2, genesE5);
                                        Collections.copy(M4_temp, TEMP);
                                        for (int c8 : getLectureIDByClass(8)) {
                                            Collections.copy(genesM4, M4_temp);
                                            genesM4.set(c8, 8);
                                            Collections.copy(E5_temp3, E5_temp2);
                                            for (int c9 : getLectureIDByClass(9)) {
                                                Collections.copy(genesE5, E5_temp3);
                                                genesE5.set(c9, 9);
                                                Collections.copy(E2_temp4, E2_temp3);
                                                for (int c10 : getLectureIDByClass(10)) {
                                                    Collections.copy(genesE2, E2_temp4);
                                                    genesE2.set(c10, 10);
                                                    Collections.copy(E3_temp, TEMP);
                                                    for (int c11 : getLectureIDByClass(11)) {
                                                        Collections.copy(genesE3, E3_temp);
                                                        genesE3.set(c11, 11);
                                                        Collections.copy(M1_temp, TEMP);
                                                        for (int c12 : getLectureIDByClass(12)) {
                                                            Collections.copy(genesM1, M1_temp);
                                                            genesM1.set(c12, 12);
                                                            Collections.copy(M5_temp3, M5_temp2);
                                                            for (int c13 : getLectureIDByClass(13)) {
                                                                Collections.copy(genesM5, M5_temp3);
                                                                genesM5.set(c13, 13);
//                                                                Collections.copy(M3_temp3, M3_temp2);
//                                                                for (int c14 : getLectureIDByClass(14)) {
//                                                                    Collections.copy(genesM3, M3_temp3);
//                                                                    genesM3.set(c14, 14);
//                                                                    Collections.copy(M2_temp3, M2_temp2);
//                                                                    for (int c15 : getLectureIDByClass(15)) {
//                                                                        Collections.copy(genesM2, M2_temp3);
//                                                                        genesM2.set(c15, 15);
                                                                        Vector<Vector<Integer>> genes = new Vector<>();
                                                                        genes.add(genesM1);
                                                                        genes.add(genesM2);
                                                                        genes.add(genesM3);
                                                                        genes.add(genesE1);
                                                                        genes.add(genesE2);
                                                                        genes.add(genesE3);
                                                                        genes.add(genesM4);
                                                                        genes.add(genesM5);
                                                                        genes.add(genesE4);
                                                                        genes.add(genesE5);
//                                                                        System.out.println(genes);
                                                                        this.individuals.add(new Chromosome(inputData, genes));
//                                                                    }
//                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    Vector<Integer> getLectureIDByClass(int classId) {
        Vector<Integer> list_lecturer_id = new Vector<>();
        Class classes = inputData.getClasses().get(classId);
        for (Teacher t : inputData.getTeachers()) {
            if (inputData.getRegisteredSubjects()[t.getId()][classes.getSubjectId()] > 0
                    && inputData.getRegisteredSlots()[t.getId()][classes.getSlotId()] > 0) {
                list_lecturer_id.add(t.getId());
            }
        }
        return list_lecturer_id;
    }

    Vector<Integer> getClassBySlot(int slotId) {
        Vector<Integer> res = new Vector<>();
        for (Class c : inputData.getClasses()) {
            if (c.getSlotId() == slotId && c.getStatus() == Class.OK) {
                res.add(c.getId());
            }
        }
        return res;
    }

//    public Chromosome(InputData inputData) {
//        this.inputData = inputData;
//        this.needTobeUpdated = true;
//        int m = inputData.getTeachers().size();
//        Vector<Slot> slots = SlotGroup.getSlotList(this.inputData.getSlots());
//        Vector<Vector<Integer>> genes = new Vector<>();
//        for (int i = 0; i < slots.size(); i++) {
//            Vector<Integer> classes = getClassBySlot(inputData.getClasses(), slots.get(i).getId());
//            while (classes.size() < m) classes.add(-1);
//            genes.add(classes);
//        }
//        this.genes = genes;
//    }


    public void updateFitness() {
        for (Chromosome chro : this.individuals) {
            chro.updateFitness();
        }
    }

    public Chromosome getBestIndividuals() {
        double best = this.individuals.get(0).getFitness();
        Chromosome res = this.individuals.get(0);
        for (Chromosome chro : this.individuals) {
            if (chro.getFitness() > best) {
                best = chro.getFitness();
                res = chro;
            }
        }
        return res;
    }

    public double getAverageFitness() {
        double res = 0;
        if (this.size == 0) return -1;
        for (Chromosome chromosome : this.individuals) {
            res += chromosome.getFitness();
        }
        return res / this.size;
    }

    public void sortByFitnetss() {
        Collections.sort(this.individuals, new Comparator<Chromosome>() {
            @Override
            public int compare(Chromosome o1, Chromosome o2) {
                if (o1.getFitness() < o2.getFitness()) return -1;
                if (o1.getFitness() == o2.getFitness()) return 0;
                return 1;
            }
        });
    }

}
