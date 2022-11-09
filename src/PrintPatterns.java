public class PrintPatterns {
    public static void main(String[] args) {
        printPatternA(8);
        System.out.println("--------------------------------------------------");
        printPatternB(8);
        System.out.println("--------------------------------------------------");
        printPatternC(8);
        System.out.println("--------------------------------------------------");
        printPatternD(8);
        System.out.println("--------------------------------------------------");
        printPatternE(7);
        System.out.println("--------------------------------------------------");
        printPatternF(7);
        System.out.println("--------------------------------------------------");
        printPatternG(7);
        System.out.println("--------------------------------------------------");
        printPatternH(7);
        System.out.println("--------------------------------------------------");
        printPatternI(7);
        System.out.println("--------------------------------------------------");
        printPatternJ(6);
        System.out.println("--------------------------------------------------");
        printPatternK(6);
        System.out.println("--------------------------------------------------");
        printPatternL(6);
        System.out.println("--------------------------------------------------");
        printPatternM(8);
        System.out.println("--------------------------------------------------");
        printPatternN(8);
        System.out.println("--------------------------------------------------");
        printPatternP(8);
        System.out.println("--------------------------------------------------");


    }

    private static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternB(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; row + col <= size + 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternD(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; row + col <= size + 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternE(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == 1 || row == size || col == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    private static void printPatternF(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size|| row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    private static void printPatternG(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size +1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    private static void printPatternH(int size) {
        for (int row = 1; row <= size ; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col || row + col == size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    private static void printPatternI(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col || row + col == size + 1 || col == size || col == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }



    private static void printPatternJ(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; row + col <= size + 1; col++) {
                System.out.print("# ");
            }
            for (int col = 1; row + col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternK(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("  ");
            }
            for (int col = 1; row + col <= size +1; col++) {
                System.out.print("# ");
            }
            for (int col = 1; row + col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternL(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; row + col <= size + 1; col++) {
                System.out.print("# ");
            }
            for (int col = 1; row + col <= size; col++) {
                System.out.print("# ");
            }

            System.out.println();
        }
        for (int row = 2; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; row + col <= size + 1; col++) {
                System.out.print("# ");
            }
            for (int col = 1; row + col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    private static void printPatternM(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }
    private static void printPatternN(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col + row <= size +1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    private static void printPatternP(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
        System.out.println();
    }


}
